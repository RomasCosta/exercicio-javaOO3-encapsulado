
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1112, 22244);
		//conta.numero = 1337; -> n�o permite pois o atributo "numero" est� privando na classe conta
		conta.setNumero(1337);//para atibuir um valor usa o m�todo SET.
		System.out.println(conta.getNumero());//para ler o valor atribuido usa o GET
		
		
		Cliente cliente = new Cliente();
		//conta.titular = romario; -> n�o funciona pois o atributo titular est� privado
		cliente.setNome("romario");
		
		conta.setTitular(cliente);
		
		System.out.println("O nome do cliente da conta 000, �: " + conta.getTitular().getNome() + "!!!");
		
		conta.getTitular().setProfissao("Estudante");
		//O mesmo c�digo acima com uma v�riavel para intermediar:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Estudante");
		
		System.out.println("A profiss�o do cliente �: " + conta.getTitular().getProfissao());
	}
}
