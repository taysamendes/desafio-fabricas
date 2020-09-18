package view;

import model.Avatar;
import model.AvatarFabrica;
import model.AvatarFemininoFabrica;
import model.AvatarMasculinoFabrica;

public class App {
	
	private static Avatar montarAvatar(String sexo) {
		AvatarFabrica af = null;
		
		if(sexo.compareTo("feminino")==0)
			af = new AvatarFemininoFabrica();
		
		else if(sexo.compareTo("masculino")==0)
			af = new AvatarMasculinoFabrica();
		
		Avatar a = new Avatar("Alex",1,5);
		a.setEstilo(af.montarEstilo());
		a.setRoupa(af.montarVestimenta());
		return a;
	}
	
	public static void main(String[] args) {
		Avatar a1 = montarAvatar("feminino");
		Avatar a2 = montarAvatar("masculino");

		
		System.out.println("Avatar feminino: "+a1);
		System.out.println("Avatar masculino: "+a2);


	}
}
