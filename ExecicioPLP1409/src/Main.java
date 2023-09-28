public class Main {
    public static void main(String[] args) {
        ControlePS5 controle = new ControlePS5();
        SensorPS5 sensor = new AdaptadorPS5ParaXbox2();

        controle.usarSensorPS5(sensor);
    }
}
