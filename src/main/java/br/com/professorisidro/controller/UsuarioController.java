package br.com.professorisidro.controller;

import br.com.professorisidro.model.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @PostMapping("/login")
    public ResponseEntity<Usuario> login(@RequestBody Usuario dadosLogin) {
        System.out.println("Recebido: " + dadosLogin.getEmail() + "- " + dadosLogin.getSenha());
        if(dadosLogin.getEmail().equals("gabriel@gmail.com")) {
            if (dadosLogin.getSenha().equals("1234")) {
                Usuario resposta = new Usuario();
                resposta.setId(54321);
                resposta.setNome("Gabriel");
                resposta.setEmail("gabriel@gmail.com");
                resposta.setSenha("******");
                return ResponseEntity.ok(resposta);
            }
            return ResponseEntity.status(401).build();
        }
        return ResponseEntity.status(404).build();
    }


}
