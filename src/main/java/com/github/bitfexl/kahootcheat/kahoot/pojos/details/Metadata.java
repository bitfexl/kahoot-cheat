
package com.github.bitfexl.kahootcheat.kahoot.pojos.details;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Metadata {

    @SerializedName("resolution")
    @Expose
    private String resolution;
    @SerializedName("moderation")
    @Expose
    private Moderation__1 moderation;
    @SerializedName("access")
    @Expose
    private Access__1 access;
    @SerializedName("sponsored")
    @Expose
    private Boolean sponsored;
    @SerializedName("duplicationProtection")
    @Expose
    private Boolean duplicationProtection;
    @SerializedName("lastEdit")
    @Expose
    private LastEdit__1 lastEdit;
    @SerializedName("versionMetadata")
    @Expose
    private VersionMetadata versionMetadata;

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public Moderation__1 getModeration() {
        return moderation;
    }

    public void setModeration(Moderation__1 moderation) {
        this.moderation = moderation;
    }

    public Access__1 getAccess() {
        return access;
    }

    public void setAccess(Access__1 access) {
        this.access = access;
    }

    public Boolean getSponsored() {
        return sponsored;
    }

    public void setSponsored(Boolean sponsored) {
        this.sponsored = sponsored;
    }

    public Boolean getDuplicationProtection() {
        return duplicationProtection;
    }

    public void setDuplicationProtection(Boolean duplicationProtection) {
        this.duplicationProtection = duplicationProtection;
    }

    public LastEdit__1 getLastEdit() {
        return lastEdit;
    }

    public void setLastEdit(LastEdit__1 lastEdit) {
        this.lastEdit = lastEdit;
    }

    public VersionMetadata getVersionMetadata() {
        return versionMetadata;
    }

    public void setVersionMetadata(VersionMetadata versionMetadata) {
        this.versionMetadata = versionMetadata;
    }

}
