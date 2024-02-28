package methods;
class Calcul{
    int res;
    public int add(int x, int y){
        return res=x+y;
    }
}
public class WithParameterWithReturn {
    public static void main(String[] args) {
        Calcul c= new Calcul();
        System.out.println(c.add(10, 10));
    }
}
