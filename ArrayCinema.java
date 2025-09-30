import java.util.Scanner;
import java.util.Arrays;
public class ArrayCinema {
    
public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    
    String [] seatf = new String[10];
    for(int i=0;i<10;i++){
    seatf[i]="Empty";
}
    int noseat=0;

   

   System.out.println("Kindly enter the number of seats to be booked");    
  noseat=sc.nextInt();
      int [] seatn = new int[noseat];
      int count=0;
  if(noseat<=10){
System.out.println("Kindly enter the seat number: "); 
for(int i=0;i<noseat;i++){
  count++;
    if(sc.hasNextInt()){
        
      seatf[sc.nextInt()-1]="Booked";  
    }
}

}
else{
    System.out.println("Only 10 seats available");
  }

System.out.println("Seats available are" + Arrays.toString(seatf));
    sc.close();

    }
}


