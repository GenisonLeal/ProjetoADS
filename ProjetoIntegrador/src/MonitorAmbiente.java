import java.util.ArrayList;
import java.util.List;

public class MonitorAmbiente {
    private List<Sensor> sensores; // Lista de sensores monitorados

    public MonitorAmbiente() {
        this.sensores = new ArrayList<>();
    }

    public void adicionarSensor(Sensor sensor) {
        sensores.add(sensor);
    }

    public void exibirValores() {
        System.out.println("Leitura dos Sensores:");
        for (Sensor sensor : sensores) {
            float valor = sensor.lerValor();
            System.out.printf("%s: %.2f\n", sensor.getNome(), valor);
        }
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        // Criação do monitor de ambiente
        MonitorAmbiente monitor = new MonitorAmbiente();

        // Adicionando sensores fictícios
        monitor.adicionarSensor(new Sensor("Temperatura (°C)", 15, 40)); // Temperatura entre 15°C e 40°C
        monitor.adicionarSensor(new Sensor("Umidade (%)", 0, 100));      // Umidade entre 0% e 100%
        monitor.adicionarSensor(new Sensor("Luminosidade", 0, 1023));   // Luminosidade entre 0 e 1023

        // Simulação de leituras dos sensores
        for (int i = 0; i < 5; i++) { // Exibe 5 leituras fictícias
            monitor.exibirValores();

            try {
                Thread.sleep(2000); // Intervalo de 2 segundos entre leituras
            } catch (InterruptedException e) {
                System.err.println("Erro na pausa da execução: " + e.getMessage());
            }
        }
    }
}