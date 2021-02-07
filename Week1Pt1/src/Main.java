
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int	qtyAirPlaneSeats = 60;
	double costOfGroceries = 10.55;
	char middleInitial = 'B';
	boolean isItHot = true;
	String fName = "Bobby";
	String streetAddress = "1234 This St";
	
	System.out.println("Available seats left on the plane " + qtyAirPlaneSeats);
	System.out.println(costOfGroceries + " is the price for groceries");
	System.out.println("The person's middle initial is - " + middleInitial);
	System.out.println("Is it hot outside " + isItHot);
	System.out.println("Is your name " + fName);
	System.out.println("My address is " + streetAddress);
	
	int remainingSeats = qtyAirPlaneSeats - 2;
	System.out.println("A customer booked 2 seats, the seats remaining are " + remainingSeats);
	
	costOfGroceries += 2.15;
	System.out.println("I had an impluse grocery purchase. My grocery bill is now " + costOfGroceries);
	
	middleInitial = 'C';
	System.out.println(middleInitial);
	
	isItHot = false;
	System.out.println(isItHot);
	
	String fullName = fName + " " + middleInitial + " Williams";
	System.out.println(fullName);
	
	System.out.println("This is the customer " + fullName + ". " + "He lives at " + streetAddress );
	
	
	}

}
