public class Principal {

    public static void main(String[] args) {

        Livro l1 = new Livro();
        l1.nome = "A LUNETA AMBAR";
        l1.autor = "Phillip Pullman";
        l1.anoescrito = 2013;
        l1.numfolhas = 500;
        l1.capadura = false;
        l1.aberto();
        l1.status();
        l1.rabiscar();

        System.out.println("\n");

        Livro l2 = new Livro();
        l1.nome = "A FACA SUTIL";
        l1.autor = "Phillip Pullman";
        l1.anoescrito = 2014;
        l1.numfolhas = 640;
        l1.capadura = true;
        l1.fechado();
        l1.status();
        l1.rabiscar();




    }
}
