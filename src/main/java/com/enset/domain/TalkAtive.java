package com.enset.domain;

public class TalkAtive  {



    private int number;

    public TalkAtive(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "TalkAtive{" +
                "number=" + number +
                '}';
    }
}
