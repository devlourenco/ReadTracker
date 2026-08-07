package br.com.Shelfie.entity;


import br.com.Shelfie.enums.Avaliacao;
import br.com.Shelfie.enums.StatusDeLeitura;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.ToString;

@Entity
@Table(name = "tb_shelfie")
@ToString
@Builder
public class ShelfieModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String autor;
    private String genero;
    private Integer numPaginas;
    @Enumerated(EnumType.STRING)
    private StatusDeLeitura statusDeLeitura;
    @Enumerated(EnumType.STRING)
    private Avaliacao avaliacao;

    public ShelfieModel() {
    }

    public ShelfieModel(Long id, String titulo, String autor, String genero, Integer numPaginas, StatusDeLeitura statusDeLeitura, Avaliacao avaliacao) {
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
