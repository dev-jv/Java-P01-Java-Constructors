package poo;

public class Trees {

	private String apNombreEjemplar;
	
	private String nombreEsp;
	
	private int edad;
	
	private String estilo;
	
	private String tipoEspHoja;

	private String colorHoja;
	
	private String tama�o;
	
	private double precio;
	
	private boolean caduco;

	private boolean semicaduco;
	
	private boolean perenne;

	public Trees() {
		
		apNombreEjemplar = "";
		nombreEsp = "";
		edad = 0;
		estilo = "";
		tipoEspHoja = "";
		colorHoja = "";
		tama�o = "";
		precio = 0;
		caduco = false;
		semicaduco = false;
		perenne = true;
		
	}
	

	
//	public arboles() {
//		
//		apNombreEjemplar = "";
//		nombreEsp = "";
//	}

//		public arboles() {
//			
//	}
	
	public Trees(String ap, String ne, int e, String est, String th, String ch, String ta, double pr, boolean cad, boolean scad, boolean per) {
		
		apNombreEjemplar = ap;
		nombreEsp = ne;
		edad = e;
		estilo = est;
		tipoEspHoja = th;
		colorHoja = ch;
		tama�o = ta;
		precio = pr;
		caduco = cad;
		semicaduco = scad;
		perenne = per;
		
	}
	public Trees(String ne, double pr) {

		
		nombreEsp = ne;
		precio = pr;
		
//		this("Indefinido", ne, 2, "Indeterminado", "Hoja", "rojo", "Shohin", pr, false, false, true);
			
	}
	
//	public arboles(String ne, double pr) {
//		
//		nombreEsp = ne;
//		precio = pr;
//		
//		edad = 5;
//		estilo = "Literati";
//		tipoEspHoja = "Ac�cula";
//		tama�o = "Shohin";
//		caduco = false;
//
//	}
	
	public String mosDatos() {
		return "\nNombre Dr: " + apNombreEjemplar + "\nNombre Cie.:" + nombreEsp + "\nEdad: " + edad + "\nEstilo: " + estilo + "\nTipo de Hoja: " + tipoEspHoja + "\nColor de Hoja: " + colorHoja + "\nTama�o: " + tama�o + "\nPrecio: " + precio + "\nCaduco: " + caduco + "\nSemicaduco: " + semicaduco + "\nPerenne: " + perenne;
	}
	
}