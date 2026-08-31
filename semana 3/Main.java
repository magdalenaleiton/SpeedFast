package speedfast;

public class Main {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("       SISTEMA SPEEDFAST");
        System.out.println("====================================");

        ControladorDeEnvios controlador = new ControladorDeEnvios();

        PedidoComida comida = new PedidoComida(
                101,
                "Av. Argentina 1250",
                4
        );

        PedidoEncomienda encomienda = new PedidoEncomienda(
                102,
                "Av. Santa Rosa 567",
                7
        );

        PedidoExpress express = new PedidoExpress(
                103,
                "Av. Brasil 850",
                3
        );

        controlador.agregarPedido(comida);
        controlador.agregarPedido(encomienda);
        controlador.agregarPedido(express);

        System.out.println("\n[PEDIDO COMIDA]");

        comida.asignarRepartidor();
        comida.mostrarResumen();
        controlador.reservarPedido(comida);
        controlador.despacharPedido(comida);

        System.out.println("\n[PEDIDO ENCOMIENDA]");

        encomienda.asignarRepartidor();
        encomienda.asignarRepartidor("Sofia Godoy");
        encomienda.mostrarResumen();
        controlador.reservarPedido(encomienda);
        controlador.despacharPedido(encomienda);

        System.out.println("\n[PEDIDO EXPRESS]");

        express.asignarRepartidor();
        express.mostrarResumen();
        controlador.cancelarPedido(express);

        System.out.println("\n[POLIMORFISMO]");

        Pedido[] pedidos = {
            comida,
            encomienda,
            express
        };

        for (Pedido pedido : pedidos) {
            System.out.println(
                    pedido.getClass().getSimpleName()
                    + " -> "
                    + pedido.calcularTiempoEntrega()
                    + " minutos"
            );
        }

        controlador.verHistorial();

        System.out.println("\n[INTERFACES]");

        Despachable despachable = comida;
        despachable.despachar();

        Cancelable cancelable = express;
        cancelable.cancelar();

        Rastreable rastreable = encomienda;
        rastreable.verHistorial();

        System.out.println("\n====================================");
        System.out.println("       FIN DEL SISTEMA");
        System.out.println("====================================");
    }
}