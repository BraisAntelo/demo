package demotest.apirest.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Sponsors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sponsors")
    private Integer id_sponsors;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "link")
    private String link;

    public Sponsors(int id_sponsors, String descripcion, String link) {
        this.id_sponsors = id_sponsors;
        this.descripcion = descripcion;
        this.link = link;
    }

    public int getId_sponsors() {
        return id_sponsors;
    }

    public void setId_sponsors(int id_sponsors) {
        this.id_sponsors = id_sponsors;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Sponsors{" +
                "id_sponsors=" + id_sponsors +
                ", descripcion='" + descripcion + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
}
