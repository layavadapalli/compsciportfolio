import java.util.*;

public class Room3
{
   public String directions[] = {"north", "east", "forwards", "exit"};
   public String pickUpItems[] = {"feather duster", "mop", "apple"};
   public String actionWords[] = {"pick up", "clean", "eat"};
   public ArrayList<String>inventory = new ArrayList<String>();
   public String firstRequest;
   public int visitCount = 0;
   public String firstRequestAlt = "";
       
   public Scanner input1 = new Scanner(System.in);
   
   public Room3()
   {
            
   }
      
   public void getinfoOnRoom3()
   {
       System.out.println("You have entered room #3. Your total visit to this room: " + visitCount + ". Where do you want to go?");
       visitCount++;
       room3Explorer();
   }
   
   public void room3Explorer()
   {
      System.out.println("You can choose to go to the following directions.");
      System.out.print("Directions: ");
      for(int i = 0; i <= directions.length-1; i++)
         {
            System.out.print(directions[i]+"\t");
         }
  
      firstRequest = input1.nextLine();
      firstRequest = firstRequest.toLowerCase();
      
      if(firstRequest.indexOf("exit")>= 0)
      {
         firstRequestAlt = "exit";
         System.out.println("You will now exit the room. Good By. \n");
         gameOver();
      } 
      
      else if(firstRequest.indexOf("north") >= 0)
      {
         System.out.println("You walk towards the north and see a nice looking protrait of a family of elephants.");
         room3Explorer();
      }
      
      else if(firstRequest.indexOf("east") >= 0)
      {
         System.out.println("You walk towards the east and notice a person trapped inside a mirror but you cannot\r\n"+
         "help them so you talk for some time and conintue on with the adventure.");
         room3Explorer();
      }
      
      else if(firstRequest.indexOf("forwards")>= 0)
      {
         room3forwards();
      }else System.out.println("Your did not type exit so it looks like you are stuck in my mind maze for a while (EVIL LAUGHTER)\n");
      
  
   } 
   
   void room3forwards()
   {
      firstRequestAlt = "forwards";
      System.out.println("You build up your courage and decide to take a few steps forwards into Room#3.\r\n"+
                        "Then you see three options infront of you. You see a bright red apple, a mop, and a feather duster. You can choose to either\r\n"+
                        "take a 'snack break' or 'clean' using either the mop or the feather duster.");
                        
      String tempAnswer = "";
      System.out.println("What do you want to do: clean or eat?");
      firstRequest = input1.nextLine();
      firstRequest = firstRequest.toLowerCase();
      
      for(int i = 0; i <= actionWords.length-1; i++)
       {
         if(firstRequest.indexOf(actionWords[i])>=0)
         {
            tempAnswer = actionWords[i];
            break;
         }
         
       } 

      if(tempAnswer.equals("eat"))
      {
         room3eat();
      }
      
      else if(tempAnswer.equals("clean"))
      {
         room3clean();
      }
      else 
      {
         System.out.println("You did not pick an option listed. Choose again.");
         room3forwards();
      }
         
      gameOver();

   }
   
   void room3eat()
   {
      System.out.println("You decided to take a small snack break and picked up the apple to eat.\r\n"+
                        "While you were munching away a clown spotted you and began to run towards you. Maybe a snack break wasn't\r\n"+
                        "such a good idea after all... But you drop your half eaten apple and run. You finally lost the clown. You get to\r\n"+
                        "continue on with the adventure.");
      room3Explorer();
   }
   
   void room3clean()
   {
      System.out.println("So you decided the clean this dusty old room.");
      String tempAnswer = "";
      System.out.println("You have an option to pick up the following: mop or feather duster.");
      firstRequest = input1.nextLine();
      firstRequest = firstRequest.toLowerCase();
      
      for(int i = 0; i <= pickUpItems.length-1; i++)
       {
         if(firstRequest.indexOf(pickUpItems[i])>=0)
         {
            tempAnswer = pickUpItems[i];
            break;
         }
         
       } 
       
       if(tempAnswer.equals("mop"))
       {
         room3cleanMop();
       }
       
       else if(tempAnswer.equals("feather duster"))
       {
         room3cleanDuster();
       }
       
       else
       {
         System.out.println("You did not pick an option listed. Choose again.");
         room3clean();
       }

   }
   
   void room3cleanMop()
   {
      System.out.println("Wow! What a nice thing to do. You begin to clean the dirty floors when you notice a mirror.\t"+
      "You look closer and see a hungry clown in the reflection. Looks like it's not your lucky day... :( ");
      gameOver();
   }
   
   void room3cleanDuster()
   {
      System.out.println("Wow! What a nice thing to do. You begin to dust the windows and don't see any dangerous clowns around.\t"+
      "When you finally finish you put the duster back where you found it and continue on with the quest.");
      room3Explorer();
   }
   
   void gameOver()
   {
       System.out.print("gameOver() called.\n");
       StringRoomControl.programExit();
       return;
   }
 
   

}