
package com.github.bitfexl.kahootcheat.kahoot.pojos.search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ImageMetadata {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("contentType")
    @Expose
    private String contentType;
    @SerializedName("resources")
    @Expose
    private String resources;
    @SerializedName("origin")
    @Expose
    private String origin;
    @SerializedName("externalRef")
    @Expose
    private String externalRef;
    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("crop")
    @Expose
    private Crop__2 crop;
    @SerializedName("effects")
    @Expose
    private List<Object> effects = null;
    @SerializedName("altText")
    @Expose
    private String altText;

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

    public String getResources() {
        return resources;
    }

    public void setResources(String resources) {
        this.resources = resources;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getExternalRef() {
        return externalRef;
    }

    public void setExternalRef(String externalRef) {
        this.externalRef = externalRef;
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

    public Crop__2 getCrop() {
        return crop;
    }

    public void setCrop(Crop__2 crop) {
        this.crop = crop;
    }

    public List<Object> getEffects() {
        return effects;
    }

    public void setEffects(List<Object> effects) {
        this.effects = effects;
    }

    public String getAltText() {
        return altText;
    }

    public void setAltText(String altText) {
        this.altText = altText;
    }

}
