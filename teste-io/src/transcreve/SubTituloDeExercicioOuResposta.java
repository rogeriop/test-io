package transcreve;

import comum.PaginaDaLicaoExercicios;

public class SubTituloDeExercicioOuResposta {

	public String transforma(String linha) {
		return PaginaDaLicaoExercicios.geraSubTituloDeExercicioOuResposta(linha);
	}
}
