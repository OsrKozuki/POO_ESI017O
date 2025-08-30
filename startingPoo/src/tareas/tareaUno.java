package tareas;
import javax.swing.JOptionPane;

public class tareaUno {

	static void zodiacal() {
		/*
		 * a) Para determinar el signo zodiacal utiliza switch con operador flecha ->
			b) Como cada mes admite dos signos, utiliza el operador ternario para determinar cuál corresponde
			c) Considera el caso de un mes no válido asignando un valor por defecto al signo
			d) No hagas validaciones con el día. Puedes suponer que siempre se captura correctamente.
			e) Si el mes/signo es válido, construye el mensaje de salida SIN concatenar (String.format).
		 */
		
		String mes = JOptionPane.showInputDialog("Dame tu mes de nacimiento");
		String diaNacimiento = JOptionPane.showInputDialog("Dame tu dia de nacimiento");
		
		// Will need the next ones for validations
		String mesZodiacal = mes.trim().toLowerCase();
		int diaNac = Integer.parseInt(diaNacimiento);
		String signoZodiacal = switch (mesZodiacal){
			case "enero" -> (diaNac < 20) ? "Capricornio" : "Acuario";
			case "febrero" -> (diaNac < 19) ? "Acuario" : "Piscis";
			case "marzo" -> (diaNac < 20) ? "Piscis" : "Aries";
			case "abril" -> (diaNac < 20) ? "Aries" : "Tauro";
			case "mayo" -> (diaNac < 21) ? "Tauro" : "Geminis";
			case "junio" -> (diaNac < 21) ? "Geminis" : "Cancer";
			case "julio" -> (diaNac < 23) ? "Cancer" : "Leo";
			case "agosto" -> (diaNac < 23) ? "Leo" : "Virgo";
			case "septiembre" -> (diaNac < 23) ? "Virgo" : "Libra";
			case "octubre" -> (diaNac < 23) ? "Libra" : "Escorpio";
			case "noviembre" -> (diaNac < 22) ? "Escorpio" : "Sagitario";
			case "diciembre" -> (diaNac < 22) ? "Sagitario" : "Capricornio";
			default -> "Mes no valido";
		};
		// Conditional 
		if (signoZodiacal.equals("Mes no valido")) {
			JOptionPane.showMessageDialog(null, signoZodiacal);
		}else {
			JOptionPane.showMessageDialog(null, String.format("Dado que naciste el %d de %s tu signo zodiacal es %s", diaNac, mesZodiacal, signoZodiacal));
		}
	}
	
	static void primo() {
		/*
		 * a) Suponga que los dos números dados A, B son mayores que 1. Además, A < B. No hay que validar.
			b) Utiliza for para iterar cada número X en el rango [A-B]. De preferencia de mayor a menor.
			c) Utiliza while interno para descubrir si X es primo. No dividas entre algo mayor que la raíz de X.
		 */
		
		String minNumero = JOptionPane.showInputDialog("Escribe el numero menor");
		String maxNumero = JOptionPane.showInputDialog("Escribe el numero mayor");
		
		int minNum = Integer.parseInt(minNumero);
		int maxNum = Integer.parseInt(maxNumero);
		int control = 0;
		int result = 0;
		
		for(int i = minNum; i <= maxNum; i++) {
			int divisor = 2;
			do {
				if( i%(double)divisor == 0 ) {
					control = 0;
					break;
				}
					System.out.println(divisor);
					divisor++;
					control = 1;
					System.out.println(i%(double)divisor);
					
			}while(divisor <= (double)Math.sqrt(i));
			// Acaba While
			if (control == 1) result = i;
		}
		
		if(result == 0) {
			JOptionPane.showMessageDialog(null, "No hay numero primos en tu rango");
		}else {
			JOptionPane.showMessageDialog(null, String.format("El primo numero mas grande entre %d y % d es %d", minNum, maxNum, result));
		}
	
		
	}
	
	public static void main(String[] args) {
		//zodiacal();
		primo();
		
		
	}
}
