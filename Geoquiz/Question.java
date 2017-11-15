package com.bignerdrach.android.geoquiz;

/**
 * Created by kauchqui on 12/23/2016.
 */

public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;
    private boolean cheated;
    //textResId is an integer because it is the R.Id of the string in strings.xml
    public Question(int textResId, boolean answerTrue)
    {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }
    public Question(int textResId, boolean answerTrue, boolean cheated){
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
        cheated = true;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }
    public boolean cheater() {
        return cheated;
    }
    public void setCheated(boolean cheat){
        this.cheated = cheat;
    }
    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}