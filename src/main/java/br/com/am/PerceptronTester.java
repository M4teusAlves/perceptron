package br.com.am;

public class PerceptronTester {

    private float b;
    private float[] w;

    // Construtor para inicializar os pesos e o bias
    public PerceptronTester(float[] w, float b) {
        this.w = w;
        this.b = b;
    }

    // Metodo para realizar o teste com uma única matriz de entrada
    public int testar(float[] entrada) {

        float teste = 0;

        for(int i = 0; i<64; i++){
            teste = teste + (entrada[i] * this.w[i]);
        }

        teste = teste + b;

        if(teste >= 0)
        {
            return 1;
        }else{
            return -1;
        }
    }

}
