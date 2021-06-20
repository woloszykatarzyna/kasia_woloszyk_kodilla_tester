package com.kodilla.collections.adv.immutable.homework;

public final class Task {

    protected final int duration;
    protected final String title;

    public Task(int duration, String title) {
        this.duration = duration;
        this.title = title;
    }
    public int getDuration() {
        return duration;
    }
    public String getTitle() {
        return title;
    }
}

