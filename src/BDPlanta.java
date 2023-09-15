import java.util.ArrayList;

public class BDPlanta implements ICrud<Integer, Planta>{
    ArrayList<Planta> plantas = new ArrayList<>();

    @Override
    public Planta create(Planta novoObjeto) {
        this.plantas.add(novoObjeto);
        return null;
    }

    @Override
    public Planta read(int id) {
        for (Planta planta: plantas) {
            if (id == planta.id){
                System.out.println(planta.toString());
            }
        }
        return null;
    }

    @Override
    public Planta update(int id, Planta objetoAtualizado) {
        int idIndex = 0;
        for (Planta planta: plantas) {
            if (id == planta.id){
                idIndex = plantas.indexOf(planta);
            }
        }
        plantas.set(idIndex, objetoAtualizado);

        return null;
    }

    @Override
    public Planta delete(int id) {
        int idIndex = 0;
        for (Planta planta:plantas) {
            if (id == planta.id){
                idIndex = plantas.indexOf(planta);
            }
        }
        plantas.remove(idIndex);
        return null;
    }

    @Override
    public ArrayList<Planta> readAll() {
        return plantas;
    }
}
