package it.unicam.cs.ids.designPatterns.adapter;

public class Mp4Player implements AdvacedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        // niente
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file: " + fileName);
    }
}
