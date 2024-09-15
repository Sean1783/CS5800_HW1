package com.filesystem.file;

public class File {

    private String name;

    public File(String name) {
        this.name = name;
    }

    public File(File fileToCopy) {
        this.name = fileToCopy.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print(int margin) {
        String marginSpace = "";
        for (int i = 0;  i < margin; i++) {
            marginSpace += " ";
        }
        System.out.println(marginSpace +  name);
    }

}
