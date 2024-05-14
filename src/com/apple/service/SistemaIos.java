package com.apple.service;

class SistemaIos {
    public static void gerarPagina(String conteudo, int numeroAbas) {
        for (int i = 0; i < numeroAbas; i++) {
            System.out.print("__|");
        }

        System.out.println("__|");
        System.out.println("");
        System.out.println("");
        System.out.println("Página de "+conteudo);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println(""+System.currentTimeMillis());
        System.out.println("||||||||||||||||||");
    }
}
