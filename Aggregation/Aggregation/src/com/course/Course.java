package com.course;

import com.instructor.Instructor;
import com.textbook.Textbook;

public class Course {

    private String courseName;
    private Instructor instructorOne;
    private Instructor instructorTwo;
    private Textbook primaryTextbook;
    private Textbook secondaryTextbook;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public Instructor getInstructorOne() {
        if (instructorOne == null) {
            instructorOne = new Instructor();
        }
        return instructorOne;
    }

    public void setInstructorOne(String firstName, String lastName, String officeNumber) {
        this.instructorOne = new Instructor(firstName, lastName, officeNumber);
    }

    public void setInstructorOne(Instructor instructor) {
        this.instructorOne = instructor;
    }

    public void removeInstructorOne() {
        if (this.instructorOne != null) {
            this.instructorOne = null;
        }
    }

    public Instructor getInstructorTwo() {
        if (instructorTwo == null) {
            instructorTwo = new Instructor();
        }
        return instructorTwo;
    }

    public void setInstructorTwo(String firstName, String lastName, String officeNumber) {
        this.instructorTwo = new Instructor(firstName, lastName, officeNumber);
    }

    public void setInstructorTwo(Instructor instructor) {
        this.instructorTwo = instructor;
    }

    public void removeInstructorTwo() {
        if (this.instructorTwo != null) {
            this.instructorTwo = null;
        }
    }

    public Textbook getPrimaryTextbook() {
        if (primaryTextbook == null) {
            primaryTextbook = new Textbook();
        }
        return primaryTextbook;
    }

    public void setPrimaryTextbook(String title, String author, String publisher) {
        this.primaryTextbook = new Textbook(title, author, publisher);
    }

    public void setPrimaryTextbook(Textbook textbook) {
        this.primaryTextbook = textbook;
    }

    public void removePrimaryTextbook() {
        if (this.primaryTextbook != null) {
            this.primaryTextbook = null;
        }
    }

    public Textbook getSecondaryTextbook() {
        if (secondaryTextbook == null) {
            secondaryTextbook = new Textbook();
        }
        return secondaryTextbook;
    }

    public void setSecondaryTextbook(String title, String author, String publishher) {
        this.secondaryTextbook = new Textbook(title, author, publishher);
    }

    public void setSecondaryTextbook(Textbook textbook) {
        this.secondaryTextbook = textbook;
    }

    public void removeSecondaryTextbook() {
        if (this.secondaryTextbook != null) {
            this.secondaryTextbook = null;
        }
    }

    public void print() {

        System.out.println("Course Name: " + courseName);
        System.out.println("\tInstructor(s): ");
        if (instructorOne != null) {
            System.out.println("\t\t" + instructorOne.getFirstName() + " " + instructorOne.getLastName());
        }
        if (instructorTwo != null) {
            System.out.println("\t\t" + instructorTwo.getFirstName() + " " + instructorTwo.getLastName());
        }
        System.out.println("\t" + "Textbook(s): ");
        if (primaryTextbook != null) {
            System.out.println("\t\t" + primaryTextbook.getTitle());
            System.out.println("\t\t\t-" + primaryTextbook.getAuthor());
        }
        if (secondaryTextbook != null) {
            System.out.println("\t\t" + secondaryTextbook.getTitle());
            System.out.println("\t\t\t-" + secondaryTextbook.getAuthor());
        }
    }
}
