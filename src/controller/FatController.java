package controller;

import br.edu.fateczl.pilhaint.Pilha;

public class FatController {
	public FatController() {
		super();
	}
	
	public long fatorial(int valor) throws Exception {
		Pilha p = new Pilha();
		for(int i = 0; i <= valor; i++) {
			if(p.isEmpty()) {
				p.push(1);
			} else {
					p.push(p.pop() * i);
			}
		}
		return p.pop();
	}
}
