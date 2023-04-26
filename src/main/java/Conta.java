import java.math.BigDecimal;

public class Conta {


    private int numero;

    private String Agencia;

    private String nomeCliente;

    private BigDecimal saldo;


    public Conta() {

    }

    public Conta(int numero, String agencia, String nomeCliente, BigDecimal saldo) {
        this.numero = numero;
        Agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return Agencia;
    }

    public BigDecimal getSaldo() {
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

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Olá" +
                this.getNomeCliente() +
                "obrigado por criar uma conta em nosso banco,sua agência é"
                + this.getAgencia() +
                ", conta" +
                this.getNumero() +
                "já está disponível para saque";
    }
}
