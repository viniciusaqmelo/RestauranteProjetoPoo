public class App {
    public static void main(String[] args) throws Exception {
        Mesa mesa1 = new Mesa(1, true);  
        Mesa mesa2 = new Mesa(2, false); 
        
        mesa1.verificar_mesa_vazia();  
        mesa2.verificar_mesa_vazia(); 

        
        mesa1.ocuparMesa();  
        mesa1.ocuparMesa();  
        mesa2.desocuparMesa();  
        mesa2.desocuparMesa();

        ArrayList<Pedido> listaPedidos = new ArrayList<>();

        Pedido pedido1 = new Pedido("Pizza Margherita", 1, false);
        Pedido pedido2 = new Pedido("Hambúrguer", 2, true);
        Pedido pedido3 = new Pedido("Salada", 3, true);

        listaPedidos.add(pedido1);
        listaPedidos.add(pedido2);
        listaPedidos.add(pedido3);

        pedido1.verificar_estado_pedido();
        pedido2.verificar_estado_pedido();
        pedido3.verificar_estado_pedido();

        retirarPedido(listaPedidos, 1);
        retirarPedido(listaPedidos, 2);
        retirarPedido(listaPedidos, 3);

        retirarPedido(listaPedidos, 2);
    }
}