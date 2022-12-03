
class RecursiveMethods
{
    RecursiveMethods()          //default constructor
    {
    }
    
    public int fOf(int x)
    {
        if (x <= 25)                        //the base case
        {
            System.out.println(x + " <= 25, therefore ... f(" + x + ") = 20");
            return 20;
        }
        else
        {
            System.out.println(x + " > 25, therefore ... f(" + x + ") = f(" + x + " / 12) - 3  = f(" + (x / 12 + 5) + ") - 3 ");
            return fOf(x/12+5)-3;
        }
    }    
}

public class RecursionQuestion2
{
    public static void main(String[] args)
    {
        int x;
        RecursiveMethods rMethods = new RecursiveMethods();
        
        System.out.println("---------------------------------");
        System.out.println("       f(x / 12 + 5) - 3    if x >  25");
        System.out.println("f(x) = ");
        System.out.println("       20              if x <= 25");
        System.out.println("---------------------------------");
        System.out.println();
        
        x = 30;
        System.out.println("Answer for  x = " + x);
        System.out.println("f(" + x + ") = " + rMethods.fOf(x));
        System.out.println();
     
    }
}

