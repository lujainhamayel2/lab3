 

public class Seat {
	private int seatNumber;
	private String passengerName;
	
	public Seat( int seatNumber) {
		this.seatNumber=seatNumber;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber=seatNumber;
		
	}
	public int getSeatNumber() {
		return seatNumber;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName=passengerName;
		
	}
	public String  getPassengerName() {
		return  passengerName;
	}
	 
    public boolean isEmpty() {
    	
    	return passengerName==null;
    }
    public String toString() {
    	
    	return "Seat Number:  "+seatNumber
    			+", Passenger Name: "+ passengerName;
    }
    public static boolean  isValid(int seatNumber) {
    	
    	return seatNumber>=1 && seatNumber<=92;
    }
    public static int getRow( int seatNumber) {
    	if(!isValid(seatNumber))
    		return -1;
    	return (seatNumber -1) / 4+ 1;
    }
    public static int getColumn(int seatNumber) {
    	if(!isValid(seatNumber))
    		return -1;
    	return (seatNumber -1)%4 +1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Seat s= new Seat(5);
		System.out.println(s.isEmpty());
		s.setPassengerName("Ali");
		System.out.print(s.isEmpty());
        System.out.println(s);
	}

}
