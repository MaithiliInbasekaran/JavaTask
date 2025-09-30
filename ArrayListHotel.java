import java.util.*;
public class ArrayListHotel{

    public static void main(String[] args){
        Scanner mm = new Scanner(System.in);
        ArrayList <String> items = new ArrayList<>();
int n=0;
  while(n>=0){
    System.out.println("1: Add items");
    System.out.println("2: Exit");
    int action = mm.nextInt();
    switch (action){
        case 1:{
System.out.println("Kindly enter the number of items to be ordered");
 int count = mm.nextInt();
 for(int i=0;i<count;i++){
  System.out.println("Kindly enter the name of the dish");
  if(mm.hasNext()){
String dish= mm.next();
items.add(dish);
  }

    }
    break;
        }
case 2:
{
 System.out.println("Dishes ordered " + items.toString());
 n=-1;
 break;
}
    }
}

    }
}