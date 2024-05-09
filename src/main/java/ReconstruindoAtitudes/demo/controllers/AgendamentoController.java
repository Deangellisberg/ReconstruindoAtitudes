package ReconstruindoAtitudes.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import ReconstruindoAtitudes.demo.Dtos.AgendamentoDto;
import ReconstruindoAtitudes.demo.Models.AgendamentoModel;
import ReconstruindoAtitudes.demo.Services.AgendamentoService;

@Controller
@RestController

public class AgendamentoController {
    
    @Autowired
    private AgendamentoService agendamentoService;

    @PostMapping("cadastrarAgenda")
    public ResponseEntity<AgendamentoModel> cadastraAgendamento(AgendamentoDto dados){
        try {
            AgendamentoModel Resultado = agendamentoService.cadastrarAgendamento(dados);
            return new ResponseEntity<>(HttpStatus.OK).ok(Resultado);
        } catch (Exception e) {
            throw new RuntimeException(e);   
        }
    }
    
}
