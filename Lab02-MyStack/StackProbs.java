import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class StackProbs
{
    public static Stack<Integer> doubleUp(Stack<Integer> s)
    {
        int i = s.pop();
        if(!s.isEmpty())
            doubleUp(s);
        s.push(i);
        s.push(i);
        return s;
    }

    public static Stack<Integer> posAndNeg(Stack<Integer> s)
    {
        List<Integer> neg = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();
        int temp;

        while(!s.isEmpty())
        {
            temp = s.pop();
            if (temp < 0)
                neg.add(temp);
            else
                pos.add(temp);
        }

        for(int i = 0 ; i < neg.size(); i ++)
            s.push(neg.get(i));

        for( int i = 0 ; i < pos.size(); i ++)
            s.push(pos.get(i));

        return s;
    }

    public static Stack<Integer> shiftByN(Stack<Integer> s, int n)
    {
        List<Integer> temp = new ArrayList<>();

        while(!s.isEmpty())
        {
            temp.add(s.pop());
        }
        for (int i = temp.size() -1 - n ; i >= 0 ; i--)
            s.push(temp.get(i));
        
        for (int i = temp.size() - 1 ; i > temp.size() -1 - n  ; i--)
            s.push(temp.get(i));

        return s;
    }

    public static String reverseVowels(String str)
    {
        Stack<Character> s = new Stack<Character>();
        String newStr = new String();

        int i;
        char a;

        for(i = 0 ; i < str.length() ; i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                a = str.charAt(i);
                s.push(a);
                newStr = str.substring(0, i) + '_' + str.substring(i + 1);
                str = newStr;
            }
        }

        for(i = 0 ; i < str.length() ; i++)
        {
            if (str.charAt(i) == '_')
            {
                newStr = str.substring(0, i) + s.pop() + str.substring(i + 1);
                str = newStr;
            }
        }
        return newStr;

    }

     public static boolean bracketBalance(String s)
     {
         Stack<Character> b = new Stack<Character>();
         char a;

         for(int i = 0; i < s.length(); i++)
         {
             if(s.charAt(i) == '(' || s.charAt(i) == '[')
             {
                 a = s.charAt(i);
                 b.push(a);
             }
             else
                 b.pop();
         }

         return b.isEmpty();

     }
}


