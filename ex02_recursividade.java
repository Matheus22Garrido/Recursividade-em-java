// Exercicio 2) Série2 = (N) + (N-1) + (N-2) + (N-3) + ... + (1)
// Autor: Matheus Garrido
import javax.swing.JOptionPane;
public class Exercicios_extra_recursividade2
{
    public static void main(String args[])
    {
        int numero = 100;
        int soma = FazSoma(numero);
        JOptionPane.showMessageDialog(null,"A soma dos primeiros 100 numeros inteiros é: "+soma);
    }
    static int FazSoma(int num)
    {
        if (num<=0)
        {
        return num;
        }
        else
        {
        int soma = num+FazSoma(num-1);
        return soma;
        }
    }
}
