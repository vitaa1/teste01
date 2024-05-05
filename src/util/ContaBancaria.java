package util;

public class ContaBancaria {
	private int numero;
	private String nome;
	private double deposito;
	
	public ContaBancaria(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	
	public ContaBancaria(int numero, String nome, double depositoInicial) {
		this.numero = numero;
		this.nome = nome;
		primeiroDeposito(depositoInicial);
	}
	
	public int getNumero() {
		return numero;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getDeposito() {
		return deposito;
	}
	
	public void primeiroDeposito(double quantidade) {
		deposito += quantidade;
	}
	
	public void saque(double quantidade) {
		deposito -= quantidade + 5.0;
	}
	
	public String toString() {
		return "Conta " + numero + ", " + "Nome da pessoa: " + nome + ", " + "saldo: " + String.format("%.2f", deposito);
	}
	
	
	
}
