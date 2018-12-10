import java.util.Scanner;
public class DistanceCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 calculateDistance();
	}
	
	
	//this method calculates distance based on lat and long
		static void calculateDistance() 
		{
			double lat1=0;double lat2=0;double lon2=0; double lon1=0;double φ1,φ2,Δφ, Δλ;
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter value of lat 1-co-ordinate ");
			lat1=sc.nextDouble();
			System.out.print("Enter value of lat 2-co-ordinte");
			lat2=sc.nextDouble();
			
			System.out.print("Enter value of long 1-co-ordinte");
			lat1=sc.nextDouble();
			
			System.out.print("Enter value of long 2-co-ordinte");
			lon2=sc.nextDouble();
			double R = 6371e3; // metres
			 φ1 = Math.toRadians(lat1);
			 φ2 =Math.toRadians( lat2);
			 Δφ = Math.toRadians((lat2-lat1));
			 Δλ = Math.toRadians((lon2-lon1));
			 
			double a = Math.sin(Δφ/2) * Math.sin(Δφ/2) +
				        Math.cos(φ1) * Math.cos(φ2) *
				        Math.sin(Δλ/2) * Math.sin(Δλ/2);
			
			System.out.print("The distance is: "+ a + "Km");
			 
			
		}

}
