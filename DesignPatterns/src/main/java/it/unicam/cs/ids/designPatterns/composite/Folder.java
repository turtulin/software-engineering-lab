package it.unicam.cs.ids.designPatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    @Override
    public int getSize() {
        int size = 0;
        for (FileSystemComponent component : components) {
            size += component.getSize();
        }
        return size;
    }

    @Override
    public int getNumberOfFiles() {
        int numberOfFiles = 0;
        for (FileSystemComponent component : components) {
            numberOfFiles += component.getNumberOfFiles();
        }
        return numberOfFiles;
    }

    @Override
    public int getNumberOfFolders() {
        int numberOfFolders = 0;
        for (FileSystemComponent component : components) {
            numberOfFolders += component.getNumberOfFolders();
        }
        return numberOfFolders;
    }

    @Override
    public boolean search(String name) {
        if (name.equals(this.name)) return true;
        for (FileSystemComponent component : components) {
            if (component.search(name)) return true;
        }
        return false;
    }

    @Override
    public void printDetails() {
        System.out.println("Name: " + name + " Components: " + components.size()
                + " Folders: " + getNumberOfFolders());
        for (FileSystemComponent component : components) {
            component.printDetails();
        }
    }
}
