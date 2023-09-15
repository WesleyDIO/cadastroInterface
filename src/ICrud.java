import java.util.ArrayList;

public interface ICrud <ID, T>{

    T create(T novoObjeto);
    T read(int id);
    T update(int id, T objetoAtualizado);
    T delete( int id);

    ArrayList<T> readAll();
}
