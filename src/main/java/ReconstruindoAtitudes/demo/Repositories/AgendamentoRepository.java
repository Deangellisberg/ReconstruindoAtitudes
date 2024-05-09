package ReconstruindoAtitudes.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ReconstruindoAtitudes.demo.Models.AgendamentoModel;

public interface AgendamentoRepository extends JpaRepository<AgendamentoModel,Long> {

    
}