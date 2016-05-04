package transcreve;

import comum.SubTitulosExplicacoes;
import comum.Sumario;
import comum.TransformaUmaLinha;

public class TranscreveSubTitulo implements TransformaUmaLinha {

	public String transforma(String umLiDeSubTituloExplicacao) {
		return new SubTitulosExplicacoes(umLiDeSubTituloExplicacao).getUmSubTituloExplicacao();
	}
}
