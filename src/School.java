import java.util.Arrays;

public class School implements Service{
    private String schoolName;
    private Student[] students;

    public School(String schoolName, Student[] students) {
        this.schoolName = schoolName;
        this.students = students;
    }

    @Override
    public Student findByName(String studentName) {
        for(Student student: students){
            if (studentName.equals(student.getName())){
                return student;
            }
        }
        return null;
    }

    @Override
    public void getAllStudents() {
        for (Student student: students){
            System.out.println(student);
        }
    }

    @Override
    public Student[] getAllGirls() {
        Student[] students1 = new Student[10];
        int san = 0;
        for (Student student : students) {
            if (student.getGender().equals("girl")) {
                students1[san] = student;
                san++;
            }
        }
        return students1;
    }

    @Override
    public void getMaxEstimation() {
        int san = 0;
        for (Student student: students) {
            if (san < student.getEstimation()){
                san=student.getEstimation();
            }
        }
        System.out.println(san);
    }

    @Override
    public double getAverageEstimation() {
        double san = 0;
        for (Student student: students) {
            san+=student.getEstimation();
        }
        return san/ students.length;
    }

    @Override
    public void getAverageAge() {
        int count = 0;
        for (Student student: students) {
            count+=student.getAge();
        }
        System.out.println(count/students.length);
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "School " +
                " schoolName: " + schoolName +
                " students: " + Arrays.toString(students);
    }
}
