package com.example.umerfarooq.uolbuscheckinsystem;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Umer Farooq on 12/17/2017.
 */

public interface Api {
    @GET("api/buses")
    Call<List<Bus>> getBuses();
}
