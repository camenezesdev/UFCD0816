package 22222;

public class Projeto2 {

	public static void main(String[] args) {

		int numeroInteiro =10;
		double numeroDecimal=numeroInteiro; //conversao implícita
		
		System.out.println("Numero Inteiro: " +numeroInteiro);
		System.out.println("Numero Decimal: " +numeroDecimal);
		
		double numeroDecimal2=9.75;
		
		int numeroInteiro2= (int)numeroDecimal2; //conversão explicita (CAST)
		
		System.out.println("Numero Inteiro: " +numeroInteiro2);
		System.out.println("Numero Decimal: " +numeroDecimal2);
		
		System.out.println("**************************");
		System.out.println("Numero Inteiro: " +numeroInteiro2+ " Numero Decimal: " +numeroDecimal);
		System.out.printf ("Numero Inteiro: %d Numero Decimal: %.2f", numeroInteiro, numeroDecimal);
		
		
		
		
		
		
		

	}

}
