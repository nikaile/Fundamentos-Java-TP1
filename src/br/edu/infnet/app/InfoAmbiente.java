package br.edu.infnet.app;

public class InfoAmbiente {
    public static void main(String[] args) {
        System.out.println("Fúvio E. Corrêa");

        /*
        * os.name - Nome Sistema Operacional
        * java.specification.version - Versão java utilizada
        * user.dir - Diretório
        */
        String SistemaOperacional = System.getProperty("os.name");
        String JavaVersao = System.getProperty("java.specification.version");
        String DiretorioAtual = System.getProperty("user.dir");

        // Saída - Impressão das versões
        System.out.println("Propriedade(os.name): " + SistemaOperacional);      
        System.out.println("Propriedade(java.specification.version): " + JavaVersao);
        System.out.println("Propriedade(java.user.dir): " + DiretorioAtual);

    }

}
