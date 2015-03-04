package br.com.senai.modelo;

public class Empresa {
	public String nome;
	public String cnpj;
	public Funcionario[] empregados = new Funcionario[3];
	public int quadroDeFuncionarios = 0;
	public int capacidadeDeFuncionarios = 3;

	public void adiciona(Funcionario f) {
		if (quadroDeFuncionarios < capacidadeDeFuncionarios) {
			this.empregados[ quadroDeFuncionarios ] = f;
			quadroDeFuncionarios++;
		}else {
			realocaEmpregados();
		}
	}
	
	private void realocaEmpregados() {
		// Criar um array de backup
		// Copiar os funcionarios atuais para o backup
		// Realocar o tamanho do array de empregados
		// Atribuir a referência de backup para o novo array.
	}

	public void mostraEmpregados() {
		for (Funcionario f : empregados) {
			f.mosta();
			System.out.println("---");
		}
	}
	
	public boolean contem(Funcionario f) {
		for (Funcionario funcionario : empregados) {
			if (funcionario == f) {
				return true;
			}
		}
		return false;
	}
}
