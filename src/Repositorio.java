import java.util.ArrayList;
import java.util.List;

import interfaces.Pessoa;

public class Repositorio implements interfaces.Pessoa.Repositorio {

    List<Pessoa> lista;
    int posicao = 0;

    public void Respositorio(){
        this.lista = new ArrayList<>();
    }

    public void guarda (Pessoa pessoa) {
       lista.add(pessoa);
    }

    public Pessoa recupera (String cpf) {
        for(Pessoa p : lista){
            if(cpf.equals(p.getCPF())){
                return p;
            }
        }
        
        return null;
    }

    public Pessoa primeiro(){
        return lista.get(0);
    }

    public Pessoa proximo(){
        this.posicao ++;
        return lista.get(posicao);
    }

    public List<Pessoa> getLista() {
        return lista;
    }

    public void setLista(List<Pessoa> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return String.format("Repositorio - >" +
                "lista - >" + lista);
    }
    
}
