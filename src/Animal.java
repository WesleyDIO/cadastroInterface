import java.util.ArrayList;

public abstract class Animal implements IAlimenta{
    private String familia;
    private String nome;
    private String classe;
    int id;
    public Animal( String familia, String nome, String classe){
      this.familia = familia;
      this.nome = nome;
      this.classe = classe;
      this.id ++;
    }

    @Override
    public int alimentar(int quantidadeComida, String tipoComida, Planta planta, int peso) {
        int dieta = 0;
        if(tipoComida.equals(planta.getNome())){
            tipoAnimal(planta,tipoComida);
            dieta = quantidadeComida / peso;
        }else{
            tipoAnimal(planta,tipoComida);
            dieta = quantidadeComida / peso;
        }

        return dieta;
    }

    public void tipoAnimal(Planta planta, String tipoComida){
        if (tipoComida.equals(planta.getNome()) && !(tipoComida != planta.getNome())){
            System.out.println("Esse animal é herbivoro");
        }else if(tipoComida.equals(planta.getNome()) || tipoComida != planta.getNome()){
            System.out.println("Esse animal é onivoro");
        }else{
            System.out.println("Esse animal é canivoro");
        }
    }

    Mamifero mamifero;
    Ave ave;
    Peixe peixe;
    public String toString() {
            return "Nome: " + nome + "\n" +
                    "Familia: " + familia + "\n" +
                    "Classe: " + classe ;

    }
}
