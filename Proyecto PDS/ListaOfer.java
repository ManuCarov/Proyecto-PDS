import java.util.ArrayList;
public class ListaOfer {
    private ArrayList<Ofertas> ofertas;

    public ListaOfer(){
        this.ofertas = new ArrayList<Ofertas>();
    }

    public void agregarOfertas(Ofertas item) {
        ofertas.add(item);
    }

}
