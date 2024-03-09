package oops;
class Calculator{
    public void add(int a){
        System.out.println("Integer Argument");
    }
    public void add(float a){
        System.out.println("Float Argument");
    }
}
public class methodOverloading {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        c.add('a');
        c.add(19l);
    }
}
