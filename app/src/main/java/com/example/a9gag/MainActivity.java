package com.example.a9gag;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private ArrayList<User> userList;
    private RecyclerView usersRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.userList = new ArrayList<>();
        usersRecyclerView = findViewById(R.id.users_recyclerview);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        APIService apiService = retrofit.create(APIService.class);

        apiService.fetchUsers().enqueue(new Callback<ArrayList<User>>() {
            @Override
            public void onResponse(Call<ArrayList<User>> call, Response<ArrayList<User>> response) {

                if (!response.isSuccessful()) {
                    Log.d("LOG_TAG", "No Success");
                }

                Log.d("LOG_TAG", "ON RESPONSE CALLED");
                userList.addAll(response.body());
                showData();

            }

            @Override
            public void onFailure(Call<ArrayList<User>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Failed !", Toast.LENGTH_LONG).show();
            }
        });



    }

    private void showData() {
        UsersRecyclerAdapter usersRecyclerAdapter = new UsersRecyclerAdapter(userList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        usersRecyclerView.setLayoutManager(layoutManager);
        usersRecyclerView.setItemAnimator(new DefaultItemAnimator());
        usersRecyclerView.setAdapter(usersRecyclerAdapter);
    }

    private void setUsersInfo() {
        this.userList.add(new User("Alireza"));
        this.userList.add(new User("Elon"));
        this.userList.add(new User("Bill"));
        this.userList.add(new User("Steve"));

        for (int i = 0; i < 150; i++) {
            this.userList.add(new User("Alireza"));
        }
    }

}