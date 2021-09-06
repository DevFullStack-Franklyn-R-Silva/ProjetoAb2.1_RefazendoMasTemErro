package application;

import javax.swing.JOptionPane;

import entities.BoletimDisciplina;
import entities.Discente;
import entities.Media;
import entities.Nota;

public class Program {

	public static void main(String[] args) {

		BoletimDisciplina boletim = new BoletimDisciplina();
		Media tipoDaMedia = new Media();
		
		boolean funcionando = true;
		// Cadastrar discentes
		while (funcionando) {
			String nome = JOptionPane.showInputDialog(null, "Digite o nome:");
			
			String matricula = JOptionPane.showInputDialog(null, "Digite a matricula:");
			
			
			boletim.getDiscentesB().add(new Discente(nome, matricula));

			int opc = JOptionPane.showOptionDialog(null, "Deseja cadatrar outro discente?", "Continuar cadastro",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
			if (opc == JOptionPane.NO_OPTION) {
				funcionando = false;
			}
		}
		int tipoMedia = JOptionPane.showOptionDialog(null, "Deseja utilizar a média aritmética?",
				"Definir tipo de média", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
		int tipo = 1;
		if (tipoMedia == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Será utilizada a média ponderada!");
			tipo = 1;
			tipoDaMedia.setTipoDaMedia(tipo);
		} else {
			JOptionPane.showMessageDialog(null, "Será utilizada a média aritmética!");
			tipo = 0;
			tipoDaMedia.setTipoDaMedia(tipo);
			
		}
		for (Discente discente : boletim.getDiscentesB()) {
			funcionando = true;
			// Cadastrar notas
			while (funcionando) {
				if (tipoDaMedia.getTipoDaMedia() == 0) { // media aritmetica
					String msg = "Digite a nota para " + discente.getNome() + ":";
					float valor = Float.parseFloat(JOptionPane.showInputDialog(null, msg));
					discente.getNotas().add(new Nota(valor, 1));
					
				} else if (tipoDaMedia.getTipoDaMedia() == 1) { // media ponderada
					String msg = "Digite a nota para " + discente.getNome() + ":";
					float valor = Float.parseFloat(JOptionPane.showInputDialog(null, msg));
					msg = "Digite o peso para a nota " + discente.getNome() + ":";
					int peso = Integer.parseInt(JOptionPane.showInputDialog(null, msg));
					discente.getNotas().add(new Nota(valor, peso));
				}
				int opc = JOptionPane.showOptionDialog(null, "Deseja inserir uma nova nota para o discente?",
						"Continuar cadastro", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null,
						null);
				if (opc == JOptionPane.NO_OPTION) {
					funcionando = false;
				}
			}
		}

		JOptionPane.showMessageDialog(null, boletim.toString());

	}

}
