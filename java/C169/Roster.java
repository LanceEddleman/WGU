/**
 * Write a description of class roster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Roster
{
    /**
     * Roster "Main" program
     */
    public static void main(String[] args) {
        clear();
        // roster();
        Student student1 = new Student();
    }
    
    public static void roster()
    {
       Student student1 = new Student();

       // System.out.println(student1.getStudentID(0));
       /*
       for (int i = 0; i < student1.length; i ++)
        {
            System.out.println(student1.getStudentID());
        }
       */
        
        //student1.setStudentID(1);
        /*        student1.firstName = "Joe Smith";
        student1.age = 35;
        student1.sayHello();
        student1.speak();
        student1.yearsToRetire();
        
        Student student2 = new Student();
        student2.studentID = 2;
        student2.firstName = "Mandi Jones";
        student2.age = 41;
        student2.speak();
        */
       
       static ArrayList<students> cStudents = new ArrayList<students>();
        for (int i=0;i < cStudents.length;i++) {
                String [] parts=cStudents[i].split(",");
                System.out.println(parts[i]);
            }
        
       // for  (int i = 0; 0 < Student.size(); i++) {
       //         System.out.println(students.get(i));
       // }
        
       // System.out.println(student1.getStudentID());
       // System.out.println(student1.getFirstName());
    }

    // 3.a Add Student
    public static void add(String studentID, String firstname, String lastname, String emailaddress, int age, int grade1, int grade2, int grade3) {
        // that sets the instance variables from part B1 and updates the roster        
    }

    // 3.b Remove Student
    public static void remove(String studentID) {
        // that removes students from the roster by student ID.
        // Note: If the student ID doesn’t exist, the method should print an error message indicating that it is not found.
        // students2.remove(students[2]);
        // System.out.println("Other: " + students);
        if (studentID == null)
        {
            System.out.println("The requested studentID is nolonger valid");
        }
            
    }

    // 3.c Print All
    public static void print_all() {
        // Prints a complete tab-separated list of student data using accessor methods
        // Note: Tabs can be formatted as such: 1 [tab] First Name: John [tab] Last Name: Smith [tab] Age: 20 [tab] Grades: {88, 79, 59}. 
        // The print_all() method should loop through all the students in the student array list and call the print() method for each student.
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
        clear.sysClear();
    }
}