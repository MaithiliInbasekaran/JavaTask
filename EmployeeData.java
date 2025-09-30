import java.util.Scanner;
import java.util.LinkedHashSet;
public class EmployeeData {
     public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        LinkedHashSet <Integer> Employee = new LinkedHashSet<>();
         Boolean flag=true;

         while(flag){
     System.out.println("1 : Add Employee id");
     System.out.println("2 : Exit");
     int action = sc.nextInt();
     if(action==1){
           System.out.println("1 : Enter Employee id");
           int id = sc.nextInt();
         if(!Employee.contains(id))  {
                 System.out.println("Added sucessfully");
                 Employee.add(id);

         }
         else{
    System.out.println("Duplicate cant be added");
       
         }
          System.out.println("Employee present" +Employee);

     }
     else{
      break;  
     }

         }

     }
}
