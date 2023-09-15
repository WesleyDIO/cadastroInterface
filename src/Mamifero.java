import java.util.ArrayList;

public class Mamifero extends Animal{
    private String classificacao;

    public Mamifero(String familia, String nome, String classe,String classificacao) {
        super(familia, nome, classe);
        this.classificacao = classificacao;
    }

    public String toString() {
        return super.toString() + "\n" + "Classificação fisico: " + classificacao;
    }
}
