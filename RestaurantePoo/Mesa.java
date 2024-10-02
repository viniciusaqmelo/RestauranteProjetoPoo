public class Mesa {
    private int numero;
    private boolean situacao;

    public Mesa(int numero, boolean situacao){
        this.numero=numero;
        this.situacao=situacao;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero=numero;
    }

    public void verificarMesa(){
        if(situacao==true){
            System.out.println("Mesa disponivel.");
        }
        else{
            System.out.println("Mesa ocupada!");
        }
    }

    public void ocuparMesa(){
        if(situacao){
            situacao=false;
            System.out.println("A mesa "+numero+" foi ocupada");
        }
        else{
            System.out.println("A mesa "+numero+" ja esta ocupada");
        }
    }

    public void desocuparMesa(){
        if(!situacao){
            situacao=true;
            System.out.println("A mesa "+numero+" foi desocupada");
        }
        else{
            System.out.println("A mesa "+numero+" ja esta disponivel");
        }
    }
}