/**
 * Created by lanceeddleman on 11/2/15.
 */
public class RosterTest {

    public static void main (String[] args) {
        Roster.roster();
        Roster.remove("4");
        Roster.print_all();
        Roster.remove("4");
        // Roster.print_all_tab();
        // Roster.print_all_formatted();
        // Roster.printStudent(2);
        // Student.color();
        // Roster.averageGrade(2);
        Roster.add("6", "Michael", "Larsen", "ml@hoops.com", 40, 95, 97, 100);
//        Roster.roster();

        Roster.print_all();
    }
}
