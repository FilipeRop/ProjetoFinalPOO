public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa("Filipe", "55553232121", 1);

        Pessoa p2 = new Pessoa("Luana", "88883232121", 2);

        Pessoa p3 = new Pessoa("Luis", "55553232212", 3);

        Pessoa p4 = new Pessoa("Maria", "55559532121", 10);

        Repositorio rep1 = new Repositorio();
        rep1.guarda(p1);
        rep1.guarda(p2);
        rep1.guarda(p3);
        rep1.guarda(p4);

        Repositorio rep2 = new Repositorio();

        Utilitarios.duplicar(rep1, rep2);
        System.out.println(rep2);


        Repositorio rep3 = new Repositorio();

        Pessoa p5 = new Pessoa("Vitor", "55532532121", 4);
        Pessoa p6 = new Pessoa("Ariel", "55532533521", 5);
        Pessoa p7 = new Pessoa("Carol", "35532532121", 6);
        Pessoa p8 = new Pessoa("Rodolfo", "35532533535", 12);

        rep3.guarda(p5);
        rep3.guarda(p6);
        rep3.guarda(p7);
        rep3.guarda(p8);

        Repositorio rep4 = new Repositorio();
        rep4.guarda(p6);
        rep4.guarda(p7);
        rep4.guarda(p8);

        Repositorio rep5 = new Repositorio();

        Utilitarios.diferenciar(rep3, rep4, rep5);
        System.out.println(rep5);
    }
}
