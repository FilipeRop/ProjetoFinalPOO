public class Pessoa implements interfaces.Pessoa{
    private String nome;
    private String cpf;
    private char tipo;

    public Pessoa(){
    }

    public Pessoa(String nome, String cpf, int cadeira){
        this.nome = nome;
        this.cpf = cpf;
        this.tipo = getTipo(cadeira);
    }

    @Override
    public String getCPF() {
        // TODO Auto-generated method stub
        return this.cpf;
    }

    @Override
    public String getNome() {
        // TODO Auto-generated method stub
        return this.nome;
    }

    @Override
    public char getTipo(int numCadeira) {
        // TODO Auto-generated method stub
        if (numCadeira <= 8){
            return 'F';
        }else{
            return 'N';
        }
    }

    @Override
    public String toString(){
        return String.format("\nPESSOA - >" +
        "NOME - >'" + nome + '\'' +
        "CPF - >'" + cpf + '\'' +
        "TIPO - >" + tipo);
    }

    
}
