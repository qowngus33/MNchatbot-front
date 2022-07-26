package com.example.myapplication.ui.newlogin;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

interface LoginAPI {
    //@통신 방식("통신 API명")
    @POST("/list")
    Call<LoginResponse> getLoginResponse(@Body LoginRequest loginRequest);
}