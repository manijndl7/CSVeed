package org.csveed.common;

import org.csveed.report.CsvException;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ColumnTest {

    @Test
    public void excelColumnToColumnIndex() {
        Column excel = new ColumnExcel("AH");
        assertEquals(34, excel.getColumnIndex());
    }

    @Test
    public void largestPossibleIndex() {
        Column excel = new ColumnExcel("ZZ");
        assertEquals(702, excel.getColumnIndex());
    }

    @Test
    public void columnIndexToExcelColumn() {
        Column excel = new Column(34);
        assertEquals("AH", excel.getExcelColumn());
    }

    @Test(expected = CsvException.class)
    public void wrongIndex() {
        Column excel = new Column(0);
        excel.getExcelColumn();
    }

    @Test
    public void nextColumn() {
        Column column = new Column(3);
        assertEquals(4, column.nextColumn().getColumnIndex());
    }

    @Test
    public void reset() {
        Column column = new Column(3);
        assertEquals(Column.FIRST_COLUMN_INDEX, column.nextLine().getColumnIndex());
    }

    @Test
    public void equals() {
        assertEquals(new Column(3), new Column(3));
    }

}