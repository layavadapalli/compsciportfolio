import java.util.Scanner;


public class StringAdventureControl
{
   public static void main(String [] args)  
   {
      Scanner Input1 = new Scanner(System.in);
      System.out.println("This is an adventure.");
      System.out.println("Enter your name.");
      String name = Input1.nextLine();
      
      System.out.println("Welcome to this adventure: " + name);
      System.out.println(name + ", first we are going to analyze your name:");
      String temp = StringChecker3000.nameData(name);
      System.out.println(temp);
      
      System.out.println("Now we will spell your name backwards");
      System.out.println(StringChecker3000.nameReverse(name));
      
      System.out.println("Next we need to check your memory; what is your name?");
      String name2 = Input1.nextLine();
      System.out.println("Equal check; the reuslts are this: " + name.equals(name2));
      System.out.println("CompareTo check; the results are this: " + name.compareTo(name2));
      
      System.out.println("Finally we need to practice removing any spacing beofre or after the entered words");
      System.out.println("Enter in words with spaces before or after the entered words ");
      String wordEntry = Input1.nextLine();
      System.out.println("The length of the wordEntry is the following: " + wordEntry.length());
      String wordEntryTrimmed = wordEntry.trim();
      System.out.println("This is the result from trimming the words: " + wordEntryTrimmed.length());
   }
   
}


class StringChecker3000
{
   public static String nameData(String str)
   {
      String tempStrU;
      String tempStrL;
      String totalConcatStr;
      tempStrU = str.toUpperCase();
      tempStrL = str.toLowerCase();
      totalConcatStr = " Upper Case:" + tempStrU +"\n Lower Case:" + tempStrL + "\n Length of your name:" + str.length() +
                        "\n The first letter of your name:" + str.substring(0,1) + "\n Last lettr of your name:" + 
                        str.substring(str.length()-1, str.length());
      return totalConcatStr;
      
   }
   
   public static String nameReverse(String str)
   {
      String tempRev = "";
      
      for(int i = str.length(); i > 0; i--)
         tempRev += str.substring(i-1,i);
         
      return tempRev;
   }
}