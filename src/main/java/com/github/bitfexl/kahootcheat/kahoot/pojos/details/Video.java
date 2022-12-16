
package com.github.bitfexl.kahootcheat.kahoot.pojos.details;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Video {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("startTime")
    @Expose
    private Double startTime;
    @SerializedName("endTime")
    @Expose
    private Double endTime;
    @SerializedName("service")
    @Expose
    private String service;
    @SerializedName("fullUrl")
    @Expose
    private String fullUrl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getStartTime() {
        return startTime;
    }

    public void setStartTime(Double startTime) {
        this.startTime = startTime;
    }

    public Double getEndTime() {
        return endTime;
    }

    public void setEndTime(Double endTime) {
        this.endTime = endTime;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getFullUrl() {
        return fullUrl;
    }

    public void setFullUrl(String fullUrl) {
        this.fullUrl = fullUrl;
    }

}
