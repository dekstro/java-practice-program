package methods;
class Calculator{
    int a, b, res;
    public int add(){
        a=10;
        b=10;
        res=a+b;
        return res;
    }
}
public class noParameterWithReturn {
  public static void main(String[] args) {
    Calculator c=new Calculator();
    int sum=c.add();
    System.out.println(sum);
  }  
}
