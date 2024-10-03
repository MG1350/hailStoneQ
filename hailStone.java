import java.util.Scanner;
public class hailStone
{
    public static void main(String args[])
    {
        boolean allCycle = true;
        int maxIter = 0;
        int mostInter = 0;

        for (int i = 1; i <= 200; i++) 
        {
            int currentIter = 0;
            stone num = new stone(i);

            while (num.isDone()) 
            {
                if (num.isEven()) 
                {
                    num.forEven();
                } else 
                {
                    num.forOdd();
                }
                currentIter++;
            }
            if (num.getNum() != 1) 
            {
                allCycle = false;
                System.out.println("Number " + i + " did not reach 1.");
            }
            if (currentIter > maxIter) 
            {
                maxIter = currentIter;
                mostInter = i;
            }
        }
        if (allCycle) 
        {
            System.out.println("All integers from 1 to 200 are HailStone Numbers.");
        } else 
        {
            System.out.println("Not all integers from 1 to 200 are HailStone Numbers.");
        }
        System.out.println("The maximum number of iterations is " + maxIter + " for starting number " + mostInter + ".");
    }
}

class stone
{
    int num;
    public stone(int input)
    {
        num = input;
    }
    public boolean isEven()
    {
        int even = num % 2;
        if(even == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean isDone()
    {
        if(num == 1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public void forEven()
    {
        num /= 2;
    }
    public void forOdd()
    {
        num *= 3;
        num += 1;
    }
    public int getNum()
    {
        return num;
    }
}