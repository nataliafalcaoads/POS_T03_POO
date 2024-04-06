package tech.natalia.pessoas;

import tech.natalia.Pessoa;
import tech.natalia.composicao.Endereco;
import tech.natalia.composicao.Telefone;

import java.time.LocalDate;

public class Funcionario extends Pessoa {

    private String matricula;

    private double salario;

    private LocalDate dataAdmissao;

    public Funcionario() {
        System.out.println("Criando funcionário");
    }

    public Funcionario(String nome, LocalDate dataNascimento, Endereco endereco, Telefone telsContato, String matricula, double salario, LocalDate dataAdmissao) {
        super(nome, dataNascimento, endereco, telsContato);
        this.matricula = matricula;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
}