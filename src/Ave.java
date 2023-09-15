import java.util.ArrayList;

public class Ave extends Animal{
    int quantidadePenas;
    String tipoBico;

    public Ave(String familia, String nome, String classe, int quantidadePenas, String tipoBico) {
        super(familia, nome, classe);
        this.quantidadePenas = quantidadePenas;
        this.tipoBico = tipoBico;
    }

    @Override
    public String toString() {
        return super.toString() +"\n" +"Quantidade penas: " + quantidadePenas + "\n" + "Tipo bico: " + tipoBico;
    }
}
