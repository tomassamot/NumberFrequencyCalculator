package Main;

public class Frequency {
	private int number;
	private int amount;
	public Frequency(int number, int amount) {
		this.number = number;
		this.amount = amount;
	}
	public int getNumber() {
		return number;
	}
	public int getAmount() {
		return amount;
	}
	public void addToAmount() {
		amount++;
	}
}
