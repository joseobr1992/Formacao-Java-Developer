public class Main {
    public static void main(String[] args) {

        Cliente jose = new Cliente();
        Conta cc1 = new ContaCorrente(jose);
        jose.setNome("Jose");

        cc1.depositar(200);
        cc1.depositar(1500);
        cc1.imprimirExtrato();

        Cliente amanda = new Cliente();
        Conta cc2 = new ContaPoupanca(amanda);
        amanda.setNome("Amanda");

        cc1.transferir(cc2,1000);
        cc2.imprimirExtrato();
        cc1.imprimirExtrato();






    }
}