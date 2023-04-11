public class Livro {


        String nome;
        String autor;

        int anoescrito;
        int numfolhas;
        boolean capadura;
        boolean lendo ;
        void status(){
            System.out.println("Nome do livro: " + this.nome);
            System.out.println("Nome do Autor: " + this.autor);
            System.out.println("Em que ano foi escrito: " + this.anoescrito);
            System.out.println("Quantas folhas tem; " + this.numfolhas);
            System.out.println("É Edição Capa dura: " + this.capadura);
            System.out.println("Você está lendo esse livro: " + this.lendo);
        }

        void aberto(){
            this.lendo = true;
        }

        void fechado(){
            this.lendo = false;
        }

        void rabiscar(){
            if(this.lendo == false){
                System.out.println("ERRO!!! Não posso rabiscar");
            }else{
                System.out.println("Estou rabiscando");
            }

        }
}


