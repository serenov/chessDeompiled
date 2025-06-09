package OriginalArtifacts;
import java.io.InputStream;

public class ReaderDemo {
    private int convertFourBytesToInt(byte[] byArray, int n) {
        int n2 = (byArray[n++] << 24) + (byArray[n++] << 16) + (byArray[n++] << 8) + (byArray[n] << 0);

        return n2;
    }

    public void someProcessing(byte[] byArray) {
        var x = -convertFourBytesToInt(byArray, 0);
        var y = -convertFourBytesToInt(byArray, 4);


        System.out.println("Offset X: " + x);
        System.out.println("Offset Y: " + y);

        System.out.println("Big Offset X: " + Integer.reverse(x));
        System.out.println("Big Offset Y: " + Integer.reverse(y));
    }

    public void readFromFile() {
        InputStream stream = this.getClass().getResourceAsStream("/6w.dmg");

        if (stream == null) {
            System.out.println("File not found");

            return;
        }

        try {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = stream.read(buffer)) != -1) {
                // Process the bytes read
                System.out.println("Read " + bytesRead + " bytes");
                someProcessing(buffer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ReaderDemo main = new ReaderDemo();
        main.readFromFile();    
    }
}
