package com.epam;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by m18 on 11.03.2016.
 */
public class Main {
    public static void main(String[] args) {

        for (MyDayOfWeek dc : MyDayOfWeek.values()) {
            switch (dc) {
                case SUNDAY:
                    System.out.println("My Java day: " + dc);
break;
                case MONDAY:
                    System.out.println("My Java day: " + dc);
                    break;
                case TUESDAY:
                    System.out.println("My Java day: " + dc);
                    break;
                case WEDNESDAY:
                    System.out.println("My Java day: " + dc);
                    break;
                case THURSDAY:
                    System.out.println("My Java day: " + dc);
                    break;
                case FRIDAY:
                    System.out.println("My Java day: " + dc);
                    break;
                case SATURDAY:
                    System.out.println("My Java day: " + dc);
                    break;
                default:
                    System.out.println("Invali name of day");

            }
        }
    }
}
