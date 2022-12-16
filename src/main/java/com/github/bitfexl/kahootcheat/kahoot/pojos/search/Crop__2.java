
package com.github.bitfexl.kahootcheat.kahoot.pojos.search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Crop__2 {

    @SerializedName("origin")
    @Expose
    private Origin__2 origin;
    @SerializedName("target")
    @Expose
    private Target__2 target;
    @SerializedName("circular")
    @Expose
    private Boolean circular;

    public Origin__2 getOrigin() {
        return origin;
    }

    public void setOrigin(Origin__2 origin) {
        this.origin = origin;
    }

    public Target__2 getTarget() {
        return target;
    }

    public void setTarget(Target__2 target) {
        this.target = target;
    }

    public Boolean getCircular() {
        return circular;
    }

    public void setCircular(Boolean circular) {
        this.circular = circular;
    }

}
