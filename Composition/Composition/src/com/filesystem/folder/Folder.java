package com.filesystem.folder;

import com.filesystem.file.File;

import java.util.HashMap;

public class Folder {

    private String name;
    private HashMap<String, Folder> subFolders;
    private HashMap<String, File> files;

    public Folder(String name) {
        this.name = name;
        subFolders = new HashMap<String, Folder>();
        files = new HashMap<String, File>();
    }

    private Folder getThisSubFolder(String filePath) {
        int splitIndex = filePath.indexOf("/");

        if (splitIndex > 0) {
            String openThisSubFolder = filePath.substring(0, splitIndex);
            String nextSubFolder = filePath.substring(splitIndex + 1);
            Folder subFolder = subFolders.get(openThisSubFolder);
            if (subFolder != null) {
                return subFolder.getThisSubFolder(nextSubFolder);
            }
        }
        return subFolders.get(filePath);
    }

    public void makeSubFolder(String fullFilePath) {
        int splitIndex = fullFilePath.lastIndexOf("/");
        if (splitIndex > 0) {
            String folderToCreateName = fullFilePath.substring(splitIndex + 1);
            Folder parentFolder = getThisSubFolder(fullFilePath.substring(0, splitIndex));
            Folder folderToCreate = new Folder(folderToCreateName);
            parentFolder.subFolders.put(folderToCreateName, folderToCreate);
        } else {

            subFolders.put(fullFilePath, new Folder(fullFilePath));
        }
    }

    public void deleteThisSubFolder(String filePath) {

        int splitIndex = filePath.lastIndexOf("/");
        if (splitIndex > 0) {
            String folderToDeleteName = filePath.substring(splitIndex + 1);
            Folder parentFolder = getThisSubFolder(filePath.substring(0, splitIndex));
            parentFolder.removeSubFolder(folderToDeleteName);
        } else {
            removeSubFolder(filePath);
        }
    }

    private void removeSubFolder(String subFolderName) {
        subFolders.remove(subFolderName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private HashMap<String, File> getAllFiles() {
        return files;
    }

    private File getFile(String fileName) {
        return files.get(fileName);
    }

    private HashMap<String, Folder> getSubFolders() {
        return subFolders;
    }

    public void addFile(String folderPath, String fileName) {
        Folder parentFolder = getThisSubFolder(folderPath);
        File file = new File(fileName);
        parentFolder.putFile(fileName, file);
    }

    private void putFile(String fileName, File fileToPut) {
        files.put(fileName, fileToPut);
    }

    public void removeFile(String fileName) {
        files.remove(fileName);
    }

    @Override
    public String toString() {
        return "Folder{" +
                "name='" + name + '\'' +
                ", subFolders=" + subFolders +
                ", files=" + files +
                '}';
    }

    public void print(int margin) {

        String marginSpace = "";
        for (int i = 0;  i < margin; i++) {
            marginSpace += " ";
        }
        System.out.println(marginSpace + "[" + this.name + "]");
        margin += 2;

        for (Folder subFolder : subFolders.values()) {
            subFolder.print(margin);
        }

        for (File file : files.values()) {
            file.print(margin);
        }

    }

}
