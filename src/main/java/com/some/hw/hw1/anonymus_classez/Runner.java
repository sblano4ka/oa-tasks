package com.some.hw.hw1.anonymus_classez;

/**
 * Created by Artem_Iurchenko on 31.10.2016.
 */
public class Runner {
    public static void main(String[] args) {
        Auto auto1 = new Auto("auto1"){
            @Override
            public boolean equals(Object obj) {
                return super.equals(obj);
            }

            @Override
            public String toString() {
                return getName();
            }
        };
        Auto auto2 = new Auto("auto2"){
            @Override
            public boolean equals(Object obj) {
                return super.equals(obj);
            }

            @Override
            public String toString() {
                return getName();
            }
        };

        System.out.println(auto1.toString() + "   " +   auto2.toString());
    }
}
