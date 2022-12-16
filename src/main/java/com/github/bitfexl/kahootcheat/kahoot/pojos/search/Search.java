
package com.github.bitfexl.kahootcheat.kahoot.pojos.search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Search {

    @SerializedName("entities")
    @Expose
    private List<Entity> entities = null;
    @SerializedName("totalHits")
    @Expose
    private Integer totalHits;
    @SerializedName("cursor")
    @Expose
    private String cursor;
    @SerializedName("pageTimestamp")
    @Expose
    private Long pageTimestamp;

    public List<Entity> getEntities() {
        return entities;
    }

    public void setEntities(List<Entity> entities) {
        this.entities = entities;
    }

    public Integer getTotalHits() {
        return totalHits;
    }

    public void setTotalHits(Integer totalHits) {
        this.totalHits = totalHits;
    }

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public Long getPageTimestamp() {
        return pageTimestamp;
    }

    public void setPageTimestamp(Long pageTimestamp) {
        this.pageTimestamp = pageTimestamp;
    }

}
