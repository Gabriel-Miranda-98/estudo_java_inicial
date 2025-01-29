import java.util.Date;

import exercicios.ContaCorrente;

public class App {
    public static void main(String[] args) throws Exception {
       ContaCorrente conta1 = new ContaCorrente(123, 456, "Fulano", new Date(), 1000);
         ContaCorrente conta2 = new ContaCorrente(456, 789, "Ciclano", new Date(), 2000);
            conta1.sacar(500);
            conta1.transferir(conta2, 200);
            conta1.cancelarConta("Fulano pediu");
            conta1.extratoPorPeriodo(new Date(), new Date());
            conta1.saldoAtual();
    }
}
