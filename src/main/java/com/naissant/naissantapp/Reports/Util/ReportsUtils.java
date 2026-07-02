// /**
//  * Desarrollo por: Ing. Harry Morales
//  * Dpto. Sistemas - Naissant 2025
//  **/

// package com.naissant.naissantapp.Reports.Util;

// import java.io.File;
// import java.io.IOException;
// import java.net.URI;
// import java.nio.file.Files;
// import java.nio.file.Paths;
// import java.sql.Connection;
// import java.sql.SQLException;
// import java.util.Map;
// import java.util.UUID;
// import javax.sql.DataSource;
// import net.sf.jasperreports.engine.JRException;
// import net.sf.jasperreports.engine.JRParameter;
// import net.sf.jasperreports.engine.JasperCompileManager;
// import net.sf.jasperreports.engine.JasperExportManager;
// import net.sf.jasperreports.engine.JasperFillManager;
// import net.sf.jasperreports.engine.JasperPrint;
// import net.sf.jasperreports.engine.JasperReport;
// import net.sf.jasperreports.engine.export.JRXlsExporter;
// import net.sf.jasperreports.engine.util.JRLoader;
// import net.sf.jasperreports.export.SimpleExporterInput;
// import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
// import net.sf.jasperreports.export.SimpleXlsReportConfiguration;
// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
// import org.springframework.core.io.ClassPathResource;


// public class ReportsUtils {

//     public static String APPBASEPATH;

//     public static String REPORT_TEMP_PATH;
//     public static String SEPARATOR = File.separator;
//     public static String REPORTPATH = "Reports";
//     public static String IMAGES_PATH = REPORTPATH + SEPARATOR + "Images";
//     public static String SUB_REPORTPATH = REPORTPATH + SEPARATOR + "SubReports";
//     private static final Logger logger = LoggerFactory.getLogger(ReportsUtils.class);

//     public static ReportResponse pdfCreator(
//             String reportName,
//             String pdfName,
//             Map<String, Object> parameters,
//             DataSource datasource
//     ) {
//         byte[] bytesResult = null;
//         ReportResponse response = null;

//         bytesResult = pdfBytes(reportName, null, parameters, datasource);
//         if (bytesResult == null) {
//             return null;
//         }

//         String uuid = UUID.randomUUID().toString();
//         pdfName = (pdfName == null || pdfName.trim().isEmpty()) ? uuid : pdfName;

//         response = new ReportResponse();
//         response.setContentDisposition("Content-Disposition");
//         response.setContentDispositionValue("inline; filename=\"" + pdfName + "\".pdf");
//         response.setContentType("application/pdf");
//         response.setResponsebytes(bytesResult);
//         response.setResponseLength(bytesResult.length);

//         return response;
//     }

//     public static ReportResponse pdfCreator(
//             String reportName,
//             String location,
//             String pdfName,
//             Map<String, Object> parameters,
//             DataSource datasource
//     ) {
//         byte[] bytesResult = null;
//         ReportResponse response = null;

//         bytesResult = pdfBytes(reportName, location, parameters, datasource);
//         if (bytesResult == null) {
//             return null;
//         }

//         String uuid = UUID.randomUUID().toString();
//         pdfName = (pdfName == null || pdfName.trim().isEmpty()) ? uuid : pdfName;

//         response = new ReportResponse();
//         response.setContentDisposition("Content-Disposition");
//         response.setContentDispositionValue("inline; filename=\"" + pdfName + "\".pdf");
//         response.setContentType("application/pdf");
//         response.setResponsebytes(bytesResult);
//         response.setResponseLength(bytesResult.length);

//         return response;
//     }

//     public static ReportResponse pdfCreator(
//             String reportName,
//             String location,
//             String pdfName,
//             Map<String, Object> parameters,
//             Connection datasource
//     ) {
//         byte[] bytesResult = null;
//         ReportResponse response = null;

//         bytesResult = pdfBytes(reportName, location, parameters, datasource);
//         if (bytesResult == null) {
//             return null;
//         }

//         String uuid = UUID.randomUUID().toString();
//         pdfName = (pdfName == null || pdfName.trim().isEmpty()) ? uuid : pdfName;

//         response = new ReportResponse();
//         response.setContentDisposition("Content-Disposition");
//         response.setContentDispositionValue("inline; filename=\"" + pdfName + "\".pdf");
//         response.setContentType("application/pdf");
//         response.setResponsebytes(bytesResult);
//         response.setResponseLength(bytesResult.length);

//         return response;
//     }

//     public static ReportResponse excelCreator(
//             String reportName,
//             String location,
//             String xlsName,
//             Map<String, Object> parameters,
//             DataSource datasource
//     ) {
//         byte[] bytesResult = null;
//         ReportResponse response = null;

//         String uuid = UUID.randomUUID().toString();
//         xlsName = (xlsName == null || xlsName.trim().isEmpty()) ? uuid : xlsName;

//         bytesResult = excelBytes(xlsName, reportName, location, parameters, datasource);
//         if (bytesResult == null) {
//             return null;
//         }

//         response = new ReportResponse();
//         response.setContentDisposition("Content-Disposition");
//         response.setContentDispositionValue("inline; filename=\"" + xlsName + "\".xls");
//         response.setContentType("application/vnd.ms-excel");
//         response.setResponsebytes(bytesResult);
//         response.setResponseLength(bytesResult.length);

//         return response;
//     }

//     public static ReportResponse excelCreator(
//             String reportName,
//             String location,
//             String xlsName,
//             Map<String, Object> parameters,
//             Connection datasource
//     ) {
//         byte[] bytesResult = null;
//         ReportResponse response = null;

//         String uuid = UUID.randomUUID().toString();
//         xlsName = (xlsName == null || xlsName.trim().isEmpty()) ? uuid : xlsName;

//         bytesResult = excelBytes(xlsName, reportName, location, parameters, datasource);
//         if (bytesResult == null) {
//             return null;
//         }

//         response = new ReportResponse();
//         response.setContentDisposition("Content-Disposition");
//         response.setContentDispositionValue("inline; filename=\"" + xlsName + "\".xls");
//         response.setContentType("application/vnd.ms-excel");
//         response.setResponsebytes(bytesResult);
//         response.setResponseLength(bytesResult.length);

//         return response;
//     }

//     public static byte[] pdfBytes(String reportName, String location, Map parameters, DataSource datasource) {
//         JasperPrint jasperPrint;

//         Connection conn = null;
//         try {

//             conn = datasource.getConnection();
//             parameters.put("SUBREPORT_DIR", SUB_REPORTPATH);
//             parameters.put("IMAGES_PATH", IMAGES_PATH);
            
//             String[] reportNameParts = reportName.split("\\.");
//             File jasperFile = reportFile(location, reportNameParts[0], reportNameParts[1]);
//             if (jasperFile == null || !jasperFile.exists()) {
//                 return null;
//             }
//             JasperReport report = reportJasper(jasperFile);
//             if (report == null) {
//                 return null;
//             }
//             jasperPrint = JasperFillManager.fillReport(report,
//                     parameters, conn);
//             byte[] bytes = JasperExportManager.exportReportToPdf(jasperPrint);
//             return bytes;
//         } catch (JRException | IOException ex) {
//             logger.warn("Error obteniendo datos del reporte: " + ex.getMessage());
//         } catch (SQLException ex) {
//             logger.warn("Error obteniendo datos de la conexion: " + ex.getMessage());
//         } finally {
//             try {
//                 if (conn != null && !conn.isClosed()) {
//                     conn.close();
//                 }
//             } catch (SQLException ex) {
//                 logger.warn("Error generando reporte: " + ex.getMessage());
//             }
//         }
//         return null;
//     }

//     public static byte[] pdfBytes(String reportName, String location, Map parameters, Connection datasource) {
//         JasperPrint jasperPrint;

//         try {
//             parameters.put("SUBREPORT_DIR", SUB_REPORTPATH);
//             parameters.put("IMAGES_PATH", IMAGES_PATH);
            
//             String[] reportNameParts = reportName.split("\\.");
//             File jasperFile = reportFile(location, reportNameParts[0], reportNameParts[1]);
//             if (jasperFile == null || !jasperFile.exists()) {
//                 return null;
//             }
//             JasperReport report = reportJasper(jasperFile);
//             if (report == null) {
//                 return null;
//             }
//             jasperPrint = JasperFillManager.fillReport(report,
//                     parameters, datasource);
//             byte[] bytes = JasperExportManager.exportReportToPdf(jasperPrint);
//             return bytes;
//         } catch (JRException | IOException ex) {
//             logger.warn("Error obteniendo datos del reporte: " + ex.getMessage());
//         }
//         return null;
//     }

//     public static byte[] excelBytes(String fileName, String reportName, String location, Map parameters, DataSource datasource) {
//         JasperPrint jasperPrint;
//         Connection conn = null;
//         try {

//             conn = datasource.getConnection();

//             String SUB_REPORTPATH = APPBASEPATH + REPORTPATH + (location == null ? "" : location)
//                     + SEPARATOR + "Sub_reports" + SEPARATOR;

//             parameters.put("SUBREPORT_DIR", SUB_REPORTPATH);
//             parameters.put("IMAGES_PATH", IMAGES_PATH);
//             parameters.put(JRParameter.IS_IGNORE_PAGINATION, Boolean.TRUE);
            
//             String[] reportNameParts = reportName.split("\\.");
//             File jasperFile = reportFile(location, reportNameParts[0], reportNameParts[1]);
//             if (jasperFile == null || !jasperFile.exists()) {
//                 return null;
//             }
//             JasperReport report = reportJasper(jasperFile);
//             if (report == null) {
//                 return null;
//             }
//             jasperPrint = JasperFillManager.fillReport(report,
//                     parameters, conn);
//             String pathToExport = REPORT_TEMP_PATH;
//             File pathFile = new File(pathToExport);
//             if (!pathFile.exists()) {
//                 pathFile.mkdirs();
//             }
//             pathToExport += fileName + ".xls";
//             pathFile = new File(pathToExport);
//             if (!pathFile.exists()) {
//                 pathFile.createNewFile();
//             }
//             JRXlsExporter excelExporter = new JRXlsExporter();
//             excelExporter.setExporterInput(new SimpleExporterInput(jasperPrint));
//             excelExporter.setExporterOutput(new SimpleOutputStreamExporterOutput(pathToExport));
//             SimpleXlsReportConfiguration config = new SimpleXlsReportConfiguration();
//             config.setOnePagePerSheet(Boolean.FALSE);
//             config.setRemoveEmptySpaceBetweenRows(Boolean.TRUE);
//             config.setFontSizeFixEnabled(Boolean.TRUE);
//             config.setWrapText(Boolean.FALSE);
//             config.setWhitePageBackground(true);
//             excelExporter.setConfiguration(config);
//             excelExporter.exportReport();
//             URI uri = pathFile.toURI();
//             byte[] result = Files.readAllBytes(Paths.get(uri));
//             pathFile.delete();
//             return result;
//         } catch (JRException ex) {
//             logger.warn("Error obteniendo datos del reporte: " + ex.getMessage());
//         } catch (SQLException | IOException ex) {
//             logger.warn("Error obteniendo datos de la conexion: " + ex.getMessage());
//         } finally {
//             try {
//                 if (conn != null && !conn.isClosed()) {
//                     conn.close();
//                 }
//             } catch (SQLException ex) {
//                 logger.warn("Error generando reporte: " + ex.getMessage());
//             }
//         }
//         return null;
//     }

//     public static byte[] excelBytes(String fileName, String reportName, String location, Map parameters, Connection datasource) {
//         JasperPrint jasperPrint;

//         try {

//             parameters.put("SUBREPORT_DIR", SUB_REPORTPATH);
//             parameters.put("IMAGES_PATH", IMAGES_PATH);
//             parameters.put(JRParameter.IS_IGNORE_PAGINATION, Boolean.TRUE);
            
//             String[] reportNameParts = reportName.split("\\.");
//             File jasperFile = reportFile(location, reportNameParts[0], reportNameParts[1]);
//             if (jasperFile == null || !jasperFile.exists()) {
//                 return null;
//             }
//             JasperReport report = reportJasper(jasperFile);
//             if (report == null) {
//                 return null;
//             }
//             jasperPrint = JasperFillManager.fillReport(report,
//                     parameters, datasource);
//             String pathToExport = REPORT_TEMP_PATH;
//             File pathFile = new File(pathToExport);
//             if (!pathFile.exists()) {
//                 pathFile.mkdirs();
//             }
//             pathToExport += fileName + ".xls";
//             pathFile = new File(pathToExport);
//             if (!pathFile.exists()) {
//                 pathFile.createNewFile();
//             }
//             JRXlsExporter excelExporter = new JRXlsExporter();
//             excelExporter.setExporterInput(new SimpleExporterInput(jasperPrint));
//             excelExporter.setExporterOutput(new SimpleOutputStreamExporterOutput(pathToExport));
//             SimpleXlsReportConfiguration config = new SimpleXlsReportConfiguration();
//             config.setOnePagePerSheet(Boolean.FALSE);
//             config.setRemoveEmptySpaceBetweenRows(Boolean.TRUE);
//             config.setFontSizeFixEnabled(Boolean.TRUE);
//             config.setWrapText(Boolean.FALSE);
//             config.setWhitePageBackground(true);
//             excelExporter.setConfiguration(config);
//             excelExporter.exportReport();
//             URI uri = pathFile.toURI();
//             byte[] result = Files.readAllBytes(Paths.get(uri));
//             pathFile.delete();
//             return result;
//         } catch (JRException ex) {
//             logger.warn("Error obteniendo datos del reporte: " + ex.getMessage());
//         } catch (IOException ex) {
//             logger.warn("Error obteniendo datos del reporte: " + ex.getMessage());
//         }
//         return null;
//     }

//     public static File reportFile(String location, String reportName, String extension) 
//             throws IOException {
//         return reportFullPath(location, reportName + "." + extension);
//     }

//     public static File reportFullPath(String location, String fileName) 
//             throws IOException  {
//         System.out.println("*************************************************");
//         System.out.println("*************************************************");
//         System.out.println("*************************************************");
//         System.out.println("*************************************************");
//         System.out.println("location: " + location);
//         System.out.println("fileName: " + fileName);
//         String auxLocation = location == null ? "" : location;
//         System.out.println("auxLocation: " + auxLocation);
//         String fileLocation = REPORTPATH + SEPARATOR + auxLocation + fileName;
//         System.out.println("str: " + fileLocation);
//         System.out.println("*************************************************");
//         System.out.println("*************************************************");
//         System.out.println("*************************************************");
//         System.out.println("*************************************************");
//         return new ClassPathResource(fileLocation).getFile();
//     }

//     public static JasperReport reportJasper(String location, String reportPath, String extension) {
//         try {
//             if (reportPath.contains(".jasper")) {
//                 File fileJasper = reportFile(location, reportPath, extension);
//                 return (JasperReport) JRLoader.loadObject(fileJasper);
//             } else if (reportPath.contains(".jrxml")) {
//                 return JasperCompileManager
//                         .compileReport(reportPath + "." + extension);
//             }
//         } catch (JRException | IOException e) {
//             logger.warn("Error obteniendo datos del reporte: " + e.getMessage());
//         }
//         return null;
//     }

//     public static JasperReport reportJasper(File jasperFile) {
//         try {

//             String filePath = jasperFile.getAbsolutePath();
//             if (filePath.contains(".jasper")) {
//                 return (JasperReport) JRLoader.loadObject(jasperFile);
//             } else if (filePath.contains(".jrxml")) {
//                 return JasperCompileManager
//                         .compileReport(filePath);
//             }
//         } catch (JRException e) {
//             logger.warn("Error obteniendo datos del reporte: " + e.getMessage());
//         }
//         return null;
//     }

// }
