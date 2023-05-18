package interfaces;

public interface Repositorio {
    void guardar (Pessoa pessoa);
    Pessoa recupera(String CPF);
    Pessoa primeiro();
    Pessoa proximo();
}
