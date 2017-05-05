package br.com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class DiaCorrenteEntity {

    private String data;
    private int horaE;
    private int minutoE;

    private int horaS;
    private int minutoS;

    private String status;
    private int tempo;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    @ManyToOne(targetEntity = Funcionario.class)
    private Funcionario funcionario;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
