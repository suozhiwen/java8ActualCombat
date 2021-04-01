package one.test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

/**
 * @author 123456
 */
public class Test {

    public static void main(String[] args) {

        List<Apple> appleList = new ArrayList<>();
        appleList.add(new Apple(1, 50.4,10025));
        appleList.add(new Apple(3, 23.9,524));
        appleList.add(new Apple(2, 43.7,105));
        appleList.add(new Apple(4, 50.4,10025));
        appleList.add(new Apple(5, 50.4,302));
        appleList.add(new Apple(6, 23.9,105));
        appleList.add(new Apple(7, 43.7,524));
        appleList.add(new Apple(8, 50.4,422));

        //基础版
        Collections.sort(appleList, new Comparator<Apple>() {
            @Override
            public int compare(Apple a1, Apple a2) {
                // a1  和 a2 可颠倒
                return (int) (a2.getWeight() - a1.getWeight());
            }
        });

        for (Apple apple : appleList) {
            System.out.println(apple.toString());
        }

        System.out.println("----分割线----java8语法");
        appleList.sort(comparing(Apple::getWeight));

        for (Apple apple : appleList) {
            System.out.println(apple.toString());
        }


        System.out.println("----分割线----reversed");
        appleList.sort(comparing(Apple::getWeight).reversed());

        for (Apple apple : appleList) {
            System.out.println(apple.toString());
        }

        System.out.println("----分割线----thenComparing");
        /**
         * 1.comparing().reversed()  以 comparing()中的字段为主排序 其他字段 正序排列
         * 2.comparing().thenComparing().reversed().thenComparing  reversed()前的两个字段接倒序排序 后一个按正序排列
         * 3..reversed() 放到最后
         */
        appleList.sort(comparing(Apple::getWeight,Comparator.reverseOrder()).thenComparing(Apple::getName).reversed().thenComparing(Apple::getId));

        for (Apple apple : appleList) {
            System.out.println(apple.toString());
        }

    }
}
