package com.company;

public class Main {
    public static void main(String[] args) {
        Recording track_1 = new Recording();
        track_1.setTitle("Africa");
        track_1.setAuthor("Toto");
        track_1.setLength(295);
        track_1.setFileName("toto-africa");
        track_1.setFileExtension("MP3");
        track_1.setFileSize(7829213);

        track_1.play();
        track_1.pause();

        System.out.println(track_1.toString());
    }
}
