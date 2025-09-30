import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayHotel {

     public static void main(String [] args){
Scanner mm = new Scanner(System.in);
int n=0;
String[] items=new String[5];
   do{
System.out.println("Kindly enter the number of items to be ordered");
 int count = mm.nextInt();
 if(count<=5 && count+n<=5){
 for(int i=0;i<count;i++){
  System.out.println("Kindly enter the name of the dish");
  if(mm.hasNext()){
String dish= mm.next();
items[n]=dish;
  }
 }
}
else{
 System.out.println("you have reached maximum number of order");

}
 n=n+count;
   System.out.println("Kvalue of n " +n);

   }
    while(n<5);
    {
     
 System.out.println("you have reached maximum number of order");
  System.out.println("orderred list "+ Arrays.toString(items));

 
    }
}
}