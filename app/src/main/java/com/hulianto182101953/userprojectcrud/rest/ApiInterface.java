package com.hulianto182101953.userprojectcrud.rest;

import com.hulianto182101953.userprojectcrud.model.GetUser;
import com.hulianto182101953.userprojectcrud.model.PostPutDelUser;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ApiInterface {
    @GET("users")
    Call<GetUser>getUser();
    @FormUrlEncoded
    @POST("users")
    Call<PostPutDelUser>postUser(@Field("name") String name,
                                 @Field("job") String job);
    @FormUrlEncoded
    @PUT("users")
    Call<PostPutDelUser>putUser(@Field("name") String name,
                                 @Field("job") String job);
    @FormUrlEncoded
    @HTTP(method = "DELETE",path = "users",hasBody = true)
    Call<PostPutDelUser>deleteUser(@Field("id") String id);
}
