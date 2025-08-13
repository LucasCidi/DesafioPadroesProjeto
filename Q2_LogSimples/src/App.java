public class App {
    public static void main(String[] args) throws Exception {
        LogSimples.getInstance();
        LogSimples.getInstance().log("Mensagem de alerta 1");
        LogSimples.getInstance().log("Mensagem de alarme 23");
        LogSimples.getInstance().log("Mensagem de PANICO!!");

        for(String m:LogSimples.instance.mensagens){
            System.out.println(m);
        }
    }
}
