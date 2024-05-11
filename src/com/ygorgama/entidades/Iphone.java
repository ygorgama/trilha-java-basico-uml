package com.ygorgama.entidades;

import com.ygorgama.entidades.intefaces.AparelhoTelefonico;
import com.ygorgama.entidades.intefaces.NavegadorNaInternet;
import com.ygorgama.entidades.intefaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical {

    @Override
    public void ligar() {
        System.out.println("LIGAR IPHONE");
    }

    @Override
    public void atender() {
        System.out.println("ATENDER TELEFONE");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIAR CORREIO DE VOZ");
    }

    @Override
    public void exibirPagina() {
        System.out.println("EXIBIR PAGINA INICAL");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONAR NOVA ABA NA WEB");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZAR PAGINA WEB");
    }

    @Override
    public void tocar() {
        System.out.println("TOCAR MUSICA");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSAR MUSICA");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("ADICIONAR MÚSICA");
    }
}
