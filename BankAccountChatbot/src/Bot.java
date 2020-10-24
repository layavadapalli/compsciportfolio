import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bot
{
    public static void main (String[] args)
    {
        Features f = new Features();
        f.initialize();

        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what can I help you with?");
        String q;
        String response;

        do
        {
            q = input.nextLine();
            //System.out.println("You entered: " + q);

            response = f.findMatch(q);

            System.out.println(response);

            switch (response) {
                case "getBalance":
                    // connect to database
                    // retrieve account balance
                    // print it back to the user
                    break;

                case "greet":
                    System.out.println("Hello");
                    break;

                case "getLastTransaction":
                    // connect to database
                    // get last transaction
                    // print it to user
                    break;

                case "getLastNTransactions":
                    //connect to database
                    //get n transactions
                    //print it back to user
                    break;

                case "orderCheckbook":
                    // do something
                    break;

                case "cancelCheckbook":
                    break;


                default:
                    System.out.println("I couldn't understand your question.\r\nPlease rephrase your question.");
                    break;
            }

        }
        while(!q.equals("bye"));
    }





}