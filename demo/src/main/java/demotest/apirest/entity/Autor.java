package demotest.apirest.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

public class Autor {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_autor")
    private Integer id_autor;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @OneToMany(mappedBy = "Autor",fetch = FetchType.LAZY,orphanRemoval = true)
    @JsonIgnoreProperties("autor")
    private List<Articulos> articulos;

    public Autor(int id_autor, String nombre, String descripcion) {
        this.id_autor = id_autor;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getId_autor() {
        return id_autor;
    }

    public void setId_autor(int id_autor) {
        this.id_autor = id_autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "id_autor=" + id_autor +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
