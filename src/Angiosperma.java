import java.util.ArrayList;

public class Angiosperma extends Planta{
    private boolean flor;
    private boolean fruto;
    private boolean semente = false;

    public Angiosperma(String nome, String tipo, String fonteEnergia, boolean fruto, boolean flor) {
        super(nome, tipo, fonteEnergia);
        this.fruto = fruto;
        this.flor = flor;
    }

    @Override
    public String tipoReprodução() {
      if(!(semente && fruto)){
          return "O tipo de reprodução é Assexuada";
      }else{
          return "O tipo de reprodução é sexuada";
      }
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Fruto: " + fruto;
    }
}
