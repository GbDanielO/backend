package br.com.backend.selecao.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.backend.local.model.Local;
import br.com.backend.selecao.model.Selecao;
import br.com.backend.selecao.service.SelecaoService;

@RestController
@RequestMapping("/selective")
public class SelecaoResource {

    @Autowired
    private SelecaoService selecaoService;

    // GET: {uri}/selective/{id}/users
    // Passar como parâmetro id da seleção
    @GetMapping("/{id}/users")
    public Selecao getUsuariosPorSelecao( @PathVariable Long id ) {
        return selecaoService.getUsuariosPorSelecao( id );
    }

    // GET: {uri}/selective/{id}/places
    // Passar como parâmetro id da seleção
    @GetMapping("/{id}/places")
    public ResponseEntity getLocalPorSelecao( @PathVariable Long id ) {
        List<Local> lstLocais = selecaoService.getLocalPorSelecao( id );
        return ResponseEntity.ok().body( lstLocais );
    }

    // POST: {uri}/selective/{id}/user
    // Salva o usuário passado como parâmetro em uma seleção

    // POST: {uri}/selective/{id}/place
    // Salva o local passado como parâmetro em uma seleção

    // PUT: {uri}/selective/{id}/user
    // Altera o usuário passado como parâmetro em uma seleção

    // PUT: {uri}/selective/{id}/place
    // Altera o local passado como parâmetro em uma seleção

    // DELETE: {uri}/selective/{id}/user
    // Deleta o usuário passado como parâmetro em uma seleção

    // DELETE: {uri}/selective/{id}/place
    // Deleta o local passado como parâmetro em uma seleção
}
