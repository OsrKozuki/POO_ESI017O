package arraysPack;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class ArraysClass {
	
	public static void main(String[] args) {
		// The first way to create arrays is only declare it, we can use or fill it later. 
		// TYPE [] IDENTIFIER
		int [] edadesExample; // Warning cause we are not using it, this for next ones as well 
		int exampleFirst [];
		int [][] exampleSecond[];
		int exampleThird[][];
		
		
		/* Ejercicio en clase */
		// ASs it were in C Language
		// THIS IS WRONG IN JAVA --->int array[100]; // We indicate in C the size, it goes to the stack 
		// ESQUEMA 1
		int[] array1;
		int N = Integer.parseInt(JOptionPane.showInputDialog("Dame el tamaño del arreglo"));
		array1 = new int[N]; // Taking space to the HEAP
		System.out.println(array1); // If the array is only declared, it will fail
		
		// Before the assignation
		System.out.println("Longitud:" +  array1.length);
		
		
		array1[0] = 3;
		array1[1] = array1[0] * 2;
		System.out.println(array1[1]);
		System.out.println(array1[0]);
		
		//Declaration in the first line / ESQUEMA 2
		double[] array2 = new double[20];
		
		for(int i = 0; i < array2.length; i++) {
			array2[i] = Math.sqrt(i + 1);
		}
		
		System.out.println(array2);
		
		for(int i = 0; i < array2.length; i++) {
			System.out.printf("%2d: %.2f \n", i+1, array2[i]); //The syntax here helps to; save spaces in the int, works similar to C language.
		}
		
		// Esquema 3
		String[] array3 = {"uno", "dos", "tres"};
		
		for(int i = 0; i < array3.length; i++) {
			// array3[i].toUpperCase(); // The string does not change, a new one is created, we need to catch the result basically
			//so, above statement is not cool. 
			// Move the pointer, here in java only assign it
			array3[i] = array3[i].toUpperCase();
			// We can use CLASS ARRAYS to several things. Like print. 
			}
		
			System.out.println(Arrays.toString(array3));
			System.out.println(Arrays.toString(array2));
			System.out.println(Arrays.toString(array1));
			
			// Matrices
			System.out.println("MATRICES Y TODO LO DEMAS A PARTIR DE AQUI");
			int[][] matrix4 = new int[3][4];
			System.out.println(matrix4.length);
			matrix4[2][1] = 5;
			
			for(int r = 0; r < matrix4.length; r++) {
				for(int c =  0; c < matrix4[r].length; c++) {
					matrix4[r][c] = (r == c)? 1: 0;
				}
			}
			System.out.println(matrix4); // Se imprime direccion
			System.out.println(Arrays.toString(matrix4)); // Prints the memory address of the Master ArraY, in this case matrix[3]
			// To print correctly
			
			for(int r = 0; r < matrix4.length; r++) {
				System.out.println(Arrays.toString(matrix4[r]));
			}

		
 	}

}
