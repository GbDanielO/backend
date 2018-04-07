package br.com.backend.selecao.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.backend.usuario.model.User;

@RestController
@RequestMapping("/selective")
public class SelecaoResource {

    // GET: {uri}/selective/{id}/users
    // Passar como parâmetro id da seleção
    @GetMapping("/{id}/users")
    public List<User> getUsuariosPorSelecao() {
        return null;
    }

    // GET: {uri}/selective/{id}/places
    // Passar como parâmetro id da seleção

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