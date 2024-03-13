package oops;
interface Icalc{
    void add(int a,int b);
    void sub(int a,int b);
}
class Advcalc{
    public void mul(int a, int b){
        System.out.println("The mul is :: "+(a*b));
    }
    public void div(int a,int b){
        System.out.println("The div is :: "+(a/b));
    }
}
class Ucalc extends Advcalc implements Icalc{
    public void add(int a, int b){
        System.out.println("The sum is :: "+(a+b));
    }
    public void sub(int a,int b){
        System.out.println("The diff is :: "+(a-b));
    }
}
public class inheritance_implements {
    public static void main(String[] args) {
        Ucalc u=new Ucalc();
        u.add(20, 10);
        u.sub(20, 10);
        u.mul(20, 10);
        u.div(20, 10);
    }
}
