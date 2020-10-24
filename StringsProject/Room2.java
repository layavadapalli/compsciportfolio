import java.util.*;

public class Room2
{
    public static Room4 room4 = new Room4();
    //public static StringInventory stringinventory = new StringInventory();
    public String directions[] = {"up", "down", "east", "west", "center", "exit"};
    public String pickUpItems[] = {"disguise", "map", "sword", "bag of cheetos"};
    public String actionWords[] = {"pick up", "put down", "smell", "store", "swing", "run", "keep", "walk", "eat", "put on"};
    public ArrayList<String>inventory = new ArrayList<String>();
    public String firstRequest;
    public int visitCount = 0;
    public String firstRequestAlt = "";
      
    public Scanner input1 = new Scanner(System.in);
      
    public Room2()
    {
            
    }
    
    
    
    public void getinfoOnRoom2()
    {
      visitCount++;
      System.out.println(inventory);
      System.out.println("You have entered room #2 the the room of infinite enigmas. Your total visits to this room: " + visitCount + 
      ". Where do you want to go?");
      
      room2Explorer();
      
      room2MindMaze();
    }
    
    public void room2Explorer()
    {
      System.out.println("You can choose to go to the following directions and action words.");
      System.out.print("Directions: ");
      for(int i = 0; i <= directions.length-1; i++)
         {
            System.out.print(directions[i]+"\t");
         }
      System.out.print("\nAction Words: ");
      for(int i = 0; i <= actionWords.length-1; i++)
         {
            System.out.print(actionWords[i]+"\t");
         }
      System.out.print("\nIf you want to leave this room type in \"exit\". If you want to continue then type \"continue\".");
      firstRequest = input1.nextLine();
      firstRequest = firstRequest.toLowerCase();
      
      if(firstRequest.indexOf("exit") >= 0)
      {
         firstRequestAlt = "exit";
         System.out.println("You will now exit the room. Good Bye. \n");
         gameOver();
      } 
      
      else 
      {
         System.out.println("Your did not type exit so it looks like you are stuck in my mind maze for a while (EVIL LAUGHTER)\n");
      }
      
    }  
    
    public void room2MindMaze()
    {
       String tempAnswer = "";
       System.out.println("The central room you are standing in reeks of some horrible smell\n"+
         " that reminds you of an uncomfortable situation while in Colwn College. However, you"+
         " do not recognize the room. All you can see are stairs that go up, and a door on the east side of the room.\n"+
         "A sense of fear is overwhelming your mind, it is becoming very hard to breath. You must escape immediately!\n"+
         "Where do you want to go?\n");
       firstRequest = input1.nextLine();
       firstRequest = firstRequest.toLowerCase();
       for(int i = 0; i <= directions.length-1; i++)
       {
         if(firstRequest.indexOf(directions[i])>=0)
         {
            tempAnswer = directions[i];
            break;
         }
         
       } 
       
       if(tempAnswer.equals("up"))
       {
         room2UpStairsCentral();
       }
       
       else if(tempAnswer.equals("down"))
       {
         room2DownStairs();
       }
       
       else if(tempAnswer.equals("east"))
       {
         room2EastRoom();
       }
       
       else if(tempAnswer.equals("exit"))
       {
         System.out.println("I'm sorry...there is no exit. While you were wasting time with the exit, a group of clowns \n"+
            "came to the house and dragged you off to the circus to wash their clown shoes.\n");
         System.out.println("This is a good time to end the game.\n");
         gameOver();
       }

       
    }
    
    void room2UpStairsCentral()
    {
      System.out.print("You just walked upstairs and find the floor covered in deadly spiders.\r\n"+
      "They surround you and you cannot move. Game Over...");
      gameOver();
    }
    
    void room2DownStairs()
    {
      System.out.print("You make your way down the stairs and see that a gang of clowns lined the floor with\r\n"+
      "a bunch of nails face up. You carefully make your way around through the nails but then the clowns surround you...\r\n"+
      "But then the floor opens up and you slide into a new room: room 4.");
      
      room4.room4Explorer();
      
    }
    
    void room2PutOnTheDisguise()
    {
      System.out.print("You wait for a safe time to put on your disguise. While you are waiting, a wandering clown finds u\n"+
      "and calls the others. Your stuck now...");
      gameOver();
    }
    
    void room2StoreItem(String s)
    {
      inventory.add(s);
      System.out.println("...................................");
      System.out.println("you have the following items in your inventor: ");
      for (String str: inventory)
         System.out.print(""+str);
      System.out.println("...................................");
    }
    
    public void setInventory(ArrayList<String>inventory)
    {
      public String r2inventory = 
      inventory = new r2inventory();
    }
       
       
    void gameOver()
    {
       System.out.print("gameOver() called.\n");
       StringRoomControl.programExit();
       return;
    }

    
    void room2EastRoom()
    {
      String tempAnswer = "";
      String tempAnswer2 = "";
      System.out.println("You walk through eastern door: there is a bag full of clown noses and a disguise. There's a creaking sound \n"+
         "coming from the celling. A faing giggle can be heard. The door slams behind you and locks. \n"+
         "You see a set of stairs that go down.\n You have two good options: do you want to go down the stairs or pick up the disguise?\n");
      firstRequest = input1.nextLine();
      firstRequest = firstRequest.toLowerCase();
      for(int i = 0; i <= directions.length-1; i++)
         {
            if(firstRequest.indexOf(directions[i]) >= 0)
            {
               tempAnswer = directions[i];
               break;
            }
          
         }  
         
      if(tempAnswer.equals("exit"))
      {
         System.out.println("So sad...the exit disappeared wirh clown magic. You are now trapped forever in the clown nightmare.\n");
         gameOver();
      }
      
      else if(tempAnswer.equals("down"))
      {
         room2DownStairs();
      }else
      {
         for(int i = 0; i <= actionWords.length-1; i++)
         {
            if(firstRequest.indexOf(actionWords[i]) >= 0)
            {
               tempAnswer = actionWords[i];
               if (tempAnswer.equals("pick up"))
               {
                  tempAnswer = actionWords[i];
                  break;
               }
            }
         }
      }
      
      for(int i = 0; i <= pickUpItems.length-1; i++)
      {
         if(firstRequest.indexOf(pickUpItems[i]) >= 0)
         {
            tempAnswer2 = pickUpItems[i];
            if(tempAnswer2.equals("disguise"))
            {
               tempAnswer2 = pickUpItems[i];
               if(tempAnswer.equals("pick up"))
                  break;
            }
         }
      }
      
      if(tempAnswer.equals("pick up")&& tempAnswer2.equals("disguise"))
      {
         System.out.println("Do you want to the disguise or put it on?\n");
         firstRequest = input1.nextLine();
         firstRequest = firstRequest.toLowerCase();
         if(firstRequest.indexOf("store") >= 0)
         {
            System.out.println("You stored the disguise.\n");
            room2StoreItem(tempAnswer2);
            System.out.println("After Storing the disguise there is little time so you hurry down the stairs.\n");
            room2DownStairs();
         }
         else if(firstRequest.indexOf("put on") >=0)
         {
            System.out.println("You put on the disguise.\n");
            room2PutOnTheDisguise();         
         }
         
         else
         {
            System.out.println("You did not pick one of the correct choices or you mispelled a word.\n"+
               "Either way we are going to force you to at this function.\n");
            room2EastRoom();
         }
            
                
       }
    }
   
}