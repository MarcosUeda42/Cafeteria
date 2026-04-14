public class Cha implements Pedido {
    private double valor;

    public Cha() {
        this.valor = 2.50;
    }

    @Override
    public double getValor() {
        return valor;
    }
}
