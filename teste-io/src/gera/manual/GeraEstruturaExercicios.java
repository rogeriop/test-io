package gera.manual;

import comum.PaginaDaLicaoExercicios;
import comum.Licao;
import comum.UsaLicao;

public class GeraEstruturaExercicios implements UsaLicao{

	@Override
	public String transforma(Licao licao) {
		return new PaginaDaLicaoExercicios(licao).getEstruturaDeExerciciosCompleta() + "<!-- FIM -->\n ";
	}
}
