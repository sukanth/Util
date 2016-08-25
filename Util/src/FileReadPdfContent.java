
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class FileReadPdfContent {


    public static void main(String[] args) throws IOException {


        File f=new File("/Users/sukanthgunda/sukanth/test/test.rtf");

        OutputStream oos = new FileOutputStream("/Users/sukanthgunda/sukanth/test/StatementOfAccount_04443869209.pdf");
        byte[] buf = new byte[8192];

        InputStream is = new FileInputStream(f);

        int c = 0;

        while ((c = is.read(buf, 0, buf.length)) > 0) {
            oos.write(buf, 0, c);
            oos.flush();
        }

        oos.close();
        System.out.println("stop");
        is.close();

    }

}
