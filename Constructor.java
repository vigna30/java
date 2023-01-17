package javaInOneVideo;
 class MyMainEmployee{
	 private int id;
	 private String name;
	 public MyMainEmployee(){
		 
	      id = 46;
		 name = "abhi";
	 }
	 
	 public String getName() {return name;}
	 public void setName(String n) {this.name =n;}
	 
	 public void setId(int i ) {this.id =i;}
	 public int getid() {return id;}
	 
 }

public class constructors {

	public static void main(String[] args) {
		MyMainEmployee abhi = new MyMainEmployee();
		
      System.out.println(abhi.getid());
      System.out.println(abhi.getName());
	}

}
