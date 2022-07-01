package com.jspsmart.upload;

/**
 * @Date ：2022/6/10 17:05
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：SmartUpload.java
 * @Software：IntelliJ IDEA
 */
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class SmartUpload {
    protected byte[] m_binArray;
    protected HttpServletRequest m_request;
    protected HttpServletResponse m_response;
    protected ServletContext m_application;
    private int m_totalBytes = 0;
    private int m_currentIndex = 0;
    private int m_startData = 0;
    private int m_endData = 0;
    private String m_boundary = new String();
    private long m_totalMaxFileSize = 0L;
    private long m_maxFileSize = 0L;
    private Vector m_deniedFilesList = new Vector();
    private Vector m_allowedFilesList = new Vector();
    private boolean m_denyPhysicalPath = false;
    private boolean m_forcePhysicalPath = false;
    private String m_contentDisposition = new String();
    public static final int SAVE_AUTO = 0;
    public static final int SAVE_VIRTUAL = 1;
    public static final int SAVE_PHYSICAL = 2;
    private Files m_files = new Files();
    private Request m_formRequest = new Request();

    public SmartUpload() {
    }

    /** @deprecated */
    public final void init(ServletConfig var1) throws ServletException {
        this.m_application = var1.getServletContext();
    }

    /** @deprecated */
    public void service(HttpServletRequest var1, HttpServletResponse var2) throws ServletException, IOException {
        this.m_request = var1;
        this.m_response = var2;
    }

    public final void initialize(ServletConfig var1, HttpServletRequest var2, HttpServletResponse var3) throws ServletException {
        this.m_application = var1.getServletContext();
        this.m_request = var2;
        this.m_response = var3;
    }

    public final void initialize(PageContext var1) throws ServletException {
        this.m_application = var1.getServletContext();
        this.m_request = (HttpServletRequest)var1.getRequest();
        this.m_response = (HttpServletResponse)var1.getResponse();
    }

    /** @deprecated */
    public final void initialize(ServletContext var1, HttpSession var2, HttpServletRequest var3, HttpServletResponse var4, JspWriter var5) throws ServletException {
        this.m_application = var1;
        this.m_request = var3;
        this.m_response = var4;
    }

    public void upload() throws ServletException, IOException, SmartUploadException {
        int var1 = 0;
        boolean var2 = false;
        long var3 = 0L;
        boolean var5 = false;
        new String();
        new String();
        String var8 = new String();
        String var9 = new String();
        String var10 = new String();
        String var11 = new String();
        String var12 = new String();
        String var13 = new String();
        String var14 = new String();
        boolean var15 = false;
        this.m_totalBytes = this.m_request.getContentLength();

        int var18;
        for(this.m_binArray = new byte[this.m_totalBytes]; var1 < this.m_totalBytes; var1 += var18) {
            try {
                this.m_request.getInputStream();
                var18 = this.m_request.getInputStream().read(this.m_binArray, var1, this.m_totalBytes - var1);
            } catch (Exception var17) {
                throw new SmartUploadException("Unable to upload.");
            }
        }

        for(; !var5 && this.m_currentIndex < this.m_totalBytes; ++this.m_currentIndex) {
            if (this.m_binArray[this.m_currentIndex] == 13) {
                var5 = true;
            } else {
                this.m_boundary = this.m_boundary + (char)this.m_binArray[this.m_currentIndex];
            }
        }

        if (this.m_currentIndex != 1) {
            ++this.m_currentIndex;

            while(this.m_currentIndex < this.m_totalBytes) {
                String var6 = this.getDataHeader();
                this.m_currentIndex += 2;
                var15 = var6.indexOf("filename") > 0;
                String var7 = this.getDataFieldValue(var6, "name");
                if (var15) {
                    var10 = this.getDataFieldValue(var6, "filename");
                    var8 = this.getFileName(var10);
                    try {
                        var8 = new String(var8.getBytes("ISO-8859-1"), "GB2312");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    var9 = this.getFileExt(var8);
                    var11 = this.getContentType(var6);
                    var12 = this.getContentDisp(var6);
                    var13 = this.getTypeMIME(var11);
                    var14 = this.getSubTypeMIME(var11);
                }

                this.getDataSection();
                if (var15 && var8.length() > 0) {
                    if (this.m_deniedFilesList.contains(var9)) {
                        throw new SecurityException("The extension of the file is denied to be uploaded (1015).");
                    }

                    if (!this.m_allowedFilesList.isEmpty() && !this.m_allowedFilesList.contains(var9)) {
                        throw new SecurityException("The extension of the file is not allowed to be uploaded (1010).");
                    }

                    if (this.m_maxFileSize > 0L && (long)(this.m_endData - this.m_startData + 1) > this.m_maxFileSize) {
                        throw new SecurityException("Size exceeded for this file : " + var8 + " (1105).");
                    }

                    var3 += (long)(this.m_endData - this.m_startData + 1);
                    if (this.m_totalMaxFileSize > 0L && var3 > this.m_totalMaxFileSize) {
                        throw new SecurityException("Total File Size exceeded (1110).");
                    }
                }

                if (var15) {
                    File var16 = new File();
                    var16.setParent(this);
                    var16.setFieldName(var7);
                    var16.setFileName(var8);
                    var16.setFileExt(var9);
                    var16.setFilePathName(var10);
                    var16.setIsMissing(var10.length() == 0);
                    var16.setContentType(var11);
                    var16.setContentDisp(var12);
                    var16.setTypeMIME(var13);
                    var16.setSubTypeMIME(var14);
                    if (var11.indexOf("application/x-macbinary") > 0) {
                        this.m_startData += 128;
                    }

                    var16.setSize(this.m_endData - this.m_startData + 1);
                    var16.setStartData(this.m_startData);
                    var16.setEndData(this.m_endData);
                    this.m_files.addFile(var16);
                } else {
                    String var19 = new String(this.m_binArray, this.m_startData, this.m_endData - this.m_startData + 1);
                    this.m_formRequest.putParameter(var7, var19);
                }

                if ((char)this.m_binArray[this.m_currentIndex + 1] == '-') {
                    break;
                }

                this.m_currentIndex += 2;
            }

        }
    }

    public int save(String var1) throws ServletException, IOException, SmartUploadException {
        return this.save(var1, 0);
    }

    public int save(String var1, int var2) throws ServletException, IOException, SmartUploadException {
        int var3 = 0;
        if (var1 == null) {
            var1 = this.m_application.getRealPath("/");
        }

        if (var1.indexOf("/") != -1) {
            if (var1.charAt(var1.length() - 1) != '/') {
                var1 = var1 + "/";
            }
        } else if (var1.charAt(var1.length() - 1) != '\\') {
            var1 = var1 + "\\";
        }

        for(int var4 = 0; var4 < this.m_files.getCount(); ++var4) {
            if (!this.m_files.getFile(var4).isMissing()) {
                this.m_files.getFile(var4).saveAs(var1 + this.m_files.getFile(var4).getFileName(), var2);
                ++var3;
            }
        }

        return var3;
    }

    public int getSize() {
        return this.m_totalBytes;
    }

    public byte getBinaryData(int var1) {
        try {
            byte var2 = this.m_binArray[var1];
            return var2;
        } catch (Exception var4) {
            throw new ArrayIndexOutOfBoundsException("Index out of range (1005).");
        }
    }

    public Files getFiles() {
        return this.m_files;
    }

    public Request getRequest() {
        return this.m_formRequest;
    }

    public void downloadFile(String var1) throws ServletException, IOException, SmartUploadException {
        this.downloadFile(var1, (String)null, (String)null);
    }

    public void downloadFile(String var1, String var2) throws ServletException, IOException, SmartUploadException, SmartUploadException {
        this.downloadFile(var1, var2, (String)null);
    }

    public void downloadFile(String var1, String var2, String var3) throws ServletException, IOException, SmartUploadException {
        this.downloadFile(var1, var2, var3, 65000);
    }

    public void downloadFile(String var1, String var2, String var3, int var4) throws ServletException, IOException, SmartUploadException {
        if (var1 == null) {
            throw new IllegalArgumentException("File '" + var1 + "' not found (1040).");
        } else if (var1.equals("")) {
            throw new IllegalArgumentException("File '" + var1 + "' not found (1040).");
        } else if (!this.isVirtual(var1) && this.m_denyPhysicalPath) {
            throw new SecurityException("Physical path is denied (1035).");
        } else {
            if (this.isVirtual(var1)) {
                var1 = this.m_application.getRealPath(var1);
            }

            java.io.File var5 = new java.io.File(var1);
            FileInputStream var6 = new FileInputStream(var5);
            long var7 = var5.length();
            boolean var9 = false;
            int var10 = 0;
            byte[] var11 = new byte[var4];
            if (var2 == null) {
                this.m_response.setContentType("application/x-msdownload");
            } else if (var2.length() == 0) {
                this.m_response.setContentType("application/x-msdownload");
            } else {
                this.m_response.setContentType(var2);
            }

            this.m_response.setContentLength((int)var7);
            this.m_contentDisposition = this.m_contentDisposition == null ? "attachment;" : this.m_contentDisposition;
            if (var3 == null) {
                this.m_response.setHeader("Content-Disposition", this.m_contentDisposition + " filename=" + this.getFileName(var1));
            } else if (var3.length() == 0) {
                this.m_response.setHeader("Content-Disposition", this.m_contentDisposition);
            } else {
                this.m_response.setHeader("Content-Disposition", this.m_contentDisposition + " filename=" + var3);
            }

            while((long)var10 < var7) {
                int var12 = var6.read(var11, 0, var4);
                var10 += var12;
                this.m_response.getOutputStream().write(var11, 0, var12);
            }

            var6.close();
        }
    }

    public void downloadField(ResultSet var1, String var2, String var3, String var4) throws ServletException, IOException, SQLException {
        if (var1 == null) {
            throw new IllegalArgumentException("The RecordSet cannot be null (1045).");
        } else if (var2 == null) {
            throw new IllegalArgumentException("The columnName cannot be null (1050).");
        } else if (var2.length() == 0) {
            throw new IllegalArgumentException("The columnName cannot be empty (1055).");
        } else {
            byte[] var5 = var1.getBytes(var2);
            if (var3 == null) {
                this.m_response.setContentType("application/x-msdownload");
            } else if (var3.length() == 0) {
                this.m_response.setContentType("application/x-msdownload");
            } else {
                this.m_response.setContentType(var3);
            }

            this.m_response.setContentLength(var5.length);
            if (var4 == null) {
                this.m_response.setHeader("Content-Disposition", "attachment;");
            } else if (var4.length() == 0) {
                this.m_response.setHeader("Content-Disposition", "attachment;");
            } else {
                this.m_response.setHeader("Content-Disposition", "attachment; filename=" + var4);
            }

            this.m_response.getOutputStream().write(var5, 0, var5.length);
        }
    }

    public void fieldToFile(ResultSet var1, String var2, String var3) throws ServletException, IOException, SmartUploadException, SQLException {
        try {
            if (this.m_application.getRealPath(var3) != null) {
                var3 = this.m_application.getRealPath(var3);
            }

            InputStream var4 = var1.getBinaryStream(var2);
            FileOutputStream var5 = new FileOutputStream(var3);

            int var6;
            while((var6 = var4.read()) != -1) {
                var5.write(var6);
            }

            var5.close();
        } catch (Exception var7) {
            throw new SmartUploadException("Unable to save file from the DataBase (1020).");
        }
    }

    private String getDataFieldValue(String var1, String var2) {
        new String();
        String var4 = new String();
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        String var3 = var2 + "=" + '"';
        int var9 = var1.indexOf(var3);
        if (var9 > 0) {
            int var10 = var9 + var3.length();
            var3 = "\"";
            int var11 = var1.indexOf(var3, var10);
            if (var10 > 0 && var11 > 0) {
                var4 = var1.substring(var10, var11);
            }
        }

        return var4;
    }

    private String getFileExt(String var1) {
        new String();
        boolean var3 = false;
        boolean var4 = false;
        if (var1 == null) {
            return null;
        } else {
            int var5 = var1.lastIndexOf(46) + 1;
            int var6 = var1.length();
            String var2 = var1.substring(var5, var6);
            return var1.lastIndexOf(46) > 0 ? var2 : "";
        }
    }

    private String getContentType(String var1) {
        new String();
        String var3 = new String();
        boolean var4 = false;
        boolean var5 = false;
        String var2 = "Content-Type:";
        int var7 = var1.indexOf(var2) + var2.length();
        if (var7 != -1) {
            int var6 = var1.length();
            var3 = var1.substring(var7, var6);
        }

        return var3;
    }

    private String getTypeMIME(String var1) {
        new String();
        boolean var3 = false;
        int var4 = var1.indexOf("/");
        return var4 != -1 ? var1.substring(1, var4) : var1;
    }

    private String getSubTypeMIME(String var1) {
        new String();
        boolean var3 = false;
        boolean var4 = false;
        int var5 = var1.indexOf("/") + 1;
        if (var5 != -1) {
            int var6 = var1.length();
            return var1.substring(var5, var6);
        } else {
            return var1;
        }
    }

    private String getContentDisp(String var1) {
        new String();
        boolean var3 = false;
        boolean var4 = false;
        int var5 = var1.indexOf(":") + 1;
        int var6 = var1.indexOf(";");
        String var2 = var1.substring(var5, var6);
        return var2;
    }

    private void getDataSection() {
        boolean var1 = false;
        new String();
        int var3 = this.m_currentIndex;
        int var4 = 0;
        int var5 = this.m_boundary.length();
        this.m_startData = this.m_currentIndex;
        this.m_endData = 0;

        while(var3 < this.m_totalBytes) {
            if (this.m_binArray[var3] == (byte)this.m_boundary.charAt(var4)) {
                if (var4 == var5 - 1) {
                    this.m_endData = var3 - var5 + 1 - 3;
                    break;
                }

                ++var3;
                ++var4;
            } else {
                ++var3;
                var4 = 0;
            }
        }

        this.m_currentIndex = this.m_endData + var5 + 3;
    }

    private String getDataHeader() {
        int var1 = this.m_currentIndex;
        int var2 = 0;
        boolean var3 = false;
        boolean var4 = false;

        while(true) {
            while(!var4) {
                if (this.m_binArray[this.m_currentIndex] == 13 && this.m_binArray[this.m_currentIndex + 2] == 13) {
                    var4 = true;
                    var2 = this.m_currentIndex - 1;
                    this.m_currentIndex += 2;
                } else {
                    ++this.m_currentIndex;
                }
            }

            String var5 = new String(this.m_binArray, var1, var2 - var1 + 1);
            return var5;
        }
    }

    private String getFileName(String var1) {
        new String();
        new String();
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        int var8 = var1.lastIndexOf(47);
        if (var8 != -1) {
            return var1.substring(var8 + 1, var1.length());
        } else {
            var8 = var1.lastIndexOf(92);
            return var8 != -1 ? var1.substring(var8 + 1, var1.length()) : var1;
        }
    }

    public void setDeniedFilesList(String var1) throws ServletException, IOException, SQLException {
        String var2 = "";
        if (var1 != null) {
            var2 = "";

            for(int var3 = 0; var3 < var1.length(); ++var3) {
                if (var1.charAt(var3) == ',') {
                    if (!this.m_deniedFilesList.contains(var2)) {
                        this.m_deniedFilesList.addElement(var2);
                    }

                    var2 = "";
                } else {
                    var2 = var2 + var1.charAt(var3);
                }
            }

            if (var2 != "") {
                this.m_deniedFilesList.addElement(var2);
            }
        } else {
            this.m_deniedFilesList = null;
        }

    }

    public void setAllowedFilesList(String var1) {
        String var2 = "";
        if (var1 != null) {
            var2 = "";

            for(int var3 = 0; var3 < var1.length(); ++var3) {
                if (var1.charAt(var3) == ',') {
                    if (!this.m_allowedFilesList.contains(var2)) {
                        this.m_allowedFilesList.addElement(var2);
                    }

                    var2 = "";
                } else {
                    var2 = var2 + var1.charAt(var3);
                }
            }

            if (var2 != "") {
                this.m_allowedFilesList.addElement(var2);
            }
        } else {
            this.m_allowedFilesList = null;
        }

    }

    public void setDenyPhysicalPath(boolean var1) {
        this.m_denyPhysicalPath = var1;
    }

    public void setForcePhysicalPath(boolean var1) {
        this.m_forcePhysicalPath = var1;
    }

    public void setContentDisposition(String var1) {
        this.m_contentDisposition = var1;
    }

    public void setTotalMaxFileSize(long var1) {
        this.m_totalMaxFileSize = var1;
    }

    public void setMaxFileSize(long var1) {
        this.m_maxFileSize = var1;
    }

    protected String getPhysicalPath(String var1, int var2) throws IOException {
        String var3 = new String();
        String var4 = new String();
        new String();
        boolean var6 = false;
        String var5 = System.getProperty("file.separator");
        if (var1 == null) {
            throw new IllegalArgumentException("There is no specified destination file (1140).");
        } else if (var1.equals("")) {
            throw new IllegalArgumentException("There is no specified destination file (1140).");
        } else {
            if (var1.lastIndexOf("\\") >= 0) {
                var3 = var1.substring(0, var1.lastIndexOf("\\"));
                var4 = var1.substring(var1.lastIndexOf("\\") + 1);
            }

            if (var1.lastIndexOf("/") >= 0) {
                var3 = var1.substring(0, var1.lastIndexOf("/"));
                var4 = var1.substring(var1.lastIndexOf("/") + 1);
            }

            var3 = var3.length() == 0 ? "/" : var3;
            java.io.File var7 = new java.io.File(var3);
            if (var7.exists()) {
                var6 = true;
            }

            if (var2 == 0) {
                if (this.isVirtual(var3)) {
                    var3 = this.m_application.getRealPath(var3);
                    if (var3.endsWith(var5)) {
                        var3 = var3 + var4;
                    } else {
                        var3 = var3 + var5 + var4;
                    }

                    return var3;
                } else if (var6) {
                    if (this.m_denyPhysicalPath) {
                        throw new IllegalArgumentException("Physical path is denied (1125).");
                    } else {
                        return var1;
                    }
                } else {
                    throw new IllegalArgumentException("This path does not exist (1135).");
                }
            } else if (var2 == 1) {
                if (this.isVirtual(var3)) {
                    var3 = this.m_application.getRealPath(var3);
                    if (var3.endsWith(var5)) {
                        var3 = var3 + var4;
                    } else {
                        var3 = var3 + var5 + var4;
                    }

                    return var3;
                } else if (var6) {
                    throw new IllegalArgumentException("The path is not a virtual path.");
                } else {
                    throw new IllegalArgumentException("This path does not exist (1135).");
                }
            } else if (var2 == 2) {
                if (var6) {
                    if (this.m_denyPhysicalPath) {
                        throw new IllegalArgumentException("Physical path is denied (1125).");
                    } else {
                        return var1;
                    }
                } else if (this.isVirtual(var3)) {
                    throw new IllegalArgumentException("The path is not a physical path.");
                } else {
                    throw new IllegalArgumentException("This path does not exist (1135).");
                }
            } else {
                return null;
            }
        }
    }

    public void uploadInFile(String var1) throws IOException, SmartUploadException {
        boolean var2 = false;
        int var3 = 0;
        boolean var4 = false;
        if (var1 == null) {
            throw new IllegalArgumentException("There is no specified destination file (1025).");
        } else if (var1.length() == 0) {
            throw new IllegalArgumentException("There is no specified destination file (1025).");
        } else if (!this.isVirtual(var1) && this.m_denyPhysicalPath) {
            throw new SecurityException("Physical path is denied (1035).");
        } else {
            int var9 = this.m_request.getContentLength();

            int var10;
            for(this.m_binArray = new byte[var9]; var3 < var9; var3 += var10) {
                try {
                    var10 = this.m_request.getInputStream().read(this.m_binArray, var3, var9 - var3);
                } catch (Exception var8) {
                    throw new SmartUploadException("Unable to upload.");
                }
            }

            if (this.isVirtual(var1)) {
                var1 = this.m_application.getRealPath(var1);
            }

            try {
                java.io.File var5 = new java.io.File(var1);
                FileOutputStream var6 = new FileOutputStream(var5);
                var6.write(this.m_binArray);
                var6.close();
            } catch (Exception var7) {
                throw new SmartUploadException("The Form cannot be saved in the specified file (1030).");
            }
        }
    }

    private boolean isVirtual(String var1) {
        if (this.m_application.getRealPath(var1) != null) {
            java.io.File var2 = new java.io.File(this.m_application.getRealPath(var1));
            return var2.exists();
        } else {
            return false;
        }
    }
}
