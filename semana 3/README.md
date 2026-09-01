# Sistema SpeedFast

## Descripción

Sistema de gestión de pedidos desarrollado en Java aplicando conceptos de Programación Orientada a Objetos.

El sistema permite gestionar pedidos de comida, encomiendas y compras express, cada uno con reglas específicas para la asignación de repartidores y cálculo del tiempo de entrega.

## Tecnologías utilizadas

- Java
- NetBeans
- GitHub
- draw.io

## Estructura del sistema

El proyecto utiliza:

- Clase abstracta `Pedido`
- `PedidoComida`
- `PedidoEncomienda`
- `PedidoExpress`
- Interfaz `Despachable`
- Interfaz `Cancelable`
- Interfaz `Rastreable`
- `ControladorDeEnvios`
- Clase `Main`

## Conceptos de Programación Orientada a Objetos

### Abstracción

La clase `Pedido` es abstracta y contiene comportamientos comunes como `mostrarResumen()` y el método abstracto `calcularTiempoEntrega()`.

### Herencia

Las clases `PedidoComida`, `PedidoEncomienda` y `PedidoExpress` heredan de `Pedido`.

### Polimorfismo

Se utiliza sobrescritura de métodos para adaptar la asignación de repartidores y el cálculo del tiempo de entrega según el tipo de pedido.

También se utiliza sobrecarga mediante:

`asignarRepartidor(String nombre)`

### Interfaces

El sistema implementa las interfaces:

- `Despachable`: permite despachar pedidos.
- `Cancelable`: permite cancelar pedidos.
- `Rastreable`: permite consultar el historial de entregas.

## Funcionalidades

El sistema permite:

- Asignar repartidores automáticamente.
- Asignar repartidores manualmente.
- Calcular el tiempo estimado de entrega.
- Reservar pedidos.
- Despachar pedidos.
- Cancelar pedidos.
- Mostrar el historial de entregas.

## Diagrama de clases

El diseño del sistema se encuentra en el archivo:

`Diagrama_SpeedFast.drawio`
