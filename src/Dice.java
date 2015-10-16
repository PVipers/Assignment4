public class Dice {
			
	private final DiceValue value;
	
	public Dice() {
		value =  DiceValue.getRandom();
	}
	
	public DiceValue getValue() {
		return value;
	}

	public DiceValue roll() {
		return DiceValue.getRandom();
	}		
	
        @Override
	public String toString() {
		return value.toString();
	}
}
