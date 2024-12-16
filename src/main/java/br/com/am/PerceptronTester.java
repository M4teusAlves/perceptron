package br.com.am;

public class PerceptronTester {

    private float[] w;
    private float b;

    // Construtor para inicializar os pesos e o bias
    public PerceptronTester(float[] w, float b) {
        this.w = w;
        this.b = b;
    }

    // Metodo para realizar o teste com uma única matriz de entrada
    public int testar(float[] entrada) {

        // Realizar o teste com a matriz de entrada
        float deltaTeste = 0; // Somatório
        for (int cont2 = 0; cont2 < 64; cont2++) {
            deltaTeste += w[cont2] * entrada[cont2];
        }
        deltaTeste += b;

        // Retorna o resultado do teste
        if (deltaTeste >= 0) {
            return 1; // Isso é um A
        } else {
            return -1; // Isso é um B
        }
    }

}
