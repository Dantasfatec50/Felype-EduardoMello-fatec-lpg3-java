package business;

public class GeradorPin extends GeradorSenha {

    @Override
    public String gerarSenha() {
        String pin;

        do {
            StringBuilder novoPin = new StringBuilder();

            for (int i = 0; i < 6; i++) {
                novoPin.append(sortearCaractere(NUMEROS));
            }
            pin = novoPin.toString();} while (pinTodosIguais(pin) || pinSequencial(pin));

        return pin;
    }

    private boolean pinTodosIguais(String pin) {
        for (int i = 1; i < pin.length(); i++) {
            if (pin.charAt(i) != pin.charAt(0)) {
                return false;}
        }
        return true;
    }

    private boolean pinSequencial(String pin) {
        boolean crescente = true;
        boolean decrescente = true;

        for (int i = 1; i < pin.length(); i++) {
            int atual = pin.charAt(i);
            int anterior = pin.charAt(i - 1);

            if (atual != anterior + 1) {
                crescente = false;}

            if (atual != anterior - 1) {
                decrescente = false;}
        }

        return crescente || decrescente;
    }
}
