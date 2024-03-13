package oops;
interface Isol{
    void add(int a,int b);
    void sub(int a,int b);
}
interface Usol extends Isol{
    void mul(int a,int b);
    void div(int a,int b);
}
class Sol implements Usol{
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
public class interfaceExtendsInterface {
    public static void main(String[] args) {
        Usol u=new Sol();
        u.add(10,20);
        u.sub(100,20);
        u.mul(10,20);
        u.div(100,20);
    }
}
