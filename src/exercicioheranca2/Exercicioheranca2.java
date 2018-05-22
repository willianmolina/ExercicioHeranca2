package exercicioheranca2;


public class Exercicioheranca2 {

  
    public static void main(String[] args) {
        /*
            Instanciação do meu novo objeto da subclasse, onde serão passados os
            parametros desejados;
        */        
      Estudante aluno = new Estudante("Willian",18,"Masculino",120175);
      aluno.imprimir();//ordem para que a minha função 'imprimir' seja executada;
      
    }    
}
