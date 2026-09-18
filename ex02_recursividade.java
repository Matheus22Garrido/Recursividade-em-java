// Exercicio 2) Série2 = (N) + (N-1) + (N-2) + (N-3) + ... + (1)
// Autor: Matheus Garrido
import javax.swing.JOptionPane;
public class Exercicios_extras_recursividade
{
    public static void main (String args[])
    {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
        int soma = FazSoma(numero);
        JOptionPane.showMessageDialog(null,"O valor da soma de todos os números até o valor dado é: "+soma);
    }
    public static int FazSoma(int num)
    {
        if (num<=0)
        {
            return num;
        }
        else
        {
            int soma = num + FazSoma(num-1);
            return soma;
        }
    }
}
