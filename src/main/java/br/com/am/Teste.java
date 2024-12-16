package br.com.am;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Teste  extends JFrame{
    private JPanel panel1;
    private JButton verificarButton;
    private JCheckBox c01;
    private JCheckBox c02;
    private JCheckBox c03;
    private JCheckBox c04;
    private JCheckBox c05;
    private JCheckBox c06;
    private JCheckBox c07;
    private JCheckBox c11;
    private JCheckBox c10;
    private JCheckBox c12;
    private JCheckBox c13;
    private JCheckBox c14;
    private JCheckBox c15;
    private JCheckBox c16;
    private JCheckBox c17;
    private JCheckBox c20;
    private JCheckBox c30;
    private JCheckBox c40;
    private JCheckBox c50;
    private JCheckBox c60;
    private JCheckBox c70;
    private JCheckBox c21;
    private JCheckBox c31;
    private JCheckBox c41;
    private JCheckBox c51;
    private JCheckBox c61;
    private JCheckBox c71;
    private JCheckBox c22;
    private JCheckBox c32;
    private JCheckBox c42;
    private JCheckBox c52;
    private JCheckBox c62;
    private JCheckBox c72;
    private JCheckBox c23;
    private JCheckBox c33;
    private JCheckBox c43;
    private JCheckBox c53;
    private JCheckBox c63;
    private JCheckBox c73;
    private JCheckBox c24;
    private JCheckBox c34;
    private JCheckBox c44;
    private JCheckBox c54;
    private JCheckBox c64;
    private JCheckBox c74;
    private JCheckBox c25;
    private JCheckBox c35;
    private JCheckBox c45;
    private JCheckBox c55;
    private JCheckBox c65;
    private JCheckBox c75;
    private JCheckBox c26;
    private JCheckBox c36;
    private JCheckBox c46;
    private JCheckBox c56;
    private JCheckBox c66;
    private JCheckBox c76;
    private JCheckBox c27;
    private JCheckBox c37;
    private JCheckBox c47;
    private JCheckBox c57;
    private JCheckBox c67;
    private JCheckBox c77;
    private JCheckBox c00;
    private JCheckBox c80;
    private JCheckBox c90;
    private JCheckBox c81;
    private JCheckBox c91;
    private JCheckBox c82;
    private JCheckBox c92;
    private JCheckBox c08;
    private JCheckBox c09;
    private JCheckBox c18;
    private JCheckBox c28;
    private JCheckBox c38;
    private JCheckBox c48;
    private JCheckBox c58;
    private JCheckBox c68;
    private JCheckBox c78;
    private JCheckBox c88;
    private JCheckBox c98;
    private JCheckBox c19;
    private JCheckBox c29;
    private JCheckBox c39;
    private JCheckBox c49;
    private JCheckBox c59;
    private JCheckBox c69;
    private JCheckBox c79;
    private JCheckBox c89;
    private JCheckBox c99;
    private JCheckBox c83;
    private JCheckBox c93;
    private JCheckBox c84;
    private JCheckBox c94;
    private JCheckBox c85;
    private JCheckBox c95;
    private JCheckBox c86;
    private JCheckBox c96;
    private JCheckBox c87;
    private JCheckBox c97;

    public Teste(){

        HebbApplication application = new HebbApplication();
        PerceptronTester tester = new PerceptronTester(application.getW(), application.getB());


        verificarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(verificarButton,(tester.testar(getLetra()) == 1) ? "A" : "B");
            }

        });
    }

    public float[] getLetra(){
        float[] l = new float[100];

        l[0] = (c00.isSelected()) ? 1 : -1;
        l[1] = (c01.isSelected()) ? 1 : -1;
        l[2] = (c02.isSelected()) ? 1 : -1;
        l[3] = (c03.isSelected()) ? 1 : -1;
        l[4] = (c04.isSelected()) ? 1 : -1;
        l[5] = (c05.isSelected()) ? 1 : -1;
        l[6] = (c06.isSelected()) ? 1 : -1;
        l[7] = (c07.isSelected()) ? 1 : -1;
        l[8] = (c08.isSelected()) ? 1 : -1;
        l[9] = (c09.isSelected()) ? 1 : -1;
        l[10] = (c10.isSelected()) ? 1 : -1;
        l[11] = (c11.isSelected()) ? 1 : -1;
        l[12] = (c12.isSelected()) ? 1 : -1;
        l[13] = (c13.isSelected()) ? 1 : -1;
        l[14] = (c14.isSelected()) ? 1 : -1;
        l[15] = (c15.isSelected()) ? 1 : -1;
        l[16] = (c16.isSelected()) ? 1 : -1;
        l[17] = (c17.isSelected()) ? 1 : -1;
        l[18] = (c18.isSelected()) ? 1 : -1;
        l[19] = (c19.isSelected()) ? 1 : -1;
        l[20] = (c20.isSelected()) ? 1 : -1;
        l[21] = (c21.isSelected()) ? 1 : -1;
        l[22] = (c22.isSelected()) ? 1 : -1;
        l[23] = (c23.isSelected()) ? 1 : -1;
        l[24] = (c24.isSelected()) ? 1 : -1;
        l[25] = (c25.isSelected()) ? 1 : -1;
        l[26] = (c26.isSelected()) ? 1 : -1;
        l[27] = (c27.isSelected()) ? 1 : -1;
        l[28] = (c28.isSelected()) ? 1 : -1;
        l[29] = (c29.isSelected()) ? 1 : -1;
        l[30] = (c30.isSelected()) ? 1 : -1;
        l[31] = (c31.isSelected()) ? 1 : -1;
        l[32] = (c32.isSelected()) ? 1 : -1;
        l[33] = (c33.isSelected()) ? 1 : -1;
        l[34] = (c34.isSelected()) ? 1 : -1;
        l[35] = (c35.isSelected()) ? 1 : -1;
        l[36] = (c36.isSelected()) ? 1 : -1;
        l[37] = (c37.isSelected()) ? 1 : -1;
        l[38] = (c39.isSelected()) ? 1 : -1;
        l[39] = (c40.isSelected()) ? 1 : -1;
        l[40] = (c41.isSelected()) ? 1 : -1;
        l[41] = (c42.isSelected()) ? 1 : -1;
        l[42] = (c43.isSelected()) ? 1 : -1;
        l[43] = (c44.isSelected()) ? 1 : -1;
        l[44] = (c45.isSelected()) ? 1 : -1;
        l[45] = (c46.isSelected()) ? 1 : -1;
        l[46] = (c47.isSelected()) ? 1 : -1;
        l[47] = (c48.isSelected()) ? 1 : -1;
        l[48] = (c49.isSelected()) ? 1 : -1;
        l[49] = (c50.isSelected()) ? 1 : -1;
        l[50] = (c51.isSelected()) ? 1 : -1;
        l[51] = (c52.isSelected()) ? 1 : -1;
        l[52] = (c53.isSelected()) ? 1 : -1;
        l[53] = (c54.isSelected()) ? 1 : -1;
        l[54] = (c55.isSelected()) ? 1 : -1;
        l[55] = (c56.isSelected()) ? 1 : -1;
        l[56] = (c57.isSelected()) ? 1 : -1;
        l[57] = (c58.isSelected()) ? 1 : -1;
        l[58] = (c59.isSelected()) ? 1 : -1;
        l[59] = (c60.isSelected()) ? 1 : -1;
        l[60] = (c61.isSelected()) ? 1 : -1;
        l[61] = (c62.isSelected()) ? 1 : -1;
        l[62] = (c63.isSelected()) ? 1 : -1;
        l[63] = (c64.isSelected()) ? 1 : -1;
        l[64] = (c65.isSelected()) ? 1 : -1;
        l[65] = (c66.isSelected()) ? 1 : -1;
        l[66] = (c67.isSelected()) ? 1 : -1;
        l[67] = (c68.isSelected()) ? 1 : -1;
        l[68] = (c69.isSelected()) ? 1 : -1;
        l[69] = (c70.isSelected()) ? 1 : -1;
        l[70] = (c71.isSelected()) ? 1 : -1;
        l[71] = (c72.isSelected()) ? 1 : -1;
        l[72] = (c73.isSelected()) ? 1 : -1;
        l[73] = (c74.isSelected()) ? 1 : -1;
        l[74] = (c75.isSelected()) ? 1 : -1;
        l[75] = (c76.isSelected()) ? 1 : -1;
        l[76] = (c77.isSelected()) ? 1 : -1;
        l[77] = (c78.isSelected()) ? 1 : -1;
        l[78] = (c77.isSelected()) ? 1 : -1;
        l[79] = (c77.isSelected()) ? 1 : -1;
        l[80] = (c74.isSelected()) ? 1 : -1;
        l[81] = (c75.isSelected()) ? 1 : -1;
        l[82] = (c76.isSelected()) ? 1 : -1;
        l[83] = (c77.isSelected()) ? 1 : -1;
        l[84] = (c77.isSelected()) ? 1 : -1;
        l[85] = (c74.isSelected()) ? 1 : -1;
        l[86] = (c75.isSelected()) ? 1 : -1;
        l[87] = (c76.isSelected()) ? 1 : -1;
        l[88] = (c77.isSelected()) ? 1 : -1;
        l[89] = (c77.isSelected()) ? 1 : -1;
        l[90] = (c74.isSelected()) ? 1 : -1;
        l[91] = (c75.isSelected()) ? 1 : -1;
        l[92] = (c76.isSelected()) ? 1 : -1;
        l[93] = (c77.isSelected()) ? 1 : -1;
        l[94] = (c77.isSelected()) ? 1 : -1;
        l[95] = (c74.isSelected()) ? 1 : -1;
        l[96] = (c75.isSelected()) ? 1 : -1;
        l[97] = (c76.isSelected()) ? 1 : -1;
        l[98] = (c77.isSelected()) ? 1 : -1;
        l[99] = (c77.isSelected()) ? 1 : -1;

        for (int i = 0; i < 64; i++) {
            if(l[i]==-1)
                System.out.print("0 ");
            else
                System.out.print("* ");

            if ((i+1)%8==0)
                System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


        return l;
    }





    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }
}
