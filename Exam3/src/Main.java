import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Person> persons = new ArrayList<>();


        persons.add(new Student("Sean", "843 Ember St", "970-111-222", "Sean@email.com", "junior"));
        persons.add(new Student("Levi", "345 Fox St", "970-222-333", "Levi@email.com", "senior"));


        persons.add(new Faculty("Matt", "697 Super St", "970-333-444", "Matt@email.com", "Computer Science", 1000000, "2024-01-20", "9:00-12:00, 1:00-4:00", "senior"));
        persons.add(new Faculty("Ben", "795 Ork St", "970-444-555", "Ben@email.com", "Mathematics", 1000000, "2024-01-21", "10:00-1:00, 2:00-5:00", "junior"));


        persons.add(new Staff("Sara", "438 Statue St", "970-555-666", "Sara@email.com", "Human Resources", 1000000, "2024-01-22", "HR Manager"));
        persons.add(new Staff("Max", "954 Flower St", "970-666-777", "Max@email.com", "Facilities", 1000000, "2024-01-23", "Custodian"));


        for (Person person : persons) {
            System.out.println(person);

        }
    }
}









