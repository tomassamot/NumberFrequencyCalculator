package Main;

import java.util.ArrayList;

public class NumberSequence {
	private ArrayList<Integer> sequence = new ArrayList<Integer>();
	public NumberSequence(int[] numbers) {
		for(int i = 0;i<numbers.length;i++) {
			sequence.add(numbers[i]);
		}
	}
	public NumberSequence(ArrayList<Integer> numbers) {
		for(int i = 0;i<numbers.size();i++) {
			sequence.add(numbers.get(i));
		}
	}
	public int[] getMinAndMax() {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i = 0;i<sequence.size();i++) {
			int num = sequence.get(i);
			if(num < min) {
				min = num;
			}
			if(num > max) {
				max = num;
			}
		}
		return new int[]{min, max};
	}
	public ArrayList<Frequency> calculateFrequencies() {
		int[] minAndMax = getMinAndMax();
		int minValue = minAndMax[0];
		int maxValue = minAndMax[1];
		
		ArrayList<Frequency> frequencies = new ArrayList<Frequency>();
		for(int i = minValue;i<=maxValue;i++) {
			frequencies.add(new Frequency(i, 0));
		}
		
		for(int i = 0;i<sequence.size();i++) {
			int number = sequence.get(i);
			frequencies.get(number-minValue).addToAmount();
		}
		
		return frequencies;
	}
}
