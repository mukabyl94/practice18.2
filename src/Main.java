import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Jon", "Denial", 28, "jon@mail.ru", "boy", 7);
        Student student2 = new Student("Oliver", "Liam", 38, "oliver@mail.ru", "boy", 9);
        Student student3 = new Student("James", "Bon", 24, "james@mail.ru", "boy", 3);
        Student student4 = new Student("Michael", "Jackson", 18, "michael@mail.ru", "boy", 10);
        Student student5 = new Student("Dabid", "Luke", 22, "david@mail.ru", "boy", 4);
        Student student6 = new Student("Mia", "David", 25, "mia@mail.ru", "girl", 3);
        Student student7 = new Student("Amelia", "Joni", 31, "amelia@mail.ru", "girl", 8);
        Student student8 = new Student("Sophia", "Lacus", 26, "sophia@mail.ru", "girl", 4);
        Student student9 = new Student("Emma", "Nolan", 33, "emma@mail.ru", "girl", 9);
        Student student10 = new Student("Charlotte", "Cameron", 20, "charlotte@mail.ru", "girl", 5);

        Student[] students = new Student[]{student1, student2, student3, student4, student5,
                student6, student7, student8, student9, student10};


        School school = new School("AUCA", students);
        System.out.println(school.findByName("Emma"));
        System.out.println();
        school.getAllStudents();
        System.out.println();
        System.out.println(Arrays.toString(school.getAllGirls()));
        System.out.println();
        school.getMaxEstimation();
        System.out.println();
        System.out.println(school.getAverageEstimation());
        System.out.println();
        school.getAverageAge();
    }
}