package javaInOneVideo;


class Employe{
int salary;
String name;
public int getSalary() {
	 return salary;
  }
public String getName(){
	return name;
 }
  public void setName(String n) {
	  name = n;
  }
}
  class cellphone{
	  public void ring(){
		  System.out.println("Ringing....");
	  }
	  public void Vibrat(){
		  System.out.println("Vibrating....");
	  }
	  public void call(){
		  System.out.println("call With Frind....");
	  }
	  public void Game(){
		  System.out.println("Play Game....");
	  }
  }
  
   class Square{
	   int side;
	   public int area() {
		   return side*side;
	   }
	   public int perimeter() {
		   return 4*side;
	   }
   }
   class rectangle {
	   int l , b;
	   public int length(){
		   return l*2;
		   
	   }
	   public int breath(){
	   return b*2;
	   }
   }
   class Tommy{
	   public void hit() {
		   System.out.println("Hitting the anime");
	   }
	   public void run() {
		   System.out.println("Running The Way");
	   }
	   public void jump() {
		   System.out.println("Jumping The Wall");
	   }
   }

public class Employ {

	public static void main(String[] args) {
		/*
		// Problem 1
		Employe abhi = new Employe();
        abhi.setName("Abhishek Prasad");
        abhi.salary = 100000;
        System.out.println(abhi.getSalary());
        
        System.out.println(abhi.getName());
       
	
	//problem 2 
	cellphone realme = new cellphone();
	realme.call();
	realme.ring();
	realme.Vibrat();
	realme.Game();
	
		//problem 3
		Square sq = new Square();
		
		sq.side = 3;
		System.out.println(sq.area());
		System.out.println(sq.perimeter());
		
	   //problum 4
		rectangle re = new rectangle();
		re.l =2;
		re.b =3;
		
	System.out.println(re.length());
	System.out.println(re.breath());
	*/
      //Problem 5
		Tommy player1 =  new Tommy();
		player1.run();
		player1.jump();
		player1.hit();
		
	}
}
