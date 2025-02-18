// COLLABORATORS: Ethan Luong

// DESCRIPTION: Converts a dollar amount to quarters, dimes, nickels, and pennies.

public class Main
{
	public static void main(String[] args)
	{
    //DECLARATION + INITIALIZATION SECTION
    double input = 1.68;
    int inputInPennies, quarters, dimes, nickels, pennies;

    //CALCULATION SECTION

    inputInPennies = (int) (input * 100.0);
    quarters = (int) (inputInPennies / 25);
    inputInPennies %= 25;
    dimes = (int) (inputInPennies / 10);
    inputInPennies %= 10;
    nickels = (int) (inputInPennies / 5);
    inputInPennies %= 5;
    pennies = (int) (inputInPennies / 1);
    inputInPennies %= 1;

    //OUTPUT SECTION
    System.out.println(input+" can be converted to "+quarters+" quarters, "+dimes+" dimes, "+nickels+" nickels, and "+pennies+" pennies.");
  }

}
