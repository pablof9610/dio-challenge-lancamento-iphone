package user;

import com.apple.service.Iphone;

public class main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("SE", 256);
        iphone.exibirPagina("G1");
        iphone.adicionarNovaAba();
        iphone.adicionarNovaAba();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
