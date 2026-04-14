public class CafeExpresso implements Pedido {
    private double valor;

    public CafeExpresso() {
        this.valor = 3.00; 
    }

    @Override
    public double getValor() {
        return valor;
    }
    
}
