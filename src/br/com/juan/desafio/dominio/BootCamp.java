package br.com.juan.desafio.dominio;

import com.sun.source.doctree.SeeTree;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class BootCamp {
    private String nome;
    private String descricao;
    private final LocalDate datainicial = LocalDate.now();
    private final LocalDate datafinal = datainicial.plusDays(45);
    private Set<Dev> devsIncritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {return nome;    }

    public void setNome(String nome) {this.nome = nome;}

    public String getDescricao() {return descricao;}

    public void setDescricao(String descricao) {this.descricao = descricao;}

    public LocalDate getDatainicial() {return datainicial;}

    public LocalDate getDatafinal() {return datafinal;}

    public Set<Dev> getDevsIncritos() {return devsIncritos;}

    public void setDevsIncritos(Set<Dev> devsIncritos) {this.devsIncritos = devsIncritos; }

    public Set<Conteudo> getConteudos() {return conteudos;}

    public void setConteudos(Set<Conteudo> conteudos) {this.conteudos = conteudos;}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BootCamp bootCamp = (BootCamp) o;
        return Objects.equals(nome, bootCamp.nome) &&
                Objects.equals(descricao, bootCamp.descricao) &&
                Objects.equals(datainicial, bootCamp.datainicial) &&
                Objects.equals(datafinal, bootCamp.datafinal) &&
                Objects.equals(devsIncritos, bootCamp.devsIncritos) &&
                Objects.equals(conteudos, bootCamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, datainicial, datafinal, devsIncritos, conteudos);
    }
}
