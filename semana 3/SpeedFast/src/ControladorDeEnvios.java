package speedfast;

import java.util.ArrayList;

public class ControladorDeEnvios implements Despachable, Cancelable, Rastreable {

    private ArrayList<Pedido> pedidos;
    private ArrayList<Pedido> historialEntregas;

    public ControladorDeEnvios() {
        pedidos = new ArrayList<>();
        historialEntregas = new ArrayList<>();
    }

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void reservarPedido(Pedido pedido) {
        pedido.reservar();
    }

    public void despacharPedido(Pedido pedido) {
        pedido.despachar();

        if (!historialEntregas.contains(pedido)) {
            historialEntregas.add(pedido);
        }
    }

    public void cancelarPedido(Pedido pedido) {
        pedido.cancelar();
    }

    @Override
    public void despachar() {
        System.out.println("Despachando pedidos...");

        for (Pedido pedido : pedidos) {
            if (!pedido.isCancelado()) {
                pedido.despachar();

                if (!historialEntregas.contains(pedido)) {
                    historialEntregas.add(pedido);
                }
            }
        }
    }

    @Override
    public void cancelar() {
        System.out.println("Cancelando pedidos...");

        for (Pedido pedido : pedidos) {
            pedido.cancelar();
        }
    }

    @Override
    public void verHistorial() {
        System.out.println("\n===== HISTORIAL DE ENTREGAS =====");

        for (Pedido pedido : historialEntregas) {
            pedido.verHistorial();
        }
    }
}