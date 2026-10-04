package business;

abstract class Animal {

	private String nome;
	private float peso;
	private int idade;
	
	public float getPeso() { return peso; }
	public void setPeso(float peso) { this.peso = peso; }

	public int getIdade() { return idade; }
	public void setIdade(int idade) { this.idade = idade; }

	public String getNome() { return nome; }
	
	public Animal(String nome) {
		this.nome = nome;
	}
	
	public String brincar() {
		return String.format("%s está brincando", nome);
	}
}
