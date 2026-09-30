public class Main {
    public static void main(String[] args) {

        Student student = new Student("Ken", 75, 68, 82);

        System.out.println("Name: " + student.getName());
        System.out.println("Total: " + student.getTotal());
        System.out.println("Average: " + student.getAverage());
        System.out.println("Grade: " + student.getGrade());
    }
}