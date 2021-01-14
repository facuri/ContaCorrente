package programa01;

/*PROGRAMA CONTACORRENTE
Crie uma classe para implementar uma conta corrente. 
A classe deve possuir os seguintes atributos: n�mero da conta, nome do correntista e saldo. 
Os m�todos s�o os seguintes: alterarNome, dep�sito e saque; 
No construtor, saldo � opcional, 
com valor default zero e os demais atributos s�o obrigat�rios.
  */
public class Programa1 {
	
	public int numConta;
	private String nome;
	private float saldo;
	
	
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public Programa1(){//Construtor
		this.setNumConta(123456789);
		this.setNome("Sandra");
		this.setSaldo(0);
		
	}
	
	public void alterarNome(String nome){//setNome estiver vazio
		if (nome == null) throw new RuntimeException("Nome Invalido");
	    else this.nome = nome;
		
	}
	public void depositar(float v){
		this.setSaldo(this.getSaldo() + v);
		System.out.println("Dep�sito de: " + this.getSaldo() + 
		" realizado na conta de: " + this.getNome());
		 
	}
	public void sacar(float v){
		 if(this.getSaldo() >= v){
			 this.setSaldo(this.getSaldo() - v);
			 System.out.println("Saque de: " + v + " realizado na conta de: " + this.getNome());
		}else
			 System.out.println("Saldo insuficiente!");
		
	}
	public void visualizarConta(){
		System.out.println("---------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Correntista: " + this.getNome());
		System.out.println("Saldo: " + this.getSaldo());
		 
		}
	


}
