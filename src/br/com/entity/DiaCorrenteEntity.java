package br.com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity

public class DiaCorrenteEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    @ManyToOne(targetEntity = Funcionario.class)
    private Funcionario funcionario;
    
    private String dataE;
    //private String dataS;

    public String getDataE() {
        return dataE;
    }

    public void setDataE(String dataE) {
        this.dataE = dataE;
    }

    /*public String getDataS() {
        return dataS;
    }

    public void setDataS(String dataS) {
        this.dataS = dataS;
    }*/
    
    private int horaE;
    private int minutoE;
    
    private int horaS;
    private int minutoS;

    public int getHoraE() {
        return horaE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHoraE(int horaE) {
        this.horaE = horaE;
    }

    public int getMinutoE() {
        return minutoE;
    }

    public void setMinutoE(int minutoE) {
        this.minutoE = minutoE;
    }

    public int getHoraS() {
        return horaS;
    }

    public void setHoraS(int horaS) {
        this.horaS = horaS;
    }

    public int getMinutoS() {
        return minutoS;
    }

    public void setMinutoS(int minutoS) {
        this.minutoS = minutoS;
    }
    
    
}
