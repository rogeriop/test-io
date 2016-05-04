package gera.manual;

import comum.Exercicios;
import comum.Licao;

public class GeraEstruturaExercicios implements UsaLicao{

	@Override
	public String transforma(Licao licao) {
		return new Exercicios(licao).getEstruturaDeExerciciosCompleta() + "<!-- FIM -->\n ";
	}
}
