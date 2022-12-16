
package com.github.bitfexl.kahootcheat.kahoot.pojos.details;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LanguageInfo__1 {

    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("lastUpdatedOn")
    @Expose
    private Long lastUpdatedOn;
    @SerializedName("readAloudSupported")
    @Expose
    private Boolean readAloudSupported;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Long getLastUpdatedOn() {
        return lastUpdatedOn;
    }

    public void setLastUpdatedOn(Long lastUpdatedOn) {
        this.lastUpdatedOn = lastUpdatedOn;
    }

    public Boolean getReadAloudSupported() {
        return readAloudSupported;
    }

    public void setReadAloudSupported(Boolean readAloudSupported) {
        this.readAloudSupported = readAloudSupported;
    }

}
