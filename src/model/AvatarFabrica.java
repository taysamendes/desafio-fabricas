package model;

//Utilizando o padrão de projetos Abstract Factory
public abstract class AvatarFabrica {
	
	public abstract Estilo montarEstilo();
	public abstract Vestimenta montarVestimenta();
	
}
