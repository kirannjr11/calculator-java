package calc;

public class Mul implements Operate{
	
	public Double getResult(Double... numbers) {
		Double result = 1.0;
		 for ( Double num : numbers ) {
			 result *= num;
		 }
		 return result;
	}

}
