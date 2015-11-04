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
        studentsPrintStringArray();  // print the original string array
        roster();                    // create new students ArrayList
        print_all();                 // print all elements from the studentsArrayList
        // removeStudent(2);         // remove the student ID 2
        // print_all();              // print all elements from the studentsArrayList
    }

    // Basic print for original String Array
    public static void studentsPrintStringArray() {
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

    // 3.a Add Student - Check with Mike to see if this is the right way to do it
    public static void add(String studentID, String firstName, String lastName, String emailAddress, int age, int grade1, int grade2, int grade3)
    {
        // that sets the instance variables from part B1 and updates the roster
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

    // 3.b Remove Student - Complete
    public static void remove(String studentID) {
        // Removes student from the roster by student ID.
        // Note: If student ID doesn’t exist, method should print an error message indicating that it is not found.

        // System.out.println("Number of Students: " + studentArrayList.size());

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

    // 3.c Print All - Complete
    public static void print_all() {
        // Prints a complete tab-separated list of student data using accessor methods
        // Note: Tabs can be formatted as such: 1 [tab] First Name: John [tab] Last Name: Smith [tab] Age: 20 [tab] Grades: {88, 79, 59}.
        // The print_all() method should loop through all the students in the student array list and call the print() method for each student.
        System.out.println("\033[32mStudent Roster (Tabbed)\033[0m");

        for(int i = 0; i<studentArrayList.size(); i++) //Suggested print format [tabs]
        {   Student s = studentArrayList.get(i);
            s.print();
        }
        System.out.println();
    }

    // 3.c.ii Print All Tab Separated - Complete
    public static void print_all_tab() {
        // Prints a complete tab-separated list of student data using accessor methods
        // Note: Tabs can be formatted as such: 1 [tab] First Name: John [tab] Last Name: Smith [tab] Age: 20 [tab] Grades: {88, 79, 59}. 
        // The print_all() method should loop through all the students in the student array list and call the print() it tab separated.
        System.out.println("Print All Student(s) Information");

        for(int i = 0; i<studentArrayList.size(); i++) //Suggested print format [tabs]
        {   Student s = studentArrayList.get(i);
            System.out.println(s.getStudentID() + "\tFirst Name: " + s.getFirstName() + "\tLast Name: " + s.getLastName() + "\tEMail: " + s.getEmailAddress() + "\tAge: " + s.getAge() + "\tGrades: {" + s.getGrade1() + ", " + s.getGrade2() + ", " + s.getGrade3() + "}");
        }
        System.out.println();
        System.out.println();
    }

    // 3.c.iii Print All Column Formatted - Complete
    public static void print_all_formatted() {
        // Prints a complete column formatted list of student data using accessor methods
        // The print_all() method should loop through all the students in the student array list and formats it in columns.
        System.out.println("\033[32mStudent Roster (Formatted)\033[0m");
        System.out.printf("%-5s %-15s %-15s %-25s %-6s %-8s %-8s %-8s\n", "ID", "First Name", "Last Name", "EMail Address", "Age", "Grade1", "Grade2", "Grade3");
        for(int i = 0; i<studentArrayList.size(); i++)
        {   Student a = studentArrayList.get(i);
            System.out.printf("%-5s %-15s %-15s %-25s %-6s %4s %8s %8s\n", a.getStudentID(), a.getFirstName(), a.getLastName(), a.getEmailAddress(), a.getAge(), a.getGrade1(), a.getGrade2(), a.getGrade3());
        }
        System.out.println();
    }

    // 3.c.iv Print Specific Student
    public static void printStudent(int ID) {
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

    // 3.d Average Grades - Check with Mike to see if this is the right way to do it
    public static void print_average_grade(int studentID) {
        System.out.println("\033[32m average grade test print");
        // public static void print_average_grade(String studentID) that correctly prints a student’s average grade by student ID
        // personal touch, list studentID, first name, grades, [average] in  tabbed format, add color for average

        System.out.println("\033[32mStudent Average Grade (Formatted)\033[0m");
        System.out.printf("%-5s %-15s %-8s %-8s %-8s %-10s\n", "ID", "First Name", "Grade1", "Grade2", "Grade3",
                "[Average]");
        Student a = studentArrayList.get(studentID-1); // studentID  = ID-1 for index reference
        System.out.printf("%-5s %-15s %4s %8s %8s %10s\n", a.getStudentID(),a.getFirstName(),a.getGrade1(),
                a.getGrade2(),a.getGrade3(),a.getAverage());

        // Add if, for the index selection, if it is not found or higher then size then give message out of range or
        // does not exist
    }

    // 3.e Invalid Emails
    public static void print_invalid_emails()
    {
        // Verifies student e-mail addresses, displays all invalid e-mail addresses to the user
        // Note: valid e-mail checks: should include an at sign (“@”) and period (“.”) and doesn’t include a space.

        // review chapter 4.7.3 for character matching to validate bad eamils
    }

    // Clear console
    public static void clear() {
        Student clear = new Student();
        clear.cls();
    }
}