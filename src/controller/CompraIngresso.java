package controller;

public class CompraIngresso extends Thread{
	private int id;
	private static int ingressos = 100;
	
	public CompraIngresso(int id) {
		this.id = id;
	}
	
	@Override
	public void run(){
		boolean prosseguir;
		 prosseguir = login(this.id);
		 if(prosseguir == true) {
			 prosseguir = compra(this.id);
			 if(prosseguir == true) {
				 ingresso(this.id);
				 System.out.println("sobraram "+this.ingressos+" ingressos");
				 
			 }
		 }
		
	}
	
	public boolean login(int id) {
		boolean ConLogin = true;
		int tempoLogin =(int)((Math.random()*1951)+50);
		try {
			sleep(tempoLogin);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(tempoLogin>= 1000) {
			ConLogin = false;
			 System.out.println("O "+id+"ª Comprandor demorou muito para concluir o login :( ");
		}
		return ConLogin;
	}
	
	public boolean compra(int id) {
		boolean ConCompra = true;
		int tempoCompra =(int)((Math.random()*2001)+1000);
		try {
			sleep(tempoCompra);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(tempoCompra>= 2500) {
			ConCompra = false;
			 System.out.println("O "+id+"ª Comprandor demorou muito para concluir a compra :(  ");
		}
		return ConCompra;
	}
	
   public void ingresso(int id){
	   int nIngressos =(int)(((Math.random()*3001)+1000)/1000);
	   if(nIngressos<=this.ingressos){
		   this.ingressos = this.ingressos - nIngressos;
		   System.out.println("O "+id+"ª Comprandor conseguiu comprar " +nIngressos+ " Ingresso(s)");
	   }else {
		   System.out.println("O "+id+"ª Comprandor não conseguiu comprar ingressos pela falta de ingressos disponiveis");
	   }
   }

}
