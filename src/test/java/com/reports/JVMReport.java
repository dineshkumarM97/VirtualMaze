package com.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

	public static void genrateJVMReport(String json) {
		File file = new File(System.getProperty("user.dir") + "\\targer");
		Configuration con = new Configuration(file, "Sample");
		con.addClassifications("browserName", "chrome");
		con.addClassifications("plateform", "windows");
		con.addClassifications("version", "12");

		List<String> li = new ArrayList<>();
		li.add(json);

		ReportBuilder builder = new ReportBuilder(li, con);
		builder.generateReports();

	}
}
