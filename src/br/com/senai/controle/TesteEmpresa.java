package br.com.senai.controle;

import br.com.senai.modelo.Empresa;
import br.com.senai.modelo.Funcionario;

public class TesteEmpresa {

	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		empresa.nome = "Senai Inc.";
		empresa.cnpj = "122303400201/0001-56";
		
		Funcionario joao = new Funcionario();
		joao.nome = "João Paulo";
		joao.rg = "11465772";
		joao.salario = 2700.00;
		empresa.adiciona(joao);
		
		Funcionario pedro = new Funcionario();
		pedro.nome = "Pedro Paulo";
		pedro.rg = "11462572";
		pedro.salario = 2900.00;
		empresa.adiciona(pedro);
		
		Funcionario marcos = new Funcionario();
		marcos.nome = "Marcos Paulo";
		marcos.rg = "121433372";
		marcos.salario = 3000.00;
		empresa.adiciona(marcos);
		
		Funcionario dejair = new Funcionario();
		dejair.nome = "João do Caminhão";
		dejair.rg = "1215678372";
		dejair.salario = 3500.00;
		empresa.adiciona(dejair);
		
		empresa.mostraEmpregados();
		
		System.out.println(empresa.contem(marcos));
		System.out.println(empresa.contem(dejair));
		
	}

}
