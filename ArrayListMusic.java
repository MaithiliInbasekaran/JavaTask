import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMusic {

    public static void main  (String[] args){
ArrayList<String> Music= new ArrayList<>();
Scanner sc = new Scanner(System.in);
int action;
String Songname;

boolean flag=true;

while(flag){
System.out.println("1: Add song");
System.out.println("2: Delete song");
System.out.println("3: Exit");

action = sc.nextInt();
sc.nextLine();
    switch (action){
        case 1: 
       
System.out.println("Kindly Enter the song to be added");
Songname=sc.nextLine();
Music.add(Songname);

break;
 case 2: 
   

System.out.println("Kindly Enter the song to be removed");
Songname=sc.nextLine();
if(Music.contains(Songname)){
    Music.remove(Songname);
}
else{
  System.out.println("Song is not present");
  
}
break;
case 3:
flag=false;
break;
default:
System.out.println("Songs present "+Music.toString());
break;
    }

System.out.println("Songs present "+Music.toString());

   sc.close(); 



    
    
}
    }
}