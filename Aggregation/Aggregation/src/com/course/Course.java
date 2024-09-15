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
        instructorOne = new Instructor();
        instructorTwo = new Instructor();
        primaryTextbook = new Textbook();
        secondaryTextbook = new Textbook();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Instructor getInstructorOne() {
        return instructorOne;
    }

    public void setInstructorOne(Instructor instructorOne) {
        this.instructorOne = instructorOne;
    }

    public Instructor getInstructorTwo() {
        return instructorTwo;
    }

    public void setInstructorTwo(Instructor instructorTwo) {
        this.instructorTwo = instructorTwo;
    }

    public String getInstructorOneFirstName() {
        return instructorOne.getFirstName();
    }

    public void setInstructorOneFirstName(String instructorOneFirstName) {
        this.instructorOne.setFirstName(instructorOneFirstName);
    }

    public String getInstructorOneLastName() {
        return instructorOne.getLastName();
    }

    public void setInstructorOneLastName(String instructorOneLastName) {
        this.instructorOne.setLastName(instructorOneLastName);
    }

    public String getInstructorOneOfficeNumber() {
        return instructorOne.getOfficeNumber();
    }

    public void setInstructorOneOfficeNumber(String instructorOneOfficeNumber) {
        this.instructorOne.setOfficeNumber(instructorOneOfficeNumber);
    }

    public String getInstructorTwoFirstName() {
        return instructorTwo.getFirstName();
    }

    public void setInstructorTwoFirstName(String instructorTwoFirstName) {
        this.instructorTwo.setFirstName(instructorTwoFirstName);
    }

    public String getInstructorTwoLastName() {
        return instructorTwo.getLastName();
    }

    public void setInstructorTwoLastName(String instructorTwoLastName) {
        this.instructorTwo.setLastName(instructorTwoLastName);
    }

    public String getInstructorTwoOfficeNumber() {
        return instructorTwo.getOfficeNumber();
    }

    public void setInstructorTwoOfficeNumber(String instructorTwoOfficeNumber) {
        this.instructorTwo.setOfficeNumber(instructorTwoOfficeNumber);

    }

    public Textbook getPrimaryTextbook() {
        return primaryTextbook;
    }

    public void setPrimaryTextbook(Textbook primaryTextbook) {
        this.primaryTextbook = primaryTextbook;
    }

    public String getPrimaryTextbookTitle() {
        return this.primaryTextbook.getTitle();
    }

    public void setPrimaryTextbookTitle(String primaryTextbookTitle) {
        this.primaryTextbook.setTitle(primaryTextbookTitle);
    }

    public String getPrimaryTextbookAuthor() {
        return this.primaryTextbook.getAuthor();
    }

    public void setPrimaryTextbookAuthor(String primaryTextbookAuthor) {
        this.primaryTextbook.setAuthor( primaryTextbookAuthor);
    }

    public String getPrimaryTextbookPublisher() {
        return this.primaryTextbook.getPublisher();
    }

    public void setPrimaryTextbookPublisher(String primaryTextbookPublisher) {
        this.primaryTextbook.setPublisher(primaryTextbookPublisher);
    }

    public Textbook getSecondaryTextbook() {
        return secondaryTextbook;
    }

    public void setSecondaryTextbook(Textbook secondaryTextbook) {
        this.secondaryTextbook = secondaryTextbook;
    }

    public String getSecondaryTextbookTitle() {
        return secondaryTextbook.getTitle();
    }

    public void setSecondaryTextbookTitle(String secondaryTextbookTitle) {
        this.secondaryTextbook.setTitle(secondaryTextbookTitle);
    }

    public String getSecondaryTextbookAuthor() {
        return this.secondaryTextbook.getAuthor();
    }

    public void setSecondaryTextbookAuthor(String secondaryTextbookAuthor) {
        this.secondaryTextbook.setAuthor(secondaryTextbookAuthor);
    }

    public String getSecondaryTextbookPublisher() {
        return this.secondaryTextbook.getPublisher();
    }

    public void setSecondaryTextbookPublisher(String secondaryTextbookPublisher) {
        this.secondaryTextbook.setPublisher(secondaryTextbookPublisher);
    }

    public void print() {
        System.out.println("Course Name: " + courseName);
        System.out.println("\tInstructor(s): ");
        System.out.println("\t\t" + instructorOne.getFirstName() + " " + instructorOne.getLastName());
        System.out.println("\t" + "Textbook(s): ");
        System.out.println("\t\t" + primaryTextbook.getTitle());
    }


    public void printAll() {

        System.out.println("Course Name: " + courseName);
        System.out.println("\tInstructor(s): ");
        System.out.println("\t\t" + instructorOne.getFirstName() + " " + instructorOne.getLastName());
        System.out.println("\t\t" + instructorTwo.getFirstName() + " " + instructorTwo.getLastName());

        System.out.println("\t" + "Textbook(s): ");
        System.out.println("\t\t" + primaryTextbook.getTitle());
        System.out.println("\t\t\t-" + primaryTextbook.getAuthor());

        System.out.println("\t\t" + secondaryTextbook.getTitle());
        System.out.println("\t\t\t-" + secondaryTextbook.getAuthor());
    }
}
