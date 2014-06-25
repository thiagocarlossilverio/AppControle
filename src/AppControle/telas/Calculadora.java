package AppControle.telas;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Thiago Carlos
 */
public class Calculadora extends JFrame implements ActionListener {
    /**
     * Elementos Swing e AWT
     */
    private JPanel panVisor, panBotoes;
    private JTextField textVisor;
    private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnAdicao, btnSubtracao, btnMultiplicacao, btnDivisao, btnIgual, btnC;
    /**
     * Variáveis de cálculo
     */
    double resultadoConta, valorAnterior, valorAtual = 0;
    int operacaoAritmetica = 0; // 1 para adição, 2 para subtração, 3 para multiplicação e 4 para divisão


    public Calculadora() {
    /**
     * Configurações da janela
     */
    setBounds(200, 200, 300, 300); // posição X, posição Y, largura e altura
    setTitle("Calculadora");
    /**
     * Definir os elementos no construtor
     */
    GridLayout gridBotoes = new GridLayout(4, 4, 2, 2); // linhas, colunas, espaçamento direita, espaçamento inferior
    panBotoes = new JPanel();
    panVisor = new JPanel();
    textVisor = new JTextField(16);
    btn1 = new JButton("1");
    btn2 = new JButton("2");
    btn3 = new JButton("3");
    btn4 = new JButton("4");
    btn5 = new JButton("5");
    btn6 = new JButton("6");
    btn7 = new JButton("7");
    btn8 = new JButton("8");
    btn9 = new JButton("9");
    btn0 = new JButton("0");
    btnAdicao = new JButton("+");
    btnSubtracao = new JButton("-");
    btnMultiplicacao = new JButton("*");
    btnDivisao = new JButton("/");
    btnIgual = new JButton("=");
    btnC = new JButton("C");
    /**
     * Setar configurações dos elementos
     */
    panVisor.setBackground(Color.DARK_GRAY);
    panBotoes.setBackground(Color.GRAY);
    panBotoes.setLayout(gridBotoes);
    textVisor.setFont(new Font("Arial", Font.BOLD, 18));
    textVisor.setHorizontalAlignment(JTextField.RIGHT);
    textVisor.setEditable(false);
    btn1.setFont(new Font("Arial", Font.BOLD, 28));
    btn2.setFont(new Font("Arial", Font.BOLD, 28));
    btn3.setFont(new Font("Arial", Font.BOLD, 28));
    btn4.setFont(new Font("Arial", Font.BOLD, 28));
    btn5.setFont(new Font("Arial", Font.BOLD, 28));
    btn6.setFont(new Font("Arial", Font.BOLD, 28));
    btn7.setFont(new Font("Arial", Font.BOLD, 28));
    btn8.setFont(new Font("Arial", Font.BOLD, 28));
    btn9.setFont(new Font("Arial", Font.BOLD, 28));
    btn0.setFont(new Font("Arial", Font.BOLD, 28));
    btnAdicao.setFont(new Font("Arial", Font.BOLD, 28));
    btnSubtracao.setFont(new Font("Arial", Font.BOLD, 28));
    btnMultiplicacao.setFont(new Font("Arial", Font.BOLD, 28));
    btnDivisao.setFont(new Font("Arial", Font.BOLD, 28));
    btnIgual.setFont(new Font("Arial", Font.BOLD, 28));
    btnC.setFont(new Font("Arial", Font.BOLD, 28));
    add(panVisor, "North");
    add(panBotoes, "Center");
    panVisor.add(textVisor);
    panBotoes.add(btn7);
    panBotoes.add(btn8);
    panBotoes.add(btn9);
    panBotoes.add(btnAdicao);
    panBotoes.add(btn4);
    panBotoes.add(btn5);
    panBotoes.add(btn6);
    panBotoes.add(btnSubtracao);
    panBotoes.add(btn1);
    panBotoes.add(btn2);
    panBotoes.add(btn3);
    panBotoes.add(btnMultiplicacao);
    panBotoes.add(btn0);
    panBotoes.add(btnIgual);
    panBotoes.add(btnC);
    panBotoes.add(btnDivisao);
    btn1.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        textVisor.setText(textVisor.getText() + "1");
    }
});
btn2.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        textVisor.setText(textVisor.getText() + "2");
    }
});
btn3.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        textVisor.setText(textVisor.getText() + "3");
    }
});
btn4.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        textVisor.setText(textVisor.getText() + "4");
    }
});
btn5.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        textVisor.setText(textVisor.getText() + "5");
    }
});
btn6.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        textVisor.setText(textVisor.getText() + "6");
    }
});
btn7.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        textVisor.setText(textVisor.getText() + "7");
    }
});
btn8.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        textVisor.setText(textVisor.getText() + "8");
    }
});
btn9.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        textVisor.setText(textVisor.getText() + "9");
    }
});
btn0.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        textVisor.setText(textVisor.getText() + "0");
    }
});

btnAdicao.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        valorAnterior = Double.parseDouble(textVisor.getText());
        textVisor.setText(null);
        operacaoAritmetica = 1;
    }
});
btnSubtracao.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        valorAnterior = Double.parseDouble(textVisor.getText());
        textVisor.setText(null);
        operacaoAritmetica = 2;
    }
});
btnMultiplicacao.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        valorAnterior = Double.parseDouble(textVisor.getText());
        textVisor.setText(null);
        operacaoAritmetica = 3;
    }
});
btnDivisao.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        valorAnterior = Double.parseDouble(textVisor.getText());
        textVisor.setText(null);
        operacaoAritmetica = 4;
    }
});
btnC.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        valorAnterior = 0;
        valorAtual = 0;
        operacaoAritmetica = 0;
        textVisor.setText(null);
    }
});
btnIgual.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        valorAtual = Double.parseDouble(textVisor.getText());
        switch (operacaoAritmetica) {
            case 1:
                resultadoConta = valorAnterior + valorAtual;
                break;
            case 2:
                resultadoConta = valorAnterior - valorAtual;
                break;
            case 3:
                resultadoConta = valorAnterior * valorAtual;
                break;
            case 4:
                if (valorAtual == 0) {
                    JOptionPane.showMessageDialog(null, "Erro: impossível dividir por zero");
                } else {
                    resultadoConta = valorAnterior / valorAtual;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Erro: operador inválido ou elementos insuficientes");
                break;
        }
        textVisor.setText(String.valueOf(resultadoConta));
    }
});
setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Calculadora();
    }
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

