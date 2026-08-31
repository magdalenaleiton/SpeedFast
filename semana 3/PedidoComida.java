package speedfast;

public class PedidoComida extends Pedido {

    public PedidoComida(int numero, String direccion, double distanciaKm) {
        super(numero, direccion, distanciaKm);
    }

    @Override
    public void asignarRepartidor() {
        if (distanciaKm <= 5) {
            repartidorAsignado = "Marcelo Peres";
        } else {
            repartidorAsignado = "Luis Diaz";
        }

        System.out.println("Repartidor asignado automaticamente: "
                + repartidorAsignado);
    }

    @Override
    public int calcularTiempoEntrega() {
        return 20 + (int) (distanciaKm * 3);
    }
}