package br.com.juan.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudoInscrito = new LinkedHashSet<>();
    private Set<Conteudo> conteudoConcluidos = new LinkedHashSet<>();


    public void increverBotcamp (BootCamp bootCamp){
        this.conteudoInscrito.addAll(bootCamp.getConteudos());
        bootCamp.getDevsIncritos().add(this);

    }
    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudoInscrito.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudoConcluidos.add(conteudo.get());
            this.conteudoInscrito.remove(conteudo.get());
        }else{
            System.err.println("Voce não esta matriculado em nenhum conteudo");
        }

    }
    public double calcularTotalXp(){
        return this.conteudoConcluidos
                .stream()
                .mapToDouble(conteudo ->conteudo.calcularXp())
                .sum();


    }

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public Set<Conteudo> getConteudoInscrito() {return conteudoInscrito;}

    public void setConteudoInscrito(Set<Conteudo> conteudoInscrito) {this.conteudoInscrito = conteudoInscrito;}

    public Set<Conteudo> getConteudoconcluidos() {return conteudoConcluidos;}

    public void setConteudoconcluidos(Set<Conteudo> conteudoconcluidos) {this.conteudoConcluidos = conteudoconcluidos;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) &&
                Objects.equals(conteudoInscrito, dev.conteudoInscrito) &&
                Objects.equals(conteudoConcluidos, dev.conteudoConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudoInscrito, conteudoConcluidos);
    }
}
