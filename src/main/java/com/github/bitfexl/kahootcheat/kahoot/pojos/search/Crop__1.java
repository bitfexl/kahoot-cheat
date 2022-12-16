
package com.github.bitfexl.kahootcheat.kahoot.pojos.search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Crop__1 {

    @SerializedName("origin")
    @Expose
    private Origin__1 origin;
    @SerializedName("target")
    @Expose
    private Target__1 target;
    @SerializedName("circular")
    @Expose
    private Boolean circular;

    public Origin__1 getOrigin() {
        return origin;
    }

    public void setOrigin(Origin__1 origin) {
        this.origin = origin;
    }

    public Target__1 getTarget() {
        return target;
    }

    public void setTarget(Target__1 target) {
        this.target = target;
    }

    public Boolean getCircular() {
        return circular;
    }

    public void setCircular(Boolean circular) {
        this.circular = circular;
    }

}
