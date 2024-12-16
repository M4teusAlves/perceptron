package br.com.am;

public class PerceptronApplication {

    private float[] w;
    private float b;

    public PerceptronApplication() {
        float[][] entrada = new float[2][64]; // 64 valores e dois padrões (A e B).
        float[] y = {1, -1}; // O 1 é para A e -1 é para B.
        float[] deltaW = new float[64];
        float deltaB, deltaTeste;
        int[] teste = new int[2];

        this.b = 0;

        this.w = new float[64];

        System.out.println("\nPrograma Regra de Hebb para reconhecimento de A e B");

        // Inicialização dos valores
        for (int cont2 = 0; cont2 < 64; cont2++) {
            this.w[cont2] = 0;
            entrada[0][cont2] = -1;
            entrada[1][cont2] = -1;
        }

        // Inserção de dados da letra A (entrada)
        entrada[0][3] = entrada[0][10] = entrada[0][12] = entrada[0][18] = entrada[0][20] = 1;
        entrada[0][25] = entrada[0][29] = entrada[0][33] = entrada[0][34] = entrada[0][35] = 1;
        entrada[0][36] = entrada[0][37] = entrada[0][41] = entrada[0][45] = entrada[0][49] = 1;
        entrada[0][53] = entrada[0][57] = entrada[0][61] = 1;

        // Inserção de dados da letra B (entrada)
        entrada[1][9] = entrada[1][10] = entrada[1][11] = entrada[1][17] = entrada[1][19] = 1;
        entrada[1][25] = entrada[1][26] = entrada[1][33] = entrada[1][34] = 1;
        entrada[1][43] = entrada[1][49] = entrada[1][51] = entrada[1][57] = entrada[1][58] = 1;
        entrada[1][59] = 1;

        // Aplicação da regra de Hebb
        for (int cont1 = 0; cont1 < 2; cont1++) {
            for (int cont2 = 0; cont2 < 64; cont2++) {
                deltaW[cont2] = entrada[cont1][cont2] * y[cont1];
            }
            deltaB = y[cont1];

            for (int cont2 = 0; cont2 < 64; cont2++) {
                this.w[cont2] = this.w[cont2] + deltaW[cont2];
            }
            this.b = this.b + deltaB;
        }




        //System.out.println("\nSaída esperada:    1(A)   -1(B)");
        //System.out.println("Saída encontrada:  " + teste[0] + "      " + teste[1] + "\n\n");



    }

    public float[] getW() {
        return w;
    }

    public void setW(float[] w) {
        this.w = w;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }
}
