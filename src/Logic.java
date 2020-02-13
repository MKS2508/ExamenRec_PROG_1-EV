
public class Logic {
	public static boolean comprobarBisiesto(int num) {
		boolean b = false;
		if (num % 4 == 0 && num % 100 != 0) {
			b = true;
		} else {
			b = false;
		}
		return b;
	}

	public static void imprimirBisiestos(int num1, int num2) {
		int i = num1;
		while (i <= num2) {
			if (comprobarBisiesto(i) == true) {
				System.out.println(i);
			}
			i++;
		}

	}

	public static void main(String[] args) {
		Logic l1 = new Logic();
		System.out.println("	#Comprobacion metodo booleano#");
		System.out.println("");

		System.out.println("El año 2020 devuelve: "+l1.comprobarBisiesto(2020));
		System.out.println("El año 2019 devuelve: "+l1.comprobarBisiesto(2019));
		System.out.println("El año 2018 devuelve: "+l1.comprobarBisiesto(2018));
		System.out.println("El año 2017 devuelve: "+l1.comprobarBisiesto(2017));
		System.out.println("El año 2016 devuelve: "+l1.comprobarBisiesto(2016));
		System.out.println("El año 2015 devuelve: "+l1.comprobarBisiesto(2015));
		System.out.println("El año 2014 devuelve: "+l1.comprobarBisiesto(2014));
		System.out.println("El año 2013 devuelve: "+l1.comprobarBisiesto(2013));
		System.out.println("El año 2012 devuelve: "+l1.comprobarBisiesto(2012));
		System.out.println("");
		System.out.println("	#Comprobacion metodo imprimir#");
	
		l1.imprimirBisiestos(1999, 2020);

	}

}
