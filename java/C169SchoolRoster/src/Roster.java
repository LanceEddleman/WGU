// import statements
import java.util.ArrayList;

/**
 * Roster Class for C169 project
 * Created with BlueJ, converted to IntelliJ IDEA.
 * Include methods:
 *     main (runs project scenario)
 *     studentsPrintStringArray
 *     roster
 *     add
 *     remove
 *     print_all, print_all_tab, print_all_formatted, print_student
 *     print_average_grade, print_average_grade_student
 *     print_invalid_emails
 *     clear
 *
 * @author (Lance Eddleman)
 * @version (v 1.0)
 * @since 09-01-2015)
 */

public class Roster
{
    /**
     * Rubicon A.
     * Initial string array of students
     * Student information added as studentID 5
     */
    static String [] students = {"1,John,Smith,John1989@gmail.com,20,88,79,59",
        "2,Suzan,Erickson,Erickson_1990@gmailcom,19,91,72,85",
        "3,Jack,Napoli,The_lawyer99yahoo.com,19,85,84,87",
        "4,Erin,Black,Erin.black@comcast.net,22,91,98,82",
        "5,Lance,Eddleman,leddlem@my.wgu.edu,45,76,85,20"};

    /**
     * Rubicon B.
     * Instantiate ArrayList for Student class
     * Converts the array of Strings to an ArrayList of Student objects
     */
    static ArrayList<Student> studentArrayList = new ArrayList<Student>();
    public static void roster()
    {
        for (int i = 0; i < students.length; i++) {
            String s = students[i];
            String[] parts = s.split(",");

            String studentID = parts[0];
            String firstName = parts[1];
            String lastName = parts[2];
            String emailAddress = parts[3];
            int age = Integer.parseInt(parts[4]);
            int grade1 = Integer.parseInt(parts[5]);
            int grade2 = Integer.parseInt(parts[6]);
            int grade3 = Integer.parseInt(parts[7]);
            Student sal = new Student(studentID, firstName, lastName, emailAddress, age, grade1, grade2, grade3);
            studentArrayList.add(sal);
        }
    }

    /**
     * Roster "Main" used to run base scenario
     * Calls methods:
     *  - print_all()
     *  - print_invalid_emails()
     *  - print_average_grade(all students)
     *  - remove("3")
     *  - remove("3")
     *      - expected: print message saying student with this ID was not found
     */
    public static void main(String[] args) {
        clear();                    // clear console
        roster();                   // create new students ArrayList
        print_all();                // print all elements from the studentsArrayList
        print_invalid_emails();     // prints a list of invalid emails
        print_average_grade();      // print all students with average grade
        remove("3");                // remove the student with ID 3
        remove("3");                // remove the student with ID 3 should list error 2nd pass
    }

    /**
     * Additional method
     * Print initial String Array of Students
     */
    public static void studentsPrintStringArray() {
        System.out.println("Student String Array");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Index " + i + " | Value: " + students[i]);
        }
        System.out.println();
    }

    /**
     * Rubicon B3a.
     * Add method allows creation of new student in the roster
     *  - uses Student instance variables
     * @param  studentID    string : student ID
     * @param  firstName    string : student First Name
     * @param  lastName     string : student Last Name
     * @param  emailAddress string : student Email Address
     * @param  age          int : student Age
     * @param  grade1       int : student first reported grade
     * @param  grade2       int : student second reported grade
     * @param  grade3       int : student third reported grade
     */
    public static void add(String studentID, String firstName, String lastName, String emailAddress, int age, int grade1, int grade2, int grade3)
    {
        Student newS = new Student();
        newS.setStudentID(studentID);
        newS.setFirstName(firstName);
        newS.setLastName(lastName);
        newS.setEmailAddress(emailAddress);
        newS.setAge(age);
        newS.setGrade1(grade1);
        newS.setGrade2(grade2);
        newS.setGrade3(grade3);
        studentArrayList.add(newS);
    }

    /**
     * Rubicon B3b.
     * Remove method allows deletion of a specific student based on passed studentID
     * Warning check used if passed studentID is not found
     * @param  studentID    string : student ID
     */
    public static void remove(String studentID) {
        for (int i = 0; i < studentArrayList.size(); i++) {
            Student r = studentArrayList.get(i);
            if (r.getStudentID().equals(studentID)) {
                studentArrayList.remove(i);
                System.out.println("Student ID: \033[31m" + studentID + "\033[0m was removed");
                System.out.println();
                return;
            }
        }
        System.out.println("Student ID: \033[31m" + studentID + "\033[0m doesn't exist");
    }

    /**
     * Rubicon B3c.
     * Uses Rubicon B2d.
     *  - print()
     *  - prints a complete tab-separated list of student data using accessor methods
     *  - added a header to make output clearer
     */
    public static void print_all() {
        System.out.println("\033[32mStudent Roster (Tabbed)\033[0m");

        for(int i = 0; i<studentArrayList.size(); i++) //Suggested print format [tabs]
        {   Student s = studentArrayList.get(i);
            s.print();
        }
        System.out.println();
    }

    /**
     * Rubicon B3c.i
     * Prints a complete tab-separated list of student data using accessor methods directly in the roster class
     *  - added a header to make output clearer
     */
    public static void print_all_tab() {
        System.out.println("Print All Student(s) Information");

        for(int i = 0; i<studentArrayList.size(); i++) //Suggested print format [tabs]
        {   Student s = studentArrayList.get(i);
            System.out.println(s.getStudentID() + "\tFirst Name: " + s.getFirstName() + "\tLast Name: " + s.getLastName() + "\tEMail: " + s.getEmailAddress() + "\tAge: " + s.getAge() + "\tGrades: {" + s.getGrade1() + ", " + s.getGrade2() + ", " + s.getGrade3() + "}");
        }
        System.out.println();
    }

    /**
     * Rubicon B3c.ii
     * Prints a complete list of student data using accessor methods directly in the roster class
     * - used string formatting for a better looking output table
     * - added a header to make output clearer
     */
    public static void print_all_formatted() {
        System.out.println("\033[32mStudent Roster (Formatted)\033[0m");
        System.out.printf("%-5s %-15s %-15s %-25s %-6s %-8s %-8s %-8s\n", "ID", "First Name", "Last Name", "EMail Address", "Age", "Grade1", "Grade2", "Grade3");
        for(int i = 0; i<studentArrayList.size(); i++)
        {   Student a = studentArrayList.get(i);
            System.out.printf("%-5s %-15s %-15s %-25s %-6s %4s %8s %8s\n", a.getStudentID(), a.getFirstName(), a.getLastName(), a.getEmailAddress(), a.getAge(), a.getGrade1(), a.getGrade2(), a.getGrade3());
        }
        System.out.println();
    }

    /**
     * Rubicon B3c.iii
     * Adds ability to prints a specific student based on studentID passed in
     * - prints a tab-separated list of student data using accessor methods
     * - prints a string formatted table for a better looking output
     * - added a headers to make output clearer
     * - allows user to use int input (doesn't currently validate int out side of array size)
     * @param  ID    int : student ID equivalent
     */
    public static void print_Student(int ID) {
        Student s = studentArrayList.get(ID-1);
        s.print();
        System.out.println("previous line");

        // Prints a tab-separated list of a specific student based on passed sutdentID.
        Student a = studentArrayList.get(ID-1); // studentID  = ID-1 for index reference
        System.out.println("Suggested print format [tabs]");
        System.out.println(a.getStudentID() + "\tFirst Name: " + a.getFirstName() + "\tLast Name: " + a.getLastName() + "\teMail: " + a.getEmailAddress() + "\tAge: " + a.getAge() + "\tGrades: {" + a.getGrade1() + ", " + a.getGrade2() + ", " + a.getGrade3() + "}");
        System.out.println();

        System.out.println("Preferred print format [field formatting]");
        System.out.printf("%-5s %-15s %-15s %-25s %-6s %-8s %-8s %-8s\n", "ID", "First Name", "Last Name", "eMail", "Age", "Grade1", "Grade2", "Grade3");
        System.out.printf("%-5s %-15s %-15s %-25s %-6s %4s %8s %8s\n", a.getStudentID(), a.getFirstName(), a.getLastName(), a.getEmailAddress(), a.getAge(), a.getGrade1(), a.getGrade2(), a.getGrade3());
        System.out.println();
    }


    // Start here
    /**
     * Rubicon B3c.iii
     * Adds ability to prints a specific student based on studentID passed in
     * - prints a tab-separated list of student data using accessor methods
     * - prints a string formatted table for a better looking output
     * - added a headers to make output clearer
     * - allows user to use int input (doesn't currently validate int out side of array size)
     */

    // 3.d Average Grades
    public static void print_average_grade() {
        // Prints a student’s average grade by student ID
        // Personal touch, list studentID, first name, grades, [average] in  tabbed format, add color for average
        // Add if, for the index selection, if not found message "Does not exist"
        // Add if, less then 70 red, 70+ green
        //Roster.roster();
        System.out.println("\033[32mStudent Average Grade (Formatted)\033[0m");
        System.out.printf("%-5s %-15s %-8s %-8s %-8s %-10s\n", "ID", "First Name", "Grade1", "Grade2", "Grade3", "[Average]");

        for (int i = 0; i < studentArrayList.size(); i++) {
            Student a = studentArrayList.get(i);
                if(a.getAverage() >= 70.0){
                    System.out.printf("%-5s %-15s %4s %8s %8s \033[32m%10s\033[0m\n", a.getStudentID(), a.getFirstName(), a.getGrade1(),
                            a.getGrade2(), a.getGrade3(), a.getAverage());
                }
                else{
                    System.out.printf("%-5s %-15s %4s %8s %8s \033[31m%10s\033[0m\n", a.getStudentID(), a.getFirstName(), a.getGrade1(),
                            a.getGrade2(), a.getGrade3(), a.getAverage());
                }
        }
    }

    // 3.d.i Average Grade Individual Student - Complete
    public static void print_average_grade_student(String studentID) {
        // Prints a student’s average grade by student ID
        // Personal touch, list studentID, first name, grades, [average] in  tabbed format, add color for average
        // Add if, for the index selection, if not found message "Does not exist"
        // Add if, less then 70 red, 70+ green

        System.out.println("\033[32mStudent Average Grade (Formatted)\033[0m");
        System.out.printf("%-5s %-15s %-8s %-8s %-8s %-10s\n", "ID", "First Name", "Grade1", "Grade2", "Grade3", "[Average]");

        for (int i = 0; i < studentArrayList.size(); i++) {
            Student a = studentArrayList.get(i);
            if (a.getStudentID().equals(studentID)) {
                if(a.getAverage() >= 70.0){
                    System.out.printf("%-5s %-15s %4s %8s %8s \033[32m%10s\033[0m\n", a.getStudentID(), a.getFirstName(), a.getGrade1(),
                            a.getGrade2(), a.getGrade3(), a.getAverage());
                    System.out.println();
                    return;
                }
                else{
                    System.out.printf("%-5s %-15s %4s %8s %8s \033[31m%10s\033[0m\n", a.getStudentID(), a.getFirstName(), a.getGrade1(),
                            a.getGrade2(), a.getGrade3(), a.getAverage());
                    System.out.println();
                    return;
                }
            }
        }
        System.out.println("Student ID: \033[31m" + studentID + "\033[0m doesn't exist");
    }

    // 3.e Invalid Emails - Complete
    public static void print_invalid_emails()
    {
        // Verifies student e-mail addresses, displays all invalid e-mail addresses
        // Note: valid e-mail checks: should include at sign (“@”) and period (“.”) - doesn’t include a space.
        // print the ID, first name and the invalid email

        // search for @, if not found fail, if found, search for . if not found fail

        String[] invalidEmails = new String[studentArrayList.size()];
        String[] missingAT = new String[studentArrayList.size()];
        String[] missingPD = new String[studentArrayList.size()];
        int invalidCount = 0;

        for (int i = 0; i < studentArrayList.size(); i++)
        {
            Student s = studentArrayList.get(i);

            if (s.getEmailAddress().contains("@") && s.getEmailAddress().contains(".")) { }
            else
            {
                invalidEmails[i] = s.getStudentID();
                if (s.getEmailAddress().contains("@")) { }
                else { missingAT[i] = "@"; }
                if (s.getEmailAddress().contains(".")) { }
                else { missingPD[i] = "."; }
                invalidCount++;
            }
        }

        if(invalidCount == 0)
        { System.out.println("\033[32mAll Email Addresses appear to be valid!\033[0m"); return; }

        System.out.println("\033[31mInvalid Student Email Addresses (Formatted)\033[0m");
        System.out.printf("%-5s %-15s %-25s %-10s\n", "ID", "First Name", "Email Address", "Missing");

        for (int i = 0; i < studentArrayList.size(); i++)
        {
            Student a = studentArrayList.get(i);
            String missing = "";

            if (missingAT[i] != null && missingPD[i] != null)
            { missing = " @ ."; }
            else if (missingAT[i] != null)
            { missing = " @"; }
            else if (missingPD[i] != null)
            { missing = "."; }

            if (a.getStudentID().equals(invalidEmails[i])) {
                System.out.printf("%-5s %-15s %15s %5s \033[31m%-3s\033[0m\n", a.getStudentID(), a.getFirstName(), a.getEmailAddress(), "", missing);
            }
        }
        System.out.println();
    }

    // Clear console
    public static void clear() {
        Student clear = new Student();
        clear.cls();
    }

}