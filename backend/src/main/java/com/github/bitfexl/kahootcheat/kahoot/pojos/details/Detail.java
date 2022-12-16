
package com.github.bitfexl.kahootcheat.kahoot.pojos.details;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Detail {

    @SerializedName("card")
    @Expose
    private Card card;
    @SerializedName("kahoot")
    @Expose
    private Kahoot kahoot;

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Kahoot getKahoot() {
        return kahoot;
    }

    public void setKahoot(Kahoot kahoot) {
        this.kahoot = kahoot;
    }

}
