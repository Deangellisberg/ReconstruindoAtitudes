package ReconstruindoAtitudes.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ReconstruindoAtitudes.demo.Dtos.AgendamentoDto;
import ReconstruindoAtitudes.demo.Models.AgendamentoModel;
import ReconstruindoAtitudes.demo.Repositories.AgendamentoRepository;

@Service
public class AgendamentoService { 

    @Autowired
    private AgendamentoRepository agendamentoRepository;

public AgendamentoModel cadastrarAgendamento(AgendamentoDto dados){
    AgendamentoModel Resultado = new AgendamentoModel(dados);
    agendamentoRepository.save(Resultado);
    return Resultado;
}
    
}
