import java.util.Scanner;
 clase  p�blica caso8 {

	public  static  void  main ( String[] args) {
		Scanner sc = new  esc�ner (System.in);
		System.out.println ("Ingrese un numero: " );
		int n = sc.nextInt();
		System.out.println ("Tabla de multiplicar hasta el 15 " + n);

		int (i = ( int ) 1 ; i <= 15 ; i ++)
			System.out.println (n + " * " + i + " = " + (n * i));

	}

}