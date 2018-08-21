package Day13;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.DoubleStream;

public class Test02 {
    public static void main(String[] args) {
        int staffQuantity = new Scanner(System.in).nextInt();
        double[] doubles = new double[staffQuantity];

        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = new Random().nextInt(30000);
        }

        DoubleStream.of(doubles).forEach(System.out::println);

        System.out.println("average " + DoubleStream.of(doubles).average().getAsDouble()
                + "\nmax " + DoubleStream.of(doubles).max().getAsDouble()
                + "\nmin " + DoubleStream.of(doubles).min().getAsDouble());

    }
}
