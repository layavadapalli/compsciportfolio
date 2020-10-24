import java.util.Scanner;
import java.util.*;

public class ServerAttic
{
   public static void main (String[]args)
   {
      ServerAttic.interact();
   }
   
   public static void interact()
   {
     Scanner input1 = new Scanner(System.in);
     System.out.println("What's your name?");
     String name = input1.nextLine();
     
     System.out.println("Nice to meet you " + name + " ! I'm Mickey. So... what's your favorite color?");
     String color = input1.nextLine();
     
     System.out.println(color + " is my favorite too! Who knew we had so much in common. What is your favorite season?");
     String season = input1.nextLine();
     
     if(season.indexOf ("winter") >= 0)
     {
        System.out.println("Hey that's my favorite too!\r\n"+ 
                           "I love to build snowmen and have snowball fights! What do you like to do in the winter?");
        String activity = input1.nextLine();
        
        System.out.println("Ohh that sounds fun! Well it was nice talking to you, you should probably get back to the game.");
        StringRoomControl.roomChooser();
     }
     else
     {
        System.out.println(season + " is also a good season. I love all seasons! There are so many things to do!\r\n"+
                          "It was fun chatting with you but you should get back to the game now. Bye!");
        StringRoomControl.roomChooser();
     }
     
     
  }
 
 
 }