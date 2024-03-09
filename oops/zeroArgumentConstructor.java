package oops;
class Emp{
    String name;
    int age;
    Emp(){
        System.out.println("I am a constructor");
    }
    public void disp(){
        System.out.println("Name: "+name);
        System.out.println("Age : "+age);
    }
}
public class zeroArgumentConstructor {
    public static void main(String[] args) {
        Emp e=new Emp();
        e.disp();
    }
}
