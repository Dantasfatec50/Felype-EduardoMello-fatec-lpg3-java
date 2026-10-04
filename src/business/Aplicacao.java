package business;

public class Aplicacao implements IAplicacao {
	private float montante;

    @Override
    public void calcularRendimento(float valorAplicado, int prazo, float taxa) {
        this.montante = (float) (valorAplicado * Math.pow(1 + (taxa / 100), prazo));}

    public float getMontante() {return this.montante;}
}
