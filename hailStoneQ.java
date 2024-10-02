import java.util.Scanner;
public class hailStoneQ
{
    public static void main(String args[])
    {
        stone num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        num = new stone(input.nextInt());
        input.close();
        System.out.print(num.getNum());
        while(num.isDone())
        {
            if(num.isEven())
            {
                num.forEven();
                System.out.print(", "+ num.getNum());
            }
            else
            {
                num.forOdd();
                System.out.print(", "+ num.getNum());
            }
        }
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