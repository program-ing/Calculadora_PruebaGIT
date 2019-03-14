import javax.swing.JOptionPane;

public class Calculadora {
	
	//Se utiliza concepto de modularidad y buenas practicas de codificacion
	
	private static int numero1;
	private static int numero2;
	private static int resultado;
	private static int operacion_a_realizar;
	
	public Calculadora()
	{
		numero1=0;
		numero2=0;
		resultado=0;
		operacion_a_realizar=0;
	}

	public static void main(String[] args) 
	{
		System.out.println("Elija la operacion que desea realizar: \n"
				+ "1.Suma\n"
				+ "2.Resta\n"
				+ "3.Multiplicacion\n"
				+ "4.Division\n"
				+ "5.Exponente\n"
				+ "6.Modulo\n");
		//Metodo para elegir la operacion
		setElegirOperacion();
	}
	//Metodo para elegir la operacion a ejecutar
	public static void setElegirOperacion()
	{
		//Almacena el numero de la operacion que el usuario desea realizar
				operacion_a_realizar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la operacion que desea realizar: "));
				
		//If para decidir la operacion a realizar
				if(operacion_a_realizar==1)
				{//Suma			
					resultado=getSuma(getPedirNumero1(), getPedirNumero2());
					System.out.println("La suma es: "+resultado);
				}
				else if(operacion_a_realizar==2)
				{//Resta
					
				}
				else if(operacion_a_realizar==3)
				{//Multiplicacion
					
				}
				else if(operacion_a_realizar==4)
				{//Division
					resultado=getDivision(getPedirNumero1(), getPedirNumero2());
					System.out.println("La division es: "+resultado);
				}
				else if(operacion_a_realizar==5)
				{//Exponente
                                    
					resultado = (int) getExpoente(getPedirNumero1(), getPedirNumero2());
					System.out.println("El resultado es: "+ resultado);
					
				}
				else if(operacion_a_realizar==6)
				{//Modulo
					resultado=getModulo(getPedirNumero1(),getPedirNumero2());
					System.out.println("El resultado es: "+resultado);
				}
	}
	//Metodo get para optener el primer numero
	public static int getPedirNumero1()
	{
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero:"));

		return numero1;
	}
	//Metodo get para optener el segundo numero
	public static int getPedirNumero2()
	{
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero:"));

		return numero2;
	}
	//Metodo get para calcular la suma entre dos numeros
    public static int getSuma(int numero1,int numero2)
    {
    	return(numero1+numero2);
    }
	//Metodo get para calcular el modulo entre dos numeros
	public static int getModulo(int divisor,int dividendo)
	{
		return (divisor%dividendo);
	}
        
    //Metodo get para calcular la division entre dos numeros
	public static int getDivision(int numero1,int numero2)
	{
		return(numero1/numero2);
	}
	//Metodo get para calcular el exponente de un numero
	public static double getExpoente(int numero1, int numero2)
	{
		double num1,num2;
          
		num1 = numero1*1.0;
		num2 = numero2*1.0;
		return (Math.pow(num1, num2));
	}
    
}
