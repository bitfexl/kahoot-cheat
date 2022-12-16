
package com.github.bitfexl.kahootcheat.kahoot.pojos.details;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Access__1 {

    @SerializedName("groupRead")
    @Expose
    private List<String> groupRead = null;
    @SerializedName("folderGroupIds")
    @Expose
    private List<Object> folderGroupIds = null;
    @SerializedName("features")
    @Expose
    private List<Object> features = null;

    public List<String> getGroupRead() {
        return groupRead;
    }

    public void setGroupRead(List<String> groupRead) {
        this.groupRead = groupRead;
    }

    public List<Object> getFolderGroupIds() {
        return folderGroupIds;
    }

    public void setFolderGroupIds(List<Object> folderGroupIds) {
        this.folderGroupIds = folderGroupIds;
    }

    public List<Object> getFeatures() {
        return features;
    }

    public void setFeatures(List<Object> features) {
        this.features = features;
    }

}
