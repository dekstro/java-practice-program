package oops;
abstract class Car{
    public abstract void run();
    public abstract void oil();
}
class Honda extends Car{
    public void run(){
        System.out.println("200 km/hr");
    }
    public void oil(){
        System.out.println("Petrol");
    }
}
abstract class Tata extends Car{
    public void run(){
        System.out.println("250 km/hr");
    }
    public abstract void oil();
}
class Nano extends Tata{
    public void oil(){
        System.out.println("Diesel");
    }
}
class Harrier extends Tata{
    public void oil(){
        System.out.println("Petrol");
    }
}
class Road{
    public void allowCar(Car c){
        c.run();
        c.oil();
        System.out.println();
    }
}
public class abstract_class {
    public static void main(String[] args) {
        Road r=new Road();
        r.allowCar(new Honda());
        r.allowCar(new Nano());
        r.allowCar(new Harrier());
    }
}
