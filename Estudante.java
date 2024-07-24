import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Estudante extends Pessoa {
    private String curso;

    public Estudante(String nome, int idade, String curso) {
        super(nome, idade);
        this.curso = curso;
    }
}
