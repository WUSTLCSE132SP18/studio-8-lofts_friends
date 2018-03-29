package studio8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountSteps {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println();
		Scanner in = new Scanner(new File("data/data.csv"));
		
		int [] values1 = new int[3];
		int [] values2 = new int[3];

		while (in.hasNextLine()) {
			String inputS = in.nextLine();
			String [] array = inputS.split(",");
			int [] currentValues = new int[3];
			for (int i = 0; i < array.length; i++) {
				currentValues[i] = Integer.parseInt(array[i]);
			}
			
			for (int i = 0; i < array.length; i++) {
				System.out.print(currentValues[i] + ",");
			}
			
			//Comparison
				if (values2[2] > values1[2] && values2[2] > currentValues[2]) {
					System.out.print("Peak");
				}
			
			for (int i = 0; i < array.length; i++) {
				values1[i] = values2[i];
				values2[i] = currentValues[i];
			}
			
			System.out.println();

			
		}
		
		in.close();

	}
}

// TODO: Develop an algorithm to count steps in accelerometer data
//    Major steeps:
//       1. Create a class and main method.
//       2. Using a Scanner and File object, read data from your .csv file.
//       3. Develop and test algorithms to count the "peaks" in the data.

