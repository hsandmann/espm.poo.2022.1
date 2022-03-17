package espm.poo.aula04;

import java.util.Arrays;

public class Aluno {

    Integer ra = null;
    String nome = null;

    public Aluno(Integer ra, String nome) {
        this.ra = ra;
        this.nome = nome;        
    }

    public double media(double... notas) {
        double soma = 0;
        for (double n: notas) {
            soma += n;
        }
        double media = soma / notas.length;

        return Arrays.stream(notas).average().getAsDouble();
    }

    @Override
    public String toString() {
        return "{ra: " + ra +
            ", nome: " + nome + "}";
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null
            && obj instanceof Aluno
            && ra.equals(((Aluno) obj).ra);
    }

    @Override
    public int hashCode() {
        return ra.hashCode();
    }
    
}
