package models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Tarefa")

public class Tarefa {
    @Id
    private int id;
    //@GeneratedValue(strategy = GenerationType.IDENTITY);
    private String nome;
    private String prioridade;
    private LocalDate dataVencimento;
    private String status;
    private LocalDate dataConclusao;

    public Tarefa(int id, String nome, String prioridade, LocalDate dataVencimento, String status, LocalDate dataConclusao) {
        this.id = id;
        this.nome = nome;
        this.prioridade = prioridade;
        this.dataVencimento = dataVencimento;
        this.status = status;
        this.dataConclusao = dataConclusao;
    }

    public Tarefa() {
    }

    @ManyToOne
    @JoinColumn(name = "ïd_projeto")
    private Projeto projeto;

    @ManyToOne
    @JoinColumn(name = "ïd_responsavel")
    private Usuario responsavel;

}
