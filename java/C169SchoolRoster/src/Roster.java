import java.util.ArrayList;
/**
 * Write a description of class roster here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Roster
{
    /** * Roster "Setup" program */
    /** initial string array of students */
    static String [] students = {"1,John,Smith,John1989@gmail.com,20,88,79,59",
        "2,Suzan,Erickson,Erickson_1990@gmailcom,19,91,72,85",
        "3,Jack,Napoli,The_lawyer99yahoo.com,19,85,84,87",
        "4,Erin,Black,Erin.black@comcast.net,22,91,98,82",
        "5,Lance,Eddleman,leddlem@my.wgu.edu,45,76,85,98"};

    static ArrayList<Student> studentArrayList = new ArrayList<Student>();

    public static void main(String[] args) {
        clear();
        // Student student1 = new Student();
        studentsArrayPrint();
        roster();
        print_all();
        removeStudent(2);
        print_all();
    }

    public static void studentsArrayPrint() {
        System.out.println("Student String Array");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Index " + i + " | Value: " + students[i]);
        }
        System.out.println();
    }

    public static void roster()
    {
        for (int i = 0; i < students.length; i++) {
            String s = students[i];
            String[] parts = s.split(",");

            int studentID = Integer.parseInt(parts[0]);
            String firstName = parts[1];
            String lastName = parts[2];
            String emailAddress = parts[3];
            int age = Integer.parseInt(parts[4]);
            int g1 = Integer.parseInt(parts[5]);
            int g2 = Integer.parseInt(parts[6]);
            int g3 = Integer.parseInt(parts[7]);

            Student sw = new Student(studentID, firstName, lastName, emailAddress, age, g1, g2, g3);
            studentArrayList.add(sw);
        }
    }

    // 3.a Add Student
    public static void addStudent(String studentID, String firstname, String lastname, String emailaddress, int age, int grade1, int grade2, int grade3) {
        // that sets the instance variables from part B1 and updates the roster        
    }

    // 3.b Remove Student
    public static void removeStudent(int studentID) {
        // that removes students from the roster by student ID.
        // Note: If the student ID doesn’t exist, the method should print an error message indicating that it is not found.
        // students2.remove(students[2]);
        // System.out.println("Other: " + students);
        System.out.println("Number of Students: " + studentArrayList.size());
        if (studentID >studentArrayList.size())
        {
            System.out.println("The requested studentID is no longer valid");
        }
    /*
        for (int i = 0; i < students.length; i++) {
            if (studentArrayList.studentID(i) != null) {
                studentArrayList.remove(i);
                return;
            }
        }
        System.out.println("Bad Things happened");
    */
    }

    // 3.c Print All
    public static void print_all() {
        // Prints a complete tab-separated list of student data using accessor methods
        // Note: Tabs can be formatted as such: 1 [tab] First Name: John [tab] Last Name: Smith [tab] Age: 20 [tab] Grades: {88, 79, 59}. 
        // The print_all() method should loop through all the students in the student array list and call the print() method for each student.
        System.out.println("Print All Student(s) Information");
        for (Student w : studentArrayList) { // enhanced loop to read and print new studentArrayList values
            System.out.println(w);
        }

        /*
        for(int i=0; i<studentArrayList.size(); i++)
        {
            int studentID = Integer.parseInt(students[0]);
            System.out.println("Expected: " + (42+i));
            System.out.println(studentArrayList(getStudentID(i)+42);
        }
        */
    }

    // 3.d Average Grades
    public static void averageGrade(String studentID) {
        System.out.println("test");
        // public static void print_average_grade(String studentID) that correctly prints a student’s average grade by student ID
        // personal touch, list studentID, first name, grades, [average] in  tabbed format, add color for average
    }

    // 3.e Average Grades
    public static void print_invalid_emails()
    {
        // Verifies student e-mail addresses, displays all invalid e-mail addresses to the user
        // Note: valid e-mail checks: should include an at sign (“@”) and period (“.”) and doesn’t include a space.
    }

    // console clear
    public static void clear() {
        Student clear = new Student();
        clear.cls();
    }
}