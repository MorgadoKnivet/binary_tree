package com.company;

import java.util.Random;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        ArvoreBinaria tree = new ArvoreBinaria();

        for (int i = 0; i < 11; i++) {
            tree.add(i);
        }

        tree.imprimaFormatado();

        System.out.println("Quantidade esquerda festiva : " + tree.quantidadeEsquerdaFestiva());
    }
}
