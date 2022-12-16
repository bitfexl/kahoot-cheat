
package com.github.bitfexl.kahootcheat.kahoot.pojos.details;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Choice {

    @SerializedName("answer")
    @Expose
    private String answer;
    @SerializedName("correct")
    @Expose
    private Boolean correct;
    @SerializedName("languageInfo")
    @Expose
    private LanguageInfo languageInfo;

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Boolean getCorrect() {
        return correct;
    }

    public void setCorrect(Boolean correct) {
        this.correct = correct;
    }

    public LanguageInfo getLanguageInfo() {
        return languageInfo;
    }

    public void setLanguageInfo(LanguageInfo languageInfo) {
        this.languageInfo = languageInfo;
    }

}
