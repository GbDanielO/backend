package br.com.backend.selecao.repository;

import java.util.List;

import br.com.backend.local.model.Local;
import br.com.backend.selecao.model.Selecao;
import br.com.backend.usuario.model.User;

public interface SelecaoRepository {

    public Selecao getSelecaoById( Long id );

    public Selecao getUsuariosPorSelecao( Long id );

    public List<Local> getLocalPorSelecao( Long id );

    public User criarUsuario( Selecao selecao, User usuario );

    public Local criarLocal( Selecao selecao, Local local );

    User atualizarUsuario( Selecao selecao, User usuario );

    Local atualizarLocal( Selecao selecao, Local local );

    void removerUsuario( Selecao selecao, User usuario );

    void removerLocal( Selecao selecao, Local local );
}
