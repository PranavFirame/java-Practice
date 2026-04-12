import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        
    }
}

class School{
    static String name;
    static int SRNo;
    School(){
        name = "ABC school";
        SRNo = 150;
    }

    void printData(){
        System.out.println(name+" address: 150 road near JWM college katraj pune 411048");
    }
}

class Student extends School{
    Scanner sc = new Scanner(System.in);
    static int srno;
    int rollno;
    String name;
    Student(String name){
        this.rollno = srno;
        this.name = name;
    }
    void setmarks(){
        System.out.print("enter maths marks: ");
        int math = sc.nextInt();
        System.out.print("enter physics marks: ");
        int phy = sc.nextInt();
        System.out.print("enter english marks: ");
        int eng = sc.nextInt();
    }
    void calPercentage(int math, int phy, int eng){
        System.out.println(this.name + "s percentage is: "+ (math+phy+eng)/3);
    };
}

class Teachers extends School{
    String name;
    String faculty;
    int id;
    Scanner sc = new Scanner(System.in);
    void setValues(){
        System.out.print("enter your name: ");
        this.name = sc.nextLine();
        System.out.print("enter your faculty: ");
        this.faculty = sc.nextLine();
        System.out.print("enter your name: ");
        this.id = sc.nextInt();
    }
}


