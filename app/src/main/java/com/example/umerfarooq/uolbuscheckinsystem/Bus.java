package com.example.umerfarooq.uolbuscheckinsystem;

/**
 * Created by Umer Farooq on 12/17/2017.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Bus {

    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("bus_number")
    @Expose
    public String busNumber;
    @SerializedName("time")
    @Expose
    public String time;
    @SerializedName("availablity")
    @Expose
    public Integer availablity;
    @SerializedName("driver_id")
    @Expose
    public Integer driverId;
    @SerializedName("route_id")
    @Expose
    public Integer routeId;
    @SerializedName("created_at")
    @Expose
    public String createdAt;
    @SerializedName("updated_at")
    @Expose
    public String updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getAvailablity() {
        return availablity;
    }

    public void setAvailablity(Integer availablity) {
        this.availablity = availablity;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public Integer getRouteId() {
        return routeId;
    }

    public void setRouteId(Integer routeId) {
        this.routeId = routeId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}
