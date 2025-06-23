package org.example.e03_decorator.io;

import java.io.*;

public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;
        InputStream in = null;
        String fileNm = "test.txt";

        try{
            in =
                    new LowerCaseInputStream(
                            new BufferedInputStream((
                                    InputTest.class.getClassLoader().getResourceAsStream(fileNm)
                                    )
                            )
                    );
            while((c = in.read()) >= 0){
                System.out.print((char)c);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if(in != null) { in.close(); }
        }
        System.out.println();
        try(InputStream in2 =
                new LowerCaseInputStream(
                        new BufferedInputStream(
                                InputTest.class.getClassLoader().getResourceAsStream(fileNm)
                )
            )
        )
        {
            while((c = in2.read()) >= 0){
                System.out.print((char) c);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
