package candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        analisarCandidatos(1900);
        analisarCandidatos(2200);
        analisarCandidatos(2000);

    }

    static void analisarCandidatos(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}
