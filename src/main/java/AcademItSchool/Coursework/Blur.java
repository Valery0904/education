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

        int matrixSize = 3;
        double[][] matrix = new double[matrixSize][matrixSize];

        double blurCoefficient = 1 / Math.pow(matrixSize, 2);

        for (double[] matrixRow : matrix) {
            Arrays.fill(matrixRow, blurCoefficient);
        }

        final int COLORS_COUNT_IN_RGB = 3;

        int[] pixel = new int[COLORS_COUNT_IN_RGB];
        double[] outputPixel = new double[COLORS_COUNT_IN_RGB];

        int indentation = matrixSize / 2;
        int widthIndent = width - indentation;
        int heightIndent = height - indentation;

        for (int y = indentation; y < heightIndent; ++y) {
            for (int x = indentation; x < widthIndent; ++x) {
                outputPixel[0] = 0;
                outputPixel[1] = 0;
                outputPixel[2] = 0;

                for (int i = 0, pixelXPosition = x - indentation; i < matrixSize; ++i, ++pixelXPosition) {
                    for (int j = 0, pixelYPosition = y - indentation; j < matrixSize; ++j, ++pixelYPosition) {
                        inputRaster.getPixel(pixelXPosition, pixelYPosition, pixel);

                        for (int k = 0; k < COLORS_COUNT_IN_RGB; k++) {
                            outputPixel[k] += pixel[k] * matrix[i][j];
                        }
                    }
                }

                for (int i = 0; i < COLORS_COUNT_IN_RGB; i++) {
                    outputPixel[i] = saturate(outputPixel[i]);
                }

                outputRaster.setPixel(x, y, outputPixel);
            }
        }

        ImageIO.write(outputImage, "jpg", new File("out.jpg"));
    }
}
