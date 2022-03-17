package espm.poo.aula04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MainCollection {

    public static void main(String[] args) {
        
        Set<Integer> sinteiros = new TreeSet<>();
        sinteiros.add(3);
        sinteiros.add(2);
        sinteiros.add(1);
        sinteiros.add(1);
        System.out.println(Arrays.toString(Arrays.asList(sinteiros).toArray()));

        List<Integer> linteiros = new ArrayList<>();
        linteiros.add(3);
        linteiros.add(2);
        linteiros.add(1);
        linteiros.add(1);
        System.out.println(Arrays.toString(Arrays.asList(linteiros).toArray()));

        Set<Aluno> salunos = new HashSet<>();
        salunos.add(new Aluno(10, "Dezmini"));
        salunos.add(new Aluno(2, "Doismini"));
        salunos.add(new Aluno(10, null));
        System.out.println(Arrays.toString(Arrays.asList(salunos).toArray()));

        List<Aluno> lalunos = new ArrayList<>();
        lalunos.add(new Aluno(10, "Dezmini"));
        lalunos.add(new Aluno(2, "Doismini"));
        lalunos.add(new Aluno(10, null));
        System.out.println(Arrays.toString(Arrays.asList(lalunos).toArray()));

        Map<Integer, Aluno> mapa = new HashMap<>();
        mapa.put(10, new Aluno(10, "Dezmini"));
        mapa.put(2, new Aluno(2, "Doismini"));
        mapa.put(13, null);
        mapa.forEach((k, v) -> System.out.println(k + " -> " + v));

    }
    
}
