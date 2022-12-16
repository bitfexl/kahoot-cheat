
package com.github.bitfexl.kahootcheat.kahoot.pojos.search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CreatorAvatar {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("contentType")
    @Expose
    private String contentType;
    @SerializedName("crop")
    @Expose
    private Crop__1 crop;
    @SerializedName("altText")
    @Expose
    private String altText;
    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("height")
    @Expose
    private Integer height;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Crop__1 getCrop() {
        return crop;
    }

    public void setCrop(Crop__1 crop) {
        this.crop = crop;
    }

    public String getAltText() {
        return altText;
    }

    public void setAltText(String altText) {
        this.altText = altText;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

}
