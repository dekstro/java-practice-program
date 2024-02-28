package methods;
class Calcu{
    int res;
    public void add(int x, int y){
        res=x+y;
        System.out.println(res);
    }
}
public class withParameterNoReturn {
    public static void main(String[] args) {
        Calcu c=new Calcu();
        c.add(10, 10);
    }
}
