/**
 * POO2 - Encapsolamento 
 * @author Pedro Henrique Andrade Silva
 */
package contas;

public class Conta {
	private double saldo;
	private String cliente;

	/**
	 * obter saldo
	 * 
	 * @return
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Atribuir um valor a variavel saldo
	 * 
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Atribuir o nome da variavel a cliente
	 * 
	 * @return
	 */
	public String getCliente() {
		return cliente;
	}

	/**
	 * Atribuir um valor a variavel a cliente
	 * 
	 * @return
	 */
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Conta() {
		System.out.println("Agência 0261");
	}

	/**
	 * exibir o saldo da conta
	 */
	protected void exibirSaldo() {
		System.out.println("Saldo: R$" + saldo);
	}

	/**
	 * debitar um valor da conta corrente
	 * 
	 * @param valor
	 */
	protected void sacar(double valor) {
		saldo -= valor;
		System.out.println("Débito: " + valor);
	}

	/**
	 * crediar valor na conta corrente
	 * 
	 * @param valor
	 */
	protected void depositar(double valor) {
		saldo += valor;
		System.out.println("Crédito: " + valor);
	}
	
	/**
	 * transferir valor na conta
	 * @param destino
	 * @param valor
	 */
	protected void transferir (Conta destino, double valor) {
		this.sacar(valor);
		destino.depositar(valor);
		System.out.println("Transferência: R$" + valor);
		
	}
}
