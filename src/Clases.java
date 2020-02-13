
public class Clases {

	/* Atributos */

	private String titulo;
	private String descripcion;
	private float precio;

	/* Constructores */

	public Clases(String titulo, String descripcion, float precio) { // por parametro
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public Clases() { // Por defecto
		this.titulo = "titulo1";
		this.descripcion = "descripcion1";
		this.precio = 80;
	}

	/* Getters & Setters */

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {

		this.descripcion = descripcion;
	}

	public int getPrecio(int precio) {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public void setitituloprecior(String titulo, float precio) {
		this.titulo = titulo;
		this.precio = precio;

	}

	public String tostring() {
		return "" + titulo + ", " + descripcion + ", " + precio;
	}

	public int Oferta(int descuento) {
		int preciofinal;
		preciofinal = (int) (precio - (precio * descuento) / 100);

		return preciofinal;
	}

	public static void main(String[] args) {

		/* Prueba1 */
		System.out.println("#Prueba 1#");
		System.out.println("");
		Clases e1 = new Clases();
		System.out.println(e1.tostring());
		e1.setitituloprecior("titulo1b", 50);
		System.out.println(e1.tostring());
		System.out.println("Aplicamos descuento 20%");
		e1.setitituloprecior("titulo1b", e1.Oferta(20));
		System.out.println(e1.tostring());
		System.out.println("");

		/* Prueba2 */
		System.out.println("#Prueba 2#");
		System.out.println("");
		Clases e2 = new Clases("titulo2", "desc2", 150);
		System.out.println(e2.tostring());
		e2.setitituloprecior("titulo2b", 50);
		System.out.println(e2.tostring());
		System.out.println("Aplicamos descuento 20%");
		e2.setitituloprecior("titulo2b", e2.Oferta(20));
		System.out.println(e1.tostring());
		

	}
}
