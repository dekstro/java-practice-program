package methods;
class Fan{
    String brand;
    float price;
}
public class referencetype {
    public static void main(String[] args) {
        Fan a=new Fan();
        System.out.println(a.brand);
        System.out.println(a.price);
        a.brand="Usha";
        a.price=4500.8f;
        System.out.println(a.brand);
        System.out.println(a.price);
        Fan b;
        b=a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(b.brand);
        System.out.println(b.price);
    }
}
