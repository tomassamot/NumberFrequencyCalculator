package Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import Main.Frequency;
import Main.NumberSequence;


class NumberSequenceTests {
	@Test
	public void Should_Calculate_1_And_2_Frequencies() {
		NumberSequence numberSequence = new NumberSequence(new int[] {1,2,1});
		
		ArrayList<Frequency> frequencies = numberSequence.calculateFrequencies();
		Frequency oneFrequency = frequencies.get(0);
		assertEquals(1, oneFrequency.getNumber());
		Frequency twoFrequency = frequencies.get(1);
		assertEquals(2, twoFrequency.getNumber());
		
		assertEquals(2, oneFrequency.getAmount());
		assertEquals(1, twoFrequency.getAmount());
	}
	@Test
	public void Should_Calculate_1_2_And_3_Frequencies() {
		NumberSequence numberSequence = new NumberSequence(new int[] {1,3,1,1,3});
		
		ArrayList<Frequency> frequencies = numberSequence.calculateFrequencies();
		Frequency oneFrequency = frequencies.get(0);
		assertEquals(1, oneFrequency.getNumber());
		Frequency twoFrequency = frequencies.get(1);
		assertEquals(2, twoFrequency.getNumber());
		Frequency threeFrequency = frequencies.get(2);
		assertEquals(3, threeFrequency.getNumber());
		
		assertEquals(3, oneFrequency.getAmount());
		assertEquals(0, twoFrequency.getAmount());
		assertEquals(2, threeFrequency.getAmount());
	}
}
