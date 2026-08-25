class employee{
    String name;
    int id;
    int Salary;

    void DisplayDetails(){
        System.out.println("=====EMPLOYEE DETAILS=====");
        System.out.println("name: " + name);
        System.out.println("id: " + id);
        System.out.println("Salary: " + Salary);
    }
}
public class Main_employee{
    public static void main(String[] args){
        employee sc = new employee();
        sc.name = "Karthik";
        sc.id = 101;
        sc.Salary = 50000;
        sc.DisplayDetails();
    }
}