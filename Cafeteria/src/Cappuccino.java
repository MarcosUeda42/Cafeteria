public class Cappuccino implements Pedido {
    private double valor;

    public Cappuccino() {
        this.valor = 5.00; 
    }

    @Override
    public double getValor() {
        return valor;
    }

}
