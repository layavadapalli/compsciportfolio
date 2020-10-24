import java.util.*;

public class Room4
{
   public static Room3 room3 = new Room3();
   public static ServerAttic serverattic = new ServerAttic();
   public String directions[] = {"north", "east", "west", "up", "exit"};
   public String pickUpItems[] = {"jacket", "boots", "apple"};
   public String actionWords[] = {"pick up", "wear","eat"};
   public ArrayList<String>inventory = new ArrayList<String>();
   public String firstRequest;
   public String clothingCheck;
   public int visitCount = 0;
   public String firstRequestAlt = "";
       
   public Scanner input1 = new Scanner(System.in);
   
   public Room4()
   {
            
   }
      
   public void getinfoOnRoom4()
   {
       System.out.println("You have entered room #4. Your total visit to this room: " + visitCount + ". Where do you want to go?");
       visitCount++;
       room4Explorer();
   }
   
   public void room4Explorer()
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
         room4north();
      }
      
      else if(firstRequest.indexOf("east") >= 0)
      {
         room4east();
      }
      
      else if(firstRequest.indexOf("west") >= 0)
      {
         room4west();
      }
      
      else
      {
         System.out.println("You did not pick an option listed. Choose again.");
         room4Explorer();  
      }
        
      
   }
   
   void playerClothingCheck()
   {
      System.out.println("\r\nDo you want to know what you are wearing?");
      clothingCheck = input1.nextLine();
      clothingCheck = clothingCheck.toLowerCase();
      
      if(clothingCheck.indexOf("yes")>= 0)
      {
         if(clothingCheck.equals("bootsCheck"))
         {
            System.out.print("You are wearing boots.");
            room4Explorer();
         }
         
         else if(clothingCheck.equals("jacketCheck"))
         {
            System.out.print("You are wearing a jacket.");
            room4Explorer();
         }
         
         else
         {
            System.out.println("You did not pick up anything to wear.");
            room4Explorer();
         }
      }
   }

   
   void room4north()
   {
      System.out.println("You walk towards the northern part of Room4 and see a huge bouncy house.\r\n"+
      "As you run towards it, you see a bookshelf with some objects other than books in it. \r\n"+
      "You see a moldy apple, a jacket, and boots.");
      String tempAnswer = "";
      System.out.println("\t What do you want to do: wear something or eat?");
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
         room4eat();
         clothingCheck = "no check";
      }
      
      else if(tempAnswer.indexOf("wear") >= 0)
      {
         room4wear();
      }
      else 
      {
         System.out.println("You did not pick an option listed. Choose again.");
         room4north();
      }

   }
   
   void room4eat()
   {
      System.out.println("It was probably a bad idea to eat a moldy apple. You fall becuase you don't feel too good :/");
      gameOver();
   }
   
   void room4wear()
   {
      System.out.println("You look down and see that you don't have any shoes or a jacket and the AC in the room just turned on.");
      String tempAnswer = "";
      System.out.println("\t What do you want to wear: boots or jacket (only have time to wear one!)");
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
       
       if(tempAnswer.indexOf("boots") >= 0)
       {
         room4wearBoots();
         clothingCheck = "bootsCheck";
       }
       
       else if(tempAnswer.indexOf("jacket") >= 0)
       {
         room4wearJacket();
         clothingCheck = "jacketCheck";
       }
       
       else
       {
         System.out.println("You did not pick an option listed. Choose again.");
         room4wear();
       }

   }
   
   void room4wearBoots()
   {
      System.out.println("You finally get your boots on and your ready to continue on your adventure!");
      room4Explorer();
   }
   
   void room4wearJacket()
   {
      System.out.println("You finally get you jacket on and are ready to continue on your journey!");
      room4Explorer();
   }
   
   void room4east()
   {
      System.out.println("You head eastwards from your current location and see a cage of pretty parrots. You make some friendly conversation.\r\n"+
      "While you were conversing with a parrot name pepe, you found out that there a secret door that takes you into a new room.\r\n"+
      "You gallop your way over to that door and decide to enter Room3.");
      room3.room3Explorer();
   }
   
   void room4west()
   {
      System.out.println("OH NO! As you head westwards you spot a giant ant comming towards you. You scream and run but it is no use.\r\n"+
      "But then you see a door to an attic. Do you want to go?");
      firstRequest = input1.nextLine();
      firstRequest = firstRequest.toLowerCase();
      if(firstRequest.indexOf("yes") >= 0)
      {
         System.out.println("HA HA if you want to open the attic door you have to answer this riddle:\r\n"+
         " What kind of room has no doors or windows?");
         firstRequest = input1.nextLine();
         firstRequest = firstRequest.toLowerCase();
         
         if(firstRequest.indexOf("mushroom") >= 0)
         {
            System.out.println("CORRECT! You may enter the attic.");
            ServerAttic.interact();
         }
         
         else
         {
            System.out.println("Nope! Try again.");
            room4west();
         }
      }
      
      else
      {
         System.out.println("OH NO! The giant ant crushed the exit and you did not want to enter the attic for safety.\r\b"+
         "You are trapped. Ooooooppps.....");
         gameOver();
      }
      
   }
   
   void gameOver()
   {
       System.out.print("gameOver() called.\n");
       StringRoomControl.programExit();
       return;
   }
    
}