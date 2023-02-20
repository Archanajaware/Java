package Abstraction;

abstract class vehicle{
	abstract void start();
	abstract void demo();
}
class Scooter extends vehicle{
	
	public void start() {
		
		System.out.println("Strats with kick");
		
	}
	void demo() {
		
		System.out.println("hello");
	}
	public void color() {
		
		System.out.println("my color is blue");
	}
	}


class car extends vehicle{
	
	public void strat() {
		
		System.out.println("Starts with key");
	}
	
	void demo() {
		
		System.out.println("hii");
	}

	@Override
	void start() {
		// TODO Auto-generated method stub
		
	}
}


public class Part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		car obj1=new car();
		obj1.start();
		obj1.demo();
		Scooter obj2=new Scooter();
		obj2.start();
		obj2.demo();
		obj2.color();

	}

}
