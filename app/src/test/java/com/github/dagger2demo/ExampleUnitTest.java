package com.github.dagger2demo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        //assertEquals(4, 2 + 2);

        List<String> a = new ArrayList<>();

        a.add("1");
        a.add("2");
        a.add("3");
        a.add("2");
        a.add("4");
        a.add("3");

        Set<String> s = new HashSet<>();

        for (String temp : a) {
            s.add(temp);
        }

        for (String temp : s) {
            System.out.println("" + temp);
        }

        Iterator<String> i = s.iterator();

        while (i.hasNext()) {
            System.out.println("--" + i.next());
        }

//        for (String temp : a) {
//            if (temp.equals("2")) {
//                a.remove(temp);
//                break;
//            }
//        }
//
//        for (String temp : a) {
//            System.out.println("" + temp);
//        }
//
//
//        Iterator<String> it = a.iterator();
//
//        while (it.hasNext()) {
//            String temp = it.next();
//            if (temp.equals("3")) {
//                it.remove();
//            }
//        }


    }
}