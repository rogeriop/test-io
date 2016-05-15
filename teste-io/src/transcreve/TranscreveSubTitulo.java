package transcreve;

import comum.PaginaDaLicaoSubTitulosExplicacoes;
import comum.Sumario;
import comum.TransformaUmaLinha;

public class TranscreveSubTitulo implements TransformaUmaLinha {

	public String transforma(String umLiDeSubTituloExplicacao) {
		return new PaginaDaLicaoSubTitulosExplicacoes(umLiDeSubTituloExplicacao).getUmSubTituloExplicacao();
	}
}
