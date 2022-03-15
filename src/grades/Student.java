package grades;


import java.util.ArrayList;

public class Student {
    // private properties for the student's name, and grades
    //The grades property should be an ArrayList of integers.
    private String stuName;
    private ArrayList<Integer> stuGrade;

    // The student class should have a constructor that sets name property, and initializes the grades property as an empty ArrayList.
    public Student(String stuName) {
        this.stuName = stuName;
        this.stuGrade = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return stuName;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        stuGrade.add(grade);
    }

    // returns the average of the students grades
    public ArrayList<Integer> getStuGrade() {
        return stuGrade;
    }


    public double getGradeAverage() {
        double total = 0; // bucket to store the grades in
        double avg;
        for (int studentGrade : stuGrade) total = total + studentGrade; // ????
        avg = total / stuGrade.size();
        return avg;
    }

    // Test your Student class by adding a main method and creating Student objects.
    public static void main(String[] args) {
        // Verify that you can add grades to each object, and that your getGradeAverage method correctly returns the average of the student's grades.
        Student gerry = new Student("gerry");
        gerry.addGrade(60);
        gerry.addGrade(72);
        gerry.addGrade(95);
        gerry.addGrade(90);
        gerry.addGrade(85);
        gerry.addGrade(20);
        System.out.println(gerry.getName()); // gets the name of the new object named Robert
        System.out.println(gerry.getStuGrade()); // prints array of grades created for Robert object
        System.out.format("%.2f", gerry.getGradeAverage()); // format 2 decimal places after whole number
    }
}