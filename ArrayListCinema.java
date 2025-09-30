import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListCinema {
    
public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
   ArrayList<String> seat = new ArrayList<>(); 
   
 
    int noseat=0;

    for(int i=0;i<10;i++){
      seat.add("Empty");
    }
   

   System.out.println("Kindly enter the number of seats to be booked");    
  noseat=sc.nextInt();
      int count=0;
  if(noseat<=10){
System.out.println("Kindly enter the seat number: "); 
for(int i=0;i<noseat;i++){
  count++;
    if(sc.hasNextInt()){
        
      seat.set(sc.nextInt()-1,"Booked");
      
    }
}

}
else{
    System.out.println("Only 10 seats available");
  }

System.out.println("Seats available are" + (seat));
    sc.close();

    }
}


