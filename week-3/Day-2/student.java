class student{
    String name;
    int id;
    double marks;

    student(String a,int b,double c){
        name = a;
        id = b;
        marks = c;
    }
    public String calculateGrade(){
        if (marks >= 90 && marks <= 100){
            return "A";
        }
        else if (marks >= 80 && marks <= 90){
            return "B";
        }
        else if (marks >= 70 && marks <= 80){
            return "C";
        }
        else if(marks >= 60 && marks <= 70){
            return  "D";
        }
        else{
            return "Fail";
        }
    }

    void display(){
        System.out.println("====Student marks Details====");
        System.out.println("name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

 
    public static void main(String[] args){
        student sc = new student("karthik",101,90);
        sc.display();
    }
}
