//import java.util.*;
class PATTERN
{
    public static void main(String args[])
    {
        //Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
