import java.util.Scanner;

public class Room1
{
      public static Room3 room3 = new Room3();
      public String directions[] = {"north" , "south" , "east" , "west" , "exit"};
      public String firstRequest;
      
      public int visitCount = 0; 

      
      public Scanner input1 = new Scanner(System.in);
      
      public Room1()
         {
            
         }
      
      public void getinfoOnRoom1()
      {
         System.out.println("You have entered room #1. Your total visit to this room: " + visitCount + ". Where do you want to go?");
         visitCount++;
         room1Explorer();
      }
      
      public void room1Explorer()
      {
         System.out.println("You can choose to go to the following directions:");
         for(int i = 0; i <= directions.length-1; i++)
         {
            System.out.println(directions[i]);
         }
         
         System.out.print("Please type in your direction in a complete sentence.");
         
         firstRequest = input1.nextLine();
         firstRequest = firstRequest.toLowerCase();
         String firstRequestAlt = "";
          
         if(firstRequest.indexOf("north")>=0)
            firstRequestAlt = "north";
         else if(firstRequest.indexOf("south")>=0)
            firstRequestAlt = "south";
         else if(firstRequest.indexOf("east")>=0)
            firstRequestAlt = "east";
         else if(firstRequest.indexOf("west")>=0)
            firstRequestAlt = "west";
         else if(firstRequest.indexOf("exit")>=0)
            firstRequestAlt = "exit";
         else {
               System.out.println("There was not a direction that matched...try entering again.");
               room1Explorer();
         }
            
         System.out.println("You have chosen to go " + firstRequestAlt + ".");
         
         switch(firstRequestAlt)
         {
            case "north": room1North();
                          break;
            case "south": room1South();
                          break;
            case "east" : room1East();
                          break;
            case "west" : room1West();
                          break;
            case "exit" : room1Exit();
                          break;
                          
            default: System.out.println("There was not a direction that matched...try entering again.");
                     room1Explorer();
                     break;
         }
         
      }
      
      public void room1North()
      {
         System.out.println("In the northern part of the room there is some scary stuff that makes you think of something horrible.");
         room1Explorer();
      }
      
      public void room1South()
      {
         System.out.println("In the southern part of the room there is some happy stuff that makes you think of having a good time.\t"+
         "While you looks around you see a door that is cracked open. You open it to see what's inside and suddenly get teleported into Room#3.");
         
         room3.getinfoOnRoom3();
      }
      
      public void room1East()
      {
         System.out.println("In the eastern part of the room there is some dogs eating chicken sandwhiches.");
         room1Explorer();
      }
      
      public void room1West()
      {
         System.out.println("In the western part of the room there is some chickens eating dog sandwhiches.");
         room1Explorer();
      }

      public boolean room1Exit()
      {
         System.out.println("This is the exit.");
         return true;
      }
   
}