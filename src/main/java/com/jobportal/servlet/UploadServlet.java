package com.jobportal.servlet;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/UploadServlet")
@MultipartConfig(
    fileSizeThreshold = 1024 * 1024, // 1MB
    maxFileSize = 5 * 1024 * 1024,   // 5MB
    maxRequestSize = 10 * 1024 * 1024 // 10MB
)
public class UploadServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Folder where uploaded files will be saved
    private static final String UPLOAD_DIR = "resumes";
    

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // 1. Save uploaded file
        Part filePart = request.getPart("resume");
        String fileName = filePart.getSubmittedFileName();
        String uploadPath = getServletContext().getRealPath("") + File.separator + "resumes";
        new File(uploadPath).mkdir();
        filePart.write(uploadPath + File.separator + fileName);

        // 2. Optional: ATS logic here (check keywords)

        // 3. Send feedback to user
        response.setContentType("text/html");
        response.getWriter().println("<h2>Resume uploaded successfully!</h2>");
        response.getWriter().println("<a href='index.jsp'>Back to Home</a>");
    }

}
