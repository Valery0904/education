package AcademItSchool;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class test {
    public static int saturate(double value) {
        if (value <= 0) return 0;
        if (value >= 255) return 255;
        return (int) Math.round(value);
    }

    public static void main(String[] args) throws IOException {
        BufferedImage inputImage = ImageIO.read(new File("image.jpg"));
        WritableRaster inputRaster = inputImage.getRaster();

        int width = inputImage.getWidth();
        int height = inputImage.getHeight();

        BufferedImage outputImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        WritableRaster outputRaster = outputImage.getRaster();

        double[][] matrix = new double[3][3];

        for (double[] convolutionCoefficient : matrix) {
            Arrays.fill(convolutionCoefficient, 1d / 9);
        }

        int matrixWidth = matrix.length;
        int matrixHeight = matrix[0].length;

        final double COLORS_COUNT_IN_RGB = 3.0;

        int[] pixel = new int[(int) COLORS_COUNT_IN_RGB];
        double[] pixelSum = new double[(int) COLORS_COUNT_IN_RGB];

        for (int y = matrixHeight / 2; y < height - matrixHeight / 2; ++y) {
            for (int x = matrixWidth / 2; x < width - matrixWidth / 2; ++x) {
                pixelSum[0] = 0;
                pixelSum[1] = 0;
                pixelSum[2] = 0;

                for (int i = -matrixWidth / 2; i <= matrixWidth / 2; ++i) {
                    for (int j = -matrixHeight / 2; j <= matrixHeight / 2; ++j) {
                        inputRaster.getPixel(x + i, y + j, pixel);

                        for (int k = 0; k < COLORS_COUNT_IN_RGB; k++) {
                            pixelSum[k] += pixel[k] * matrix[i + matrixWidth / 2][j + matrixHeight / 2];
                        }
                    }
                }

                for (int k = 0; k < COLORS_COUNT_IN_RGB; k++) {
                    pixelSum[k] = saturate(pixelSum[k]);
                }

                outputRaster.setPixel(x, y, pixelSum);
            }
        }

        ImageIO.write(outputImage, "jpg", new File("out2.jpg"));
    }
}
