package View;
import controller.CompraIngresso;


public class main {

	public static void main(String[] args) {
		 for(int idThread = 1; idThread< 301; idThread++) {
			 CompraIngresso CompraIngresso = new CompraIngresso(idThread);
			 CompraIngresso.start();
         }

	}

}
