import com.course.Course;
import com.textbook.Textbook;
import com.instructor.Instructor;

public class Main {
    public static void main(String[] args) {

        Course advancedSoftwareEngineering = new Course("Advanced Software Engineering");

        Instructor instructorOne = advancedSoftwareEngineering.getInstructorOne();
        instructorOne.setFirstName("Nima");
        instructorOne.setLastName("Davarpanah");
        instructorOne.setOfficeNumber("3-2636");

        Textbook primaryTextbook = advancedSoftwareEngineering.getPrimaryTextbook();
        primaryTextbook.setTitle("Clean Code");
        primaryTextbook.setAuthor("Uncle Bob");
        primaryTextbook.setPublisher("Pearson");

        advancedSoftwareEngineering.print();

        Instructor instructorTwo = advancedSoftwareEngineering.getInstructorOne();
        instructorTwo.setFirstName("Assistant");
        instructorTwo.setLastName("Instructor");
        instructorTwo.setOfficeNumber("4-3747");

        Textbook secondaryTextbook = advancedSoftwareEngineering.getSecondaryTextbook();
        secondaryTextbook.setTitle("Design Patterns");
        secondaryTextbook.setAuthor("Gang of Four");
        secondaryTextbook.setPublisher("Addison-Wesley Professional");

        advancedSoftwareEngineering.printAll();

    }
}