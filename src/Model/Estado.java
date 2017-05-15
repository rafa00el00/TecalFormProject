package Model;

import java.util.EnumMap;

public class Estado {

	public enum TERMINAIS{
		R1("R$1,00"),
		R2("R$2.00"),
		R5("R$5,00"),
		BG("Bala de Goma"),
		BL("Bolacha"),
		CH("Chocolate");
		private String value;
		TERMINAIS(String value){
			this.value = value;
		}
		
		public String getValue(){
			return value;
		}
		
	}

	private String nome;
	private EnumMap<TERMINAIS, Estado> estadosFuturos;
	
	public Estado() {
		this("",new EnumMap<>());
	}
	
	public Estado(String nome) {
		this(nome,new EnumMap<>());
	}

	public Estado(String nome, EnumMap<TERMINAIS, Estado> estadosFuturos) {
		super();
		this.nome = nome;
		this.estadosFuturos = estadosFuturos;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public EnumMap<TERMINAIS, Estado> getEstadosFuturos() {
		return estadosFuturos;
	}
	public void setEstadosFuturos(EnumMap<TERMINAIS, Estado> estadosFuturos) {
		this.estadosFuturos = estadosFuturos;
	}
	
}
