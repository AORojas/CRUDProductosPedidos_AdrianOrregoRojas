package Pre_Entrega;
import java.util.ArrayList;

public class PedidoService {
    private ArrayList<Pedido> pedidos = new ArrayList<>();

    public void agregarPedido(Pedido p) {
        pedidos.add(p);
    }

    public ArrayList<Pedido> listarPedidos() {
        return pedidos;
    }
}
