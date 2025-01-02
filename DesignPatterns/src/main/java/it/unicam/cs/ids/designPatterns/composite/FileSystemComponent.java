package it.unicam.cs.ids.designPatterns.composite;

public interface FileSystemComponent {
    int getSize();
    int getNumberOfFiles();
    int getNumberOfFolders();
    boolean search(String name);
    void printDetails();
}
