package AcademItSchool.Coursework;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Blur {
    public static int saturate(double colorIntensity) {
        if (colorIntensity <= 0) {
            return 0;
        }

        if (colorIntensity >= 255) {
            return 255;
        }

        return (int) Math.round(colorIntensity);
    }

    public static void main(String[] args) throws IOException {
        BufferedImage inputImage = ImageIO.read(new File("image.jpg"));
        WritableRaster inputRaster = inputImage.getRaster();

        int width = inputImage.getWidth();
        int height = inputImage.getHeight();

        BufferedImage outputImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        WritableRaster outputRaster = outputImage.getRaster();

        int size = 3;
        double[][] matrix = new double[size][size];
        int matrixSize = matrix.length;
        double blurCoefficient = 1 / Math.pow(matrixSize, 2);

        for (double[] matrixLine : matrix) {
            Arrays.fill(matrixLine, blurCoefficient);
        }

        final int COLORS_COUNT_IN_RGB = 3;

        int[] pixel = new int[COLORS_COUNT_IN_RGB];
        double[] sumPixels = new double[COLORS_COUNT_IN_RGB];

        int coefficientForSibling = matrixSize / 2;

        for (int y = coefficientForSibling; y < width - coefficientForSibling; ++y) {
            for (int x = coefficientForSibling; x < height - coefficientForSibling; ++x) {
                sumPixels[0] = 0;
                sumPixels[1] = 0;
                sumPixels[2] = 0;

                for (int i = -coefficientForSibling; i <= coefficientForSibling; ++i) {
                    for (int j = -coefficientForSibling; j <= coefficientForSibling; ++j) {
                        inputRaster.getPixel(y + i, x + j, pixel);

                        for (int k = 0; k < COLORS_COUNT_IN_RGB; k++) {
                            sumPixels[k] += pixel[k] * matrix[i + coefficientForSibling][j + coefficientForSibling];
                        }
                    }
                }

                for (int i = 0; i < COLORS_COUNT_IN_RGB; i++) {
                    sumPixels[i] = saturate(sumPixels[i]);
                }

                outputRaster.setPixel(y, x, sumPixels);
            }
        }

        ImageIO.write(outputImage, "jpg", new File("out.jpg"));
    }
}
