
package com.github.bitfexl.kahootcheat.kahoot.pojos.details;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LastEdit__1 {

    @SerializedName("editorUserId")
    @Expose
    private String editorUserId;
    @SerializedName("editorUsername")
    @Expose
    private String editorUsername;
    @SerializedName("editTimestamp")
    @Expose
    private Long editTimestamp;

    public String getEditorUserId() {
        return editorUserId;
    }

    public void setEditorUserId(String editorUserId) {
        this.editorUserId = editorUserId;
    }

    public String getEditorUsername() {
        return editorUsername;
    }

    public void setEditorUsername(String editorUsername) {
        this.editorUsername = editorUsername;
    }

    public Long getEditTimestamp() {
        return editTimestamp;
    }

    public void setEditTimestamp(Long editTimestamp) {
        this.editTimestamp = editTimestamp;
    }

}
