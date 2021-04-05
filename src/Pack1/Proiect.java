package Pack1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InvalidClassException;
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
    public Pair[] mihaela;
    public Pair[] profesor;
    public int n,m,k;

    public Proiect() {}

    public void Citire(String url){
        File mydata = new File(url);
        Scanner myscaner = null;
        try {
            myscaner = new Scanner(mydata);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int i;
        this.k = myscaner.nextInt();
        this.n = myscaner.nextInt();

        if (this.k<1 || this.k>1000) {
            throw new IndexOutOfBoundsException("k is out of bounds");
        }
        if (this.n<1 || this.n>20) {
            throw new IndexOutOfBoundsException("n is out of bounds");
        }

        this.mihaela = new Pair[n];

        for (i=0;i<n;i++) {
            this.mihaela[i] = new Pair(myscaner.nextInt(),myscaner.nextInt());

            if (this.mihaela[i].x<1 || this.mihaela[i].x>20)
                throw new IndexOutOfBoundsException("mihaela: x is out of bounds");
            if (this.mihaela[i].y<1 || this.mihaela[i].y>20)
                throw new IndexOutOfBoundsException("mihaela: y is out of bounds");
            if (this.mihaela[i].x >= this.mihaela[i].y)
                try {
                    throw new InvalidClassException("mihaela: x should be less than y");
                } catch (InvalidClassException e) {
                    e.printStackTrace();
                }
        }

        this.m = myscaner.nextInt();

        if (this.m<1 || this.m>20) {
            throw new IndexOutOfBoundsException("m is out of bounds");
        }

        this.profesor = new Pair[m];
        for (i=0;i<m;i++) {
            this.profesor[i] = new Pair(myscaner.nextInt(),myscaner.nextInt());

            if (this.profesor[i].x<1 || this.profesor[i].x>20)
                throw new IndexOutOfBoundsException("profesor: x is out of bounds");
            if (this.profesor[i].x >= this.profesor[i].y)
                try {
                    throw new InvalidClassException("profesor: x should be less than y");
                } catch (InvalidClassException e) {
                    e.printStackTrace();
                }
        }
    }

    public void Sortare() {
        Compare obj1 = new Compare();
        obj1.compare(this.mihaela, this.n);

        Compare obj2 = new Compare();
        obj2.compare(this.profesor, this.m);
    }

    public Pair Rezolvare() {
        int lb = 0, rb = 0;
        while (lb < this.n && rb < this.m) {
            int xmax = max(this.mihaela[lb].x, this.profesor[rb].x),
                    ymin = min(this.mihaela[lb].y, this.profesor[rb].y);

            if (ymin - xmax >= this.k) {
                Pair solution = new Pair(xmax, xmax + this.k);
                return solution;
            }

            if (this.mihaela[lb].y < this.profesor[rb].y)
                ++lb;
            else if (this.mihaela[lb].y > this.profesor[rb].y)
                ++rb;
            else {
                ++lb;
                ++rb;
            }
        }
        return null;
    }


}
