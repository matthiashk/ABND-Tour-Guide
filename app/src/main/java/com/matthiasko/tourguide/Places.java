package com.matthiasko.tourguide;

import android.graphics.drawable.Drawable;

/**
 * Created by matthiasko on 7/31/16.
 */
public class Places {

    private String name;
    private String address;
    private String schedule;
    private String description;
    private Drawable photo;

    public Drawable getPhoto() {
        return photo;
    }

    public void setPhoto(Drawable photo) {
        this.photo = photo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
