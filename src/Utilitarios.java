import java.util.ArrayList;
import java.util.List;
import interfaces.Pessoa;


public class Utilitarios {
    public static void duplicar(Repositorio A, Repositorio B){
        B.setLista(A.getLista());
    }

    public static void diferenciar(Repositorio A, Repositorio B, Repositorio C){
        List<Pessoa> listaC = new ArrayList<>();

        int i = 0;
        for(Pessoa p1: A.getLista()){
            i = 0;
            for(Pessoa p2: B.getLista()){
                if(p1.getCPF().equals(p2.getCPF())){
                    i++;
                }
            }
            if(i == 0){
                listaC.add(p1);
            }
        }

        C.setLista(listaC);
    }
}
