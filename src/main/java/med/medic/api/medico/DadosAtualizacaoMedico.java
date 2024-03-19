package med.medic.api.medico;

import jakarta.validation.constraints.NotNull;
import med.medic.api.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
