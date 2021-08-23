import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) throws IOException {
        Boolean perguntas = false;
        Scanner sc = new Scanner(System.in);
        Colaborador col1 = new Colaborador("Teste",12345);

        System.out.println("Terminou o colegial: ");
        perguntas = sc.hasNextBoolean();

        if (perguntas == true){
            col1.getEscola();
        }else{
            System.out.println(col1);
        };

        System.out.println("Terminou o Superior: ");
        if (perguntas == true){
            col1.getUniversidade();
        }else{
            System.out.println(col1);
        };
    }
}

class Colaborador{
    private String nome;
    private int matricula;
    private String escola;
    private String Universidade;

    public Colaborador(String nome, int matricula ){
        this.nome = nome;
        this.matricula = matricula;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public void setUniversidade(String universidade) {
        Universidade = universidade;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getEscola() {
        return escola;
    }

    public String getUniversidade() {
        return Universidade;
    }

}
