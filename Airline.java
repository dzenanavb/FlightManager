import java.util.*;

public class Airline extends Airport {
	String nameOfTheAirline;

	public Airline () {
		
	}
	
	public Airline(String nameOfTheAirline) {
		this.nameOfTheAirline = nameOfTheAirline;
	}
	
	static ArrayList<Airline> Airlines= new ArrayList<Airline>();
	
	public boolean doesNotExist(Airline airline) {
		for(int i=0; i<Airlines.size(); i++) {
			if(Airlines.get(i).equals(airline))
			{return false;}
		}
		return true;
	}
	
	public static boolean validationOfName(String name)
	{ if(name.length() != 6)
		{return false;}
		
		for(int i=0; i<name.length(); i++)
		{if(Character.isLetter(name.charAt(i))==false)
			{return false;}	}
		
		return true;
	}
	
	public void addAirline(Airline airline)
	{	String name = airline.toString();
		if((doesNotExist(airline))&&(validationOfName(name)))
		Airlines.add(new Airline(name));
	}
}
