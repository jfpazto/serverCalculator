package co.edu.escuelaing.Calculadora;

public class Calculadora {

	
	public Calculadora() {

	}
	public double realizaOp(String operation, String number)
	{
		double numberAtReturn = 0;
		String cos="cos";
		String sin="sin";
		String tan="tan";
		System.out.println(operation.equals(cos));
		if (operation.equals(cos))
		{
			
			numberAtReturn = Math.cos(Double.parseDouble(number));
			System.out.println(numberAtReturn);
		}
		else if (operation.equals(sin))
		{
			
			numberAtReturn = Math.sin(Double.parseDouble(number));
			System.out.println(numberAtReturn);
		}
		else if (operation.equals(tan))
		{
			
			numberAtReturn = Math.tan(Double.parseDouble(number));
			System.out.println(numberAtReturn);
		}

        return numberAtReturn;
	}


}
