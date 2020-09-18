package model;

public class AvatarMasculinoFabrica extends AvatarFabrica{

	public Estilo montarEstilo() {
		return new EstiloClassico();
	}
	
	public Vestimenta montarVestimenta() {
		return new VestimentaMasculina();
	}
}
