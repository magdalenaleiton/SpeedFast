package speedfast;

public abstract class Pedido implements Despachable, Cancelable, Rastreable {

    protected int numero;
    protected String direccion;
    protected double distanciaKm;
    protected String repartidorAsignado;
    protected boolean reservado;
    protected boolean despachado;
    protected boolean cancelado;

    public Pedido(int numero, String direccion, double distanciaKm) {
        this.numero = numero;
        this.direccion = direccion;
        this.distanciaKm = distanciaKm;
        this.repartidorAsignado = "Sin asignar";
        this.reservado = false;
        this.despachado = false;
        this.cancelado = false;
    }

    public void mostrarResumen() {
        System.out.println("Pedido #" + numero);
        System.out.println("Direccion: " + direccion);
        System.out.println("Distancia: " + distanciaKm + " km");
        System.out.println("Repartidor asignado: " + repartidorAsignado);
        System.out.println("Tiempo estimado: "
                + calcularTiempoEntrega() + " minutos");
    }

    public abstract int calcularTiempoEntrega();

    public abstract void asignarRepartidor();

    public void asignarRepartidor(String nombre) {
        repartidorAsignado = nombre;
        System.out.println("Repartidor asignado manualmente: " + nombre);
    }

    public void reservar() {
        reservado = true;
        System.out.println("Pedido #" + numero + " reservado correctamente.");
    }

    public boolean isCancelado() {
        return cancelado;
    }

    @Override
    public void despachar() {
        if (cancelado) {
            System.out.println("No se puede despachar un pedido cancelado.");
            return;
        }

        despachado = true;
        System.out.println("Pedido #" + numero + " despachado correctamente.");
    }

    @Override
    public void cancelar() {
        if (despachado) {
            System.out.println("El pedido #" + numero
                    + " ya fue despachado y no puede cancelarse.");
            return;
        }

        cancelado = true;
        System.out.println("Pedido #" + numero + " cancelado exitosamente.");
    }

    @Override
    public void verHistorial() {
        System.out.println("Pedido #" + numero
                + " - Repartidor: " + repartidorAsignado);
    }
}