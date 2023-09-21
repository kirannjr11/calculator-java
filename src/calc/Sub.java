package calc;

public class Sub implements Operate {
	
	public Double getResult(Double... numbers) {
		double result = numbers[0];
		
		for (int i = 1; i < numbers.length; i++) {
			result -= numbers[i];
		}
		return result;
	}
}
