package exerciciorepita;

import javax.swing.JOptionPane;

public class exercicio {
    public static void main(String[] args) {
        int ent = 1;
        int v = 0, par = 0, imp = 0, cem = 0, soma = 0;
        
        do {
            ent = Integer.parseInt(JOptionPane.showInputDialog(null, "Infome um número: \n (0 para parar)"));
            if (ent != 0) {
                v++;
                soma += ent;
                //Operador Ternário que verifica se um número é par ou ímpar
                int a = (ent % 2 == 0) ? par++ : imp++;
                if (ent > 100) {
                    cem++;
                }
            }        
        } while (ent != 0);
        
        float med = soma / v;
        JOptionPane.showMessageDialog(null, "RESULTADOS \n ------------------ \n"
            + "Total de Valores: " + v + "\n Total de Pares: " + par + 
            "\n Total de Ímpares: " + imp + "\n Acima de 100: " + cem + 
            "\n Média dos valores: " + med);
    }
}
