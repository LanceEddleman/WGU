import java.util.Arrays;
import java.util.ArrayList;
/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student
{
    // instance variables - replace the example below with your own
    String[] students = {
        "1,John,Smith,John1989@gmail.com,20,88,79,59", 
        "2,Suzan,Erickson,Erickson_1990@gmailcom,19,91,72,85",
        "3,Jack,Napoli,The_lawyer99yahoo.com,19,85,84,87",
        "4,Erin,Black,Erin.black@comcast.net,22,91,98,82",
        "5,Lance,Eddleman,lance.eddleman@wgu.org,45,76,85,98"
    };
    ArrayList<String> student2 = new ArrayList<String>();


    /**
     * Constructor for objects of class Student
     */
    public Student()
    {
        // initialise instance variables
    }

    /**
     * Create ArrayList of elements form the String Array of Students
     * 
     * @param  y   a sample parameter for a method
     */
    public void studentElements()
    {
        Student s = new Student();
        for(int i=0; i<students.length; i++)
        {
            s.student2.add(students[i]);
            System.out.println(s.student2.get(i));
        }
        

    }
}
