
package com.github.bitfexl.kahootcheat.kahoot.pojos.details;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Question {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("question")
    @Expose
    private String question;
    @SerializedName("time")
    @Expose
    private Integer time;
    @SerializedName("points")
    @Expose
    private Boolean points;
    @SerializedName("pointsMultiplier")
    @Expose
    private Integer pointsMultiplier;
    @SerializedName("choices")
    @Expose
    private List<Choice> choices = null;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("imageMetadata")
    @Expose
    private ImageMetadata__1 imageMetadata;
    @SerializedName("resources")
    @Expose
    private String resources;
    @SerializedName("video")
    @Expose
    private Video video;
    @SerializedName("questionFormat")
    @Expose
    private Integer questionFormat;
    @SerializedName("languageInfo")
    @Expose
    private LanguageInfo__1 languageInfo;
    @SerializedName("media")
    @Expose
    private List<Object> media = null;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Boolean getPoints() {
        return points;
    }

    public void setPoints(Boolean points) {
        this.points = points;
    }

    public Integer getPointsMultiplier() {
        return pointsMultiplier;
    }

    public void setPointsMultiplier(Integer pointsMultiplier) {
        this.pointsMultiplier = pointsMultiplier;
    }

    public List<Choice> getChoices() {
        return choices;
    }

    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ImageMetadata__1 getImageMetadata() {
        return imageMetadata;
    }

    public void setImageMetadata(ImageMetadata__1 imageMetadata) {
        this.imageMetadata = imageMetadata;
    }

    public String getResources() {
        return resources;
    }

    public void setResources(String resources) {
        this.resources = resources;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public Integer getQuestionFormat() {
        return questionFormat;
    }

    public void setQuestionFormat(Integer questionFormat) {
        this.questionFormat = questionFormat;
    }

    public LanguageInfo__1 getLanguageInfo() {
        return languageInfo;
    }

    public void setLanguageInfo(LanguageInfo__1 languageInfo) {
        this.languageInfo = languageInfo;
    }

    public List<Object> getMedia() {
        return media;
    }

    public void setMedia(List<Object> media) {
        this.media = media;
    }

}
