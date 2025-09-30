import java.util.*;
import java.util.Scanner.*;
import java.util.HashSet;

public class BusTicket{
public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 HashSet <Integer >checktic = new HashSet<>();

      
 Boolean flag=true;

 while(flag)
 {
     System.out.println("1: Book Ticket");
        System.out.println("2: Exit");
 int action = sc.nextInt();
    if(action==1){
    System.out.println("Kindly enter the ticket number to book");
    int seat= sc.nextInt();
 String msg="";
if(checktic.size()<50){
if(!checktic.contains(seat)){
   checktic.add(seat); 
   msg="Booked Successfully";
    System.out.println(msg);

}
else{
    msg="Already Booked Kinly choose another seat";
    System.out.println(msg);

   
}
}
else{
     msg="Bus full";
    System.out.println(msg);
}

    }
    else{
flag=false;
break;
    }
    System.out.println(checktic);

 }
sc.close();

}

}