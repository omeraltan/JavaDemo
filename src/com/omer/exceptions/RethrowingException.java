package com.omer.exceptions;

import java.io.IOException;
import java.sql.SQLException;

public class RethrowingException {
    public static void main(String[] args) throws Exception {
        try {
            rethrow();
        }catch (Exception e){
            e = new IOException();
            throw e;
        }
    }

    public static void rethrow() throws SQLException, IOException{}
}
