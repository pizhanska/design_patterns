package com.cdp.patterns.structural.bridge;

/**
 * Created by Uliana Pizhanska on 18/07/2017.
 */
public class BridgeDemo {

    public static void main(String []args){
        Report htmlReport = new HTMLReport(new CoverageAnalysisArtifact());
        htmlReport.createReport();

        Report xmlReport = new XMLReport(new ScreenshotArtifact());
        xmlReport.createReport();


    }
}
