package it.unicam.cs.ids.designPatterns.composite;

public class File implements FileSystemComponent {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public int getNumberOfFiles() {
        return 1;
    }

    @Override
    public int getNumberOfFolders() {
        return 0;
    }

    @Override
    public boolean search(String name) {
        return name.equals(this.name);
    }

    @Override
    public void printDetails() {
        System.out.println("File name: " + name + " size: " + size);
    }
}
