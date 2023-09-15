import java.util.ArrayList;

public class Peixe extends Animal {
    private String classificacaoCorpo;


    public Peixe(String familia, String nome, String classe, String classificacaoCorpo) {
        super(familia, nome, classe);
        this.classificacaoCorpo = classificacaoCorpo;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Classificação corpo: " + classificacaoCorpo;
    }
}
