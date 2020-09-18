package model;

public class AvatarFemininoFabrica extends AvatarFabrica{
	
	public Estilo montarEstilo() {
		return new EstiloEsportista();
	}
	
	public Vestimenta montarVestimenta() {
		return new VestimentaFeminina();
	}
}
