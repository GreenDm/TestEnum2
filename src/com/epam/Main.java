package com.epam;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by m18 on 11.03.2016.
 */
public class Main {
    public static void main(String[] args) {

        for (MyDayOfWeek dc : MyDayOfWeek.values()) {
            switch (dc) {
                case MONDAY:
                case WEDNESDAY:
                case FRIDAY:
                    System.out.println("My Java day: " + dc);
                   
            }
        }
    }
}
