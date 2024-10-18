import java.util.UUID;


public class Aluno
{
    //Atributos
    private String nome;
    private int idade;
    private String endereco;
    private UUID uuid;


    // Getters e Setters
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


    public String getEndereco() {
        return endereco;
    }


    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public UUID getUuid() {
        return uuid;
    }
    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }


    // Construtor
    Aluno (String nome, int idade, String endereco, UUID uuid)
    {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.uuid = uuid;
    }
}
