package com.swathi;

public class Songs {
    private String title;
    private double duration;

    public Songs(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return  this.title +": "+ this.duration ;
    }
}
