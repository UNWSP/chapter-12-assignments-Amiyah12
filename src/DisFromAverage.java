import java.util.Scanner;

public class DisFromAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		double input[] = {0};
		
		double value = 0;
		
		int size;
		System.out.println("Enter size of array: ");
		
		try
		{
			size = Integer.parseInt(Scanner.nextLine());
			input = new double[size];
		}
		catch (NegativeArraySizeException e)
		{
			System.out.println("Exception: " + "NegativeArraySizeException");
			System.exit(0);
			
		}
		
		double total = 0;
		
		for (int index = 0; index < input.length;index++)
		{
			System.out.println("Enter your value[" + (index + 1) + "]");
		}
		
		try
		{
			value = Double.parseDouble(scanner.nextLine());
			int index;
			input[index] = value;
			
			total += input[index];
		}
		
		catch (NumberFormatException e)
		{
			System.out.println("Exception: " + "NumberFormatException");
			
		}
				double avaerage = total/input.length;
				
				System.printf("%-10s%-20\n", "value", "Distance from average");
				for (int i = 0; i < input.length; i++)
				{
					double average;
					System.out.printf("%-19.2f%-10.2f\n", input[i], average - input[i]);
				}
	}

}
