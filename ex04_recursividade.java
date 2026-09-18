// Exercício 4) Série4 = (N/1)+(N-1/2)+(N-2/3)+...+(1/N)
// Autor: Matheus Garrido
import javax.swing.JOptionPane;
public class exercicios_extra_recursividade4 
{
    public static void main(String args[])
    {
        double contador = 1;
        double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor: "));
        double soma = FazSoma(numero,contador);
        JOptionPane.showMessageDialog(null,"O valor da soma é: "+soma);
    }
    static double FazSoma(double num,double cont)
    {
        double soma;
        if (num>=1)
        {
            soma = num/cont + FazSoma(num-1,cont+1);
            return soma;
        }
        else
        {
            return num;
        }
    }
}
