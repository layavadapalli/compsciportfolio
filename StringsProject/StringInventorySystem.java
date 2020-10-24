import java.util.*;

public class StringInventorySystem
{
   public ArrayList <String>inventory = new ArrayList<String>();
   public void ListItem(String s)
   {
         System.out.println(".....................................................");
         System.out.println("You have the following items in your inventory: ");
         for(String str : inventory)
         System.out.print(" " + str);
         System.out.println("....................................................."); 
   }
   public void addItem(String s)
   {
      inventory.add(s);
      System.out.println("You added the item to your inventory");
   }  
}