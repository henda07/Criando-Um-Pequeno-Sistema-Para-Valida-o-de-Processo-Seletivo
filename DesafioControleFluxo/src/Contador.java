import tech.cbm.dio.fluxo.model.ContadorModel;

public class Contador {
    public static void main(String[] args) throws Exception {
        ContadorModel model = new ContadorModel();

        model.getDadosFromTerminal();
        model.contar();
    }
}
