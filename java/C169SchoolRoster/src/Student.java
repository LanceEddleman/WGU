/**
 * ****************** Write a description of class student here.
 *
 *
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
    // B.1 instance variables not initialized.
    private int studentID;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private int age;
    //  private ArrayList [] grades;
    private int g1;
    private int g2;
    private int g3;

    // B.2.c. base constructor used for start point (individual function call validation)constructor using all of the input parameters
    public Student() {
        System.out.println();
//        System.out.println("Base constructor");
    }

    // B.2.c+. base constructor using all of the input parameters
    public Student(int studentID, String firstName, String lastName, String emailAddress, int age, int g1, int g2, int g3) {
    // public Student(int studentID, String firstName, String lastName, String emailAddress, int age, ArrayList[] grades) { // Remove this line before submission
        // student info
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.g1 = g1;
        this.g2 = g2;
        this.g3 = g3;
        //  this.grades = grades; // Remove this line before submission
        // System.out.println("Full constructor: " + studentID + " " + firstName + " " + lastName + " " + emailAddress + " " + age + " " + g1 + " " + g2 + " " + g3);
        // toString();
    }

    // All access and change to the instance variables of the Student class should be through mutator methods.
    // B.2.a  -  Starting Getters:  (accessors)
    public int getStudentID() { return studentID; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmailAddress() { return emailAddress; }
    public int getAge() { return age; }
    public int getG1() {return g1; }
    public int getG2() {return g2; }
    public int getG3() {return g3; }
    // public ArrayList[] getGrades() {return grades; } // Remove this line before submission

    // B.2.a  -  Starting Setters: (mutators)
    public void setStudentID(int studentID) { this.studentID = studentID; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setEmailAddress(String emailAddress) { this.emailAddress = emailAddress; }
    public void setAge(int age) { this.age = age; }
    public void setG1(int g1) { this.g1 = g1; }
    public void setG2(int g2) { this.g2 = g2; }
    public void setG3(int g3) { this.g3 = g3; }
    // public void setGrades(ArrayList[] grades) {this.grades = grades;} // Remove this line before submission

    public static void cls() //cleans console prior to next test
    { System.out.print('\u000C'); }

    // print array
    public String toString() {
        return studentID + " " + firstName + " " + lastName + " " + emailAddress + " " + age + " " + g1 + " " + g2 + " " + g3;
    }


}