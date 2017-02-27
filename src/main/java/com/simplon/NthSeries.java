package com.simplon;

import java.text.DecimalFormat;

/**
 * Created by alonso on 27/02/17.
 */
public class NthSeries {

    public String seriesSum(int serie) {
        DecimalFormat df = (serie == 1) ? new DecimalFormat("0") : new DecimalFormat("0.00");
        double div = 1;
        double result = (serie == 0) ? 0.00 : 1.00;
        for (int i = 1; i<serie; i++) {
            div += 3;
            result +=  (1/(div));
        }
        return  df.format(result).replace(",", ".");
    }

}
