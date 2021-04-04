package Pack1;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

class Pair {
    int x;
    int y;

    // Constructor
    public Pair(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}

// class to define user defined conparator
class Compare {

    static void compare(Pair arr[], int n)
    {
        // Comparator to sort the pair according to first element
        Arrays.sort(arr, new Comparator<Pair>() {
            @Override public int compare(Pair p1, Pair p2)
            {
                return p1.x - p2.x;
            }
        });
    }
}

public class Proiect {
    public static void main(String[] arg) throws FileNotFoundException {
        File mydata = new File("D:\\info 3\\TSoptional\\src\\input\\data.txt");
        Scanner myscaner = new Scanner(mydata);
        int n,m,k, xs[], ys[], xt[], yt[], i;
        k = myscaner.nextInt();
        n = myscaner.nextInt();
        Pair mihaela[] = new Pair[n];

        for (i=0;i<n;i++) {
            mihaela[i] = new Pair(myscaner.nextInt(),myscaner.nextInt());
        }

        m = myscaner.nextInt();
        Pair profesor[] = new Pair[m];
        for (i=0;i<m;i++) {
            profesor[i] = new Pair(myscaner.nextInt(),myscaner.nextInt());
        }
        //System.out.println(mihaela[1].x);

        Compare obj1 = new Compare();
        obj1.compare(mihaela, n);

        Compare obj2 = new Compare();
        obj2.compare(profesor, m);

        int lb = 0, rb = 0;
        while (lb < n && rb < m) {
            int xmax = max(mihaela[lb].x, profesor[rb].x),
            ymin = min(mihaela[lb].y, profesor[rb].y);

            if (ymin - xmax >= k) {
                Pair solution = new Pair(xmax,xmax+k);
                System.out.println(solution.x + " " +solution.y);
                break;
            }

            if (mihaela[lb].y < profesor[rb].y)
                ++lb;
            else if (mihaela[lb].y > profesor[rb].y)
                ++rb;
            else
            {  ++lb; ++rb; }
        }
    }
}
