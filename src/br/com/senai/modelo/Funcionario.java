package br.com.senai.modelo;

public class Funcionario {
	public String nome;
	public String rg;
	public double salario;
	
	public void mosta() {
		System.out.println("Nome: " + this.nome);
		System.out.println("RG: " + this.rg);
		System.out.println("Salário: " + this.salario);
	}
}
