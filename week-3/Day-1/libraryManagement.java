class Book{
    int id;
    String title;
    double price;
    Book(int a,String b,double c){
        int id = a;
        int title = b;
        double price = c;
    }
    void display(){

        System.out.println("Id = " + id);
        System.out.println("tittle = " + title);
        System.out.println("Price = " + price);
    }
}

public class libraryManagement{
    public static void main(String[] args){
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        book1.id = 1;
        book1.title = "AI tools";
        book1.price = 500;

        book2.id = 2;
        book2.title = "Java learning";
        book2.price = 400;

        book3.id = 3;
        book3.title = "Python learning";
        book3.price = 450;
        Double highest = book1.price;
       if (highest > book2.price && highest > book3.price){
            book1.display();
        }
        else if (book2.price > highest && book2.price > book3.price){
            book2.display();
        }
        else{
            book3.display();
        }
            
        int cost = 400;
        if (book1.price > cost){
            book1.display();
        }   
       if (book2.price > cost){
        book2.display();
       }
       if (book3.price > cost){
        book3.display();
       }
    }
}
/* 
class student{
    int id;
    String name;
    int marks;

    void display(){
        System.out.println("id: " + id);
        System.out.println("Name: " + name);
        System.out.println("marks : " + marks);
    }
}

public class libraryManagement{
    public static void main(String[] args){
        student st1 = new student();
        student st2 = new student();
        student st3 = new student();
        student st4 = new student();

        st1.id = 1;
        st1.name ="karthik kumar reddy";
        st1.marks = 90;

        st2.id = 2;
        st2.name = "Ramu";
        st2.marks = 96;

        st3.id = 3;
        st3.name = "krishna";
        st3.marks = 97;

        st4.id = 4;
        st4.name = "shiva";
        st4.marks = 98;

        if (st4.marks > st3.marks){
            st4.display();
        }
        else if (st4.marks > st3.marks){
            st3.display();
        } 
        else if (st4.marks > st2.marks){
            st2.display();
        }
        else{
            st1.display();
        }
        int sum = st1.marks + st2.marks + st3.marks +st4.marks;
        int avg = sum / 4;
        System.out.println("Average: " + avg);
    }
}
    */
