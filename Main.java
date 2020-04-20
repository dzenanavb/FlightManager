import java.util.*;
public class Main {
	static Scanner unos = new Scanner(System.in);
	static ArrayList<Airport> Airports= new ArrayList<Airport>();
	static ArrayList<Airline> Airlines= new ArrayList<Airline>();
	static ArrayList<Flight> Flights = new ArrayList<Flight>();
	static ArrayList<Seat> Seats = new ArrayList<Seat>();
	static int numberOfRows;
	static int numberOfWantedRow;
	public static void main(String[] args) {/*
 	-Book a seat on a flight*/
		menu();
	}
	public static void menu() {
		while(true) {
			System.out.println("Press 1 to create airport. ");
			System.out.println("Press 2 to create airline.");
			System.out.println("Press 3 to create a flight.");
			System.out.println("Press 4 to book a seat on a flight.");
			int izbor = unos.nextInt();
			
			switch(izbor) {
			case 1:
				unos.nextLine();
				System.out.println("Write the name of the airport: ");
				String airport = unos.nextLine();
				addAirport(airport); break;
			case 2:
				unos.nextLine();
				System.out.println("Write the name of the airline: ");
				String airline = unos.nextLine();
				addAirline(airline); break;
			case 3:
				unos.nextLine();
				System.out.println("Enter the name of your airport,airline origin and destination, all in this order: ");
				String air = unos.nextLine();
				String airli = unos.nextLine();
				String origin = unos.nextLine();
				String destination = unos.nextLine();
				System.out.println("Enter the number of rows in this flight: ");
				numberOfRows = unos.nextInt();
				addFlight(air, airli, origin, destination); break;
			case 4:
				System.out.println("Enter the character of the seat, then your wanted row: ");
				char row = unos.next().charAt(0);
				numberOfWantedRow = unos.nextInt();
				addSeat(row, numberOfWantedRow, numberOfRows); break;
			default:
				System.out.println("Press only numbers from 1 to 4.");
			}
			}
	}
	
	public static boolean doesNotExist(String airport) {
		for (int i = 0; i < Airports.size(); i++)
			if (Airports.get(i).nameOfTheAirport.equals(airport)) {
				System.out.println("Airport already exists!");
				return false;}
		return true;}
	
	
	public static boolean validationOfName(String name)
	{ if(name.length()!=3)
		{System.out.println("Name of the airport should contain 3 characters!");
		return false;}
		
		for(int i=0; i<name.length(); i++)
		{if(Character.isLetter(name.charAt(i))==false)
			{System.out.println("Include only alphabetical characters in the name!");
			return false;}	}
		
		return true;
	}
	
	public static void addAirport(String airport)
	{	if((doesNotExist(airport))&&(validationOfName(airport)))
		{Airports.add(new Airport(airport));
		System.out.println("Airport is added!");}
	else System.out.println("Airport is not added!");
	}
	
	public static boolean doesNotExistAirline(String airline) {
		for (int i = 0; i < Airlines.size(); i++)
			if (Airlines.get(i).nameOfTheAirline.equals(airline)) {
				System.out.println("Airline already exists!");
				return false;}
		return true;}
	
	public static boolean validationOfNameAirline(String name)
	{ if(name.length() != 6)
		{System.out.println("Name should contain exactly 6 characters!");
		return false;}
		
		for(int i=0; i<name.length(); i++)
		{if(Character.isLetter(name.charAt(i))==false)
			{System.out.println("Include only alphabetical characters in the name!");
			return false;}	}
		
		return true;
	}
	
	public static void addAirline(String airline)
	{	if((doesNotExistAirline(airline))&&(validationOfNameAirline(airline)))
		{Airlines.add(new Airline(airline));
		System.out.println("Airline is added!");
		}
	else System.out.println("Airline is not added!");
	}
	
	public static void addFlight(String airline, String airport, String origin, String destination) {
		String nameAirport = airport.toString();
		String nameAirline = airline.toString();
		if((validationOfName(nameAirport)) && (validationOfNameAirline(nameAirline))){
		Flights.add(new Flight(airline, airport, origin, destination)); 
		System.out.println("Flight is made!");}
		else
			System.out.println("Flight is not made!");
	}
	
	public static boolean doesRowExist(int numberOfWantedRows, int NumberOfRows) {
		if(numberOfWantedRow > NumberOfRows)
		{System.out.println("Row does not exist!");
			return false;}
		else
		{return true;}}
	
	public static boolean doesRowCharacterExist(char row) {
		if (row > 'F')
		{System.out.println("Only enter A,B, C, D, E or F!");
			return false;}
		else
		{return true;}
	}
	
	public static void addSeat(char row, int wantedRow, int numberOfRows) {
		if((doesRowExist(wantedRow, numberOfRows)) && (doesRowCharacterExist(row))) {
			Seats.add(new Seat(row, wantedRow));
			System.out.println("Seat booked!");}
		else
			System.out.println("Seat is not booked!");
	}
}