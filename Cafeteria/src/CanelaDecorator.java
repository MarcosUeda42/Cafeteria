public class CanelaDecorator extends PedidoDecorator {
    public CanelaDecorator(Pedido pedido) {
        super(pedido);
    }

    @Override
    public double getValor() {
        return super.getValor() + 1; 
    }
}
