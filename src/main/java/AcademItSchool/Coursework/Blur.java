package AcademItSchool.Coursework;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;

public class Blur {
    public static int sat(double x) {
        if (x < 0) {
            return 0;
        }

        if (x > 255) {
            return 255;
        }

        return (int) x;
    }

    public static void main(String[] args) throws IOException {
        BufferedImage image = ImageIO.read(new File("image.jpg"));

        WritableRaster raster = image.getRaster();

        int width = image.getWidth();
        int height = image.getHeight();

        BufferedImage outputImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        WritableRaster outputRaster = outputImage.getRaster();

        double[] kernel = {
                1d / 9, 1d / 9, 1d / 9,
                1d / 9, 1d / 9, 1d / 9,
                1d / 9, 1d / 9, 1d / 9
        };

        int[] pixel = new int[3];
        int[] sum = new int[3];

        for (int x = 0; x < width; ++x) {
            for (int y = 0; y < height; ++y) {
                sum[0] = sum[1] = sum[2] = 0;

                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        if (x + i >= 0 && x + i < width && y + j >= 0 && y + j < height) {
                            raster.getPixel(x + i, y + j, pixel);

                            for (int k = 0; k < 3; k++) {
                                sum[k] += (int) (pixel[k] * kernel[i + 1 + (j + 1) * 3]);
                            }
                        }
                    }
                }

                for (int k = 0; k < 3; k++) {
                    sum[k] = sat(sum[k]);
                }

                outputRaster.setPixel(x, y, sum);
            }
        }

        ImageIO.write(image, "jpg", new File("out.jpg"));
    }
}