package exercise;

import java.util.Arrays;

// BEGIN
public class App {
    public static String[][] enlargeArrayImage(String[][] image) {
        int imageSize = image.length;
        int enlargedImageSize = imageSize * 2;
        String[][] enlargedImage = new String[enlargedImageSize][enlargedImageSize];
        for (var i = 0; i < enlargedImage.length; i++) {
            for (var j = 0; j < enlargedImage.length; j++) {
                if (i < 2 || i > enlargedImage.length - 3) {
                    enlargedImage[i][j] = "*";
                } else {
                    if (j < 2 || j > enlargedImage.length - 3) {
                        enlargedImage[i][j] = "*";
                    } else {
                        enlargedImage[i][j] = " ";
                    }
                }
            }
        }
        return enlargedImage;
    }
}
// END
