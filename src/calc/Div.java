package calc;

public class Div implements Operate{
	
	public Double getResult(Double... numbers) {
		Double result = numbers[0];
		 for (int i =1; i<numbers.length; i++ ) {
			 result /= numbers[i];
		 }
		 return result;
	}

}
