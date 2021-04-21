package com.company;

import java.util.Objects;

public class VideoRecording extends Recording {
    private int dimensionX;
    private int dimensionY;
    private int colorBits;
    private int audioChannels;

    /*@param*/
    public void setDimensionX(int x) {
        this.dimensionX = x;
    }

    /*@param*/
    public void setDimensionY(int y) {
        this.dimensionY = y;
    }

    /*@param*/
    public void setColorBits(int colorBits) {
        this.colorBits = colorBits;
    }

    /*@param*/
    public void setAudioChannels(int audioChannels) {
        this.audioChannels = audioChannels;
    }

    /*@return*/
    public int getDimensionX() {
        return dimensionX;
    }

    /*@return*/
    public int getDimensionY() {
        return dimensionY;
    }

    /*@return*/
    public int getColorBits() {
        return colorBits;
    }

    /*@return*/
    public int getAudioChannels() {
        return audioChannels;
    }

    /*@return*/
    public String toString() {
        return getClass().getName() + ": " + '"' + getTitle() + '"' + " by " + getAuthor() + "; length: " +
                getLength() + " seconds; resolution: " + getDimensionX() + "px x " + getDimensionY() + "px; " +
                getColorBits() + " color bits; " + getAudioChannels() + " audio channels; file: " +
                getFileName() + '.' + getFileExtension() + ", weighing " + getFileSize() + " bytes.";
    }

    public void play() {
        System.out.println(getFileName() + '.' + getFileExtension() + " is playing");
    }

    public void pause() {
        System.out.println(getFileName() + '.' + getFileExtension() + " is paused");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        VideoRecording that = (VideoRecording) o;
        return dimensionX == that.dimensionX && dimensionY == that.dimensionY && colorBits == that.colorBits && audioChannels == that.audioChannels;
    }

    public void stop() {
        System.out.println(getFileName() + '.' + getFileExtension() + " stopped playing");
    }
}
