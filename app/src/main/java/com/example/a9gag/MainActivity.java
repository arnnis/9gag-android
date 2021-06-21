package com.example.a9gag;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.app.ActionBar;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private PostsResponse postsResponse;
    private RecyclerView usersRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#222222")));

        this.postsResponse = new PostsResponse();
        usersRecyclerView = findViewById(R.id.users_recyclerview);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.9gag.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        APIService apiService = retrofit.create(APIService.class);

        apiService.fetchPosts().enqueue(new Callback<PostsResponse>() {
            @Override
            public void onResponse(Call<PostsResponse> call, Response<PostsResponse> response) {

                if (!response.isSuccessful()) {
                    Log.d("LOG_TAG", "No Success");
                }

                Log.d("LOG_TAG", "ON RESPONSE CALLED");
                Log.d("LOG_TAG", response.body().getData().getPosts()[0].getTitle());
                Log.d("URL", response.body().getData().getPosts()[0].getImages().getImage460().getURL());
                postsResponse = response.body();
                showData();

            }

            @Override
            public void onFailure(Call<PostsResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Failed !", Toast.LENGTH_LONG).show();
            }
        });



    }

    private void showData() {
        PostsRecyclerAdapter postsRecyclerAdapter = new PostsRecyclerAdapter(postsResponse);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        usersRecyclerView.setLayoutManager(layoutManager);
        usersRecyclerView.setItemAnimator(new DefaultItemAnimator());
        usersRecyclerView.setAdapter(postsRecyclerAdapter);
    }

//    private void setUsersInfo() {
//        this.userList.add(new User("Alireza"));
//        this.userList.add(new User("Elon"));
//        this.userList.add(new User("Bill"));
//        this.userList.add(new User("Steve"));
//
//        for (int i = 0; i < 150; i++) {
//            this.userList.add(new User("Alireza"));
//        }
//    }

}