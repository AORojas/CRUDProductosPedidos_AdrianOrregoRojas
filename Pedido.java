package Pre_Entrega;
import java.util.ArrayList;

public class Pedido {
    private int id;
    private ArrayList<LineaPedido> lineas = new ArrayList<>();

    public Pedido(int id) {
        this.id = id;
    }

    public void agregarLinea(Producto p, int cantidad) {
        lineas.add(new LineaPedido(p, cantidad));
    }

    public double calcularTotal() {
        double total = 0;
        for (LineaPedido lp : lineas) {
            total += lp.getSubtotal();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Pedido #" + id + "\n");
        for (LineaPedido lp : lineas) {
            sb.append(" - ").append(lp).append("\n");
        }
        sb.append("TOTAL: $").append(calcularTotal());
        return sb.toString();
    }
}
