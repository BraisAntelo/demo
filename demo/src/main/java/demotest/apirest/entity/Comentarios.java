package demotest.apirest.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

public class Comentarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_comentarios")
    private Integer id_comentarios;

    @Column(name = "cod_usuario")
    private int cod_usuario;

    @Column(name = "cod_articulo")
    private int cod_articulo;

    @Column(name = "texto")
    private String texto;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_usuario",referencedColumnName = "id_usuario",insertable = false,updatable = false)
    @JsonIgnoreProperties("comentarios")
    Usuario usuario;

    public Comentarios(Integer id_comentarios, int cod_usuario, int cod_articulo, String texto) {
        this.id_comentarios = id_comentarios;
        this.cod_usuario = cod_usuario;
        this.cod_articulo = cod_articulo;
        this.texto = texto;
    }

    public Integer getId_comentarios() {
        return id_comentarios;
    }

    public void setId_comentarios(Integer id_comentarios) {
        this.id_comentarios = id_comentarios;
    }

    public int getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(int cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    public int getCod_articulo() {
        return cod_articulo;
    }

    public void setCod_articulo(int cod_articulo) {
        this.cod_articulo = cod_articulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Comentarios{" +
                "id_comentarios=" + id_comentarios +
                ", cod_usuario=" + cod_usuario +
                ", cod_articulo=" + cod_articulo +
                ", texto='" + texto + '\'' +
                ", usuario=" + usuario +
                '}';
    }
}
