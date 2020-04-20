public class Seat {
	//3. Each flight consists of seats organized in rows. Each row is labeled with
		//("A", "B", "C", "D", "E", "F"). Each row has number of seats in row.
	char row;
	int numberOfWantedRow;
	int numberOfRows;
	int numberOfSeatsRow;
	
	public Seat(char row, int wantedRow) {
		this.row = row;
		this.numberOfWantedRow = wantedRow;
	}
	
}