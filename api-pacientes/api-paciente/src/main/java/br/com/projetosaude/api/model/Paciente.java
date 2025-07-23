package br.com.projetosaude.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity(name = "Paciente")
@Table(name = "pacientes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Paciente {
    // Este é o construtor que você deve adicionar
    public Paciente(DadosCadastroPaciente dados) {
        this.nome = dados.nome();
        this.cpf = dados.cpf();
        this.dataNascimento = dados.dataNascimento();
        this.telefone = dados.telefone();
        this.diagnostico = dados.diagnostico();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique = true) // Isso garante que não haverá dois CPFs iguais no banco
    private String cpf;

    private LocalDate dataNascimento;

    private String telefone;
    
    private String diagnostico;
}