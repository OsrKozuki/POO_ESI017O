package tareas;

/* Adding necessary imports for this homework*/
import java.util.Arrays;
import javax.swing.JOptionPane;

	public class TareaDos {
			static short[][] splitArray(short[] arrayOne){
			// With this make sure that each dimension has enough space to put the values by inspecting the matrix for the first time, not adding nothing yet
			int even = 0;
			int odd = 0;
			for(int value : arrayOne){
				if(value % 2 == 0 && value > 0) {
					even += 1;
					//System.out.println(value);
				}else if (value % 2 != 0 && value > 0) {
					odd += 1;
					//System.out.println(value);
				}
			}
			// Just for testing
			//System.out.println("ACAB");
			//System.out.println(odd);
			//System.out.println(even);
				
				
			short twoArrays [][] = new short[2][];
			twoArrays[0] = new short[odd];
			twoArrays[1] = new short[even];
			
			int d1 = 0;
			int d2 = 0;
			// If number is odd, then save it in first row and add a column
			// If number is even, then save on second row and add value for column
			for(int i = 0; i < arrayOne.length; i++) {
				if(arrayOne[i] % 2 != 0 && arrayOne[i] > 0) {
					twoArrays[0][d1] = arrayOne[i];
					d1 += 1;
				}
				else if (arrayOne[i] > 0){
					twoArrays[1][d2] = arrayOne[i];
					d2 += 1;
				}
					
			}
				return twoArrays;
			}
	
	
	public static void main(String[] args) {
		/* Part 1 of the homework: splitArrays*/
		short[] arrayOne = {12, -34, 16, -28, 5, -5, 56, 11, 12, 1};
		short [][] twoArrays = splitArray(arrayOne);
		System.out.println(twoArrays.length); 
		System.out.println(Arrays.toString(twoArrays[0])); 
		System.out.println(Arrays.toString(twoArrays[1]));
		
		/* Part 2  of the homework: Median*/
		int numCalf = 0;
		// Confirmation that the number is expected, if fails then close the program, finish it.
		try {
			numCalf = Integer.parseInt(JOptionPane.showInputDialog("Dame el numero de calificaciones a insertar"));
		}catch(NumberFormatException ex) { 
			JOptionPane.showMessageDialog(null, "Cantidad no válida. Gracias por participar");
			};
		
		
		// Working with array if above was sucessfull and set the lenght using the above numCalf result
		// Iterate each position and ask for a grade, if it not a number then the exceptions comes, if the value is greater than 10 then the if change the value to 0
		double calificaciones[] = new double[numCalf];
		for(int i = 0; i < calificaciones.length; i++) {
			try {
				calificaciones[i] = Double.parseDouble(JOptionPane.showInputDialog("Inserta la calificación: " + (i+1)));
				if(calificaciones[i] < 0 || calificaciones[i] > 10) {
					calificaciones[i] = 0;					
				}
			}catch(NumberFormatException ex) {calificaciones[i] = 0;}; 
		}
		
		// Using Arrays method to sort in an ascend way
		// Then using a simple algoritm, it calculated the median by taking the lenght, evaluating if even or odd and perform the calculation for each case
		Arrays.sort(calificaciones);
		int operMedi = (calificaciones.length/2); 
		double mediana;
		if(calificaciones.length % 2 == 1) {
			mediana = calificaciones[operMedi + 1];
		}else {
			mediana = (calificaciones[operMedi-1] + calificaciones[operMedi])/2;
		}
		JOptionPane.showMessageDialog(null, "La mediana es " + mediana);
	}
}
