package ReconstruindoAtitudes.demo.Services;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ReconstruindoAtitudes.demo.Dtos.USerDto;
import ReconstruindoAtitudes.demo.Models.UserModel;
import ReconstruindoAtitudes.demo.Repositories.UserRepositorie;
import jakarta.transaction.Transactional;

@Service
public class UserService {
    
    @Autowired
    private UserRepositorie _UserRepositorie;

    @Transactional
    public UserModel CadastrarUsuario(USerDto data){
        UserModel user = new UserModel(data);
        return this._UserRepositorie.save(user);
    }

    public List<UserModel> TodosUsuarios(){
        List<UserModel> result = this._UserRepositorie.findAll();
        return result;
    }

    public Optional EncontrarUsuarioPorId(Long id){
        Optional user = this._UserRepositorie.findById(id);
        return user;
    }

    @Transactional
    public UserModel AtualizarUsuario(USerDto data, Long id){
        Optional<UserModel> existeUsuario = this.EncontrarUsuarioPorId(id);
        if(!existeUsuario.isPresent()){
            throw new RuntimeException("Usuário não encontrado com o ID: " + id);
        }
        UserModel usuarioAtualizar = existeUsuario.get();
        if (data != null && data.Email() != null && !data.Email().isEmpty()) {
            usuarioAtualizar.setEmail(data.Email());
        }
        if (data != null && data.Senha() != null && !data.Senha().isEmpty()) {
            usuarioAtualizar.setSenha(data.Senha());
        }
        return usuarioAtualizar;
    }
    
    public void DeletarUsuario(Long id){
        Optional<UserModel> existeUsuario = this.EncontrarUsuarioPorId(id);
        if(!existeUsuario.isPresent()){
            throw new RuntimeException("Usuário não encontrado com o ID: " + id);
        }
        _UserRepositorie.deleteById(id);
    }
}
