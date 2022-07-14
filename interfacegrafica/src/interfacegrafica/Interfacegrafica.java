package interfacegrafica;

import javax.swing.JOptionPane;

public class Interfacegrafica {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "NICE", "OH DAMN", JOptionPane.INFORMATION_MESSAGE);
        
        String resposta = JOptionPane.showInputDialog(null, "O que completa o OH?", "RESPONDE, PORRA");
        
        if(resposta.equals("DAMN")) {
            JOptionPane.showMessageDialog(null, "NICE " + resposta);
        }
        else {
            JOptionPane.showMessageDialog(null, "O QUE CARALHOS SIGNIFICA " + resposta + "?");
        }
        
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome: ", "Tela de boas-vindas", JOptionPane.QUESTION_MESSAGE);
    }
}
