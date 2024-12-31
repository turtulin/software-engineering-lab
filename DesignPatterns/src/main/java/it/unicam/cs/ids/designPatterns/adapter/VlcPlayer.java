package it.unicam.cs.ids.designPatterns.adapter;

public class VlcPlayer implements AdvacedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing VLC file: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // niente
    }
}
