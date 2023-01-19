package InOut;
import java.util.ArrayList;

import Main.Frequency;

public class InOut {
	public static ArrayList<Integer> processInput(String input){
		String[] stringNumbers = input.split(",");
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i = 0;i<stringNumbers.length;i++) {
			String stringNumber = stringNumbers[i];
			int number;
			try {
				number = Integer.parseInt(stringNumber);
			}
			catch (NumberFormatException e) {
				System.out.println(e.getMessage());
				System.out.println(e.getStackTrace());
				number=-1;
			}
			numbers.add(number);
		}
		return numbers;
	}
	public static void printOutFrequencies(ArrayList<Frequency> frequencies) {
		System.out.print("Frequency: ");
		for(int i = 0;i<frequencies.size();i++) {
			System.out.print(frequencies.get(i).getAmount());
			if(i != frequencies.size()-1) {
				System.out.print(", ");
			}
		}
		System.out.println();
		
		System.out.print("Number: ");
		for(int i = 0;i<frequencies.size();i++) {
			System.out.print(frequencies.get(i).getNumber());
			if(i != frequencies.size()-1) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}
	public static void makeGraph(ArrayList<Frequency> frequencies) {
		int maxAmount = Integer.MIN_VALUE;
		for(int i = 0;i<frequencies.size();i++) {
			int amount = frequencies.get(i).getAmount();
			if(amount > maxAmount) {
				maxAmount = amount; 
			}
		}
		
		for(int i = maxAmount-1;i>=0;i--) {
			for(int j = 0;j<frequencies.size();j++) {
				int amount = frequencies.get(j).getAmount();
				if(amount - i > 0) {
					System.out.print(" * ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		for(int i = 0;i<frequencies.size();i++) {
			System.out.print(" "+frequencies.get(i).getNumber()+" ");
		}
		System.out.println();
	}
}
