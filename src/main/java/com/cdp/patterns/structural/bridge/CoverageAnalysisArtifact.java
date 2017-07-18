package com.cdp.patterns.structural.bridge;

public class CoverageAnalysisArtifact implements ReportArtifact {

    public void addArtifact() {
        System.out.println("Add detailed coverage, description, etc.");
    }
}
