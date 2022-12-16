
package com.github.bitfexl.kahootcheat.kahoot.pojos.details;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Moderation {

    @SerializedName("flaggedTimestamp")
    @Expose
    private Long flaggedTimestamp;
    @SerializedName("timestampResolution")
    @Expose
    private Long timestampResolution;
    @SerializedName("resolution")
    @Expose
    private String resolution;

    public Long getFlaggedTimestamp() {
        return flaggedTimestamp;
    }

    public void setFlaggedTimestamp(Long flaggedTimestamp) {
        this.flaggedTimestamp = flaggedTimestamp;
    }

    public Long getTimestampResolution() {
        return timestampResolution;
    }

    public void setTimestampResolution(Long timestampResolution) {
        this.timestampResolution = timestampResolution;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

}
