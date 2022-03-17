package espm.poo.aula04;

public class Main {

    public static void main(String[] args) {
        Aluno a1 = new Aluno(1000, "Seumini");
        System.out.println(a1);
        Aluno a2 = new Aluno(1000, "Ceúmini");
        System.out.println(a2.toString());

        if (a1.equals(a2)) {
            System.out.println("São iguais");            
        } else {
            System.out.println("Não são iguais");            
        }

        Integer n1 = 1000;
        Integer n2 = 1000;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n1 == n2);
        System.out.println(n1.equals(n2));
    }
    
}
