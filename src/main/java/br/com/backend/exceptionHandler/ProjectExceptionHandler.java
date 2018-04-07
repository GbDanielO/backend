package br.com.backend.exceptionHandler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ProjectExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({ EntidadeNaoEncontradaException.class })

    public ResponseEntity<Object> handlePessoaInexistenteOuInativaException( EntidadeNaoEncontradaException ex ) {

        return ResponseEntity.badRequest().body( ex.getMessage() );
    }

}
