package business;

public class GeradorSenhaForte extends GeradorSenha {

    private int tamanho;

    public GeradorSenhaForte(int tamanho) {
        if (tamanho < 12) {
            throw new IllegalArgumentException("A senha deve ter no minimo 12 caracteres.");}
        	this.tamanho = tamanho;
    }

    @Override
    public String gerarSenha() {
        StringBuilder senha = new StringBuilder();

        senha.append(sortearCaractere(MAIUSCULAS));
        senha.append(sortearCaractere(MINUSCULAS));
        senha.append(sortearCaractere(NUMEROS));
        senha.append(sortearCaractere(ESPECIAIS));

        
        String caracteres = MAIUSCULAS + MINUSCULAS + NUMEROS + ESPECIAIS;

        while (senha.length() < tamanho) {
            senha.append(sortearCaractere(caracteres));}
        return embaralhar(senha.toString());
    }
}

