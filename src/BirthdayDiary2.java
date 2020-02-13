import java.util.*;

public class BirthdayDiary2 {
	// Atributos
	HashMap<String, Calendar> cumple;
	
	public BirthdayDiary2() {
		cumple = new HashMap<String, Calendar>();
	}
	
	public void addBirthday(String name, int day, int month, int year) {
		Calendar fecha = Calendar.getInstance();
		fecha.set(year, month, day);
		cumple.put(name, fecha);
	}
	
	public Calendar getBirthdayFor(String name) {
		return cumple.get(name);
	}
	
	public void printDiary() {
		for (String key : cumple.keySet()) {
	        System.out.println(key+" cumple el "+cumple.get(key).get(Calendar.DATE)+" del "+cumple.get(key).get(Calendar.MONTH)+" de "+cumplea.get(key).get(Calendar.YEAR));
	    }
	}
	
	public static void main(String[] args) {
		BirthdayDiary bd = new BirthdayDiary();
		
		bd.addBirthday("Carmen", 14, 8, 2000);
		bd.printDiary();
	}
}
