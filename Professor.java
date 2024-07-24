import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }
}
