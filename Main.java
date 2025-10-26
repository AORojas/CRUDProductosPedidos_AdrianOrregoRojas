package Pre_Entrega;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductoService productoService = new ProductoService();
        PedidoService pedidoService = new PedidoService();

        int opcion;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Agregar producto");
            System.out.println("2. Listar productos");
            System.out.println("3. Buscar/Actualizar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Crear pedido");
            System.out.println("6. Listar pedidos");
            System.out.println("7. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Precio: ");
                    double precio = sc.nextDouble();
                    System.out.print("Stock: ");
                    int stock = sc.nextInt();
                    productoService.agregarProducto(new Producto(id, nombre, precio, stock));
                    break;

                case 2:
                    for (Producto p : productoService.listarProductos())
                        System.out.println(p);
                    break;

                case 3:
                    System.out.print("ID del producto: ");
                    int idBuscado = sc.nextInt();
                    Producto p = productoService.buscarPorId(idBuscado);
                    if (p != null) {
                        System.out.print("Nuevo nombre: ");
                        sc.nextLine();
                        p.setNombre(sc.nextLine());
                        System.out.print("Nuevo precio: ");
                        p.setPrecio(sc.nextDouble());
                        System.out.print("Nuevo stock: ");
                        p.setStock(sc.nextInt());
                    } else System.out.println("No encontrado.");
                    break;

                case 4:
                    System.out.print("ID del producto: ");
                    int idDel = sc.nextInt();
                    if (productoService.eliminarProducto(idDel)) System.out.println("Eliminado.");
                    else System.out.println("No existe.");
                    break;

                case 5:
                    System.out.print("ID del pedido: ");
                    int idPedido = sc.nextInt();
                    Pedido pedido = new Pedido(idPedido);

                    int seguir;
                    do {
                        System.out.print("ID del producto: ");
                        int idProd = sc.nextInt();
                        System.out.print("Cantidad: ");
                        int cant = sc.nextInt();

                        Producto prod = productoService.buscarPorId(idProd);
                        if (prod != null && prod.getStock() >= cant) {
                            pedido.agregarLinea(prod, cant);
                            prod.setStock(prod.getStock() - cant);
                        } else {
                            System.out.println("No existe o stock insuficiente.");
                        }
                        String opcionSeguir;
                        do {
                            System.out.print("Agregar otro? (1=Si / 0=No): ");
                            opcionSeguir = sc.next(); // lee texto
                            if (!opcionSeguir.equals("1") && !opcionSeguir.equals("0")) {
                                System.out.println("Opción inválida. Por favor ingrese 1 o 0.");
                            }
                        } while (!opcionSeguir.equals("1") && !opcionSeguir.equals("0"));

                        seguir = Integer.parseInt(opcionSeguir);
                    } while (seguir == 1);

                    pedidoService.agregarPedido(pedido);
                    System.out.println("Pedido creado.");
                    break;

                case 6:
                    for (Pedido ped : pedidoService.listarPedidos())
                        System.out.println(ped + "\n");
                    break;
            }
        } while (opcion != 7);

        System.out.println("Saliendo...");
        sc.close();
    }
    }
