/*
 * Recording.java
 *
 * Created on 18.02.2021.
 *
 * @author Krzysztof Piórkowski 300250, Uladzislau Prusevich 307857
 */

package com.company;

import java.util.Objects;

public class Recording {
    private String title;
    private String author;
    private int length;
    private String fileName;
    private String fileExtension;
    private int fileSize;

    /*@param*/
    public void setTitle(String title) {
        this.title = title;
    }

    /*@param*/
    public void setAuthor(String author) {
        this.author = author;
    }

    /*@param*/
    public void setLength(int length) {
        this.length = length;
    }

    /*@param*/
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recording recording = (Recording) o;
        return Double.compare(recording.length, length) == 0 && Double.compare(recording.fileSize, fileSize) == 0 && Objects.equals(title, recording.title) && Objects.equals(author, recording.author) && fileName.equals(recording.fileName) && fileExtension.equals(recording.fileExtension);
    }


    @Override
    public int hashCode() {
        return Objects.hash(title, author, fileName, fileExtension);
    }

    /*@param*/
    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    /*@param*/
    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    /*@return*/
    public String getTitle() {
        return title;
    }

    /*@return*/
    public String getAuthor() {
        return author;
    }

    /*@return*/
    public int getLength() {
        return length;
    }

    /*@return*/
    public String getFileName() {
        return fileName;
    }

    /*@return*/
    public String getFileExtension() {
        return fileExtension;
    }

    /*@return*/
    public int getFileSize() {
        return fileSize;
    }

    /*@return*/
    public String toString() {
        return getClass().getName() + ": " + '"' + getTitle() + '"' + " by " + getAuthor() + "; length: " +
                getLength() + " seconds; file: " + getFileName() + '.' + getFileExtension() +
                ", weighing " + getFileSize() + " bytes.";
    }

    public void play() {
        System.out.println(getFileName() + '.' + getFileExtension() + " is playing");
    }

    public void pause() {
        System.out.println(getFileName() + '.' + getFileExtension() + " is paused");
    }

    public void stop() {
        System.out.println(getFileName() + '.' + getFileExtension() + " stopped playing");
    }
}