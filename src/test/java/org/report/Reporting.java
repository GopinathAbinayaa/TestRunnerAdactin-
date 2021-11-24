package org.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {
	public static void generateReport(String jsonfile) {
		String path = System.getProperty("user.dir");

		File reportDirectory = new File(path + "\\src\\test\\resources\\Reports");
		Configuration configuration = new Configuration(reportDirectory, "Adactin Hotel");
		configuration.addClassifications("Browser", "chrome");
		configuration.addClassifications("Browser Version", "96");
		configuration.addClassifications("OS", "Windows 7");
		configuration.addClassifications("sprint", "34");
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonfile);
		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
		reportBuilder.generateReports();
	}
}
