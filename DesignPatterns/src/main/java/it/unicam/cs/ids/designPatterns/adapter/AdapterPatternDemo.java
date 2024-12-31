package it.unicam.cs.ids.designPatterns.adapter;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "prova.mp3");
        audioPlayer.play("mp4", "prova.mp4");
        audioPlayer.play("vlc", "prova.vlc");
        audioPlayer.play("avi", "prova.avi");
    }
}
