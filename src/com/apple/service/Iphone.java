package com.apple.service;

import com.apple.model.AparelhoTelefonico;
import com.apple.model.NavegadorInternet;
import com.apple.model.ReprodutorMusical;


public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
    private String modelo;
    private int armazenamento;
    private int variavelAuxiliarAbas;
    private String variavelAuxiliarTexto;

    public Iphone(String modelo, int armazenamento) {
        setModelo(modelo);
        setArmazenamento(armazenamento);
    }

    public String getModelo() {
        return modelo;
    }



    private void setModelo(String modelo) {
        this.modelo = modelo;
    }



    public int getArmazenamento() {
        return armazenamento;
    }



    private void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }



    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String nomeMusica) {
        System.out.println("Tocando a música "+nomeMusica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Discando para...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    @Override
    public void exibirPagina(String conteudo) {
        SistemaIos.gerarPagina(conteudo, 0);
        variavelAuxiliarTexto = conteudo;
    }

    @Override
    public void adicionarNovaAba() {
        if (!(variavelAuxiliarTexto == null)) {
            SistemaIos.gerarPagina(variavelAuxiliarTexto, variavelAuxiliarAbas+1);
            variavelAuxiliarAbas += 1;
        }
    }

    @Override
    public void atualizarPagina() {
        if(!(variavelAuxiliarTexto == null)) {
            SistemaIos.gerarPagina(variavelAuxiliarTexto, variavelAuxiliarAbas);
        }
    }
}
