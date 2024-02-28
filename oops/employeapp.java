package oops;
class employee{
    private int e_id;
    private String e_name;
    private int e_age;
    private String e_address;

    public void setId(int e_id){
        this.e_id=e_id;
    }
    public void setName(String e_name){
        this.e_name=e_name;
    }
    public void setAge(int e_age){
        this.e_age=e_age;
    }
    public void setAddress(String e_address){
        this.e_address=e_address;
    }

    public int getId(){
		return e_id;
	}
	public String getName(){
		return e_name;
	}
    public int getAge(){
        return e_age;
    }
	public String getAddress(){
		return e_address;
	}
}
public class employeapp {
    public static void main(String[] args) {
        employee e=new employee();
        e.setId(15);
        e.setName("Prasanjit");
        e.setAge(22);
        e.setAddress("Puri, Odisha");

        System.out.println("Id      is : "+e.getId());
		System.out.println("Name    is : "+e.getName());
        System.out.println("Age     is : "+e.getAge());
		System.out.println("Address is : "+e.getAddress());
    }
}
