public class Main {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("João", 20, "Computação");
        Professor professor = new Professor("Maria", 40, "Matemática");

        System.out.println("Estudante: " + estudante.getNome() + ", Idade: " + estudante.getIdade() + ", Curso: " + estudante.getCurso());
        System.out.println("Professor: " + professor.getNome() + ", Idade: " + professor.getIdade() + ", Disciplina: " + professor.getDisciplina());
    }
}
