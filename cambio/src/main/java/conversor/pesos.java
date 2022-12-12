package conversor;
import java.util.Scanner;

public class pesos
{
    
    double precioMoneda, moneda, pesos;
    int opcion;
    Scanner terminal = new Scanner(System.in);

    
    
    public void conversor() 
    {
        System.out.println("CONVERSOR DE PESOS");
        System.out.println("-----------------------");
        System.out.println("Elege la moneda que quieras convertir en pesos  \n1: DOLAR \n2: EUROS");
        opcion = terminal.nextInt();
        System.out.println("------------------");

        switch (opcion)
		{  
			case 1:
				System.out.println("DOlAR");

                System.out.println("ingrese el precio actual del dolar");
                precioMoneda =  terminal.nextDouble();
                System.out.println("ingrese la cantidad de dolares a convertir");
                moneda = terminal.nextDouble();
                pesos = precioMoneda*moneda;

                System.out.println( moneda +  "dolares son :" + pesos);

                break;

			case 2:
				System.out.println("EUROS");

                System.out.println("ingrese el precio actual del euro");
                precioMoneda =  terminal.nextDouble();
                System.out.println("ingrese la cantidad de euros a convertir");
                moneda = terminal.nextDouble();
                pesos = precioMoneda*moneda;

                System.out.println( moneda +  "euros son :" + pesos);
				break;

        }


        terminal.close();
    }
    
    
}
