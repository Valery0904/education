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

        BufferedImage outputImage = new BufferedImage(width, height, inputImage.getType());
        WritableRaster outputRaster = outputImage.getRaster();

        int matrixSize = 3;
        double[][] matrix = new double[matrixSize][matrixSize];

        double blurCoefficient = 1 / Math.pow(matrixSize, 2);

        for (double[] matrixRow : matrix) {
            Arrays.fill(matrixRow, blurCoefficient);
        }

        final int COLORS_COUNT_IN_RGB = 3;

        int[] pixel = new int[COLORS_COUNT_IN_RGB];
        double[] outputPixel = new double[COLORS_COUNT_IN_RGB];

        int indent = matrixSize / 2;
        int yUpperLimit = width - indent;
        int xUpperLimit = height - indent;

        for (int y = indent; y < yUpperLimit; ++y) {
            for (int x = indent; x < xUpperLimit; ++x) {
                Arrays.fill(outputPixel, 0);

                for (int i = 0, pixelYNeighbor = y - indent; i < matrixSize; ++i, ++pixelYNeighbor) {
                    for (int j = 0, pixelXNeighbor = x - indent; j < matrixSize; ++j, ++pixelXNeighbor) {
                        inputRaster.getPixel(pixelYNeighbor, pixelXNeighbor, pixel);

                        for (int k = 0; k < COLORS_COUNT_IN_RGB; k++) {
                            outputPixel[k] += pixel[k] * matrix[j][i];
                        }
                    }
                }

                for (int i = 0; i < COLORS_COUNT_IN_RGB; i++) {
                    pixel[i] = saturate(outputPixel[i]);
                }

                outputRaster.setPixel(y, x, pixel);
            }
        }

        ImageIO.write(outputImage, "jpg", new File("out.jpg"));
    }
}
