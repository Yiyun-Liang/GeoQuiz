package com.example.isa.geoquiz;

/**
 * Created by isa on 2016-07-26.
 */
public class Questions {

    private int mTextResId;
    private boolean mAnswerTrue;


    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public Questions(int textId, boolean answerTrue){
        this.mTextResId = textId;
        this.mAnswerTrue = answerTrue;
    }
}
