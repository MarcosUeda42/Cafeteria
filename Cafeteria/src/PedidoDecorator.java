public class PedidoDecorator implements Pedido {
    protected Pedido pedido;

    public PedidoDecorator(Pedido pedido) {
        this.pedido = pedido;
    }

    public double getValor() {
        return pedido.getValor();
    }
}
