package oops;
interface Icalculator{
    void add(int a,int b);
    void sub(int a,int b);
    void mul(int a,int b);
    void div(int a,int b);
}
class Ucalculator implements Icalculator{
    public void add(int a,int b){
        System.out.println("The sum is :: "+(a+b));
    }
    public void sub(int a,int b){
        System.out.println("The diff is :: "+(a-b));
    }
        
    public void mul(int a,int b){
        System.out.println("The mul is :: "+(a*b));
    }
    public void div(int a,int b){
        System.out.println("The div is :: "+(a/b));
    }
}
public class interfaces {
    public static void main(String[] args) {
        Icalculator i=new Ucalculator();
        i.add(20, 10);
        i.sub(20, 10);
        i.mul(20, 10);
        i.div(20, 10);
    }
}
