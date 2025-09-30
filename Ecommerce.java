import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class Ecommerce {
    public static void main (String[] args){
         Scanner sc = new Scanner(System.in);
         Boolean flag=true;
         HashMap <String ,Integer> cart = new HashMap<>();
         String item="";
 while(flag){
   System.out.println("1: shop"); 
    System.out.println("2: Exit"); 
   int action = sc.nextInt();
   sc.nextLine();
   if(action==1){
   System.out.println(" Add item(enter values seperated by comma , )"); 

    item = sc.nextLine();
   System.out.println(" value "+item); 

   String[] main= item.split(",");

   for(String m :main){
    cart.put(m, cart.getOrDefault(m, 0)+1);

   }

    
   }
else{
 break;
}
 for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        } }
    }
}
