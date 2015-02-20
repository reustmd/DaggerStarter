package com.rx.demo.rest;

import com.rx.demo.model.User;

import java.util.ArrayList;

import retrofit.http.GET;
/**
 * Created by MikeN on 8/16/14.
 */
public interface Github {

    @GET("/users")
    rx.Observable<ArrayList<User>> users();
}
