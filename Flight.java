public class Flight extends Airline {
	//4. Every flight has an airport,airline origin destination and seats.
	Airline airline;
	Airport airport;
	String origin; 
	String destination;
	String airline2;
	String airport2;
	
	public Flight() {
		
	}
	public Flight(Airline airline, Airport airport, String origin, String destination) {
		super();
		this.airline = airline;
		this.airport = airport;
		this.origin = origin;
		this.destination = destination;
	}
	
	public Flight(String airline2, String airport2, String origin, String destination) {
		this.airline2 = airline2;
		this.airport2 = airport2;
		this.origin = origin;
		this.destination = destination;
	}
}