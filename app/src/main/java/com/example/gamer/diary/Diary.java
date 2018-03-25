package com.example.gamer.diary;

import android.support.annotation.NonNull;

import java.io.File;

/**
 * Created by gamer on 2018/3/25.
 */

public class Diary {
    private String title;
    private File image;
    private Long date;
    private File textFile;
    private String key;

    public Diary(String title, File image, Long date, File textFile) {
        this.title = title;
        this.image = image;
        this.date = date;
        this.textFile = textFile;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public File getImage() {
        return image;
    }

    public void setImage(File image) {
        this.image = image;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public File getTextFile() {
        return textFile;
    }

    public void setTextFile(File textFile) {
        this.textFile = textFile;
    }
}
