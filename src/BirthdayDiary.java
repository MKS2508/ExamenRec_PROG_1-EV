import java.util.Calendar;
import java.util.Scanner;

public class BirthdayDiary {
	private String name;
	private int day;
	private int month;
	private int year;

	public BirthdayDiary() {
		this.name = name;
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public void addBirthday(String name, int day, int month, int year) {
		String Birthday = "";
		Scanner reader = new Scanner(System.in);

		// namMae = reader.nextLine();

		// day = reader.nextInt();
		if (day > 31 || day < 1) {
			System.out.println("Día no válido, introduzca un valor entre 1 y 31: ");
			day = reader.nextInt();
		}
		String string_day = String.valueOf(day);

		// month = reader.nextInt();
		if (month > 12 || month < 1) {
			System.out.println("Mes no válido, introduzca un valor entre 1 y 12: ");
			month = reader.nextInt();
		}
		String string_month = String.valueOf(month);
		// year = reader.nextInt();
		String string_year = String.valueOf(year);
		if (string_year.length() != 4 || string_year.charAt(0) != 1 || string_year.charAt(0) != 2) {
			System.out.println("Año no válido, introduzca un valor entre 1XXX y 2XXX: ");
			month = reader.nextInt();
		}
		Birthday = Birthday + name + string_year + "/" + string_month + "/" + string_day;
		System.out.println(Birthday);
	}

	public Calendar getBirthdayForCal(String name) {

		return null;

	}

	public String getBirthdayFor(String name) {
		Scanner reader2 = new Scanner(System.in);
	
		name = reader2.nextLine();
		
		}

	

	public void printDiary() {

	}

	public static void main(String[] args) {
		BirthdayDiary e1 = new BirthdayDiary();
		Scanner reader = new Scanner(System.in);

		System.out.println("Introduzca el Nombre y una fecha de cumpleaños válida: ");
		String name = reader.nextLine();
		int day = reader.nextInt();
		int year = reader.nextInt();
		int month = reader.nextInt();

		e1.addBirthday(name, day, month, year);

	}
}
