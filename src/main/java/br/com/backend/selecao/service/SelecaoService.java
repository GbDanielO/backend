package br.com.backend.selecao.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.backend.exceptionHandler.EntidadeNaoEncontradaException;
import br.com.backend.local.model.Local;
import br.com.backend.selecao.model.Selecao;
import br.com.backend.selecao.repository.SelecaoRepository;
import br.com.backend.selecao.repository.SelecaoRepositoryImpl;
import br.com.backend.usuario.model.User;

@Service
public class SelecaoService {

    private SelecaoRepository selecaoRepository = new SelecaoRepositoryImpl();

    public Selecao getSelecaoById( Long id ) {
        try {
            return selecaoRepository.getSelecaoById( id );
        } catch ( EntidadeNaoEncontradaException e ) {
            throw new EntidadeNaoEncontradaException( "Seleção não encontrada" );
        }
    }

    public Selecao getUsuariosPorSelecao( Long id ) {
        try {
            return selecaoRepository.getUsuariosPorSelecao( id );
        } catch ( EntidadeNaoEncontradaException e ) {
            throw new EntidadeNaoEncontradaException( "Seleção não encontrada" );
        }
    }

    public List<Local> getLocalPorSelecao( Long id ) {
        Selecao selecao = getSelecaoById( id );
        try {
            return selecaoRepository.getLocalPorSelecao( selecao.getId() );
        } catch ( EntidadeNaoEncontradaException e ) {
            throw new EntidadeNaoEncontradaException( "Local não encontrado" );
        }
    }

    public User criarUsuario( Long id, User usuario ) {
        Selecao selecao = getSelecaoById( id );

        return selecaoRepository.criarUsuario( selecao, usuario );
    }

    public Local criarLocal( Long id, Local local ) {
        Selecao selecao = getSelecaoById( id );

        return selecaoRepository.criarLocal( selecao, local );
    }

    public User atualizarUsuario( Long id, User usuario ) {
        Selecao selecao = getSelecaoById( id );

        return selecaoRepository.atualizarUsuario( selecao, usuario );
    }

    public Local atualizarLocal( Long id, Local local ) {
        Selecao selecao = getSelecaoById( id );

        return selecaoRepository.atualizarLocal( selecao, local );
    }

    public void removerUsuario( Long id, User usuario ) {
        Selecao selecao = getSelecaoById( id );

        selecaoRepository.removerUsuario( selecao, usuario );
    }

    public void removerLocal( Long id, Local local ) {
        Selecao selecao = getSelecaoById( id );

        selecaoRepository.removerLocal( selecao, local );
    }
}
