class Employee{
    String name;
    int id;
    int monthlySalary;

    Employee(String a, int b, int c){
        name = a;
        id = b;
        monthlySalary = c;
    }
     public int calculate_salary(){
        return monthlySalary * 12;
     }

     void display(){
        System.out.println("name: " + name);
        System.out.println("id: " + id);
        System.out.println("Monthly salary: " + calculate_salary());
     }
}

class Main{
    public static void main(String[] args){
        Employee sc = new Employee("karthik",101,50000);
        sc.display();
    }
}