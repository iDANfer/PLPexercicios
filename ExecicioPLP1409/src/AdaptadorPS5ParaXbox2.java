public class AdaptadorPS5ParaXbox2 extends SensorXbox2 implements SensorPS5 {
    @Override
    public void conectarAoPS5() {
        conectarAoXbox2(); // Reutiliza a lógica de conectarAoXbox2 para se conectar ao PS5
    }
}
