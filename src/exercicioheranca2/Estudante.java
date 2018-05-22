package exercicioheranca2;

/*
    Criação da classe 'Estudante'/subclasse, que herdará os atributos/métodos da
    classe super/ 'Pessoa';
*/
public class Estudante extends Pessoa{
    
//Criado um parametro a parte, que irá pertencer somente a esta subclasse;
    private int RA;
   
   //Criação do construtor que irá acessar os atributos da minha superclasse;  
    public Estudante(String nome, int idade, String sexo, int RA) {
/*
    Para que os atributos sejam acessados, é necessario o 'operador' super, para 
    que só assim, eu consiga acessar o construtor da superclasse;
*/
        super(nome,idade,sexo);//acessando o construtor da superclasse;
        //Inicializando os elementos da superclasse;
        super.setNome(nome);
        super.setIdade(idade);
        super.setSexo(sexo);
        
        this.RA = RA;//Definindo o atributo da minha subclasse;
        
    }
    
   
    
    
    @Override
    public void imprimir(){
        /*
            Para que eu consiga acessar um metodo da superclasse, a utilização do
            super ocorre da mesma maneira com a mesma ideia do visto logo acima;
        */
        super.imprimir();
        /*
            Alem dos parametros a serem mostrados ao usuario na minha subclasse,
            tambem será passado agora, para que seja mostrado o atributo 'RA';
        */
        System.out.println("RA: "+RA);
    }
    
   //Criação dos getters e setters do atributo private desta subclasse;
    public int getRA() {
        return RA;
    }

  
    public void setRA(int RA) {
        this.RA = RA;
    }
    
    
    
}
