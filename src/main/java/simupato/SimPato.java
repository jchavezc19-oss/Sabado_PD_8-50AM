package simupato;

public class SimPato {
    public static void main(String[] args) {
        Pato[] patos = { new PatoReal(), new PatoDeGoma(), new PatoSenuelo(), new PatoCabezaRoja() };
        for (Pato p : patos) {
            p.mostrar();
            p.realizarCuaqueo();
            p.realizarVuelo();
            p.nadar();
            System.out.println();
        }
    }
}
