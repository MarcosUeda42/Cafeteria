public class App {
    public static void main(String[] args) throws Exception {
        Pedido CE = new LeiteDecorator(new CafeExpresso());
        System.out.println("Valor do pedido: " + CE.getValor());
        
        Pedido CC = new CanelaDecorator(new Cappuccino());
        System.out.println("Valor do pedido: " + CC.getValor());

        Pedido CH = new LeiteDecorator(new Cha());
        System.out.println("Valor do pedido: " + CH.getValor());

        Pedido tudo = new CaldaChocolate(new CanelaDecorator(new ChantillyDecorator(new LeiteDecorator(new Cappuccino()))));
        System.out.println("Valor do pedido: " + tudo.getValor());
    }
}
