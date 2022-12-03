
class RecursiveMethods
{
    RecursiveMethods()          //default constructor
    {
    }
    
    public int fOf(int x)
    {
        if (x <= 20)                        //the base case
        {
            System.out.println(x + " <= 20, therefore ... f(" + x + ") = f(" + x + " * 12) - 4  = f(" + (x * 12 - 4) + ") - 4 ");
            return fOf(x/12+5)-3;
        }
        else
        {
            System.out.println(x + " > 20 , therefore ... f(" + x + ") = -100");
            return -100;
        }
    }    
}

public class RecursionQuestion4
{
    public static void main(String[] args)
    {
        int x;
        RecursiveMethods rMethods = new RecursiveMethods();
        
        System.out.println("---------------------------------");
        System.out.println("       f(x * 2) - 4    if x >  20");
        System.out.println("f(x) = ");
        System.out.println("       20              if x <= 20");
        System.out.println("---------------------------------");
        System.out.println();
        
        x = 500;
        System.out.println("Answer for  x = " + x);
        System.out.println("f(" + x + ") = " + rMethods.fOf(x));
        System.out.println();
     
    }
}

