package fKTMbGN8DANraYbky9GbtrKTNguDOLa0jJSzYkXVw5A2cV5XpbAAUNJsT228mrcaYyF1AbQxxyNS9Vfg6e9ZBpswIHgmPQaAcv8o9Gf7S1dQWhtgZiYfwj2xGj30cAdhheRp6;

import android.view.WindowInsets;

public abstract class r0YK42ySwjIywUFGhEUoQ5Kqv4jIehUr5xRkZeEabfIYzzFXfQHdfhDVn {
    public static int P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(int i) {
        int osWaXDDeLSz3xTdh9JMsF4w1V14Qp6qQcOS;
        int i2 = 0;
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            if ((i & i3) != 0) {
                if (i3 == 1) {
                    osWaXDDeLSz3xTdh9JMsF4w1V14Qp6qQcOS = WindowInsets.Type.statusBars();
                } else if (i3 == 2) {
                    osWaXDDeLSz3xTdh9JMsF4w1V14Qp6qQcOS = WindowInsets.Type.navigationBars();
                } else if (i3 == 4) {
                    osWaXDDeLSz3xTdh9JMsF4w1V14Qp6qQcOS = WindowInsets.Type.captionBar();
                } else if (i3 == 8) {
                    osWaXDDeLSz3xTdh9JMsF4w1V14Qp6qQcOS = WindowInsets.Type.ime();
                } else if (i3 == 16) {
                    osWaXDDeLSz3xTdh9JMsF4w1V14Qp6qQcOS = WindowInsets.Type.systemGestures();
                } else if (i3 == 32) {
                    osWaXDDeLSz3xTdh9JMsF4w1V14Qp6qQcOS = WindowInsets.Type.mandatorySystemGestures();
                } else if (i3 == 64) {
                    osWaXDDeLSz3xTdh9JMsF4w1V14Qp6qQcOS = WindowInsets.Type.tappableElement();
                } else if (i3 == 128) {
                    osWaXDDeLSz3xTdh9JMsF4w1V14Qp6qQcOS = WindowInsets.Type.displayCutout();
                } else if (i3 == 512) {
                    osWaXDDeLSz3xTdh9JMsF4w1V14Qp6qQcOS = WindowInsets.Type.systemOverlays();
                }
                i2 |= osWaXDDeLSz3xTdh9JMsF4w1V14Qp6qQcOS;
            }
        }
        return i2;
    }
}
