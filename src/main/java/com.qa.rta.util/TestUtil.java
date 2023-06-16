package com.qa.rta.util;

import com.qa.rta.constants.Constants;

public class TestUtil {




    public static void shortWait() {
        try {
            Thread.sleep(Constants.SHORT_WAIT);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void mediumWait() {
        try {
            Thread.sleep(Constants.MEDIUM_WAIT);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void longWait() {
        try {
            Thread.sleep(Constants.LONG_WAIT);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
