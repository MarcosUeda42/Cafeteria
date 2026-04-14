public class ChantillyDecorator extends PedidoDecorator {
    public ChantillyDecorator(Pedido pedido) {
        super(pedido);
    }

    @Override
    public double getValor() {
        return super.getValor() + 1.50; 
    }
    
}
