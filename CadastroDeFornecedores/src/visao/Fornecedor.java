/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
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
import javax.persistence.Transient;

/**
 *
 * @author Alessandro Reis
 */
@Entity
@Table(name = "FORNECEDOR", catalog = "", schema = "EMPRESA")
@NamedQueries({
    @NamedQuery(name = "Fornecedor.findAll", query = "SELECT f FROM Fornecedor f")
    , @NamedQuery(name = "Fornecedor.findById", query = "SELECT f FROM Fornecedor f WHERE f.id = :id")
    , @NamedQuery(name = "Fornecedor.findByNome", query = "SELECT f FROM Fornecedor f WHERE f.nome = :nome")
    , @NamedQuery(name = "Fornecedor.findByCnpj", query = "SELECT f FROM Fornecedor f WHERE f.cnpj = :cnpj")
    , @NamedQuery(name = "Fornecedor.findByEndereco", query = "SELECT f FROM Fornecedor f WHERE f.endereco = :endereco")
    , @NamedQuery(name = "Fornecedor.findByEstado", query = "SELECT f FROM Fornecedor f WHERE f.estado = :estado")
    , @NamedQuery(name = "Fornecedor.findByCidade", query = "SELECT f FROM Fornecedor f WHERE f.cidade = :cidade")
    , @NamedQuery(name = "Fornecedor.findByTelefone", query = "SELECT f FROM Fornecedor f WHERE f.telefone = :telefone")})
public class Fornecedor implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "CNPJ")
    private String cnpj;
    @Column(name = "ENDERECO")
    private String endereco;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "CIDADE")
    private String cidade;
    @Column(name = "TELEFONE")
    private String telefone;

    public Fornecedor() {
    }

    public Fornecedor(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        String oldCnpj = this.cnpj;
        this.cnpj = cnpj;
        changeSupport.firePropertyChange("cnpj", oldCnpj, cnpj);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        String oldEndereco = this.endereco;
        this.endereco = endereco;
        changeSupport.firePropertyChange("endereco", oldEndereco, endereco);
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        String oldEstado = this.estado;
        this.estado = estado;
        changeSupport.firePropertyChange("estado", oldEstado, estado);
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        String oldCidade = this.cidade;
        this.cidade = cidade;
        changeSupport.firePropertyChange("cidade", oldCidade, cidade);
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        String oldTelefone = this.telefone;
        this.telefone = telefone;
        changeSupport.firePropertyChange("telefone", oldTelefone, telefone);
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
        if (!(object instanceof Fornecedor)) {
            return false;
        }
        Fornecedor other = (Fornecedor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "visao.Fornecedor[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
