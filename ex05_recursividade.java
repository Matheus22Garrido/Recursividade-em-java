// Exercício 5) Série5 =(N)!+(N-1)!+(N-2)!+(N-3)!+...+(1)!
// Autor: Matheus Garrido
import javax.swing.JOptionPane;
public class exercicio_extra_recursividade5
{
    public static void main(String args[])
    {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de "));
        int soma = FSoma(numero);
        JOptionPane.showMessageDialog(null,"O valor da soma é: "+soma);
    }
    static int Ffat(int num)
    {
        if (num>=2)
        {
            int soma = num*Ffat(num-1);
            return soma;
        }
        else
        {
            return num;
        }
    }
    static int FSoma(int num)
    {
        int somaT;
        if (num>=1)
        {
            int soma = Ffat(num);
            num -= 1;
            somaT =soma+ FSoma(num);
            return somaT;
        }
        else
        {
            return num;
        }
    }
}
