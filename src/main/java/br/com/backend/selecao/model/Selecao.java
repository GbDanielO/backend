package br.com.backend.selecao.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import br.com.backend.local.model.Local;
import br.com.backend.usuario.model.User;

public class Selecao implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -6627040124936101059L;

    private Long id;

    private User usuarioRealizador;

    private LocalDate datInicio;

    private LocalDate dataFim;

    private List<User> lstParticipantes;

    private List<Local> lstLocais;

    public Selecao() {
    }

    public Selecao( Long id ) {
        this.id = id;
    }

    public Selecao( User usuarioRealizador, LocalDate datInicio, LocalDate dataFim,
            List<User> lstParticipantes, List<Local> lstLocais ) {
        super();
        this.usuarioRealizador = usuarioRealizador;
        this.datInicio = datInicio;
        this.dataFim = dataFim;
        this.lstParticipantes = lstParticipantes;
        this.lstLocais = lstLocais;
    }

    public Selecao( Long id, User usuarioRealizador, LocalDate datInicio, LocalDate dataFim,
            List<User> lstParticipantes, List<Local> lstLocais ) {
        super();
        this.id = id;
        this.usuarioRealizador = usuarioRealizador;
        this.datInicio = datInicio;
        this.dataFim = dataFim;
        this.lstParticipantes = lstParticipantes;
        this.lstLocais = lstLocais;
    }

    public Long getId() {
        return id;
    }

    public void setId( Long id ) {
        this.id = id;
    }

    public User getUsuarioRealizador() {
        return usuarioRealizador;
    }

    public void setUsuarioRealizador( User usuarioRealizador ) {
        this.usuarioRealizador = usuarioRealizador;
    }

    public LocalDate getDatInicio() {
        return datInicio;
    }

    public void setDatInicio( LocalDate datInicio ) {
        this.datInicio = datInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim( LocalDate dataFim ) {
        this.dataFim = dataFim;
    }

    public List<User> getLstParticipantes() {
        return lstParticipantes;
    }

    public void setLstParticipantes( List<User> lstParticipantes ) {
        this.lstParticipantes = lstParticipantes;
    }

    public List<Local> getLstLocais() {
        return lstLocais;
    }

    public void setLstLocais( List<Local> lstLocais ) {
        this.lstLocais = lstLocais;
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
        Selecao other = (Selecao) obj;
        if ( id == null ) {
            if ( other.id != null )
                return false;
        } else if ( !id.equals( other.id ) )
            return false;
        return true;
    }

}
