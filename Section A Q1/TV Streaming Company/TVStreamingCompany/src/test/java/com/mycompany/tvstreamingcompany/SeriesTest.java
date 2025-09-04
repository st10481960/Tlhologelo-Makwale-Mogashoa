/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.tvstreamingcompany;

import static com.mycompany.tvstreamingcompany.Series.seriesInformation;
import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Tlhologelo Mogashoa
 */
//Farrell(2023)
public class SeriesTest {
    static private Series seriesTest;
    
    public SeriesTest() {
    }

    @org.junit.Test
    public void testStartProgram() {
    }

    @org.junit.Test
    public void testMenu() {
    }

    @Before
    public void testCaptureSeries() {
        seriesTest = new Series();
        try
        {
            java.lang.reflect.Field field = Series.class.getDeclaredField("seriesInformation");
            field.setAccessible(true);
            ((java.util.ArrayList<String>) field.get(null)).clear();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }             
    }

    @org.junit.Test
    public void testIsValidAgeRestriction() {
    }

    @Test
    public void testSearchSeries() 
    {
       Series serieSearch = new Series();
       seriesTest.SeriesId = "01";
       seriesTest.SeriesName = "HighSchool Musical";
       seriesTest.SeriesAge = "12";
       seriesTest.SeriesNumberOfEpisodes = "7";
       addToList(seriesTest);
       
       String result = seriesTest.SearchSeries("01");
       String expected = "\n******************"
                        +"\nSeries ID: 01"
                        +"\nSeries Name: HighSchool Musical"
                        +"\nAge Restriction: 12"
                        +"\nNumber of episodes: 7";
       assertEquals(expected, result);
       
       
    }

    @Test
    public void testUpdateSeries() {
       Series seriesSearch = new Series();
       seriesTest.SeriesId = "01";
       seriesTest.SeriesName = "Spiderman Homecoming";
       seriesTest.SeriesAge = "12";
       seriesTest.SeriesNumberOfEpisodes = "5";
       addToList(seriesTest); 
       
       String result = "New Series Name";
       Scanner input = new Scanner(result);
       seriesTest.UpdateSeries("01", input);
       
       String feedback = seriesTest.searchSeries("01");
       assertTrue(feedback.contains("New Name"));
       assertTrue(feedback.contains("12"));
       assertTrue(feedback.contains("5"));      
    }

    @Test
    public void testDeleteSeries() {
        Series seriesSearch = new Series();
        seriesTest.SeriesId = "01";
        addToList(seriesTest);
        
        String input = "yes/no";
        Scanner result = new Scanner(input);
        boolean delete = seriesTest.deleteSeries("01", result);
        assertTrue(delete);
        
        String feedback = seriesTest.searchSeries("01");
        assertTrue(feedback.contains("not found"));
    }

    @org.junit.Test
    public void testSeriesReport() {
    }

    @org.junit.Test
    public void testExitSeriesApplication() {
    }

    private void addToList(Series seriesTest) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
//Reference list:
//Farrell, J. (2023) Java programming. Boston, MA: Cengage