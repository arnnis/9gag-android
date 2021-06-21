package com.example.a9gag;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {
    @GET("/users")
    Call<ArrayList<User>> fetchUsers();
}
