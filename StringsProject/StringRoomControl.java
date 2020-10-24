import java.util.Scanner;
import java.lang.*;

public class StringRoomControl
{
   public static Room1 room1 = new Room1();
   public static Room2 room2 = new Room2();
   public static Room3 room3 = new Room3();
   public static Room4 room4 = new Room4();
   public static Scanner input1 = new Scanner(System.in);
   public static boolean endGameRequest = false;
   
   public static void main(String[]args)
   {
   do{
      roomChooser();
      
     }while(!endGameRequest);
     System.out.println("Thanks for playing!");
     programExit();
   }
   
   public static void roomChooser()
   {
      System.out.println("Which room do you want to go to?");
      String answer1 = input1.nextLine();
      answer1 = answer1.toLowerCase();
      
      if(answer1.indexOf("room1")>=0)
      {
         System.out.println("It looks like you want to go to Room 1.");
         
         room4.playerClothingCheck();
         room1.getinfoOnRoom1();
      }
      
      else if(answer1.indexOf("room2")>=0)
      {
         System.out.println("It looks like you want to go to Room 2.");
         
         room4.playerClothingCheck();
         room2.getinfoOnRoom2();
      }
      
      else if(answer1.indexOf("room3")>=0)
      {
         System.out.println("It looks like you want to go to Room 3.");
         
         room4.playerClothingCheck();
         room3.getinfoOnRoom3();
      }
      
      else if(answer1.indexOf("room4")>=0)
      {
         System.out.println("It looks like you want to go to Room 4.");
         
         room4.playerClothingCheck();
         room4.getinfoOnRoom4();
      }
      
      else
      {
         System.out.println("The room you named is not recognized.");
      }
      
      System.out.print("\nDo you want to end the adventure?");
      answer1 = input1.nextLine();
      answer1 = answer1.toLowerCase();
      
      if(answer1.indexOf("yes")>=0)
      {
         endGameRequest = true;
         return;
      }
      else{
         System.out.print("Here we go again!");
         roomChooser();
      }
   }
   
   public static void programExit()
   {
      System.out.print("The System will now exit.");
      System.exit(0);
   }
     
}
   