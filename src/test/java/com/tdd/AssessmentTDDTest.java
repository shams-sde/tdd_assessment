package com.tdd;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssessmentTDDTest {

    @Test
    public void shouldCheckIfLeapYear() {
        AssessmentTDD assessmentTDD = new AssessmentTDD();
        assertTrue(assessmentTDD.checkIfLeapYear(2000));
        assertFalse(assessmentTDD.checkIfLeapYear(2001));
        assertTrue(assessmentTDD.checkIfLeapYear(2004));
        assertFalse(assessmentTDD.checkIfLeapYear(1700));
        assertFalse(assessmentTDD.checkIfLeapYear(1800));
        assertFalse(assessmentTDD.checkIfLeapYear(1900));
        assertFalse(assessmentTDD.checkIfLeapYear(2017));
        assertFalse(assessmentTDD.checkIfLeapYear(2018));
        assertFalse(assessmentTDD.checkIfLeapYear(2019));
        assertTrue(assessmentTDD.checkIfLeapYear(1908));
        assertTrue(assessmentTDD.checkIfLeapYear(1976));
        assertTrue(assessmentTDD.checkIfLeapYear(2016));
        assertFalse(assessmentTDD.checkIfLeapYear(2100));

        // all leap years b/w 1584 - 2020
        assertTrue(assessmentTDD.checkIfLeapYear(1584));
        assertTrue(assessmentTDD.checkIfLeapYear(1588));
        assertTrue(assessmentTDD.checkIfLeapYear(1592));
        assertTrue(assessmentTDD.checkIfLeapYear(1596));
        assertTrue(assessmentTDD.checkIfLeapYear(1600));
        assertTrue(assessmentTDD.checkIfLeapYear(1604));
        assertTrue(assessmentTDD.checkIfLeapYear(1608));
        assertTrue(assessmentTDD.checkIfLeapYear(1612));
        assertTrue(assessmentTDD.checkIfLeapYear(1616));
        assertTrue(assessmentTDD.checkIfLeapYear(1620));
        assertTrue(assessmentTDD.checkIfLeapYear(1624));
        assertTrue(assessmentTDD.checkIfLeapYear(1628));
        assertTrue(assessmentTDD.checkIfLeapYear(1632));
        assertTrue(assessmentTDD.checkIfLeapYear(1636));
        assertTrue(assessmentTDD.checkIfLeapYear(1640));
        assertTrue(assessmentTDD.checkIfLeapYear(1644));
        assertTrue(assessmentTDD.checkIfLeapYear(1648));
        assertTrue(assessmentTDD.checkIfLeapYear(1652));
        assertTrue(assessmentTDD.checkIfLeapYear(1656));
        assertTrue(assessmentTDD.checkIfLeapYear(1660));
        assertTrue(assessmentTDD.checkIfLeapYear(1664));
        assertTrue(assessmentTDD.checkIfLeapYear(1668));
        assertTrue(assessmentTDD.checkIfLeapYear(1672));
        assertTrue(assessmentTDD.checkIfLeapYear(1676));
        assertTrue(assessmentTDD.checkIfLeapYear(1680));
        assertTrue(assessmentTDD.checkIfLeapYear(1684));
        assertTrue(assessmentTDD.checkIfLeapYear(1688));
        assertTrue(assessmentTDD.checkIfLeapYear(1692));
        assertTrue(assessmentTDD.checkIfLeapYear(1696));
        assertTrue(assessmentTDD.checkIfLeapYear(1704));
        assertTrue(assessmentTDD.checkIfLeapYear(1708));
        assertTrue(assessmentTDD.checkIfLeapYear(1712));
        assertTrue(assessmentTDD.checkIfLeapYear(1716));
        assertTrue(assessmentTDD.checkIfLeapYear(1720));
        assertTrue(assessmentTDD.checkIfLeapYear(1724));
        assertTrue(assessmentTDD.checkIfLeapYear(1728));
        assertTrue(assessmentTDD.checkIfLeapYear(1732));
        assertTrue(assessmentTDD.checkIfLeapYear(1736));
        assertTrue(assessmentTDD.checkIfLeapYear(1740));
        assertTrue(assessmentTDD.checkIfLeapYear(1744));
        assertTrue(assessmentTDD.checkIfLeapYear(1748));
        assertTrue(assessmentTDD.checkIfLeapYear(1752));
        assertTrue(assessmentTDD.checkIfLeapYear(1756));
        assertTrue(assessmentTDD.checkIfLeapYear(1760));
        assertTrue(assessmentTDD.checkIfLeapYear(1764));
        assertTrue(assessmentTDD.checkIfLeapYear(1768));
        assertTrue(assessmentTDD.checkIfLeapYear(1772));
        assertTrue(assessmentTDD.checkIfLeapYear(1776));
        assertTrue(assessmentTDD.checkIfLeapYear(1780));
        assertTrue(assessmentTDD.checkIfLeapYear(1784));
        assertTrue(assessmentTDD.checkIfLeapYear(1788));
        assertTrue(assessmentTDD.checkIfLeapYear(1792));
        assertTrue(assessmentTDD.checkIfLeapYear(1796));
        assertTrue(assessmentTDD.checkIfLeapYear(1804));
        assertTrue(assessmentTDD.checkIfLeapYear(1808));
        assertTrue(assessmentTDD.checkIfLeapYear(1812));
        assertTrue(assessmentTDD.checkIfLeapYear(1816));
        assertTrue(assessmentTDD.checkIfLeapYear(1820));
        assertTrue(assessmentTDD.checkIfLeapYear(1824));
        assertTrue(assessmentTDD.checkIfLeapYear(1828));
        assertTrue(assessmentTDD.checkIfLeapYear(1832));
        assertTrue(assessmentTDD.checkIfLeapYear(1836));
        assertTrue(assessmentTDD.checkIfLeapYear(1840));
        assertTrue(assessmentTDD.checkIfLeapYear(1844));
        assertTrue(assessmentTDD.checkIfLeapYear(1848));
        assertTrue(assessmentTDD.checkIfLeapYear(1852));
        assertTrue(assessmentTDD.checkIfLeapYear(1856));
        assertTrue(assessmentTDD.checkIfLeapYear(1860));
        assertTrue(assessmentTDD.checkIfLeapYear(1864));
        assertTrue(assessmentTDD.checkIfLeapYear(1868));
        assertTrue(assessmentTDD.checkIfLeapYear(1872));
        assertTrue(assessmentTDD.checkIfLeapYear(1876));
        assertTrue(assessmentTDD.checkIfLeapYear(1880));
        assertTrue(assessmentTDD.checkIfLeapYear(1884));
        assertTrue(assessmentTDD.checkIfLeapYear(1888));
        assertTrue(assessmentTDD.checkIfLeapYear(1892));
        assertTrue(assessmentTDD.checkIfLeapYear(1896));
        assertTrue(assessmentTDD.checkIfLeapYear(1904));
        assertTrue(assessmentTDD.checkIfLeapYear(1908));
        assertTrue(assessmentTDD.checkIfLeapYear(1912));
        assertTrue(assessmentTDD.checkIfLeapYear(1916));
        assertTrue(assessmentTDD.checkIfLeapYear(1920));
        assertTrue(assessmentTDD.checkIfLeapYear(1924));
        assertTrue(assessmentTDD.checkIfLeapYear(1928));
        assertTrue(assessmentTDD.checkIfLeapYear(1932));
        assertTrue(assessmentTDD.checkIfLeapYear(1936));
        assertTrue(assessmentTDD.checkIfLeapYear(1940));
        assertTrue(assessmentTDD.checkIfLeapYear(1944));
        assertTrue(assessmentTDD.checkIfLeapYear(1948));
        assertTrue(assessmentTDD.checkIfLeapYear(1952));
        assertTrue(assessmentTDD.checkIfLeapYear(1956));
        assertTrue(assessmentTDD.checkIfLeapYear(1960));
        assertTrue(assessmentTDD.checkIfLeapYear(1964));
        assertTrue(assessmentTDD.checkIfLeapYear(1968));
        assertTrue(assessmentTDD.checkIfLeapYear(1972));
        assertTrue(assessmentTDD.checkIfLeapYear(1976));
        assertTrue(assessmentTDD.checkIfLeapYear(1980));
        assertTrue(assessmentTDD.checkIfLeapYear(1984));
        assertTrue(assessmentTDD.checkIfLeapYear(1988));
        assertTrue(assessmentTDD.checkIfLeapYear(1992));
        assertTrue(assessmentTDD.checkIfLeapYear(1996));
        assertTrue(assessmentTDD.checkIfLeapYear(2000));
        assertTrue(assessmentTDD.checkIfLeapYear(2004));
        assertTrue(assessmentTDD.checkIfLeapYear(2008));
        assertTrue(assessmentTDD.checkIfLeapYear(2012));
        assertTrue(assessmentTDD.checkIfLeapYear(2016));
        assertTrue(assessmentTDD.checkIfLeapYear(2020));

    }
}
