package view;

import business.Aplicacao;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Jframe extends JFrame {

    private JLabel lblValor;
    private JLabel lblPrazo;
    private JLabel lblTaxa;
    private JLabel lblResultado;
    private JTextField txtValor;
    private JTextField txtPrazo;
    private JButton btnCalcular;
    private JComboBox<String> cbTaxa;

    public Jframe() {
        setTitle("Aula08_01_Investimento");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));
        setLocationRelativeTo(null);

        lblValor = new JLabel("Valor a ser aplicado (R$):");
        txtValor = new JTextField();
        configurar_Filtro_Numerico(txtValor, true);

        lblPrazo = new JLabel("Prazo da aplicação (meses):");
        txtPrazo = new JTextField();
        configurar_Filtro_Numerico(txtPrazo, false);

        lblTaxa = new JLabel("Selecione o indexador:");
        cbTaxa = new JComboBox<>(new String[]{"Poupança", "CDI", "Tesouro Direto"});

        btnCalcular = new JButton("Calcular Rendimento");
        lblResultado = new JLabel("Rendimento: R$ 0,00");

        btnCalcular.addActionListener(e -> Calcular());

        add(lblValor);
        add(txtValor);
        add(lblPrazo);
        add(txtPrazo);
        add(lblTaxa);
        add(cbTaxa);
        add(btnCalcular);
        add(lblResultado);
    }

    private void configurar_Filtro_Numerico(JTextField textField, boolean permiteDecimal) {
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {if (permiteDecimal && c == '.') {if (textField.getText().contains(".")) {e.consume();}} else {e.consume();}}}});}

    private void Calcular() {
        try {
            float valorAplicado = Float.parseFloat(txtValor.getText());
            int prazo = Integer.parseInt(txtPrazo.getText());
            float taxa = 0.0f;

            String selecionado = (String) cbTaxa.getSelectedItem();
            if ("Poupança".equals(selecionado)) {taxa = 0.38f;} else if ("CDI".equals(selecionado)) {taxa = 0.53f;} else if ("Tesouro Direto".equals(selecionado)) {taxa = 0.65f;}

            Aplicacao app = new Aplicacao();
            app.calcularRendimento(valorAplicado, prazo, taxa);
            
            lblResultado.setText(String.format(" Rendimento: R$ %.2f", app.getMontante()));
            
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, insira valores válidos.");
        }
    }
}