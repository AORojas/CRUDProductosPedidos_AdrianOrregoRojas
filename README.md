# Sistema CRUD de Productos y Gestión de Pedidos

Este proyecto es una aplicación **Java por consola** que permite administrar productos y crear pedidos, aplicando conceptos de POO como:
- Clases y Objetos
- Composición (Pedido contiene múltiples productos)
- Encapsulamiento (getters/setters)
- Listas dinámicas (`ArrayList`)
- Menú interactivo repetitivo
- Validación básica de entradas

---

## 🧱 Estructura del Proyecto
Pre_Entrega/
├─ Producto.java
├─ LineaPedido.java
├─ Pedido.java
├─ ProductoService.java
├─ PedidoService.java
└─ Main.java

---

## 📝 Funcionalidades

| Función                                | Descripción |
|----------------------------------------|-------------|
| Agregar Producto                       | Permite registrar un nuevo producto con ID, nombre, precio y stock. |
| Listar Productos                       | Muestra todos los productos almacenados. |
| Buscar / Actualizar Producto           | Localiza un producto por ID y permite modificarlo. |
| Eliminar Producto                      | Elimina un producto por su ID. |
| Crear Pedido                           | Permite seleccionar productos, cantidades y genera un pedido. Descuenta stock. |
| Listar Pedidos                         | Muestra todos los pedidos realizados con total calculado. |
| Salir                                  | Finaliza la aplicación. |

---

## 🧮 Ejemplo de Ejecución (Menú)

===== MENU =====

1. Agregar producto 
2. Listar productos 
3. Buscar/Actualizar producto 
4. Eliminar producto 
5. Crear pedido 
6. Listar pedidos 
7. Salir
