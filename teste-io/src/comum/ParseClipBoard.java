package comum;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.Calendar;

import formata.FonteMaior;
import formata.FundoCinza;
import formata.ItalicoVermelho;
import formata.Negrito;
import formata.ParaListaNumerada;
import gera.automatico.PaginasAulaCurso;
import gera.automatico.PastaDeCursos;
import gera.manual.EstruturaExercicios;
import gera.manual.EstruturaSubTitulosExplicacao;
import gera.manual.IconeDiploma;
import gera.manual.IconeTecla;
import gera.manual.PaginaAulaCurso;
import gera.manual.PaginaIndiceCurso;
import gera.manual.XmlPadraoDoCurso;
import transcreve.Codigo;
import transcreve.Imagem;
import transcreve.LinkLabelDiferente;
import transcreve.LinkMesmoLabel;
import transcreve.ListaNumerada;
import transcreve.Paragrafo;
import transcreve.SubTitulo;
import transcreve.SubTituloDeExercicioOuResposta;

public class ParseClipBoard {
	public static void main(String[] args) throws UnsupportedFlavorException,
			IOException {
		
		Calendar dateTime;
		ClipBoard clipBoard = new ClipBoard();

		// PEGA PRÓXIMA OPÇÃO NA LINHA DE COMANDO
		Opcoes opcoes = new Opcoes();
		
		// EXECUTA A OPÇÃO DESEJADA E SOLICITA MAIS DEMANDA
		while (!opcoes.getA().equals("99")) {

			// RECEBE CONTEÚDO DO CLIPBOARD
			String vem = clipBoard.obtem();
			if (vem == null) vem = "Bem vindo ao ParseClipBoard";
			
			// CRIA ARRAY DE LINHAS
			String[] vemEmLinhas = vem.split("\n");

			// PARA MIGRAÇÃO XML
			Curso curso;
			
			// INICIO DE PREPARAÇÃO DA VARIÁVEL DE SAÍDA PARA O CLIPBOARD 
			String vai = "";
			
			switch (opcoes.getA()) {
			case "1":
				vai = new Codigo().transforma(vemEmLinhas);
				break;
			case "2":
				vai = new Paragrafo().transforma(vemEmLinhas);
				break;
			case "3":
				vai = new ListaNumerada().transforma(vemEmLinhas);
				break;
			case "4":
				vai = new SubTitulo().transforma(vem);
				break;
			case "5":
				vai = new LinkLabelDiferente().transforma(vem);
				break;
			case "6":
				vai = new Negrito().transforma(vemEmLinhas);
				break;
			case "7":
				vai = new Imagem().transforma(vemEmLinhas, opcoes.getWidth(), opcoes.getHeight());
				break;
			case "8":
				vai = new  SubTituloDeExercicioOuResposta().transforma(vem);
				break;
			case "9":
				vai = new  FundoCinza().tranforma(vem); 
				break;
			case "10":
				vai = new  ParaListaNumerada().transforma(vemEmLinhas); 
				break;
			case "11":
				vai = new  ItalicoVermelho().transforma(vemEmLinhas); 
				break;
			case "12":
				vai = new  FonteMaior().transforma(vemEmLinhas); 
				break;
			case "13":
				vai = new  LinkMesmoLabel().transforma(vemEmLinhas); 
				break;
			case "14":
				vai = new  EstruturaExercicios().transforma(vemEmLinhas); 
				break;
			case "15":
				vai = new  IconeTecla().transforma(vem); 
				break;
			case "16":
				vai = new  IconeDiploma().transforma(vem); 
				break;
			case "17":
				vai = new  EstruturaSubTitulosExplicacao().transforma(vemEmLinhas); 
				break;
			case "18":
				curso = ConverteXmlParaCurso.cursoDeXml(vem);
				vai = new  PaginaIndiceCurso().transforma(curso); 
				break;
			case "19":
				vai = new  PaginaAulaCurso().transforma(vem); 
				break;
			case "20":
				new  PastaDeCursos().transforma(vem); 
				break;
			case "21":
				new  PaginasAulaCurso().transforma(vem, opcoes); 
				break;
			case "22":
				curso = new Curso("01", "Nome do Curso", "01/11/2014");
				vai = new  XmlPadraoDoCurso().transforma(curso); 
				break;
			}
			
			// GRAVA TRATAMENTO DO TEXTO NO CLIBOARD
			clipBoard.copia(vai);

			// INFORMA HORA DE CONCLUSÃO DA OPÇÃO SOLICITADA
			dateTime = Calendar.getInstance();
			System.out.print("Feito as " );
			System.out.printf("%1$tH:%1$tM:%1$tS\n", dateTime);
			System.out.println("------------------");
			for(int x = 0; (x <= vemEmLinhas.length - 1) && (x < 3); x++) {
				System.out.println(vemEmLinhas[x]);
			}
			System.out.println("------------------");
			
			// PEGA PRÓXIMA OPÇÃO NA LINHA DE COMANDO
			opcoes.pegaOpcao();
			
		}

		System.out.println("Bye!");
	}

}
