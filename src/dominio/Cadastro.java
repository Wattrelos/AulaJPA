/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Josias Wattrelos
 */
@Entity
@Table(name = "cadastro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cadastro.findAll", query = "SELECT c FROM Cadastro c")
    , @NamedQuery(name = "Cadastro.findById", query = "SELECT c FROM Cadastro c WHERE c.id = :id")
    , @NamedQuery(name = "Cadastro.findByNome", query = "SELECT c FROM Cadastro c WHERE c.nome = :nome")
    , @NamedQuery(name = "Cadastro.findByCpf", query = "SELECT c FROM Cadastro c WHERE c.cpf = :cpf")
    , @NamedQuery(name = "Cadastro.findByMassa", query = "SELECT c FROM Cadastro c WHERE c.massa = :massa")
    , @NamedQuery(name = "Cadastro.findByAltura", query = "SELECT c FROM Cadastro c WHERE c.altura = :altura")})
public class Cadastro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "cpf")
    private long cpf;
    @Basic(optional = false)
    @Column(name = "massa")
    private int massa;
    @Basic(optional = false)
    @Column(name = "altura")
    private int altura;

    public Cadastro() {
    }

    public Cadastro(Integer id) {
        this.id = id;
    }

    public Cadastro(Integer id, String nome, long cpf, int massa, int altura) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.massa = massa;
        this.altura = altura;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cadastro)) {
            return false;
        }
        Cadastro other = (Cadastro) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dominio.Cadastro[ id=" + id + " ]";
    }
    
}
