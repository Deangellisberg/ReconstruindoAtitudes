package ReconstruindoAtitudes.demo.Models;

import ReconstruindoAtitudes.demo.Dtos.AgendamentoDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Agendamento")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AgendamentoModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @NotBlank
    @NotNull
    private String DescricaoPais;
    @NotNull
    @NotBlank
    private String DinamicaFamilia;
    @NotNull
    @NotBlank
    private String RelacionamentoIrmaos;
    
    public AgendamentoModel(AgendamentoDto dados) {
        DescricaoPais = dados.DescricaoPais();
        DinamicaFamilia = dados.DinamicaFamilia();
        RelacionamentoIrmaos = dados.RelacionamentoIrmaos();
    }


}
