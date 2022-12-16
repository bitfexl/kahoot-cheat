
package com.github.bitfexl.kahootcheat.kahoot.pojos.details;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Kahoot {

    @SerializedName("uuid")
    @Expose
    private String uuid;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("creator")
    @Expose
    private String creator;
    @SerializedName("creator_username")
    @Expose
    private String creatorUsername;
    @SerializedName("compatibilityLevel")
    @Expose
    private Integer compatibilityLevel;
    @SerializedName("creator_primary_usage")
    @Expose
    private String creatorPrimaryUsage;
    @SerializedName("folderId")
    @Expose
    private String folderId;
    @SerializedName("visibility")
    @Expose
    private Integer visibility;
    @SerializedName("audience")
    @Expose
    private String audience;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("quizType")
    @Expose
    private String quizType;
    @SerializedName("cover")
    @Expose
    private String cover;
    @SerializedName("coverMetadata")
    @Expose
    private CoverMetadata__1 coverMetadata;
    @SerializedName("questions")
    @Expose
    private List<Question> questions = null;
    @SerializedName("metadata")
    @Expose
    private Metadata metadata;
    @SerializedName("resources")
    @Expose
    private String resources;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("languageInfo")
    @Expose
    private LanguageInfo__2 languageInfo;
    @SerializedName("inventoryItemIds")
    @Expose
    private List<Object> inventoryItemIds = null;
    @SerializedName("isValid")
    @Expose
    private Boolean isValid;
    @SerializedName("playAsGuest")
    @Expose
    private Boolean playAsGuest;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("created")
    @Expose
    private Long created;
    @SerializedName("modified")
    @Expose
    private Long modified;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreatorUsername() {
        return creatorUsername;
    }

    public void setCreatorUsername(String creatorUsername) {
        this.creatorUsername = creatorUsername;
    }

    public Integer getCompatibilityLevel() {
        return compatibilityLevel;
    }

    public void setCompatibilityLevel(Integer compatibilityLevel) {
        this.compatibilityLevel = compatibilityLevel;
    }

    public String getCreatorPrimaryUsage() {
        return creatorPrimaryUsage;
    }

    public void setCreatorPrimaryUsage(String creatorPrimaryUsage) {
        this.creatorPrimaryUsage = creatorPrimaryUsage;
    }

    public String getFolderId() {
        return folderId;
    }

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public String getAudience() {
        return audience;
    }

    public void setAudience(String audience) {
        this.audience = audience;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getQuizType() {
        return quizType;
    }

    public void setQuizType(String quizType) {
        this.quizType = quizType;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public CoverMetadata__1 getCoverMetadata() {
        return coverMetadata;
    }

    public void setCoverMetadata(CoverMetadata__1 coverMetadata) {
        this.coverMetadata = coverMetadata;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public String getResources() {
        return resources;
    }

    public void setResources(String resources) {
        this.resources = resources;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public LanguageInfo__2 getLanguageInfo() {
        return languageInfo;
    }

    public void setLanguageInfo(LanguageInfo__2 languageInfo) {
        this.languageInfo = languageInfo;
    }

    public List<Object> getInventoryItemIds() {
        return inventoryItemIds;
    }

    public void setInventoryItemIds(List<Object> inventoryItemIds) {
        this.inventoryItemIds = inventoryItemIds;
    }

    public Boolean getIsValid() {
        return isValid;
    }

    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    public Boolean getPlayAsGuest() {
        return playAsGuest;
    }

    public void setPlayAsGuest(Boolean playAsGuest) {
        this.playAsGuest = playAsGuest;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public Long getModified() {
        return modified;
    }

    public void setModified(Long modified) {
        this.modified = modified;
    }

}
