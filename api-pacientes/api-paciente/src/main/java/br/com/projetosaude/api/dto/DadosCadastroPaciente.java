package br.com.projetosaude.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import java.time.LocalDate;

public record DadosCadastroPaciente(
        @NotBlank String nome,
        @NotBlank @Pattern(regexp = "\\d{11}") String cpf,
        @NotNull LocalDate dataNascimento,
        String telefone,
        String diagnostico) {
}