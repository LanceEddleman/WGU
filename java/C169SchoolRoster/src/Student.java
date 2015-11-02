// Import functions
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: LanceEddleman
 * Date: 11/1/15
 * Time: 2:40 PM
 **/

// ======================================================================

/**
 * Write a description of class student here.
 *
 * @author (Lance Eddleman)
 * @version (v 1.0 - 09/01/2015)
 */
public class Student
{
    // B.1 instance variables not initialiazed.
    private int studentID;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private int age;
    private ArrayList [] grades;

    // B.2.c. constructor using all of the input parameters
    public Student() {
        System.out.println("Base constrcutor");
    }

    public Student(int studentID, String firstName, String lastName, String emailAddress, int age, ArrayList[] grades) {
        System.out.println("2nd constructor running " + firstName);
        // student info
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.grades = grades;
    }

    public static void Student(String[] args) {
        cls();
        String [] students = {"1,John,Smith,John1989@gmail.com,20,88,79,59",
                "2,Suzan,Erickson,Erickson_1990@gmailcom,19,91,72,85",
                "3,Jack,Napoli,The_lawyer99yahoo.com,19,85,84,87",
                "4,Erin,Black,Erin.black@comcast.net,22,91,98,82",
                "5,Lance,Eddleman,leddlem@my.wgu.edu,45,76,85,98"};

        // System.out.println("test data: " + x);
        // ArrayList<String> arraylist = new ArrayList<String>();
        List list = Arrays.asList(students);
        int x = list.size();
        for (int i = 0; i< x; i++)
        {
            // System.out.println(i);
            System.out.println(students[i]);
        }
    }

    // All access and change to the instance variables of the Student class should be through accessor and mutator methods.
    // B.2.a  -  Starting Getters:  (accessors)
    public int getStudentID() {
        return studentID;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public int getAge() {
        return age;
    }
    public ArrayList[] getGrades() {
        return grades;
    }

    // B.2.a  -  Starting Setters: (mutators)
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGrades(ArrayList[] grades) {
        this.grades = grades;
    }

    public static void cls()
    {
        System.out.print('\u000C');
    }

    public static void sArray() {
        String [] array = {"John","Suzan","Jack","Erin","Lance"};
        int x = array.length;
        // System.out.println("test data: " + x);
        for (int i = 0; i< x; i++)
        {
            System.out.println(i);
            System.out.println(array[i]);
        }
        //System.out.println(array);
    }

}