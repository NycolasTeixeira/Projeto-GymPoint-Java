
package Entities;

import java.util.Date;
import java.util.UUID;
import javax.persistence.*;

@Entity
@Table(name = "academia")
public class Gym {
    @Id
    @Column(name = "id", columnDefinition = "UUID")
    private final UUID id;
   
    
    @Column(name = "nome", unique = true)
    private  String nome;
   
    
    @Column(name = "telefone", unique = true)
    private  String tel;
    
     @Column(name = "descricao")
    private  String desc;
    
      @Column(name = "longitude")
     private Double longitude;
      @Column(name = "latitude")
      private  Double latitude;
    @Column(name = "data_criacao" )
    @Temporal(TemporalType.TIMESTAMP)
      private Date data_criacao;

    public Gym(String nome, String tel, String desc, Double longitude, Double latitude) {
        this.nome = nome;
        this.tel = tel;
        this.desc = desc;
        this.longitude = longitude;
        this.latitude = latitude;
        this.id = UUID.randomUUID();
        this.data_criacao = new Date();
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTel() {
        return tel;
    }

    public String getDesc() {
        return desc;
    }

    public Double getLongitude() {
        return longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Date getData_criacao() {
        return data_criacao;
    }
}
