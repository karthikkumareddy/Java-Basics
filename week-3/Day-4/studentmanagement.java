import java.util.Scanner;

class Student {
    private String name;
    private int roll;
    private double marks;

    Student(String name, int roll, double marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }
    
    public String getName() { return this.name; }
    public int getRoll() { return this.roll; }
    public double getMarks() { return this.marks; }

    public void setMarks(double marks) {
        if (marks > 0 && marks <= 100) {
            this.marks = marks;
        }
    }
    public void setName(String name) { this.name = name; }
    public void setRoll(int roll) { this.roll = roll; }

    public void displayDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Roll No: " + getRoll());
        System.out.println("Marks: " + getMarks());
        System.out.println("Grade: " + GradeCalculator());
    }

    public String GradeCalculator() {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 50) return "D";
        else return "F";
    }
}

public class studentmanagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = null;
        int choice;

        
        do {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Student");
            System.out.println("3. Calculate Grade");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine(); 
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();
                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();
                    
                    s1 = new Student(name, roll, marks);
                    System.out.println("Student Added Successfully!");
                    break;

                case 2:
                    
                    if (s1 != null) {
                        s1.displayDetails();
                    } else {
                        System.out.println("Please add student first.");
                    }
                    break;

                case 3:
                    if (s1 != null) {
                        System.out.println("Grade: " + s1.GradeCalculator());
                    } else {
                        System.out.println("Please add student first.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");         
            }
        } while (choice != 4);
        sc.close();
    }
}
