import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayMusic{

  public static void main (String[] args){
     String[] music = new String [5];
     int songs=0; 
     int counter=0;
     Boolean flag=true;
     String songname;
     Scanner sc= new Scanner(System.in);
        do{
          System.out.println("1: Press 1 to enter the song");
          System.out.println("2: press 2 for exit");
          int action = sc.nextInt();
          
          switch(action)
          {
            case 1 :
            {
          System.out.println("Enter the number to be added");
           songs= sc.nextInt();
           sc.nextLine();
           if(counter==5){
                       System.out.println("play list full");
                  break;

           }
           if(songs<5){
            if (songs+counter<=5){
             System.out.println("Enter the song name");

                  for(int i=0;i<songs;i++){
                    if(sc.hasNext()){
                  songname=sc.next();
                  music[i]=songname;
                  }
                  counter++;
                }
           System.out.println("counter " +counter);
                }
                else{
                     System.out.println("only "+ (5-counter) +"songs can be added");
        
                }
              }

                else{
           System.out.println("play list full");
             
                }
                                 break;

              }
             
              
             case 2:
             {
              flag=false;
              break;
             }
            
            
        }
      }
    while (flag=true);
      {
      System.out.println("play list full");
      sc.close();
      
      }
        }
      
      }
  

  



