public class Pedido {
    private String descricao;
    private int numero;
    private boolean estado;

    public Pedido(String descricao, int numero, boolean estado){
        this.descricao=descricao;
        this.numero=numero;
        this.estado=estado;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero=numero;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao=descricao;
    }

    public void verificarPedido(){
        if(estado==true){
            System.out.println("Pedido está pronto.");
        }
        else{
            System.out.println("Pedido em preparação!");
        }
    }

    public void registrarPedido(ArrayList<Pedido> listaPedidos, Pedido novoPedido){
        listaPedidos.add(novoPedido);
        Sysytem.out.println("Pedido registrado: "+novoPedido.getDescricao());
    }

    public void retirarPedido(ArrayList<Pedido> listaPedidos, int numeroPedido){
        for(int i=0; i<listaPedidos.size();i++){
            Pedido pedido=listaPedidos.get(i);
            if(pedido.getNumero()==numeroPedido){
                if(pedido.estado){
                    listaPedido.remove(i);
                    System.out.println("Pedido "+numeroPedido+" retirado com sucesso");
                }
                else{
                    System.out.println("Pedido "+numeroPedido+" ainda nao esta pronto");
                }
                return;
            }
        }
        System.out.println("Pedido nao encontrado");
    }
}