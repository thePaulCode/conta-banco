public class ContaCliente {
    //Atributos da classe
    String agencia;
    int numeroConta;
    String nome, sobreNome;
    double saldo;

    //Construtor da classe
    public ContaCliente(String agencia, int numeroConta, String nome, String sobreNome, double saldo){

        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.saldo = saldo;

    }

    //Sobrescrever o método toString() para exibir as informações da conta
    @Override
    public String toString() {
        return "Olá " +this.nome+ ", obrigado por criar uma conta em nosso banco, sua agência é "+this.agencia+", conta "+this.numeroConta+" e seu saldo "+this.saldo+" já está disponível para saque.";
    }
    
}