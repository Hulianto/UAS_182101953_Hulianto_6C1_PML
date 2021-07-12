package com.hulianto182101953.userprojectcrud.model;

import com.google.gson.annotations.SerializedName;

public class PostPutDelUser {
    @SerializedName("status")
    String status;
    @SerializedName("result")
    User user;
    @SerializedName("message")
    String message;

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public User getUser() {
        return user;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
