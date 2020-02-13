
public class Cadenas {
	public  String negativizar(String str) {

		String neg="";
		String no = " no ";
		int indexsi =  str.indexOf(" si ");
		String principio = str.substring(0, indexsi);
		String si = str.substring(indexsi, indexsi+4);
		String finalst = str.substring(indexsi+4, str.length());

		
		neg=neg+principio+no+finalst;
		return neg;
	}
	public static void main(String[] args) {
		Cadenas e1 = new Cadenas();
		System.out.println(e1.negativizar("si me parece que si es asi"));
		System.out.println(e1.negativizar("asi si que si"));
		System.out.println(e1.negativizar("A si si"));
		System.out.println(e1.negativizar("no sabia que si eras inutil"));

		


	}
}
