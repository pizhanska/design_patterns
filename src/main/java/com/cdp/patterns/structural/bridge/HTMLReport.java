package com.cdp.patterns.structural.bridge;

public class HTMLReport extends Report{

    public HTMLReport(ReportArtifact artifact){
        super(artifact);
    }
    @Override
    public void createReport() {
        System.out.println("Add some artifacts to HTML report");
        artifact.addArtifact();
    }
}
