package funcionario;

import java.time.Year;
import java.util.Date;

public class Funcionario {

	private String nome;
	private String departamento;
	private double salario;
	private String dataEntrada;
	private String rg;

	public Funcionario() {
	}


	public Funcionario(String nome, String rg, String dataEntrada, double salario, String departamento) {
		this.nome = nome;
		this.rg = rg;
		this.dataEntrada = dataEntrada;
		this.salario = salario;
		this.departamento = departamento;
	}


	public double recebeAumento(double aumento) {
		this.salario += aumento;
		return this.salario;
	}

	public double calculaGanhoAnual() {
		return this.salario * 12;
	}

	public void mostra() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Salario: " + this.salario);
		System.out.println("Data de Entrada: " + this.dataEntrada);
		System.out.println("RG: " + this.rg);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

}
