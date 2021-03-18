package calculadora;

public class Calculadora {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]); // converter String
        int n2 = Integer.parseInt(args[1]);

        System.out.println("Soma: " + (n1 + n2));
        System.out.println("Diferença: " + (n1 - n2));
        System.out.println("Divisão: " + (n1 / n2));
        System.out.println("Multiplicação: " + (n1 * n2));

        if (n1 > n2)
            System.out.println(n1 + " é maior");
        if (n1 == n2)
            System.out.println("numeros iguais");
        else
            System.out.println(n2 + " é maior");
    }
}
