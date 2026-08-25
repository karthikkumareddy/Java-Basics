class student{
    String name;
    int age;
    double marks;

    void Displaydetails(){
        System.out.println("=====Student Details=====");
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("Marks: " + marks);
    }
}
public class Main {
    public static void main(String[] args){
        student sc = new student();
        sc.name = "karthik";
        sc.age = 20;
        sc.marks = 89;
        sc.Displaydetails();
    }
}