public class ATableOfVariables
{
    //default main method
   public static void main(String args[])
   {
//method printing out the numbers in table
       integerPrint();
   }

    //method being called in main
    public static void integerPrint()
    {
        int variable;

        variable = 1;
    //print variable table
        System.out.println("a" + " " + "a^2" + " "  + "a^3");
        System.out.println(variable + "  " + squaredOperator(variable)+ "  " + cubedOperator(variable));
        System.out.println(variable*2 + "  " + squaredOperator(variable*2)+ "  " + cubedOperator(variable*2));
        System.out.println(variable*3 + "  " + squaredOperator(variable*3) + "  " + cubedOperator(variable*3));
        System.out.println(variable*4 + "  " + squaredOperator(variable*4)+ " " + cubedOperator(variable*4));
    }
// https://stackoverflow.com/questions/22084373/does-java-have-an-exponential-operator
// I was "inspired" by this code

// takes an inputted int and multiplies it by itself 
    public static int squaredOperator(int n)
    {
        int nSquared;

        nSquared = n*n;
        return (nSquared);
    }
// takes an inputted int and multiplies it by itself twice
    public static int cubedOperator(int n)
    {
        int nCubed;

        nCubed = n*n*n;
        return (nCubed);
    }
}