
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1112, 22244);
		//conta.numero = 1337; -> não permite pois o atributo "numero" está privando na classe conta
		conta.setNumero(1337);//para atibuir um valor usa o método SET.
		System.out.println(conta.getNumero());//para ler o valor atribuido usa o GET
		
		
		Cliente cliente = new Cliente();
		//conta.titular = romario; -> não funciona pois o atributo titular está privado
		cliente.setNome("romario");
		
		conta.setTitular(cliente);
		
		System.out.println("O nome do cliente da conta 000, é: " + conta.getTitular().getNome() + "!!!");
		
		conta.getTitular().setProfissao("Estudante");
		//O mesmo código acima com uma váriavel para intermediar:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Estudante");
		
		System.out.println("A profissão do cliente é: " + conta.getTitular().getProfissao());
	}
}
