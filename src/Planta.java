import java.util.ArrayList;

public abstract class Planta implements IReproducao<Integer,Planta>{

   private String nome;
   private String tipo;
   private String fonteEnergia;

   int id;

   public Planta(String nome, String tipo, String fonteEnergia){
      this.nome = nome;
      this.tipo = tipo;
      this.fonteEnergia = fonteEnergia;
      this.id ++;
   }

   public String getNome() {
      return nome;
   }

   @Override
   public String toString() {
      return "Nome: " + nome + "\n" +
              "Tipo: " + tipo + "\n" +
              "Fonte Energia: " + fonteEnergia;
   }
}
