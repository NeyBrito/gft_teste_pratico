import java.util.Scanner;

public class Exe3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean temCachorro = false;
        Moradores mor = new Moradores("Teste");
        System.out.println("Tem cachorro (0.Não | 1.Sim):");
        temCachorro = sc.hasNextBoolean();

        if (temCachorro == true){
            System.out.println("Entrega correspondencia.");
        }else{
            System.out.println("Não entrega correspondência");
        }


    }
}

class Moradores{
    public String nome;
    private String telefone;
    private int numResidencia;

    public Moradores(String nome){
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setNumResidencia(int numResidencia) {
        this.numResidencia = numResidencia;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public int getNumResidencia() {
        return numResidencia;
    }
}