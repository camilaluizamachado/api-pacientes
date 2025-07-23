package br.com.projetosaude.api.controller;

import br.com.projetosaude.api.dto.DadosCadastroPaciente;
import br.com.projetosaude.api.dto.DadosListagemPaciente;
import br.com.projetosaude.api.model.Paciente;
import br.com.projetosaude.api.repository.PacienteRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody @Valid DadosCadastroPaciente dados, UriComponentsBuilder uriBuilder) {
        var paciente = new Paciente(dados);
        repository.save(paciente);

        var uri = uriBuilder.path("/pacientes/{id}").buildAndExpand(paciente.getId()).toUri();
        
        // Retorna o código 201 (Created) e o paciente recém-criado no corpo da resposta
        return ResponseEntity.created(uri).body(paciente);
    }

    @GetMapping
    public ResponseEntity<List<DadosListagemPaciente>> listar() {
        var lista = repository.findAll().stream().map(DadosListagemPaciente::new).toList();
        return ResponseEntity.ok(lista);
    }
}