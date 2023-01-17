package javaInOneVideo;
 
class MyEmployee{
	private int id;
	private String Name;
	public String getName(){
		 return Name;
	}
	
	public void setName(String n) {
		this.Name = n;
	}
	public int getId() {
		return id;
	}
	public void setId(int i) {
		 this.id = i;
	}
}
public class modifers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyEmployee rohan = new MyEmployee();
//        rohan.id = 55;
//        rohan.Name = "Rohan Rajput";// Throws an error due to private
        rohan.setName("Rohan Rajput");
        System.out.println(rohan.getName());
        rohan.setId(45);
        System.out.println(rohan.getId());
	}

}
