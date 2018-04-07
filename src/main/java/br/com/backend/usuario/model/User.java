package br.com.backend.usuario.model;

import java.io.Serializable;

public class User implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1596165829701549637L;

    private Long id;

    private String nome;

    private String email;

    private String cpf;

    private String site;

    private EnumSexo enumSexo;

    private String profissao;

    public User() {
    }

    public User( Long id ) {
        this.id = id;
    }

    public User( String nome, String email, String cpf, String site, EnumSexo enumSexo, String profissao ) {
        super();
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.site = site;
        this.enumSexo = enumSexo;
        this.profissao = profissao;
    }

    public User( Long id, String nome, String email, String cpf, String site, EnumSexo enumSexo, String profissao ) {
        super();
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.site = site;
        this.enumSexo = enumSexo;
        this.profissao = profissao;
    }

    public Long getId() {
        return id;
    }

    public void setId( Long id ) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome( String nome ) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail( String email ) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf( String cpf ) {
        this.cpf = cpf;
    }

    public String getSite() {
        return site;
    }

    public void setSite( String site ) {
        this.site = site;
    }

    public EnumSexo getEnumSexo() {
        return enumSexo;
    }

    public void setEnumSexo( EnumSexo enumSexo ) {
        this.enumSexo = enumSexo;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao( String profissao ) {
        this.profissao = profissao;
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
        User other = (User) obj;
        if ( id == null ) {
            if ( other.id != null )
                return false;
        } else if ( !id.equals( other.id ) )
            return false;
        return true;
    }

}
