package ProjetoJava;

import java.util.Scanner;

public class VerificarCPF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um CPF: ");
        String cpf = scanner.nextLine();
        scanner.close();

        // Chame o método em CPFUtil para validar o CPF
        boolean cpfValido = CPFUtil.validarCPF(cpf);

        if (cpfValido) {
            System.out.println("CPF válido.");
        } else {
            System.out.println("CPF inválido.");
        }
    }
}
