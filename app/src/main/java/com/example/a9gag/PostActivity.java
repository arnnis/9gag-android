package com.example.a9gag;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PostActivity extends AppCompatActivity {
    private CommentsResponse commentsResponse;
    private RecyclerView commentsRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);

        String postId = getIntent().getStringExtra("POST_ID");
        String postURL = getIntent().getStringExtra("POST_URL");

        ActionBar bar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#222222")));
        bar.setTitle("Post");

        this.commentsResponse = new CommentsResponse();
        commentsRecyclerView = findViewById(R.id.comments_recyclerview);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://local.host")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        APIService apiService = retrofit.create(APIService.class);
        
        apiService.fetchComments(postURL).enqueue(new Callback<CommentsResponse>() {
            @Override
            public void onResponse(Call<CommentsResponse> call, Response<CommentsResponse> response) {

                if (!response.isSuccessful()) {
                    Log.d("LOG_TAG", "No Success");
                }

                Log.d("LOG_TAG", "ON RESPONSE CALLED");
//                Log.d("LOG_TAG", response.body().getData().getPosts()[0].getTitle());
                Log.d("URL", response.body().getStatus());
                commentsResponse = response.body();
                showData();

            }

            @Override
            public void onFailure(Call<CommentsResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Failed !", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void showData() {
        CommentsRecyclerAdapter commentsRecyclerAdapter = new CommentsRecyclerAdapter(commentsResponse);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        commentsRecyclerView.setLayoutManager(layoutManager);
        commentsRecyclerView.setItemAnimator(new DefaultItemAnimator());
        commentsRecyclerView.setAdapter(commentsRecyclerAdapter);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}