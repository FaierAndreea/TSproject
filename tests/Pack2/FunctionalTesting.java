package Pack2;

import Pack1.Interval;
import Pack1.Proiect;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.InvalidClassException;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FunctionalTesting {

    //teste pe clase de echivalenta

    @Test
    public void TestEqualsC111111111()
    {
        Proiect problema = new Proiect();
        Interval sol1= new Interval();
        sol1 = problema.Rezolvare("D:\\info 3\\TSoptional\\src\\input\\FunctionalTesting\\data.txt");
        assertEquals(new Interval(5,9), sol1); // C111111111 (cazul ideal)
    }
    @Test(expected=IndexOutOfBoundsException.class)
    public void TestOutOfBoundsC211111111()
    {
        Proiect problema = new Proiect();
        Interval sol= new Interval();
        sol = problema.Rezolvare("D:\\info 3\\TSoptional\\src\\input\\FunctionalTesting\\test1.txt");
        assertEquals(new Interval(5,9), sol); // C211111111 (k negativ)
    }
    @Test(expected=IndexOutOfBoundsException.class)
    public void TestOutOfBoundsC121111111()
    {
        Proiect problema = new Proiect();
        Interval sol= new Interval();
        sol = problema.Rezolvare("D:\\info 3\\TSoptional\\src\\input\\FunctionalTesting\\test2.txt");
        assertEquals(new Interval(5,9), sol); // C121111111 (n negativ)
    }
    @Test(expected = AssertionError.class)
    public void TestAssertionC111121111()
    {
        Proiect problema = new Proiect();
        Interval sol= new Interval();
        sol = problema.Rezolvare("D:\\info 3\\TSoptional\\src\\input\\FunctionalTesting\\test3.txt");
        assertEquals(new Interval(5,9), sol); // C111121111 (xs>ys)
    }
    @Test(expected = AssertionError.class)
    public void TestAssertionC111111112()
    {
        Proiect problema = new Proiect();
        Interval sol= new Interval();
        Throwable ex = assertThrows(AssertionError.class,()->problema.Rezolvare("D:\\info 3\\TSoptional\\src\\input\\FunctionalTesting\\test10.txt"));
        assertEquals("profesor: x should be less than y", ex.getMessage());
    }
    @Test(expected=IndexOutOfBoundsException.class)
    public void TestOutOfBoundsC111112111()
    {
        Proiect problema = new Proiect();
        Interval sol= new Interval();
        sol = problema.Rezolvare("D:\\info 3\\TSoptional\\src\\input\\FunctionalTesting\\test4.txt");
        assertEquals(new Interval(5,9), sol); // C111112111 (m negativ)
    }
    @Test(expected=IndexOutOfBoundsException.class)
    public void TestOutOfBoundsC111212111()
    {
        Proiect problema = new Proiect();
        Interval sol= new Interval();
        sol = problema.Rezolvare("D:\\info 3\\TSoptional\\src\\input\\FunctionalTesting\\test5.txt");
        assertEquals(new Interval(5,9), sol); // C111212111 (m negativ, ys negativ)
    }
    @Test(expected=IndexOutOfBoundsException.class)
    public void TestOutOfBoundsC131111111()
    {
        Proiect problema = new Proiect();
        Interval sol= new Interval();
        sol = problema.Rezolvare("D:\\info 3\\TSoptional\\src\\input\\FunctionalTesting\\test6.txt");
        assertEquals(new Interval(5,9), sol); // C131111111 (n>20)
    }
    @Test(expected=IndexOutOfBoundsException.class)
    public void TestOutOfBoundsC111311111()
    {
        Proiect problema = new Proiect();
        Interval sol= new Interval();
        sol = problema.Rezolvare("D:\\info 3\\TSoptional\\src\\input\\FunctionalTesting\\test7.txt");
        assertEquals(new Interval(5,9), sol); // C111311111 (ys>20)
    }
    @Test(expected=IndexOutOfBoundsException.class)
    public void TestOutOfBoundsC11211111()
    {
        Proiect problema = new Proiect();
        Interval sol= new Interval();
        sol = problema.Rezolvare("D:\\info 3\\TSoptional\\src\\input\\FunctionalTesting\\test9.txt");
        assertEquals(new Interval(5,9), sol); // C112111111 (xs negativ)
    }
    @Test(expected=IndexOutOfBoundsException.class)
    public void TestOutOfBoundsC11111211()
    {
        Proiect problema = new Proiect();
        Interval sol= new Interval();
        sol = problema.Rezolvare("D:\\info 3\\TSoptional\\src\\input\\FunctionalTesting\\test11.txt");
        assertEquals(new Interval(5,9), sol); // C11111211 (xt negativ)
    }
    @Test(expected=IndexOutOfBoundsException.class)
    public void TestOutOfBoundsC11111121()
    {
        Proiect problema = new Proiect();
        Interval sol= new Interval();
        sol = problema.Rezolvare("D:\\info 3\\TSoptional\\src\\input\\FunctionalTesting\\test12.txt");
        assertEquals(new Interval(5,9), sol); // C11111121 (yt negativ)
    }
    // teste pe valori de frontiera

    @Test(expected=IndexOutOfBoundsException.class)
    public void TestBoundaryK1()
    {
        Proiect problema = new Proiect();
        Interval sol= new Interval();
        sol = problema.Rezolvare("D:\\info 3\\TSoptional\\src\\input\\FunctionalTesting\\testfr1.txt");
        assertEquals(new Interval(5,9), sol);
    }
    @Test
    public void TestBoundaryK2()
    {
        Proiect problema = new Proiect();
        Interval sol= new Interval();
        sol = problema.Rezolvare("D:\\info 3\\TSoptional\\src\\input\\FunctionalTesting\\testfr2.txt");
        assertEquals(new Interval(2,3), sol);
    }
    @Test
    public void TestBoundaryK3()
    {
        Proiect problema = new Proiect();
        Interval sol= new Interval();
        sol = problema.Rezolvare("D:\\info 3\\TSoptional\\src\\input\\FunctionalTesting\\testfr3.txt");
        assertEquals(null, sol);
    }
    @Test(expected=IndexOutOfBoundsException.class)
    public void TestBoundaryK4()
    {
        Proiect problema = new Proiect();
        Interval sol= new Interval();
        sol = problema.Rezolvare("D:\\info 3\\TSoptional\\src\\input\\FunctionalTesting\\testfr4.txt");
        assertEquals(new Interval(5,9), sol);
    }
    @Test(expected=IndexOutOfBoundsException.class)
    public void TestBoundaryN1()
    {
        Proiect problema = new Proiect();
        Interval sol= new Interval();
        sol = problema.Rezolvare("D:\\info 3\\TSoptional\\src\\input\\FunctionalTesting\\testfr5.txt");
        assertEquals(new Interval(5,9), sol);
    }
    @Test
    public void TestBoundaryN2()
    {
        Proiect problema = new Proiect();
        Interval sol= new Interval();
        sol = problema.Rezolvare("D:\\info 3\\TSoptional\\src\\input\\FunctionalTesting\\testfr6.txt");
        assertEquals(new Interval(5,9), sol);
    }
    @Test
    public void TestBoundaryN3()
    {
        Proiect problema = new Proiect();
        Interval sol= new Interval();
        sol = problema.Rezolvare("D:\\info 3\\TSoptional\\src\\input\\FunctionalTesting\\testfr7.txt");
        assertEquals(new Interval(5,9), sol);
    }
    @Test(expected=IndexOutOfBoundsException.class)
    public void TestBoundaryN4()
    {
        Proiect problema = new Proiect();
        Interval sol= new Interval();
        sol = problema.Rezolvare("D:\\info 3\\TSoptional\\src\\input\\FunctionalTesting\\testfr8.txt");
        assertEquals(new Interval(5,9), sol);
    }


    @Test
    public void TestCovEqualsC111111111()
    {
        Proiect problema = new Proiect();
        Interval sol1= new Interval();
        sol1 = problema.Rezolvare("D:\\info 3\\TSoptional\\src\\input\\FunctionalTesting\\test8.txt");
        assertEquals(new Interval(5,9), sol1); // C111111111 (cazul ideal)
    }
    @Test(expected= NullPointerException.class)
    public void TestCovFileException() {
        Proiect problema = new Proiect();
        Interval sol = new Interval();
        sol = problema.Rezolvare("D:\\info 3\\TSoptional\\src\\input\\FunctionalTesting\\nuExista.txt");
        assertEquals(new Interval(5, 9), sol);
    }
}
