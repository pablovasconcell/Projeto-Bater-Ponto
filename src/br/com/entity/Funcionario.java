package br.com.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Funcionario {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<DiaCorrenteEntity> getDiaCorrente() {
        return diaCorrente;
    }

    public void setDiaCorrente(List<DiaCorrenteEntity> diaCorrente) {
        this.diaCorrente = diaCorrente;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToMany(targetEntity = DiaCorrenteEntity.class)
    private List<DiaCorrenteEntity> diaCorrente;

    private String nome;

    @Override
    public String toString() {
        return nome;
    }
    private int idade;
    private String telefone;
    private String CPF;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getIdFunc() {
        return id;
    }

    public void setIdFunc(int idFunc) {
        this.id = idFunc;
    }
}
