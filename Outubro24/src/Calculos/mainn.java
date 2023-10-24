package Calculos;

public class  mainn {
public static void main(String[] args) {
	
	Adicionar ad = new Adicionar();
	Subtracao sub = new Subtracao();
	Exp expo = new Exp();
	Calcular cal = new Calcular();
	
	System.out.println("Valor A"+50+"\nValor B: "+20);
	System.out.println("\nSubtração: "+sub.sub(50,20));
	System.out.println("Multplicação: "+cal.mult(50,20));
	System.out.println("Divisão: "+cal.div(50,20));
	System.out.println("Expoente: "+expo.exp(50,20));
	System.out.println("Soma: "+ad.soma(50, 20));
	
	
	
	
}
}