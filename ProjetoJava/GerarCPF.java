package ProjetoJava;

public class GerarCPF {
    public static void main(String[] args) {
        // Chame o método em CPFUtil para gerar um CPF e mostre o resultado
        int[] cpfGerado = CPFUtil.gerarCPFRandom();

        // Imprima o CPF gerado no formato array int
        for (int i = 0; i < cpfGerado.length; i++) {
            System.out.print(cpfGerado[i] + " ");
        }
    }
}
