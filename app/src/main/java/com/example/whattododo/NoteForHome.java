package com.example.whattododo;

import io.realm.RealmObject;

public class NoteForHome extends RealmObject {
    String title;
    long createdTime;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(long createdTime) {
        this.createdTime = createdTime;
    }
}
