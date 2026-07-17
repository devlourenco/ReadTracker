package br.com.Shelfie.dto;

import br.com.Shelfie.enums.Avaliacao;
import br.com.Shelfie.enums.StatusDeLeitura;

public class ShelfieDTO {
    private Long id;
    private String titulo;
    private String autor;
    private String genero;
    private Integer numPaginas;
    private StatusDeLeitura statusDeLeitura;
    private Avaliacao avaliacao;

    public ShelfieDTO() {
    }

    public ShelfieDTO(Long id, String titulo, String autor, String genero, Integer numPaginas, StatusDeLeitura statusDeLeitura, Avaliacao avaliacao) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.numPaginas = numPaginas;
        this.statusDeLeitura = statusDeLeitura;
        this.avaliacao = avaliacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    public StatusDeLeitura getStatusDeLeitura() {
        return statusDeLeitura;
    }

    public void setStatusDeLeitura(StatusDeLeitura statusDeLeitura) {
        this.statusDeLeitura = statusDeLeitura;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }
}
