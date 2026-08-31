package speedfast;

public class PedidoExpress extends Pedido {

    public PedidoExpress(int numero, String direccion, double distanciaKm) {
        super(numero, direccion, distanciaKm);
    }

    @Override
    public void asignarRepartidor() {
        if (distanciaKm <= 4) {
            repartidorAsignado = "Daniela Perez";
        } else {
            repartidorAsignado = "Matias Silva";
        }

        System.out.println("Repartidor asignado automaticamente: "
                + repartidorAsignado);
    }

    @Override
    public int calcularTiempoEntrega() {
        return 15 + (int) (distanciaKm * 2);
    }
}