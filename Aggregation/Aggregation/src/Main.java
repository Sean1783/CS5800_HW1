import com.course.Course;
import com.textbook.Textbook;
import com.instructor.Instructor;

public class Main {
    public static void main(String[] args) {

        Course advancedSoftwareEngineering = new Course("Advanced Software Engineering");

        advancedSoftwareEngineering.setInstructorOne(
                "Nima",
                "Davarpanah",
                "3-2636");

        advancedSoftwareEngineering.setPrimaryTextbook(
                "Clean Code",
                "Uncle Bob",
                "Pearson");

        advancedSoftwareEngineering.print();

        advancedSoftwareEngineering.setInstructorTwo(
                "Assistant",
                "Instructor",
                "4-3747");

        advancedSoftwareEngineering.setSecondaryTextbook(
                "Design Patterns",
                "Gang of Four",
                "Addison-Wesley Professional");

        advancedSoftwareEngineering.print();

        Instructor instructorOne = advancedSoftwareEngineering.getInstructorOne();
        advancedSoftwareEngineering.removeInstructorOne();
        advancedSoftwareEngineering.print();
        instructorOne.print();

        Textbook secondaryTextbook = advancedSoftwareEngineering.getSecondaryTextbook();
        advancedSoftwareEngineering.removeSecondaryTextbook();
        advancedSoftwareEngineering.print();
        secondaryTextbook.print();

    }
}