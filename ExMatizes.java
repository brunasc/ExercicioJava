package LP;

import javax.swing.JOptionPane;

public class ExMatizes {
	
    public static void main(String[] args) {
    	
    	int i, j;
        double notas[][], media, soma;
        notas = new double[3][2];
        

        for (i = 0; i < 3; i++) {
            media = 0.0;
            soma = 0.0;
            for (j = 0; j < 2; j++) {
            	notas[i][j] =Double.parseDouble(JOptionPane.showInputDialog("Insira a nota "+(j+1)+" do aluno "+(i+1)));
                 
                soma = (soma + notas[i][j]);
            }
            media = (soma / 2);
            System.out.println("A média do aluno "+(i+1)+" é igual a: "+media);
        }
        soma = 0.0;
        for (i = 0; i < 3; i++) {
            soma = (soma + notas[i][0]);
        }
        media = (soma / 3);
        System.out.println("A média das notas da prova 1 é: "+media);
        soma = 0.0;
        for (i = 0; i < 3; i++) {
            soma = (soma + notas[i][1]);
        }
        media = (soma / 3);
        System.out.println("A média das notas da prova 2 é: "+media);
    }      
}