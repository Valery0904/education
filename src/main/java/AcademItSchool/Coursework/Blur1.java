package AcademItSchool.Coursework;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;

public class Blur1 {
    public static int saturate(double x) {
        if (x <= 0) {
            return 0;
        }

        if (x >= 255) {
            return 255;
        }

        return (int) Math.round(x);
    }

    public static void main(String[] args) throws IOException {
        BufferedImage inputImage = ImageIO.read(new File("image.jpg"));
        WritableRaster inputRaster = inputImage.getRaster();

        int width = inputImage.getWidth();
        int height = inputImage.getHeight();

        BufferedImage outputImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        WritableRaster outputRaster = outputImage.getRaster();

        double[] matrix = {
                1d / 9, 1d / 9, 1d / 9,
                1d / 9, 1d / 9, 1d / 9,
                1d / 9, 1d / 9, 1d / 9
        };


        int[] pixel = new int[3];
        int[] pixelsSum = new int[3];
        
        for (int x = 0; x < width; ++x) {
            for (int y = 0; y < height; ++y) {
                pixelsSum[0] = 0;
                pixelsSum[1] = 0;
                pixelsSum[2] = 0;

                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        if (x + i >= 0 && x + i < width && y + j >= 0 && y + j < height) {
                            inputRaster.getPixel(x + i, y + j, pixel);

                            for (i = 0; i <= 3; i++) {
                               pixelsSum[i] += (int) (pixel[i] * matrix[i + 1 + (j + 1) * 3]);
                            }
                        }
                    }
                }

                for (int k = 0; k < 3; k++) {
                    pixelsSum[k] = saturate(pixelsSum[k]);
                }

                outputRaster.setPixel(x, y, pixelsSum);
            }
        }

        ImageIO.write(outputImage, "jpg", new File("out.jpg"));
    }
}