package br.com.backend.selecao.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.backend.local.model.Local;
import br.com.backend.selecao.model.Selecao;
import br.com.backend.selecao.service.SelecaoService;
import br.com.backend.usuario.model.User;

@RestController
@RequestMapping("/selective")
@CrossOrigin
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
    @PostMapping("/{id}/users")
    @ResponseStatus(HttpStatus.CREATED)
    public User criarUsuario( @PathVariable Long id, @RequestBody User usuario ) {
        return selecaoService.criarUsuario( id, usuario );
    }

    // POST: {uri}/selective/{id}/place
    // Salva o local passado como parâmetro em uma seleção
    @PostMapping("/{id}/places")
    @ResponseStatus(HttpStatus.CREATED)
    public Local criarLocal( @PathVariable Long id, @RequestBody Local local ) {
        return selecaoService.criarLocal( id, local );
    }

    // PUT: {uri}/selective/{id}/user
    // Altera o usuário passado como parâmetro em uma seleção
    @PutMapping("/{id}/users")
    public User atualizarUsuario( @PathVariable Long id, @RequestBody User usuario ) {
        return selecaoService.atualizarUsuario( id, usuario );
    }

    // PUT: {uri}/selective/{id}/place
    // Altera o local passado como parâmetro em uma seleção
    @PutMapping("/{id}/places")
    public Local atualizarLocal( @PathVariable Long id, @RequestBody Local local ) {
        return selecaoService.atualizarLocal( id, local );
    }

    // DELETE: {uri}/selective/{id}/user
    // Deleta o usuário passado como parâmetro em uma seleção
    @DeleteMapping("/{id}/users")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removerUsuario( @PathVariable Long id, @RequestBody User usuario ) {
        selecaoService.removerUsuario( id, usuario );
    }

    // DELETE: {uri}/selective/{id}/place
    // Deleta o local passado como parâmetro em uma seleção
    @DeleteMapping("/{id}/places")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removerLocal( @PathVariable Long id, @RequestBody Local local ) {
        selecaoService.removerLocal( id, local );
    }
}
