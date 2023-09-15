import java.util.ArrayList;

public class Gimnosperma extends Planta {
     boolean semente = false;

     boolean estrobilo = false;

     public Gimnosperma(String nome, String tipo, String fonteEnergia) {
          super(nome, tipo, fonteEnergia);
     }

     @Override
     public String tipoReprodução() {
         if(!(semente && estrobilo)){
              return "O tipo de reprodução é sexuada";
         }else{
              return "O tipo de repodução é Assexuada";
         }
     }

    @Override
    public String toString() {
        return super.toString();
    }
}
