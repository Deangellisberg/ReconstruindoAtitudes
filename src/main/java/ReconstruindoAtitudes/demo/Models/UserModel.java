package ReconstruindoAtitudes.demo.Models;

import javax.print.DocFlavor.STRING;

import ReconstruindoAtitudes.demo.Dtos.USerDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="usuarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Email(message = "Campo email invalido!")
    private String Email;

    @NotBlank
    @NotNull
    private String Senha;

    public UserModel(USerDto data) {
        Email = data.Email();
        Senha = data.Senha();
    } 
}
