import java.util.ArrayList;

public class BDAnimal implements ICrud<Integer,Animal> {
    ArrayList<Animal> animais = new ArrayList<>();
    @Override
    public Animal create(Animal novoObjeto) {
        this.animais.add(novoObjeto);
        return null;
    }

    @Override
    public Animal read(int id) {
        for (Animal animal: animais) {
            if (id == animal.id){
                System.out.println(animal.toString());
            }
        }
        return null;
    }

    @Override
    public Animal update(int id, Animal objetoAtualizado) {
        int idIndex = 0;
        for (Animal animal: animais) {
            if (id == animal.id){
                 idIndex = animais.indexOf(animal);
            }
        }
        animais.set(idIndex, objetoAtualizado);

        return null;
    }

    @Override
    public Animal delete(int id) {
        int idIndex = 0;
        for (Animal animal:animais) {
            if (id == animal.id){
                idIndex = animais.indexOf(animal);
            }
        }
       animais.remove(idIndex);
        return null;
    }

    @Override
    public ArrayList<Animal> readAll() {
        return animais;
    }


}
