package contaBancaria;

public class Programa {
    //método principal.
    public static void main(String[] args) {
        //criando a conta
        //variável minha conta do tipo conta.
        Conta minhaConta;
        minhaConta = new Conta(); //ou pode ser tbem Conta minhaConta

        //alterando os valores de minhaConta.
        minhaConta.dono = "Poliane";
        minhaConta.saldo = "1234567";

        //verificar saldo atual
        System.out.println("Saldo atual é: " + minhaConta.saldo);

        //saca quanto quiser
        minhaConta.saca("1234567");
        System.out.println(minhaConta.saldo);

        //deposita 1234567 reaias
        minhaConta.deposita("1234567");
        System.out.println(minhaConta.saldo);
    }
}
