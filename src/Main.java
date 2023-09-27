///
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Random;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int[] c = new int[14];
        float[] x = new float[14];
        double[][] result = new double[7][14];
        int cValue = 4;

        for(int i = 0; i < 14; ++i) {
            c[i] = cValue;
            cValue += 2;
        }

        Random random = new Random();

        int i;
        for(i = 0; i < 14; ++i) {
            x[i] = random.nextFloat() * 28.0F - 14.0F;
        }

        int j;
        for(i = 0; i < 7; ++i) {
            for(j = 0; j < 14; ++j) {
                if (c[i] == 12) {
                    result[i][j] = Math.cbrt(Math.asin(Math.sin((double)x[j])));
                } else if (c[i] != 6 && c[i] != 8 && c[i] != 10) {
                    result[i][j] = Math.cbrt(Math.sin(Math.cbrt((double)(x[j] / 2.0F))));
                } else {
                    double sin2x = Math.sin((double)x[j]) * Math.sin((double)x[j]);
                    result[i][j] = Math.pow(Math.log(sin2x), 3.0 / Math.sin((double)x[j]) * (Math.pow((double)(x[j] / 2.0F), 3.0) + 4.0));
                }
            }
        }

        for(i = 0; i < 7; ++i) {
            for(j = 0; j < 14; ++j) {
                String formattedNumber = String.format("%.2f", (float)result[i][j]);
                System.out.print(formattedNumber + " ");
            }
        }

    }
}
