/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/
package com.naissant.naissantapp.Controller;

import com.naissant.naissantapp.Entity.SistemReports;
import com.naissant.naissantapp.Reports.Util.ReportResponse;
import com.naissant.naissantapp.Reports.Util.ReportsUtils;
import com.naissant.naissantapp.Service.ISistemReportsService;
import java.io.ByteArrayInputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/reports")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)

public class ReportsController {

    Logger log = LoggerFactory.getLogger(ReportsController.class);

    @Autowired
    private ISistemReportsService reportService;
    @Autowired
    private DataSource dataSource;

    @GetMapping(value = "/pdf/{id}")
    private ResponseEntity<Resource> createPDF(
            @PathVariable("id") String codigo,
            HttpServletRequest request,
            HttpServletResponse response
    ) {
        Connection conn = null;
        byte[] bytes = null;
        ReportResponse responseReport = null;
        try {

            conn = dataSource.getConnection();

            Map<String, Object> parameters = findParameters(request);
            SistemReports report = reportService.findByCodigo(codigo);
            if (report == null) {
                return null;
            }
            parameters.put("IMAGES_PATH", null);

            String fileName = parameters.containsKey("fileName")
                    ? (String) parameters.get("fileName") : "";

            String location = report.getUbicacion();
            String reporte = report.getReporte();

            responseReport = ReportsUtils.pdfCreator(reporte, location, fileName, parameters, conn);
            if (responseReport == null) {
                return null;
            }
           
            bytes = responseReport.getResponsebytes();
        } catch (Exception e) {
            log.warn("Error generando reporte: " + e.getMessage());
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException ex) {
                log.warn("Error generando reporte: " + ex.getMessage());
            }
        }
        HttpHeaders headers = new HttpHeaders();
        headers.add(responseReport.getContentDisposition(), responseReport.getContentDispositionValue());
        return ResponseEntity.ok()
                .headers(headers)
                .contentType(MediaType.valueOf(responseReport.getContentType()))
                .contentLength(responseReport.getResponseLength())
                .body(new InputStreamResource(new ByteArrayInputStream(bytes)));

    }

    @GetMapping(value = "/excel/{id}")
    private ResponseEntity<Resource> createEXCEL(
            @PathVariable("id") String codigo,
            HttpServletRequest request,
            HttpServletResponse response
    ) {

        Connection conn = null;
        byte[] bytes = null;
        ReportResponse responseReport = null;
        try {

            conn = dataSource.getConnection();

            Map<String, Object> parameters = findParameters(request);
            SistemReports report = reportService.findByCodigo(codigo);
            if (report == null) {
                return null;
            }
            parameters.put("IMAGES_PATH", null);

            String fileName = parameters.containsKey("fileName")
                    ? (String) parameters.get("fileName") : "";

            String location = report.getUbicacion();
            String reporte = report.getReporte();

            responseReport
                    = ReportsUtils.excelCreator(reporte, location, fileName, parameters, dataSource);
            if (responseReport == null) {
                return null;
            }
            bytes = responseReport.getResponsebytes();
        } catch (Exception e) {
            log.warn("Error generando reporte: " + e.getMessage());
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException ex) {
                log.warn("Error generando reporte: " + ex.getMessage());
            }
        }
        HttpHeaders headers = new HttpHeaders();
        headers.add(responseReport.getContentDisposition(), responseReport.getContentDispositionValue());

        return ResponseEntity.ok()
                .headers(headers)
                .contentType(MediaType.valueOf(responseReport.getContentType()))
                .contentLength(responseReport.getResponseLength())
                .body(new InputStreamResource(new ByteArrayInputStream(bytes)));

    }

    private Map<String, Object> findParameters(HttpServletRequest request) {
        Enumeration<String> parameters = request.getParameterNames();
        Map<String, Object> result = new HashMap<>();

        String key = null;
        while (parameters.hasMoreElements()) {
            key = parameters.nextElement();
            System.out.println("Key: " + key + " Value: " + request.getParameter(key));
            result.put(key, request.getParameter(key));
        }

        return result;
    }

}
