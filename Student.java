public class Student {
    private String name;
    private double mathematics;
    private double computerScience;
    private double physics;

    public Student(String name, double mathematics,
                double computerScience, double physics) {
        this.name = name;
        this.mathematics = mathematics;
        this.computerScience = computerScience;
        this.physics = physics;
    }
    public double getTotal() {
        return mathematics + computerScience + physics;
    }

    public double getAverage() {
        return getTotal() / 3;
    }

    public String getGrade() {
        double average = getAverage();

        if (average >= 70) {
            return "A";
        } else if (average >= 60) {
            return "B";
        } else if (average >= 50) {
            return "C";
        } else if (average >= 45) {
            return "D";
        } else if (average >= 40) {
            return "E";
        } else {
            return "F";
        }
    }
    public String getName() {
        return name;
    }
}

