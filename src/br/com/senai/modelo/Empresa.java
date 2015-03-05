package br.com.senai.modelo;

public class Empresa {
	public String nome;
	public String cnpj;
	public Funcionario[] empregados = new Funcionario[3];
	public int quadroDeFuncionarios = 0;
	public int capacidadeDeFuncionarios = 3;
			
	public void adiciona(Funcionario f) {
		if (quadroDeFuncionarios >= capacidadeDeFuncionarios) {
			realocaEmpregados();
		}
		this.empregados[ quadroDeFuncionarios] = f;
		quadroDeFuncionarios++;
	}
	
	private void realocaEmpregados() {
		// 1. Incrementar a capacidade de Funcionarios da empresa
		capacidadeDeFuncionarios = capacidadeDeFuncionarios + 3;
		
		// 2. Criar um array de backup com a nova capacidade
		Funcionario[] backupEmpregados = new Funcionario[capacidadeDeFuncionarios];
		
		// 3. Copiar os funcionarios atuais para o backup
		for (int i = 0; i < this.empregados.length; i++) {
			backupEmpregados[i] = this.empregados[i];
		}
				
		// 4. Atribuir a referência de backup para o antigo array.
		this.empregados = backupEmpregados;
	}

	public void mostraEmpregados() {
		for (Funcionario f : this.empregados) {
			if (f != null) {
				f.mostra();
				System.out.println("---");
			}
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
