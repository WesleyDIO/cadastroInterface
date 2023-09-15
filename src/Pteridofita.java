import java.util.ArrayList;

public class Pteridofita extends Planta{
    private String grupo;
    boolean esporos = false;

    public Pteridofita(String nome, String tipo, String fonteEnergia, String grupo) {
        super(nome, tipo, fonteEnergia);
        this.grupo = grupo;
    }

    @Override
    public String tipoReprodução() {
        if(!(esporos)){
            return "O tipo de reprodução é sexuada";
        }else{
            return "O tipo de reprodução é assexuada";
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Grupo: " + grupo;
    }
}
