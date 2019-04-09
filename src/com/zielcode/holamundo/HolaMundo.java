package com.zielcode.holamundo;

public class HolaMundo {
	//upper Camel Case
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola Mundo :)");
		
		//Enteros
		byte edad = 127;
		short year = -32768;
		int id_user = 1001;
		long id_twitter = 4545645646456456456L;
		
		//Punto Flotante
		float diametro = 34.25F;
		double precio = 12345.12345489456421;
		
		//Texto
		char genero = 'M';
		
		//Logico
		boolean isVisible = true;
		boolean funciona = false;
		
		
		int variable = 2;
		int _variable = 3;
		int $variable = 4;
		int variable1 = 5;
		
		//Constantes
		int VALOR = 0;
		int VALOR_MAXIMO = 1;
		
		//Lower camel case
		int minValor = 4;
		
		byte b = 6;
		short s = b;
		
		b = (byte)s;
		
		int i = 1;
		double d = 2.5;
		
		i = (int) d;
		
		int codigo = 97;
		char codigoASCII = (char)codigo;
		
		short numero = 300;
		byte numeroBYTE = (byte)numero;
		
		//Arrays
		//Declaracion de array
		
		int[] arregloInt = new int[3];
		double arregloDouble[]; 
		
		int[][] array2D = new int[2][3]; //Caben 6 cupcakes
		int[][][] array3D = new int[3][3][2]; //caben 18 cookies
		int[][][][] array4D = new int [1][2][3][4];
		
		char[][] days = { {'M', 'T', 'W'}, {'M', 'T', 'W'}};
		//char[][][] days = { {'a', 'b', 'c'}, {'a', 'b', 'c'}, {'a', 'b', 'c'}};
		
		
		char[] names = new char [4];
		names[0] = 'h';
		names[1] = 'o';
		names[2] = 'l';
		names[3] = 'a';
			
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		
		char[][][][] monkey = new char [2][3][2][2];
		monkey [1][0][0][1] = 'm';
		
		System.out.println(monkey [1][0][0][1]);
		
		
		//Operadores Aritmeticos
		int a = 1;
		int aa = a+a;
		
		System.out.println("El valor de: " + aa);
		
		double x = 2.56;
		int y = 9;
		
		float w = (float)x + y;
		System.out.println(w*2);
		
		double k = 4/0.00002;
		System.out.println(k);
		
		
		System.out.println(7%2);
		
		double f = 2;
		int g = 3;
		f %= g;
		
		System.out.println(f);
		
		int l = 3;
		//l++;
		++l;
		System.out.println(l);
		
		
		//Operadores de Equidad
		int q = 8;
		int p = 5;
		
		System.out.println(q!=p);
		
		//Operadores relacionales
		System.out.println("q > p -> " +  (q>p));
		System.out.println("q < p -> " +  (q<p));
		System.out.println("q = p -> " +  (q==p));
		
		System.out.println("q >= p -> " +  (q>=p));
		System.out.println("q <= p -> " +  (q<=p));
		
		//operadores logicos
		boolean n = false;
		boolean m = true;
		
		System.out.println("a && b ->" + (n && m));
		System.out.println("a || b ->" + (n || m));
		System.out.println("!n ->" + (!n));
		System.out.println("!m ->" + (!m));
		
		//Control de Flujo
		//If/else
		
		if(q > p) {
			//true
			System.out.println("si es mayor");
		} else if(q == p) {
			//false
			System.out.println("es igual");
			
		} else {
			System.out.println("No es mayor, y no es igual");
		}
		
		//switch
		
		int mes = 0;
		
		switch (mes) {
		case 1:
			System.out.println("Enero");
			break;
		case 2:
			System.out.println("Febrero");
			break;
		case 3:
			System.out.println("Marzo");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Mayo");
			break;
		case 6:
			System.out.println("Junio");
			break;
		case 7:
			System.out.println("Julio");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Septiembre");
			break;
		case 10:
			System.out.println("Octubre");
			break;
		case 11:
			System.out.println("Noviembre");
			break;
		case 12:
			System.out.println("Diciembre");
			break;
		default:
			System.out.println("Mes incorrecto");
			break;
		}
		
	}//cierre del main

}
