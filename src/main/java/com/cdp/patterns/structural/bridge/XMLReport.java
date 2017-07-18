package com.cdp.patterns.structural.bridge;

public class XMLReport extends Report {

    public XMLReport(ReportArtifact artifact){
        super(artifact);
    }
    @Override
    public void createReport() {
        System.out.println("Add some artifacts to XML report");
        artifact.addArtifact();
    }
}
