public class Main {

	public static void main(String[] args) {
		Cliente murillo = new Cliente();
		murillo.setNome("Murillo");
		
		Conta cc = new ContaCorrente(murillo);
		Conta poupanca = new ContaPoupanca(murillo);

		cc.depositar(140);
		cc.transferir(80, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();		
	}

}
