package oops;
class Student{
    private int rollno;
    private String name;
    private String address;

    public void setRollno(int rollno){
        this.rollno=rollno;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAddress(String address){
        this.address=address;
    }

    public int getRollno(){
		return rollno;
	}
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
}
public class studentapp {
    public static void main(String[] args) {
        Student s=new Student();
        s.setRollno(10);
		s.setName("Shiva");
		s.setAddress("Kailash Parvat");
        System.out.println("RollNo  is : "+s.getRollno());
		System.out.println("Name    is : "+s.getName());
		System.out.println("Address is : "+s.getAddress());
    }
}
