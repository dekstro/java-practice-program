package methods;
class Calc{
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
    Calc c=new Calc();
    int sum=c.add();
    System.out.println(sum);
  }  
}
