public class Conta {


    private int numero;

    private String Agencia;

    private String nomeCliente;

    private double saldo;


    public Conta() {

    }

    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return Agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setAgencia(String agencia) {
        Agencia = agencia;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    @Override
    public String toString() {
        return "Olá " +
                this.getNomeCliente() +
                " obrigado por criar uma conta em nosso banco, sua agência é "
                + this.getAgencia() +
                ", conta " +
                this.getNumero() +
                ". já está disponível para saque. " + "Seu saldo atual, é: " + this.getSaldo();
    }

    public void depositar(double i) {
        this.saldo = i;
        System.out.println("Valor depositado " + saldo);
    }

}
