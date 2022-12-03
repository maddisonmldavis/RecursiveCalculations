
class RecursiveMethods
{
    RecursiveMethods()          //default constructor
    {
    }
    
    public int fOf(int x)
    {
        if (x <= 17)                        //the base case
        {
            System.out.println(x + " > 10, therefore ... f(" + x + ") = f(" + x + " - 4) + 2 = f(" + (x -4) + ") + 2");
            return -10;
         
        }
        else
        {
            System.out.println(x + " > 10, therefore ... f(" + x + ") = f(" + x + " - 4) + 2 = f(" + (x -4) + ") + 2");
            return fOf(x-12)+2;
        }
    }    
}

public class RecursionQuestion1
{
    public static void main(String[] args)
    {
        int x;
        RecursiveMethods rMethods = new RecursiveMethods();
        
        System.out.println("---------------------------------");
        System.out.println("       f(x - 4) + 2    if x >  10");
        System.out.println("f(x) = ");
        System.out.println("       -7              if x <= 10");
        System.out.println("---------------------------------");
        System.out.println();
        
        x = 35;
        System.out.println("Answer for  x = " + x);
        System.out.println("f(" + x + ") = " + rMethods.fOf(x));
        System.out.println();
     
    }
}

