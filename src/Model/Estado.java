package Model;

import java.util.EnumMap;

public class Estado {

	public enum TERMINAIS{
		R1("R$1,00"),
		R2("R$2.00"),
		R5("R$5,00"),
		BG("Bala de Goma"),
		BL("Bolacha"),
		CH("Chocolate"),
		Iniciar("Iniciar");
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
	private String descricao;
	
	public Estado() {
		this("",new EnumMap<>(TERMINAIS.class),"");
	}
	
	public Estado(String nome) {
		this(nome,new EnumMap<>(TERMINAIS.class),"");
	}
	public Estado(String nome, String descricao) {
		this(nome,new EnumMap<>(TERMINAIS.class),descricao);
	}

	public Estado(String nome, EnumMap<TERMINAIS, Estado> estadosFuturos, String descricao) {
		super();
		this.nome = nome;
		this.estadosFuturos = estadosFuturos;
		this.descricao = descricao;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
