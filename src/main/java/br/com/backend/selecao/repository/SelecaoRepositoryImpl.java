package br.com.backend.selecao.repository;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import br.com.backend.exceptionHandler.EntidadeNaoEncontradaException;
import br.com.backend.local.model.Local;
import br.com.backend.selecao.model.Selecao;
import br.com.backend.usuario.model.EnumSexo;
import br.com.backend.usuario.model.User;

public class SelecaoRepositoryImpl implements SelecaoRepository {

    private static List<Selecao> lstSelecao;

    private static Long id = 0L;

    public SelecaoRepositoryImpl() {
        montarEntidade();
    }

    @Override
    public Selecao getSelecaoById( Long id ) {
        Selecao selecao = new Selecao( id );
        for ( Selecao selecaoBD : lstSelecao ) {
            if ( selecaoBD.equals( selecao ) ) {
                return selecaoBD;
            }
        }
        throw new EntidadeNaoEncontradaException();
    }

    @Override
    public Selecao getUsuariosPorSelecao( Long id ) {
        Selecao selecao = new Selecao( id );

        for ( Selecao selecaoBD : lstSelecao ) {
            if ( selecaoBD.equals( selecao ) ) {
                return selecaoBD;
            }
        }

        throw new EntidadeNaoEncontradaException();
    }

    @Override
    public List<Local> getLocalPorSelecao( Long id ) {
        Selecao selecaoBD = getSelecaoById( id );
        try {
            return selecaoBD.getLstLocais();
        } catch ( Exception e ) {
            throw new EntidadeNaoEncontradaException();
        }

    }

    private void montarEntidade() {
        if ( lstSelecao == null || lstSelecao.isEmpty() ) {
            User realizador = new User( getId(), "Antonio Astolfo Ramos da Silva", "11111111111", null, null,
                    EnumSexo.MASCULINO, null );
            Local local = new Local( getId(), "Secretaria Regional IV", "Brasil", "Ceará", "Fortleza", "8534332800" );
            LocalDate datIni = LocalDate.of( 2018, Month.JANUARY, 1 );
            LocalDate datFim = LocalDate.of( 2018, Month.JANUARY, 1 );

            User participante1 =
                    new User( getId(), "Astolfo Braga", "ab@hotmail.com", "22222222222", null, EnumSexo.MASCULINO,
                            "Programador" );
            User participante2 =
                    new User( getId(), "Yury Gagari da Silva", "ygs@hotmail.com", "33333333333", null,
                            EnumSexo.MASCULINO,
                            "Analista" );
            User participante3 =
                    new User( getId(), "Cristiane Torlon", "ct@hotmail.com", "44444444444", null, EnumSexo.MASCULINO,
                            "Analista" );
            List<User> lstParticipantes = new ArrayList<>();
            lstParticipantes.add( participante1 );
            lstParticipantes.add( participante2 );
            lstParticipantes.add( participante3 );

            List<Local> lstLocais = new ArrayList<>();
            lstLocais.add( local );

            Selecao selecao = new Selecao( 1L, realizador, datIni, datFim, lstParticipantes, lstLocais );
            lstSelecao = new ArrayList<>();
            lstSelecao.add( selecao );
        }
    }

    public static Long getId() {
        id++;
        return id;
    }

}
