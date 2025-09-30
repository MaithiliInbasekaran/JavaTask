import java.util.Scanner;
import java.util.TreeSet;
import java.util.TreeSet;
public class Library {
     public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        TreeSet <Integer> books = new TreeSet<>();
         Boolean flag=true;

         while(flag){
     System.out.println("1 : Add book id");
     System.out.println("2 : Exit");
     int action = sc.nextInt();
     if(action==1){
           System.out.println("1 : Enter book id");
           int id = sc.nextInt();
         if(!books.contains(id))  {
                 System.out.println("Added sucessfully");
                 books.add(id);

         }
         else{
    System.out.println("Duplicate");
       
         }
          System.out.println("Books present" +books);

     }
     else{
      break;  
     }

         }

     }
}
