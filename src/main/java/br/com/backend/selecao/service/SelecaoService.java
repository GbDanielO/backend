package br.com.backend.selecao.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.backend.exceptionHandler.EntidadeNaoEncontradaException;
import br.com.backend.local.model.Local;
import br.com.backend.selecao.model.Selecao;
import br.com.backend.selecao.repository.SelecaoRepository;
import br.com.backend.selecao.repository.SelecaoRepositoryImpl;

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

}
