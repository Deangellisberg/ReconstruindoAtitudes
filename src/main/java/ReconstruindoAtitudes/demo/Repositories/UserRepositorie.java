package ReconstruindoAtitudes.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ReconstruindoAtitudes.demo.Models.UserModel;

public interface UserRepositorie extends JpaRepository<UserModel, Long> {

    // Não é necessário definir métodos como save e findAllById, 
    // pois eles já são fornecidos pelo JpaRepository.
}
