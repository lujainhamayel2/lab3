
public class Train {

 
		// TODO Auto-generated method stub
   private static Seat [][] seats=new Seat[23][];
  for(int i=0;i<seats.length;i++){
	  seats[i]=new Seat[4];
	  int seatNumber;
	for(int j=0;j<seats[i].length;j++)
		  seats[i][j]=new Seat(seatNumber);
	  
  }
  public Train(int seatNumber,String passengerName){
	  seats[1]=new Seat[3];
	  seats[23]=new Seat[3];
	  for(int i=2;i<=22;i++)
		  seats[i]=new Seat[3];
	  
  }
   public boolean reserveSeat(int seatNumber,String passengerName){
	  if(!Seat.isValid(seatNumber)){
		  return false;
		 
	  }
	  int row =Seat.getRow(seatNumber)-1;
	  int col=Seat.getColumn(seatNumber)-1;
	  if(seats[row][col]==null){
		  seats[row][col]=new Seat(seatNumber);
		  }
	  else{
		  seats[row][col].setPassengerName(passengerName);
	  }
	  Seat seats=seats[row][col];
	  if(!seats.isEmpty()){
		  return false;
		  seats.setPassengerName(passengerName);
		  return true;
	  }
}

	  public static boolean deleteSeat(int seatNumber){
		  if(!Seat.isValid(seatNumber)){
			  return false;}
	  }
		  public static boolean deleteAllSeat(int seatNumber){
			  
			  if(!Seat.isValid(seatNumber)){
				  return false;
			  }
		  }
  }
   
	 
	  
  
	 


