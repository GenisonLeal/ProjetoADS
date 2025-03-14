import java.util.Random;

public class Sensor {
    private String nome; // Nome do sensor (ex.: Temperatura, Umidade)
    private float valorMin; // Valor mínimo do sensor
    private float valorMax; // Valor máximo do sensor
    private Random random;  // Gerador de números aleatórios

    public Sensor(String nome, float valorMin, float valorMax) {
        this.nome = nome;
        this.valorMin = valorMin;
        this.valorMax = valorMax;
        this.random = new Random();
    }

    public float lerValor() {
        // Gera um valor aleatório dentro do intervalo [valorMin, valorMax]
        return valorMin + random.nextFloat() * (valorMax - valorMin);
    }

    public String getNome() {
        return nome;
    }
}