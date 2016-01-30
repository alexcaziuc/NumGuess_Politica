package org.fasttrackit.dev.lesson1.numgenerator.servlet;

import org.fasttrackit.dev.lesson1.numgenerator.NumGeneratorBusinessLogic;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by icondor on 30/01/16.
 */
public class NumGenServletTest {

    @Test
    public void testBuildJSonObject() throws Exception {

        NumGeneratorBusinessLogic nbl = new NumGeneratorBusinessLogic();

        String result = NumGenServlet.buildJSonObject(nbl,"abc");
        assertEquals(result,"{\"keyError\":\"WRONGNUMBERFORMAT\"}");


    }


    @Test
    public void testnewBuildJSonObject() throws Exception {

        NumGeneratorBusinessLogic nbl = new NumGeneratorBusinessLogic();


        String result = NumGenServlet.buildJSonObject(nbl,"11");
        assertEquals(result,"{\"keySuccess\":\"" + false + "\", \"keyHint\":\"" + "lower"+ "\", \"keyCounter\":\"" + "0.0" + "\", \"isMinimalScore\":\"" + false +"\", \"keyNrGuesses\":\"" + 1 + "\"}");


    }
}