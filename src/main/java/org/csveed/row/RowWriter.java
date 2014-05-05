package org.csveed.row;

import org.csveed.api.Header;
import org.csveed.api.Row;

public interface RowWriter {

    /**
    * Writes the cells of a table row as an individual row
    * @param cells the individual cells of the row
    * @return the Row, created from the cells
    */
    public Row writeRow(String[] cells);

    /**
    * Writes a single row to the Writer.
    * @param row row to write to the Writer
    * @return the Row, created from the cells
    */
    public Row writeRow(Row row) throws RowWriteException;

    /**
    * Creates and sets the header of the table
    * @param headerNames the individual cells of the header row
    * @return the Header, created from the header names
    */
    public Header writeHeader(String[] headerNames);

    /**
    * Sets the header of the table
    * @param header the header row
    * @return the Header, created from the header names
    */
    public Header writeHeader(Header header);

    /**
    * The set of instructions for dealing with rows
    * @return row instructions
    */
    public RowInstructions getRowInstructions();

}