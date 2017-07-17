package com.cdp.patterns.structural.facade;

/**
 * Created by Uliana Pizhanska on 18/07/2017.
 */
public class FacadeHelper {
    public static enum DBTypes{
        MYSQL,ORACLE;
    }

    public static void executeQuery(DBTypes type){
        switch (type){
            case MYSQL:
                MySQLWorker worker = new MySQLWorker();
                worker.createConnection();
                worker.executeQuery();
                break;
            case ORACLE:
                OracleWorker oracleWorker = new OracleWorker();
                oracleWorker.createConnection();
                oracleWorker.executeQuery();
                break;

        }
    }
}
