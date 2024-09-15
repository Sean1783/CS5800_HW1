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

    public void dummyCreateFolder(String filePath) {
//        Folder subFolder = getThisSubFolder(filePath);
        Folder subFolder = dummy(filePath);
        int lastIndex = filePath.lastIndexOf("/");
        String folderString = filePath.substring(lastIndex + 1);
        subFolder.subFolders.put(folderString, subFolder);
    }

    public Folder dummy (String filePath) {
        Folder f = null;
        return getThisSubFolder(filePath, f);
    }
    
    public Folder getThisSubFolder(String filePath, Folder subFolder) {
        int splitIndex = filePath.indexOf("/");
        String openThisSubFolder;
        if (splitIndex > 0) {
            openThisSubFolder = filePath.substring(0, splitIndex);
            subFolder = subFolders.get(openThisSubFolder);
            Folder callingFolder = subFolders.get(openThisSubFolder);
            String nextSubFolder = filePath.substring(splitIndex + 1);
            return callingFolder.getThisSubFolder(nextSubFolder, subFolder);
        } else {
            return subFolder;
        }

    }

//    public Folder getThisSubFolder(String filePath) {
//        int splitIndex = filePath.indexOf("/");
////        System.out.println(this);
////        System.out.println(splitIndex);
//        if (splitIndex > 0) {
//            String openThisSubFolder = filePath.substring(0, splitIndex);
//            String nextSubFolder = filePath.substring(splitIndex + 1);
//
//            Folder subFolder = subFolders.get(openThisSubFolder);
//            if (subFolder != null) {
//                return subFolder.getThisSubFolder(nextSubFolder);
//            }
//            subFolders.get(openThisSubFolder).getThisSubFolder(nextSubFolder);
//        }
////        System.out.println(this);
//        return subFolders.get(filePath);
//    }


    public void createSubFolder(String subFolderString) {

//        Folder parentSubFolder = getThisSubFolder(subFolderString);
//
//        int lastIndex = subFolderString.lastIndexOf("/");
//        String folderString = subFolderString.substring(lastIndex + 1);
//
//        Folder subFolder = new Folder(folderString);
//        parentSubFolder.subFolders.put(folderString, subFolder);

        int splitIndex = subFolderString.indexOf("/");
        if (splitIndex > 0) {
            String openThisSubFolder = subFolderString.substring(0, splitIndex);
            String nextSubFolder = subFolderString.substring(splitIndex + 1);
            if (subFolders.get(openThisSubFolder) != null) {
                subFolders.get(openThisSubFolder).createSubFolder(nextSubFolder);
            }
        } else {
            Folder subFolder = new Folder(subFolderString);
            subFolders.put(subFolderString, subFolder);
        }
    }

    public void deleteThisSubFolder(String filePath) {

        int splitIndex = filePath.indexOf("/");
        if (splitIndex > 0) {
            String openThisSubFolder = filePath.substring(0, splitIndex);
            String nextSubFolder = filePath.substring(splitIndex + 1);
            if (subFolders.get(openThisSubFolder) != null) {
                subFolders.get(openThisSubFolder).deleteThisSubFolder(nextSubFolder);
            }
        } else {
            subFolders.remove(filePath);
        }
    }

    public void deleteSubFolder(String subFolderName) {
        subFolders.remove(subFolderName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, File> getAllFiles() {
        return files;
    }

    public File getFile(String fileName) {
        return files.get(fileName);
    }

    public Folder getSubFolder(String subFolderName) {
        return subFolders.get(subFolderName);
    }

    public HashMap<String, Folder> getSubFolders() {
        return subFolders;
    }

    public void addFile(String folderPath, String fileName) {

        int splitIndex = folderPath.indexOf("/");
        if (splitIndex > 0) {
            String openThisSubFolder = folderPath.substring(0, splitIndex);
            String nextSubFolder = folderPath.substring(splitIndex + 1);
            if (subFolders.get(openThisSubFolder) != null) {
                subFolders.get(openThisSubFolder).addFile(nextSubFolder, fileName);
            }
        } else {
            File file = new File(fileName);
            subFolders.get(folderPath).files.put(fileName, file);

        }
    }


    public void removeFile(String fileName) {
        files.remove(fileName);
    }

    public void moveFolder(String moveThisFolder, Folder sourceFolder) {
        Folder folderToMove = sourceFolder.getSubFolder(moveThisFolder);
        subFolders.put(folderToMove.getName(), folderToMove);
        sourceFolder.deleteSubFolder(moveThisFolder);
    }

    @Override
    public String toString() {
        return "Folder{" +
                "name='" + name + '\'' +
//                ", subFolders=" + subFolders +
//                ", files=" + files +
                '}';
    }

//    public int addFile(File file) {
//        files.put(file.getName(), file);
//        return files.size();
//    }

//    public int addFile(String fileName) {
//        File fileToAdd = new File(fileName);
//        files.add(fileToAdd);
//        return files.size();
//    }

//    public void setFiles(ArrayList<File> existingFileList) {
////        this.files = files;
//        for (File file : existingFileList) {
//            File fileToAdd = new File(file);
//            files.add(fileToAdd);
//            file = null;
//        }
//    }



//    public int moveFile(File fileToMove) {
//        addFile(fileToMove.getName());
//        fileToMove = null;
//        return files.size();
//    }

//    public int removeFile(File file) {
//        files.remove(file);
//        return files.size();
//    }

//    public ArrayList<Folder> getSubFolders() {
//        return subFolders;
//    }

//    public int addFolder(String folderName) {
////        subFolders.add(folder);
//        Folder folderToAdd = new Folder(folderName);
//        subFolders.add(folderToAdd);
//        return subFolders.size();
//    }

//    public int removeFolder(Folder folder) {
//        folder.delete();
//        subFolders.remove(folder);
//        return subFolders.size();
//    }

//    public void setSubFolders(ArrayList<Folder> subFolders) {
//        this.subFolders = subFolders;
//    }

//    public void printFolderName() {
//        System.out.println(name);
//    }

//    public void delete() {
//
//        for (Folder subFolder : subFolders) {
//            subFolder.delete();
//        }
//
//        for (int file = files.size() - 1; file >= 0; file--) {
//            files.remove(file);
//        }
//
//        for (int subFolder = subFolders.size() - 1; subFolder >= 0; subFolder--) {
//            subFolders.remove(subFolder);
//        }
//    }

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
