# Conta
package contaBancaria;

public class Conta {
    //atributos que todo conta tem

    int numero;
    String dono;
    String saldo;
    double limite;

    //método que saca uma determinada quantidade.
    boolean saca(String string) {
        if (this.saldo < string) {
            return false;

        } else {
            this.saldo = this.saldo - string;
            return true;
        }
    } //fim do método saca.

    //método que deposita uma quantia.
    void deposita(String string) {
        double valor;
        this.saldo += valor; //ou this.saldo = saldo + valor;
        //*soma quantidade ao valor antigo do saldo */
        // e guarda no próprio saldo.
    } //fim da classe conta.
    
}
