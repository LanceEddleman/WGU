/**
 * Student Class for C169 project
 * Created with BlueJ, converted to IntelliJ IDEA.
 *  - contains:
 *     instance variables
 *     constructor(s)
 *     accessors
 *     setters
 * Include methods:
 *     toString
 *     print
 *     clear screen
 *     color list
 * @author (Lance Eddleman)
 * @version (v 1.0)
 * @since 09-01-2015)
 */

public class Student
{
    /**
     * Rubicon B1
     * Create Student appropriate instance variables for use with various methods
     */
    private String studentID;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private int age;
    private int[] grades = new int[3];

    /**
     * Rubicon B2c.
     * Create Student Constructor using all input parameters
     * @param  studentID    string : student ID
     * @param  firstName    string : student First Name
     * @param  lastName     string : student Last Name
     * @param  emailAddress string : student Email Address
     * @param  age          int : student Age
     * @param  grade1       int : student first reported grade
     * @param  grade2       int : student second reported grade
     * @param  grade3       int : student third reported grade
     */
    public Student(String studentID, String firstName, String lastName, String emailAddress, int age, int grade1, int grade2, int grade3) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.age = age;
        this.grades[0] = grade1;
        this.grades[1] = grade2;
        this.grades[2] = grade3;
    }

    /**
     * Rubicon B2c.i
     * Base Student Constructor used for clear screen method and printing specific student requests
     */
    public Student() {
        // empty constructor
        // used to enable single user print options passing none or specific studentIDs
        // used to call clear screen method in roster
    }

    /**
     * Rubicon B2a.
     * Create Accessor for each instance variable (getters)
     */
    public String getStudentID() { return studentID; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmailAddress() { return emailAddress; }
    public int getAge() { return age; }
    public int getGradeIndex(int i) {return grades[i];}
    public double getAverage() {return (grades[0]+grades[1]+grades[2])/grades.length; }

    /**
     * Rubicon B2b.
     * Create Mutator for each instance variable (setters)
     */
    public void setStudentID(String studentID) { this.studentID = studentID; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setEmailAddress(String emailAddress) { this.emailAddress = emailAddress; }
    public void setAge(int age) { this.age = age; }
    public void setGrade(int grade, int gIndex) {
        this.grades[gIndex] = grade;
    }


    /**
     * Clear Console - (Additional method)
     * Code used to clear console (debugging, testing)
     * Information from: http://www.bluej.org/faq.html (BlueJ Features)
     */
    public static void cls() //cleans console prior to next test
    { System.out.print('\u000C'); }

    /**
     * Returns string object that can be printed via the print() method if desired
     * Usage: Change the print() method to: System.out.println(toString());
     * Uses toString() to package Student array from Accessors
     * @return  full Student record as a string
     */
    public String toString() {
        return getStudentID() + "\tFirst Name: " + getFirstName() + "\tLast Name: " + getLastName() + "\tEMail: " + getEmailAddress() + "\tAge: " + getAge() + "\tGrades: {" + getGradeIndex(0) + ", " + getGradeIndex(1) + ", " + getGradeIndex(2) + "}";
    }

    /**
     * Rubicon B2d.
     * Creates a single line TAB style print method
     * Provide a complete tab-separated list of student data using accessor methods.
     */
    public void print() {
        // System.out.println(toString());
        String s = getStudentID() + "\tFirst Name: " + getFirstName() + "\tLast Name: " + getLastName() + "\tEMail: " + getEmailAddress() + "\tAge: " + getAge() + "\tGrades: {" + getGradeIndex(0) + ", " + getGradeIndex(1) + ", " + getGradeIndex(2) + "}";
        System.out.println(s);
    }

}