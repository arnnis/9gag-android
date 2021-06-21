package com.example.a9gag;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface APIService {
    @Headers({
            "9gag-9gag_token: Y29tLm5pbmVnYWcuYW5kcm9pZC5hcHAqNzVtNHB1eGYx",
            "9gag-app_id: com.ninegag.android.app",
            "9gag-device_uuid: v6-1624280034863-74c0e4d0-b9b5-45d6-97bd-18ce752f5119",
            "9gag-request-signature: 519718b8d6323eda54397f8f3d8ff9c39d97e88a",
            "9gag-timestamp: 1624281524824",
    })
    @GET("/v2/post-list?group=1&type=hot&itemCount=25")
    Call<PostsResponse> fetchPosts();


}
