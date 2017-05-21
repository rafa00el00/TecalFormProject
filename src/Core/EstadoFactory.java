package Core;

import java.util.HashMap;

import Model.Estado;

public class EstadoFactory {

	public Estado criar() {
		HashMap<String, Estado> estados;
		estados = new HashMap<String, Estado>();

		estados.put("q0", new Estado("q0"));
		estados.put("q1", new Estado("q1"));
		estados.put("q2", new Estado("q2"));
		estados.put("q3", new Estado("q3"));
		estados.put("q4", new Estado("q4"));
		estados.put("q5", new Estado("q5"));
		estados.put("q6", new Estado("q6"));
		estados.put("q7", new Estado("q7"));
		estados.put("q8", new Estado("q8"));
		estados.put("q9", new Estado("q9"));
		estados.put("q10", new Estado("q10", "Bala de Goma"));
		estados.put("q11", new Estado("q11", "Bolacha"));
		estados.put("q12", new Estado("q12", "Chocolate"));
		estados.put("q13", new Estado("q13", "Bala de Goma com troco"));
		estados.put("q14", new Estado("q14", "Bolacha com troco"));
		estados.put("q15", new Estado("q15", "Chocolate com troco"));

		// q0
		estados.get("q0").getEstadosFuturos().put(Estado.TERMINAIS.R1, estados.get("q1"));
		estados.get("q0").getEstadosFuturos().put(Estado.TERMINAIS.R2, estados.get("q2"));
		estados.get("q0").getEstadosFuturos().put(Estado.TERMINAIS.R5, estados.get("q5"));

		// q1
		estados.get("q1").getEstadosFuturos().put(Estado.TERMINAIS.R1, estados.get("q2"));
		estados.get("q1").getEstadosFuturos().put(Estado.TERMINAIS.R2, estados.get("q3"));
		estados.get("q1").getEstadosFuturos().put(Estado.TERMINAIS.R5, estados.get("q6"));

		// q2
		estados.get("q2").getEstadosFuturos().put(Estado.TERMINAIS.R1, estados.get("q3"));
		estados.get("q2").getEstadosFuturos().put(Estado.TERMINAIS.R2, estados.get("q4"));
		estados.get("q2").getEstadosFuturos().put(Estado.TERMINAIS.R5, estados.get("q7"));

		// q3
		estados.get("q3").getEstadosFuturos().put(Estado.TERMINAIS.R1, estados.get("q4"));
		estados.get("q3").getEstadosFuturos().put(Estado.TERMINAIS.R2, estados.get("q5"));
		estados.get("q3").getEstadosFuturos().put(Estado.TERMINAIS.R5, estados.get("q8"));

		// q4
		estados.get("q4").getEstadosFuturos().put(Estado.TERMINAIS.R1, estados.get("q5"));
		estados.get("q4").getEstadosFuturos().put(Estado.TERMINAIS.R2, estados.get("q6"));
		estados.get("q4").getEstadosFuturos().put(Estado.TERMINAIS.R5, estados.get("q9"));
		// q5
		estados.get("q5").getEstadosFuturos().put(Estado.TERMINAIS.R1, estados.get("q6"));
		estados.get("q5").getEstadosFuturos().put(Estado.TERMINAIS.R2, estados.get("q7"));
		estados.get("q5").getEstadosFuturos().put(Estado.TERMINAIS.R5, estados.get("q9"));
		// q6
		estados.get("q6").getEstadosFuturos().put(Estado.TERMINAIS.R1, estados.get("q7"));
		estados.get("q6").getEstadosFuturos().put(Estado.TERMINAIS.R2, estados.get("q8"));
		estados.get("q6").getEstadosFuturos().put(Estado.TERMINAIS.R5, estados.get("q9"));
		estados.get("q6").getEstadosFuturos().put(Estado.TERMINAIS.BG, estados.get("q10"));
		// q7
		estados.get("q7").getEstadosFuturos().put(Estado.TERMINAIS.R1, estados.get("q8"));
		estados.get("q7").getEstadosFuturos().put(Estado.TERMINAIS.R2, estados.get("q9"));
		estados.get("q7").getEstadosFuturos().put(Estado.TERMINAIS.R5, estados.get("q9"));
		estados.get("q7").getEstadosFuturos().put(Estado.TERMINAIS.BG, estados.get("q13"));
		estados.get("q7").getEstadosFuturos().put(Estado.TERMINAIS.BL, estados.get("q11"));
		// q8
		estados.get("q8").getEstadosFuturos().put(Estado.TERMINAIS.R1, estados.get("q9"));
		estados.get("q8").getEstadosFuturos().put(Estado.TERMINAIS.R2, estados.get("q9"));
		estados.get("q8").getEstadosFuturos().put(Estado.TERMINAIS.R5, estados.get("q9"));
		estados.get("q8").getEstadosFuturos().put(Estado.TERMINAIS.BG, estados.get("q13"));
		estados.get("q8").getEstadosFuturos().put(Estado.TERMINAIS.BL, estados.get("q14"));
		estados.get("q8").getEstadosFuturos().put(Estado.TERMINAIS.CH, estados.get("q12"));
		// q9
		estados.get("q9").getEstadosFuturos().put(Estado.TERMINAIS.R1, estados.get("q9"));
		estados.get("q9").getEstadosFuturos().put(Estado.TERMINAIS.R2, estados.get("q9"));
		estados.get("q9").getEstadosFuturos().put(Estado.TERMINAIS.R5, estados.get("q9"));
		estados.get("q9").getEstadosFuturos().put(Estado.TERMINAIS.BG, estados.get("q13"));
		estados.get("q9").getEstadosFuturos().put(Estado.TERMINAIS.BL, estados.get("q14"));
		estados.get("q9").getEstadosFuturos().put(Estado.TERMINAIS.CH, estados.get("q15"));
		
		// q10-15
		estados.get("q10").getEstadosFuturos().put(Estado.TERMINAIS.Iniciar, estados.get("q0"));
		estados.get("q11").getEstadosFuturos().put(Estado.TERMINAIS.Iniciar, estados.get("q0"));
		estados.get("q12").getEstadosFuturos().put(Estado.TERMINAIS.Iniciar, estados.get("q0"));
		estados.get("q13").getEstadosFuturos().put(Estado.TERMINAIS.Iniciar, estados.get("q0"));
		estados.get("q14").getEstadosFuturos().put(Estado.TERMINAIS.Iniciar, estados.get("q0"));
		estados.get("q15").getEstadosFuturos().put(Estado.TERMINAIS.Iniciar, estados.get("q0"));
		
		
		return estados.get("q0");
	}

}
