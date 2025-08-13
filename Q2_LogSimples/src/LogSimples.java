import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LogSimples implements Iterable<String>{
    static LogSimples instance;
    List<String> mensagens;

    private LogSimples(){
        mensagens = new LinkedList<>();
    }

    static public LogSimples getInstance() {
        if(instance == null) {
            instance = new LogSimples();
        }
        return instance;
    }

    public void log(String m){
        String logM = LocalDate.now().toString() + " : " + m;
        instance.mensagens.add(logM);
    }

    @Override
    public Iterator<String> iterator() {
        return instance.mensagens.iterator();
    }
}
