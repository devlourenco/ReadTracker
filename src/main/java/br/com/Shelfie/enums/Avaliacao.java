package br.com.Shelfie.enums;

public enum Avaliacao {
    EXCELENTE(5),
    BOM(4),
    MEDIANO(3),
    RUIM(2),
    PESSIMO(1);

    private final int numAvaliacao;


    Avaliacao(int numAvaliacao) {
        this.numAvaliacao = numAvaliacao;
    }

    public int getNumAvaliacao() {
        return numAvaliacao;
    }
}
