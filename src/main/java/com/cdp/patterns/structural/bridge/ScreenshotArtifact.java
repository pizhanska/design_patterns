package com.cdp.patterns.structural.bridge;

public class ScreenshotArtifact implements ReportArtifact {

    public void addArtifact() {
        System.out.println("Add screenshots to report");
    }
}
