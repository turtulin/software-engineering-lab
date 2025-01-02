package it.unicam.cs.ids.designPatterns.composite;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("Document.txt", 10);
        File file2 = new File("Image.jpg", 50);

        Folder musicFolder = new Folder("Music");
        File file3 = new File("Song.mp3", 30);
        musicFolder.addComponent(file3);

        Folder rootFolder = new Folder("Root");
        rootFolder.addComponent(file1);
        rootFolder.addComponent(file2);
        rootFolder.addComponent(musicFolder);

        rootFolder.printDetails();

        int totalSize = rootFolder.getSize();
        int totalFiles = rootFolder.getNumberOfFiles();
        int totalFolders = rootFolder.getNumberOfFolders();

        System.out.println("Total Size of FileSystem: " + totalSize + " KB");
        System.out.println("Total Number of Files: " + totalFiles);
        System.out.println("Total Number of Folders: " + totalFolders);

        String searchTarget = "Song.mp3";
        if (rootFolder.search(searchTarget)) {
            System.out.println("Found: " + searchTarget);
        } else {
            System.out.println("Not Found: " + searchTarget);
        }
    }
}
