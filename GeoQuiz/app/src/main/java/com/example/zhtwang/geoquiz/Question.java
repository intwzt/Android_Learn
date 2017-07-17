package com.example.zhtwang.geoquiz;

/**
 * Created by zhtwang on 17/07/2017.
 */

public class Question {

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public int getTextResId() {
        return mTextResId;

    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    private int mTextResId;
    private boolean mAnswerTrue;
    public Question(int textResId, boolean answerTrue) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }

}
