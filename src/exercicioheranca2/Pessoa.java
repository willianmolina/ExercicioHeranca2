package exercicioheranca2;

/*Criação da Classe 'Pessoa'/superclasse, que será herdada posteriormente herdada
por outra classe
*/
public class Pessoa {
    private String nome;//Atributo nome;
    private int idade;//Atributo idade;
    private String sexo;//Atributo sexo;
    
//Criação do construtor desta superclasse;
    public Pessoa(String nome, int idade, String sexo){//Parametros passados dentro do construtor;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    //Criação dos getters e setters para os atributos privates desta classe;
    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }


    public String getSexo() {
        return sexo;
    }

    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

   //Criação do metodo que irá mostrar os atributos ao usuario;
    public void imprimir(){
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Sexo: "+sexo);
    }
     
}
