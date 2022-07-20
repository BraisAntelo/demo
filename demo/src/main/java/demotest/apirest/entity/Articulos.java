package demotest.apirest.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

public class Articulos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_articulos")
    private Integer id_articulos;

    @Column(name = "texto")
    private String texto;

    @Column(name = "cod_autor")
    private int cod_autor;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "exclusivo")
    private boolean exclusivo;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_autor",referencedColumnName = "id_autor",insertable = false,updatable = false)
    @JsonIgnoreProperties("articulos")
    private Autor autor;

    public Articulos(int id_articulos, String texto, int cod_autor, String titulo, boolean exclusivo) {
        this.id_articulos = id_articulos;
        this.texto = texto;
        this.cod_autor = cod_autor;
        this.titulo = titulo;
        this.exclusivo = exclusivo;
    }

    public int getId_articulos() {
        return id_articulos;
    }

    public void setId_articulos(int id_articulos) {
        this.id_articulos = id_articulos;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getCod_autor() {
        return cod_autor;
    }

    public void setCod_autor(int cod_autor) {
        this.cod_autor = cod_autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isExclusivo() {
        return exclusivo;
    }

    public void setExclusivo(boolean exclusivo) {
        this.exclusivo = exclusivo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Articulos{" +
                "id_articulos=" + id_articulos +
                ", texto='" + texto + '\'' +
                ", cod_autor=" + cod_autor +
                ", titulo='" + titulo + '\'' +
                ", exclusivo=" + exclusivo +
                ", autor=" + autor +
                '}';
    }
}
