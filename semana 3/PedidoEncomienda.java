package speedfast;

public class PedidoEncomienda extends Pedido {

    public PedidoEncomienda(int numero, String direccion, double distanciaKm) {
        super(numero, direccion, distanciaKm);
    }

    @Override
    public void asignarRepartidor() {
        if (distanciaKm <= 8) {
            repartidorAsignado = "Sofia Godoy";
        } else {
            repartidorAsignado = "Jorge Silva";
        }

        System.out.println("Repartidor asignado automaticamente: "
                + repartidorAsignado);
    }

    @Override
    public int calcularTiempoEntrega() {
        return 25 + (int) (distanciaKm * 2);
    }
}