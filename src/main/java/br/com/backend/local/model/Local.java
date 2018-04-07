package br.com.backend.local.model;

import java.io.Serializable;

public class Local implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -3603927514315640884L;

    private Long id;

    private String descricao;

    private String pais;

    private String estado;

    private String cidade;

    private String telefone;

    public Local( Long id ) {
        this.id = id;
    }

    public Local() {
        super();
    }

    public Local( String descricao, String pais, String estado, String cidade, String telefone ) {
        super();
        this.descricao = descricao;
        this.pais = pais;
        this.estado = estado;
        this.cidade = cidade;
        this.telefone = telefone;
    }

    public Local( Long id, String descricao, String pais, String estado, String cidade, String telefone ) {
        super();
        this.id = id;
        this.descricao = descricao;
        this.pais = pais;
        this.estado = estado;
        this.cidade = cidade;
        this.telefone = telefone;
    }

    public Long getId() {
        return id;
    }

    public void setId( Long id ) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao( String descricao ) {
        this.descricao = descricao;
    }

    public String getPais() {
        return pais;
    }

    public void setPais( String pais ) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado( String estado ) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade( String cidade ) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone( String telefone ) {
        this.telefone = telefone;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ( ( id == null ) ? 0 : id.hashCode() );
        return result;
    }

    @Override
    public boolean equals( Object obj ) {
        if ( this == obj )
            return true;
        if ( obj == null )
            return false;
        if ( getClass() != obj.getClass() )
            return false;
        Local other = (Local) obj;
        if ( id == null ) {
            if ( other.id != null )
                return false;
        } else if ( !id.equals( other.id ) )
            return false;
        return true;
    }

}
