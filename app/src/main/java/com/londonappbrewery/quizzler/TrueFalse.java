package com.londonappbrewery.quizzler;

public class TrueFalse {

    private int mQuestionId;
    private boolean mAnswer;

    public TrueFalse(int mQuestionId, boolean mAnswer) {
        this.mQuestionId = mQuestionId;
        this.mAnswer = mAnswer;
    }

    public int getQuestionId() {
        return mQuestionId;
    }

    public void setQuestionId(int questionId) {
        mQuestionId = questionId;
    }

    public boolean isAnswer() {
        return mAnswer;
    }

    public void setAnswer(boolean answer) {
        mAnswer = answer;
    }
}
