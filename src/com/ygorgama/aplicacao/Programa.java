package com.ygorgama.aplicacao;

import com.ygorgama.entidades.Iphone;

public class Programa {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.ligar();
        iphone.adicionarNovaAba();
        iphone.atender();
        iphone.exibirPagina();
        iphone.pausar();
        iphone.iniciarCorreioVoz();
        iphone.selecionarMusica();
        iphone.atualizarPagina();
        iphone.tocar();
    }
}
