package Entities;

import Enums.Function;
import java.util.Date;
import java.util.UUID;
import javax.persistence.*;
import org.mindrot.jbcrypt.BCrypt;

@Entity
@Table(name = "usuario")
public class User {

    @Id
    @Column(name = "id", columnDefinition = "UUID")
    private UUID id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "senha_hash")
    private String senha_hash;

    @Enumerated(EnumType.STRING)
    @Column(name = "funcao")
    private Function funcao_usuario;

    @Column(name = "data_criacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date data_criacao;

    public User() { }

    public User(String nome, String email, String senha, Function funcao_usuario) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.email = email;
        this.senha_hash = BCrypt.hashpw(senha, BCrypt.gensalt());
        this.funcao_usuario = funcao_usuario;
        this.data_criacao = new Date();
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha_hash() {
        return senha_hash;
    }

    public Function getFuncao_usuario() {
        return funcao_usuario;
    }

    public Date getData_criacao() {
        return data_criacao;
    }

}
