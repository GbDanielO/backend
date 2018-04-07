package br.com.backend.selecao.repository;

import java.util.List;

import br.com.backend.local.model.Local;
import br.com.backend.selecao.model.Selecao;

public interface SelecaoRepository {

    public Selecao getSelecaoById( Long id );

    public Selecao getUsuariosPorSelecao( Long id );

    public List<Local> getLocalPorSelecao( Long id );
}
