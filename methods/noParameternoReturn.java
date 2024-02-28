package methods;
class Calculator{
    int a, b, res;
    public void add(){
        a=10;
        b=10;
        res=a+b;
        System.out.println(res);
    }
}
public class noParameternoReturn {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        c.add();
    }
}
