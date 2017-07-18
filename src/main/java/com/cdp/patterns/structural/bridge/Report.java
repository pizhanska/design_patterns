package com.cdp.patterns.structural.bridge;

/**
 * Created by Uliana Pizhanska on 18/07/2017.
 */
public abstract class Report {
    protected ReportArtifact artifact;

    public Report(ReportArtifact artifact){
        this.artifact = artifact;
    }

    public abstract void createReport();
}
