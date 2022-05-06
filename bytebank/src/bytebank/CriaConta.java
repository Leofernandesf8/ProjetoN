package bytebank;

public class CriaConta {
	
	public static void main(String[] args) {
		Conta primeiraconta = new Conta();
		primeiraconta.saldo = 200;
		System.out.println(primeiraconta.saldo);
		
		primeiraconta.saldo += 100;
		System.out.println(primeiraconta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println("primeira conta tem " + primeiraconta.saldo);
		System.out.println("segunda conta tem " + segundaConta.saldo);
		
		System.out.println(primeiraconta.agencia);
		System.out.println(segundaConta.numero);
		
		System.out.println(segundaConta.agencia);
		
		segundaConta.agencia = 146;
		System.out.println("agora a segunda conta esta na agencia " + segundaConta.agencia);
	}
}
