package br.com.am;

public class PerceptronApplication {

    private float[] w;
    private float b;

    public PerceptronApplication() {

        float limiar = 0;
        float w[] = new float[64]; //Um peso para cada entrada.
        float target [] = {-1, 1}; //Duas possíveis saídas.
        float alfa = 0.01F;//taxa de aprendizagem 0<X<=1.
        float yLiq =0;
        int contCiclo=0;
        float y;
        int lin, col;
        int condErro=1;
        float teste;

        float[][] entrada = new float[2][64]; // 64 valores e dois padrões (A e B).

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

        // Aplicação da regra Perceptron
        while (condErro == 1) {
            condErro = 0;
            lin = 0;
            while (lin < 2) {
                yLiq = 0;
                col = 0;
                while(col<64){
                    yLiq = yLiq + (entrada[lin][col]*w[col]);
                    col++;
                }
                yLiq = yLiq + this.b;
                if (yLiq>=limiar) {
                    y = 1;
                }else {
                    y = -1;
                }

                if(y != target[lin]){
                    condErro = 1;
                    col = 0;
                    while(col<64){
                        w[col] = w[col ] + (alfa * target[lin] * entrada[lin][col]);
                        col++;
                    }
                    this.b = this.b + (alfa * target[lin]);
                }
                lin++;
            }
            contCiclo++;
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
