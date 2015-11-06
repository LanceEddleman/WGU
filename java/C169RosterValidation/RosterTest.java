/**
 * Created by lanceeddleman on 11/2/15.
 */
public class RosterTest {

    public static void main (String[] args) {
        Roster.roster();
       //  Roster.remove("2");
       //  Roster.print_all();
       //  Roster.remove("3");
        // Roster.print_all_tab();
        Roster.print_all_formatted();
        // Roster.printStudent(4);
       // Roster.remove("4");
        Roster.add("6", "Michael", "Larsen", "ml#shoot-n-Hoops#com", 40, 95, 97, 100);

        Roster.print_invalid_emails();
        // Roster.print_average_grade("5");
        // Student.color();
        // Roster.averageGrade(2);
//         Roster.add("6", "Michael", "Larsen", "ml@shoot-n-Hoops.com", 40, 95, 97, 100);
//        Roster.roster();

        // Roster.print_all();
    }
}
