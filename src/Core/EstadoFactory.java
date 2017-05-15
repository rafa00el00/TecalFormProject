package Core;

import java.util.HashMap;

import Model.Estado;

public class EstadoFactory {

	public Estado criar(){
		HashMap<String, Estado> estados;
		estados = new HashMap<String,Estado>();
		
		Estado estado;
		for(int i =0; i <= 29;i++)
		{
			estado = new Estado("q"+i);
			estados.put("q"+i,estado);
		}
		
		HashMap<Estado.TERMINAIS, Estado> futuros;
		for(int i = 0; i<=7;i++)
		{
			futuros = estados.get("q"+i).getEstadosFuturos();
			futuros.put(Estado.TERMINAIS.R1, estados.get("q"+ i+1));
			futuros.put(Estado.TERMINAIS.R2, estados.get("q"+ i+2));
			futuros.put(Estado.TERMINAIS.R5, estados.get("q"+ i+5));
		}
		estados.get("q6").getEstadosFuturos().put(Estado.TERMINAIS.BG, estados.get("q27"));
		estados.get("q7").getEstadosFuturos().put(Estado.TERMINAIS.BG, estados.get("q12"));
		estados.get("q7").getEstadosFuturos().put(Estado.TERMINAIS.BL, estados.get("q28"));
		
		for(int i = 0; i<=(8 - 12 + 1);i++)
		{
			futuros = estados.get("q"+ (i + 8)).getEstadosFuturos();
			futuros.put(Estado.TERMINAIS.BG, estados.get("q"+ (i+13)));
			futuros.put(Estado.TERMINAIS.BL, estados.get("q"+ (i+18)));
			futuros.put(Estado.TERMINAIS.CH, estados.get("q"+ (i+22)));
		}
		estados.get("q8").getEstadosFuturos().put(Estado.TERMINAIS.BL, estados.get("q29"));
		
		return estados.get("q0");
	}
	
}
