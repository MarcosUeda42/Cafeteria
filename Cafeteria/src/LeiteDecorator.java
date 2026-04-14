public class LeiteDecorator extends PedidoDecorator {
    public LeiteDecorator(Pedido pedido) {
        super(pedido);
    }

    @Override
    public double getValor() {
        return super.getValor() + 0.50; 
    }
}
