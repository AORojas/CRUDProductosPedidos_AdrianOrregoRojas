package Pre_Entrega;
import java.util.ArrayList;

public class ProductoService {
    private ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public Producto buscarPorId(int id) {
        for (Producto p : productos) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    public boolean eliminarProducto(int id) {
        Producto p = buscarPorId(id);
        if (p != null) return productos.remove(p);
        return false;
    }

    public ArrayList<Producto> listarProductos() {
        return productos;
    }
}
