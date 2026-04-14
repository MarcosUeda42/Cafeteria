public class CaldaChocolate extends PedidoDecorator {
    public CaldaChocolate(Pedido pedido) {
        super(pedido);
    }

    @Override
    public double getValor() {
        return super.getValor() + 2.00; 
    }
    
}
