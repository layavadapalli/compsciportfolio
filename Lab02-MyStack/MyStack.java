import java.util.Arrays;
import java.util.EmptyStackException;

public class MyStack
{
    Integer[] stack;
    int size;

    public MyStack()
    {
        this(10);
    }

    public MyStack(int intiCap)
    {
        stack = new Integer[intiCap];
    }

    public boolean isEmpty()
    {
        return size==0;
    }

    public Integer peek()
    {
        if(size ==0)
            throw new EmptyStackException();
        return stack[size -1];
    }

    public Integer pop()
    {
        if (size ==0)
            throw new EmptyStackException();
        int n = stack[size - 1];
        size--;
        return n;
    }

    public void push(Integer item)
    {
        if(size == stack.length)
            doubleCapacity();
        else
        {
            stack[size] = item;
            size++;
        }
    }

    private void doubleCapacity()
    {
        Integer[] stack2 = new Integer[stack.length*2];
        for(int i = 0; i < stack.length ; i++)
            stack2[i] = stack[i];
        stack = stack2;
    }

    @Override
    public String toString()
    {
        if (stack.length == 0)
            return "[]";
        else
        {
            String s = "[";
            for(Integer i : stack)
            {
                if(i == null)
                    break;
                else
                    s += i +", ";
            }
            return s.substring(0,s.length()-2)  + "]";
        }
    }
    public int getSize()
    {
        return size;
    }

}
