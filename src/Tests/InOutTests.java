package Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import InOut.InOut;


public class InOutTests {
	@Test
	public void Should_Correctly_Process_String_Into_Numbers() {
		String input = "1,2,1";
		
		ArrayList<Integer> processedInput = InOut.processInput(input);
		
		assertEquals(1, processedInput.get(0));
		assertEquals(2, processedInput.get(1));
		assertEquals(1, processedInput.get(2));
	}
}
