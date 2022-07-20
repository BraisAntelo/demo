package demotest.apirest.entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_usuario")
    private Integer id_usuario;
    @Column(name = "username")
    private String username;
    @Column(name = "email")
    private String email;
    @Column(name="contraseña")
    private String contraseña;
    @Column(name="pago")
    private boolean pago;
    @Column(name="nombre")
    private String nombre;
    @Column(name="apellido1")
    private String apellido1;
    @Column(name="apellido2")
    private String apellido2;

    @Column(name = "active")
    private boolean active;

    @OneToMany(mappedBy = "Usuario",fetch = FetchType.LAZY, orphanRemoval = true)
    @JsonIgnoreProperties("usuario")
    private List<Comentarios> comentarios;

    public Usuario(Integer id_usuario, String username, String email, String contraseña, boolean pago, String nombre, String apellido1, String apellido2, boolean active) {
        this.id_usuario = id_usuario;
        this.username = username;
        this.email = email;
        this.contraseña = contraseña;
        this.pago = pago;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.active = active;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }


    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id_usuario=" + id_usuario +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", pago=" + pago +
                ", nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", active=" + active +
                '}';
    }
}
