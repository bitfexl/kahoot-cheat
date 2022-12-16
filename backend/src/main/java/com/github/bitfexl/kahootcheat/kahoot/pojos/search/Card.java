
package com.github.bitfexl.kahootcheat.kahoot.pojos.search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Card {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("cover")
    @Expose
    private String cover;
    @SerializedName("coverMetadata")
    @Expose
    private CoverMetadata coverMetadata;
    @SerializedName("draftExists")
    @Expose
    private Boolean draftExists;
    @SerializedName("inventoryItemIds")
    @Expose
    private List<Object> inventoryItemIds = null;
    @SerializedName("number_of_questions")
    @Expose
    private Integer numberOfQuestions;
    @SerializedName("creator")
    @Expose
    private String creator;
    @SerializedName("creator_username")
    @Expose
    private String creatorUsername;
    @SerializedName("creatorPrimaryUsageType")
    @Expose
    private String creatorPrimaryUsageType;
    @SerializedName("creator_avatar")
    @Expose
    private CreatorAvatar creatorAvatar;
    @SerializedName("badges")
    @Expose
    private List<String> badges = null;
    @SerializedName("visibility")
    @Expose
    private Integer visibility;
    @SerializedName("locked")
    @Expose
    private Boolean locked;
    @SerializedName("writeProtection")
    @Expose
    private Boolean writeProtection;
    @SerializedName("last_edit")
    @Expose
    private LastEdit lastEdit;
    @SerializedName("featured")
    @Expose
    private Boolean featured;
    @SerializedName("young_featured")
    @Expose
    private Boolean youngFeatured;
    @SerializedName("sponsored")
    @Expose
    private Boolean sponsored;
    @SerializedName("moderation")
    @Expose
    private Moderation moderation;
    @SerializedName("resolution")
    @Expose
    private String resolution;
    @SerializedName("draft")
    @Expose
    private Boolean draft;
    @SerializedName("combined")
    @Expose
    private Boolean combined;
    @SerializedName("compatibility_level")
    @Expose
    private Integer compatibilityLevel;
    @SerializedName("sample_questions")
    @Expose
    private List<SampleQuestion> sampleQuestions = null;
    @SerializedName("number_of_plays")
    @Expose
    private Integer numberOfPlays;
    @SerializedName("number_of_players")
    @Expose
    private Integer numberOfPlayers;
    @SerializedName("total_favourites")
    @Expose
    private Integer totalFavourites;
    @SerializedName("question_types")
    @Expose
    private List<String> questionTypes = null;
    @SerializedName("created")
    @Expose
    private Long created;
    @SerializedName("modified")
    @Expose
    private Long modified;
    @SerializedName("access")
    @Expose
    private Access access;
    @SerializedName("duplication_disabled")
    @Expose
    private Boolean duplicationDisabled;
    @SerializedName("uuid")
    @Expose
    private String uuid;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public CoverMetadata getCoverMetadata() {
        return coverMetadata;
    }

    public void setCoverMetadata(CoverMetadata coverMetadata) {
        this.coverMetadata = coverMetadata;
    }

    public Boolean getDraftExists() {
        return draftExists;
    }

    public void setDraftExists(Boolean draftExists) {
        this.draftExists = draftExists;
    }

    public List<Object> getInventoryItemIds() {
        return inventoryItemIds;
    }

    public void setInventoryItemIds(List<Object> inventoryItemIds) {
        this.inventoryItemIds = inventoryItemIds;
    }

    public Integer getNumberOfQuestions() {
        return numberOfQuestions;
    }

    public void setNumberOfQuestions(Integer numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
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

    public String getCreatorPrimaryUsageType() {
        return creatorPrimaryUsageType;
    }

    public void setCreatorPrimaryUsageType(String creatorPrimaryUsageType) {
        this.creatorPrimaryUsageType = creatorPrimaryUsageType;
    }

    public CreatorAvatar getCreatorAvatar() {
        return creatorAvatar;
    }

    public void setCreatorAvatar(CreatorAvatar creatorAvatar) {
        this.creatorAvatar = creatorAvatar;
    }

    public List<String> getBadges() {
        return badges;
    }

    public void setBadges(List<String> badges) {
        this.badges = badges;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public Boolean getWriteProtection() {
        return writeProtection;
    }

    public void setWriteProtection(Boolean writeProtection) {
        this.writeProtection = writeProtection;
    }

    public LastEdit getLastEdit() {
        return lastEdit;
    }

    public void setLastEdit(LastEdit lastEdit) {
        this.lastEdit = lastEdit;
    }

    public Boolean getFeatured() {
        return featured;
    }

    public void setFeatured(Boolean featured) {
        this.featured = featured;
    }

    public Boolean getYoungFeatured() {
        return youngFeatured;
    }

    public void setYoungFeatured(Boolean youngFeatured) {
        this.youngFeatured = youngFeatured;
    }

    public Boolean getSponsored() {
        return sponsored;
    }

    public void setSponsored(Boolean sponsored) {
        this.sponsored = sponsored;
    }

    public Moderation getModeration() {
        return moderation;
    }

    public void setModeration(Moderation moderation) {
        this.moderation = moderation;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public Boolean getDraft() {
        return draft;
    }

    public void setDraft(Boolean draft) {
        this.draft = draft;
    }

    public Boolean getCombined() {
        return combined;
    }

    public void setCombined(Boolean combined) {
        this.combined = combined;
    }

    public Integer getCompatibilityLevel() {
        return compatibilityLevel;
    }

    public void setCompatibilityLevel(Integer compatibilityLevel) {
        this.compatibilityLevel = compatibilityLevel;
    }

    public List<SampleQuestion> getSampleQuestions() {
        return sampleQuestions;
    }

    public void setSampleQuestions(List<SampleQuestion> sampleQuestions) {
        this.sampleQuestions = sampleQuestions;
    }

    public Integer getNumberOfPlays() {
        return numberOfPlays;
    }

    public void setNumberOfPlays(Integer numberOfPlays) {
        this.numberOfPlays = numberOfPlays;
    }

    public Integer getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(Integer numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public Integer getTotalFavourites() {
        return totalFavourites;
    }

    public void setTotalFavourites(Integer totalFavourites) {
        this.totalFavourites = totalFavourites;
    }

    public List<String> getQuestionTypes() {
        return questionTypes;
    }

    public void setQuestionTypes(List<String> questionTypes) {
        this.questionTypes = questionTypes;
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

    public Access getAccess() {
        return access;
    }

    public void setAccess(Access access) {
        this.access = access;
    }

    public Boolean getDuplicationDisabled() {
        return duplicationDisabled;
    }

    public void setDuplicationDisabled(Boolean duplicationDisabled) {
        this.duplicationDisabled = duplicationDisabled;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

}
