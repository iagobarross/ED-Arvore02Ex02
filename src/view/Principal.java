package view;

import br.edu.fateczl.Arvore.Arvore;
import controller.ArvoreController;

public class Principal {

	public static void main(String[] args) {
		ArvoreController arvCont = new ArvoreController();
		int[] vetor = { 12, 4, 16, 2, 8, 6 };
		
		Arvore arvore = arvCont.insereElementos(vetor);
		
		arvore.search(6);
		
		try {
			arvore.remove(12);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		arvCont.printElementos(arvore);
	}

}
