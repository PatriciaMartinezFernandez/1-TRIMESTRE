package ejemplos;

public class resumen {

	// METODOS DE LA CLASE RANDOMCHARACTER

	// getRandomCharacter(ch, ch2) > genera caracter aleatorio entre ch y ch2

	public static char getRandomCharacter(char ch, char ch2) {
		return (char) (ch + Math.random() * (ch2 - ch + 1));
	}

	// getRandomLowerCaseCharacter() > genera caracter aleatorio minusculas

	public static char getRandomLowerCaseLetter() {
		return getRandomCharacter('a', 'z');
	}
	// getRandomLowerCaseCharacter() > genera caracter aleatorio minusculas

	public static char getRandomUpperCaseLetter() {
		return getRandomCharacter('A', 'Z');
	}

	// getRandomDigitCharacter() > genera digito aleatorio

	public static char getRandomDigitCharacter() {
		return getRandomCharacter('0', '9');
	}

	// getRandomCharacter > devuelve un caracter aleatorio

	public static char getRandomCharacter() {
		return getRandomCharacter('\u0000', '\uFFFF');
	}

	public static void main(String[] args) {

		// METODOS DE LA CLASE RANDOMCHARACTER

		System.out.println(getRandomCharacter('1', '5'));
		System.out.println(getRandomLowerCaseLetter());
		System.out.println(getRandomUpperCaseLetter());
		System.out.println(getRandomDigitCharacter());
		System.out.println(getRandomCharacter());

		char ch, ch2;

		// METODOS DE LA CLASE CHARACTER

		// isDigit > devuelve true si es un digito

		ch = '1';

		System.out.println("Es digito? " + Character.isDigit(ch));

		// isLetter > devuelve true si es una letra

		ch = 'a';

		System.out.println("Es letra? " + Character.isLetter(ch));

		// isLetterOrDigit > devuelve true si digito o letra

		ch2 = '1';

		System.out.println("Es letra o numero? " + Character.isLetterOrDigit(ch));
		System.out.println("Es letra o numero? " + Character.isLetterOrDigit(ch2));

		// isLowerCase > devuelve true si minusculas, isUpperCase > devuelve true si
		// mayusculas

		ch2 = 'A';

		System.out.println("Minusculas? " + Character.isLowerCase(ch));
		System.out.println("Mayusculas? " + Character.isUpperCase(ch2));

		// isSpaceChar > devuelve true si es un espacio

		ch = ' ';

		System.out.println("Es un espacio? " + Character.isSpaceChar(ch));

		// isWhiteSpace > devuelve true si es algun tipo de blanco

		ch = '\r';

		System.out.println("Blanco? " + Character.isWhitespace(ch));

		// toLowerCase > devuelve minúscula o lo mismo

		ch = 'A';

		System.out.println(Character.toLowerCase(ch2));

		// toUpperCase > devuelve mayúsculas o lo mismo

		ch = 'a';

		System.out.println(Character.toUpperCase(ch));

		// digit > devuelve el valor numerico de un caracter en la base indicada

		int num = Character.digit('3', 10);

		System.out.println(num);

		// toString > devuelve una cadena de longitud 1 que contiene cad

		String cad = Character.toString('b');

		System.out.println(cad);

		// forDigit > devuelve el caracter que representa a digito en la base indicada

		ch = Character.forDigit(3, 10);
		ch2 = Character.forDigit(12, 16);

		System.out.println(ch);
		System.out.println(ch2);

		// METODOS PARA OBJETOS STRING

		// static String valueOf() > representa un tipo primitivo en forma de cadena

		cad = String.valueOf(1234);
		System.out.println(cad);

		// equals() > compara el contenido de la cadena que invoca y la de parametro

		cad = "Hola Mundo";
		String cad2 = "Hola Mundo";
		String cad3 = "Hola, buenos días";
		boolean iguales;

		iguales = cad.equals(cad2);
		System.out.println(iguales);
		iguales = cad.equals(cad3);
		System.out.println(iguales);
		
		// equalsIgnoreCase() > compara el contenido de dos cadenas sin distingir mayusculas de minusculas
		
		cad2 = "HOLA MUNDO";
		iguales = cad.equals(cad2);
		System.out.println(iguales);
		iguales = cad.equalsIgnoreCase(cad2);
		System.out.println(iguales);
		
		// compareTo() > devuelve 0, negativo si la cadena invocante es menor alfabeticamente y positivo si la cadena invocante es mayor alfabeticamente
		
		cad = "Alondra";
		cad2 = "Nutria";
		cad3 = "Zorro";
		System.out.println(cad2.compareTo(cad)); // Nutria < Alondra
		System.out.println(cad2.compareTo(cad3)); // Nutria > Zorro
		
		// compareToIgnoreCase() > compara alfabeticamente cadenas sin distinguir mayusculas y minusculas
		
		cad2 = "burro";
		System.out.println(cad.compareTo(cad2)); // burro < Alondra
		
		// lenght() > devuelve numero de caracteres de esta cadena
		
		System.out.println(cad.length());
		
		// charAt(index) > devuelve el caracter en el indice especifica en esa cadena
		
		System.out.println(cad.charAt(4)); // 0-a 1-l 2-o 3-n 4-d 5-r 6-a
		
		// concat() > devuelve una nueva cadena que concatena esta cadena con la siguiente
		
		System.out.println(cad.concat(cad2));
		
		// toUpperCase() > devuelve una cadena con todas las letras mayus 
		// toLowerCase() > devuelve una cadena con todas las ketras minus
		
		System.out.println(cad.toUpperCase());
		System.out.println(cad.toLowerCase());
		
		// trim() > devuelve una nueva cadena con espacios en blanco recortados en ambos lados
		
		System.out.println(cad.trim());
		
		
	}

}
