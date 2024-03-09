package oops;
class Person{
    public String name;
    public String address;
    public int age; 
}
class Students extends Person{
    public int marks;
    public char grade;
    Students(String name, String address, int age, int marks, char grade){
        this.name=name;
        this.address=address;
        this.age=age;
        this.marks=marks;
        this.grade=grade;
    }
    public void disp(){
        System.out.println("Name    : "+name);
        System.out.println("Address : "+address);
        System.out.println("Age     : "+age);
        System.out.println("Mark    : "+marks);
        System.out.println("Grade   : "+grade);
    }
} 
public class inheritance {
    public static void main(String[] args) {
        Students s=new Students("Prasanjit", "Puri", 22, 96, 'A');
        s.disp();
    }
}
