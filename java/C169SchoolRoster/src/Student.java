/**
 * ****************** Write a description of class student here.
 *
 * Created with IntelliJ IDEA.
 * User: LanceEddleman
 * Date: 11/1/15
 * Time: 2:40 PM
 *
 **/

// ======================================================================

/**
 *
 * Write a description of class student here.
 * @author (Lance Eddleman)
 * @version (v 1.0 - 09/01/2015)
 */
public class Student
{
    // B.1 instance variables not initialized.
    private String studentID;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private int age;
    //  private ArrayList [] grades;
    private int grade1;
    private int grade2;
    private int grade3;
    private double average;

    // B.2.c. base constructor
    // Used for clear screen and color
    public Student() {
        //  System.out.println();
    }

    // B.2.c+. base constructor using all of the input parameters
    public Student(String studentID, String firstName, String lastName, String emailAddress, int age, int grade1, int grade2, int grade3) {
    // public Student(int studentID, String firstName, String lastName, String emailAddress, int age, ArrayList[] grades) { // Remove this line before submission
        // student info
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.age = age;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.average = (grade1+grade2+grade3)/3;
        //  this.grades = grades; // Remove this line before submission
        // System.out.println("Full constructor: " + studentID + " " + firstName + " " + lastName + " " + emailAddress + " " + age + " " + grade1 + " " + grade2 + " " + grade3);
        // toString();
    }

    // All access and change to the instance variables of the Student class should be through mutator methods.
    // B.2.a  -  Starting Getters:  (accessors)
    public String getStudentID() { return studentID; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmailAddress() { return emailAddress; }
    public int getAge() { return age; }
    public int getGrade1() {return grade1; }
    public int getGrade2() {return grade2; }
    public int getGrade3() {return grade3; }
    public double getAverage() {return average; }
    // public ArrayList[] getGrades() {return grades; } // Remove this line before submission

    // B.2.a  -  Starting Setters: (mutators)
    public void setStudentID(String studentID) { this.studentID = studentID; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setEmailAddress(String emailAddress) { this.emailAddress = emailAddress; }
    public void setAge(int age) { this.age = age; }
    public void setGrade1(int grade1) { this.grade1 = grade1; }
    public void setGrade2(int grade2) { this.grade2 = grade2; }
    public void setGrade3(int grade3) { this.grade3 = grade3; }
    // public void setGrades(ArrayList[] grades) {this.grades = grades;} // Remove this line before submission

    public static void cls() //cleans console prior to next test
    { System.out.print('\u000C'); }

    /**
     * Color information found at:
     * http://stackoverflow.com/questions/7091003/show-system-out-println-output-with-another-color
     * https://en.wikipedia.org/wiki/ANSI_escape_code
     */
    public static void color() {
        System.out.println("\033[0m BLACK");
        System.out.println("\033[31m RED");
        System.out.println("\033[32m GREEN");
        System.out.println("\033[33m YELLOW");
        System.out.println("\033[34m BLUE");
        System.out.println("\033[35m MAGENTA");
        System.out.println("\033[36m CYAN");
        System.out.println("\033[37m WHITE");
    }

    // print array
    public String toString() {
        return studentID + "\tFirst Name: " + firstName + "\tLast Name: " + lastName + "\tEMail: " + emailAddress + "\tAge: " + age + "\tGrades: {" + grade1 + ", " + grade2 + ", " + grade3 + "}";
    }

    // print array
    public void print() {
        System.out.println(toString());
    }

}