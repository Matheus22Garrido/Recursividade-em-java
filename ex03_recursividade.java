// Exercicio 3) Série3 = (1/1) + (1/2) + (1/3) + ... + (1/N)
// Autor: Matheus Garrido
import javax.swing.JOptionPane;
public class exercicio_extra_recursividade3
{
    public static void main(String args[])
    {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
        double soma = FazSoma(numero);
        JOptionPane.showMessageDialog(null,"O valor da soma é: "+soma);
    }
    static double FazSoma(int num)
    {
        double soma;
        if (num<=0)
        {
            return num;
        }
        else
        {
            soma = 1.0/num + FazSoma(num-1);
            return soma;
        }
    }
}
