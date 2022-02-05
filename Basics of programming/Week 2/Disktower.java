import java.util.*;
import java.io.*;

class Disktower {

    publicstaticvoidmain(String[] args) throwsIOException {

        BufferedReaderreader = newBufferedReader(newInputStreamReader(System.in));

        intn = Integer.parseInt(reader.readLine());

        String[] s = reader.readLine().split(" ");

        // PriorityQueue<Integer> q1 = new PriorityQueue<>();

        PriorityQueue<Integer> q2 = newPriorityQueue<>(java.util.Collections.reverseOrder());

        int[] s1 = newint[n];

        intmax = n;

        for (inti = 0; i < n; i++) {

            s1[i] = Integer.parseInt(s[i]);

            q2.add(s1[i]);

            

            while (!q2.isEmpty() && q2.peek() == max) {

                System.out.print(q2.poll() + " ");

                max--;

            }

            System.out.println();

        }


 

    }

}

