
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1177, 22334);
		
		System.out.println(conta.getAgencia());
		
		
		
		
		Conta conta2 = new Conta(1177, 22334);
		System.out.println(conta2.getAgencia());
		Conta conta3 = new Conta(1177, 22334);
		System.out.println(conta3.getAgencia());
		Conta conta4 = new Conta(1177, 22334);
		System.out.println(conta4.getAgencia());
		
		System.out.println(Conta.getTotal());
	}
}
