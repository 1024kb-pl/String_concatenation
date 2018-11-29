package pl.maniaq;

import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {
        String blog = "1024kb";
        System.out.println("Adres String przed dodaniem: " + Integer.toHexString(blog.hashCode()));
        blog += ".pl";
        System.out.println("Adres String po dodaniu nowego Stringa: " + Integer.toHexString(blog.hashCode()));

        String name = "Pablo";
        String lastName = "Escabo";

        String pablo1 = name + " " + lastName;

        StringBuilder stringBuilder = new StringBuilder(    );
        stringBuilder.append(name);
        stringBuilder.append(" ");
        stringBuilder.append(lastName);

        String pablo2 = stringBuilder.toString();

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(name);
        stringBuffer.append(" ");
        stringBuffer.append(lastName);

        String pablo3 = stringBuffer.toString();

        System.out.println("Pablo 1: " + pablo1);
        System.out.println("Pablo 2: " + pablo2);
        System.out.println("Pablo 3: " + pablo3);

        final long count = 1000000L;

        System.out.println("N: " + count);


        String s = "";
        long startStringTime = System.currentTimeMillis();

        Map<String, Long> map = new HashMap<>();

        for (long i=0;i<count;i++) {
            s += "*";
        }
        long endStringTime = System.currentTimeMillis();

        long stringTime = endStringTime - startStringTime;
        System.out.println("String: " + (stringTime / (float) 1000));

        StringBuffer buffer = new StringBuffer();
        long startBufferTime = System.currentTimeMillis();

        for (long i=0;i<count;i++) {
            buffer.append("*");
        }
        buffer.toString();
        long endBufferTime = System.currentTimeMillis();

        long bufferTime = endBufferTime - startBufferTime;
        System.out.println("Buffer: " + (bufferTime / (float) 1000));


        StringBuilder builder = new StringBuilder();
        long startBuilderTime = System.currentTimeMillis();

        for (long i=0;i<count;i++) {
            builder.append("*");
        }
        builder.toString();
        long endBuilderTime = System.currentTimeMillis();

        long builderTime = endBuilderTime - startBuilderTime;
        System.out.println("Builder: " + (builderTime / (float) 1000));


    }
}
