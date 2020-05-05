package ru.job4j.oop.override;

public class ReportUsage {
    public static void main(String[] args) {
        HtmlReport report = new HtmlReport();
        String text = report.generate("Report's  name", "Report's body");
        System.out.println(text);
        System.out.println();

        JSONReport reportJSON = new JSONReport();
        String textJSON = reportJSON.generate("name", "body");
        System.out.println(textJSON);
    }
}
