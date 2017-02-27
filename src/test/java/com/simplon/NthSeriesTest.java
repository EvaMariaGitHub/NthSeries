package com.simplon;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alonso on 27/02/17.
 */
public class NthSeriesTest {

    @Test
    public void sumNthSeriesWith0(){
        //set
        NthSeries nthSeries = new NthSeries();
        //test
        String result = nthSeries.seriesSum(0);
        //assert
        assertEquals("0.00", result);
    }

    @Test
    public void sumNthSeriesWith1(){
        //set
        NthSeries nthSeries = new NthSeries();
        //test
        String result = nthSeries.seriesSum(1);
        //assert
        assertEquals("1", result);
    }

    @Test
    public void sumNthSeriesWith2(){
        //set
        NthSeries nthSeries = new NthSeries();
        //test
        String result = nthSeries.seriesSum(2);
        //assert
        assertEquals("1.25", result);
    }

    @Test
    public void sumNthSeriesWith5(){
        //set
        NthSeries nthSeries = new NthSeries();
        //test
        String result = nthSeries.seriesSum(5);
        //assert
        assertEquals("1.57", result);
    }

}