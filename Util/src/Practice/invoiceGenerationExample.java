/*package Practice;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Date;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import com.itextpdf.awt.DefaultFontMapper;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.Barcode128;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.DatabaseMetaData;
import com.mysql.jdbc.Statement;

public class invoiceGenerationExample {

	*//**
	 * @param args
	 *//*
	public static Connection con = null;
	public static Statement st = null;
	public static ResultSet rs = null;
//	private static String USER_PASS = "Hello123";
//
//	private static String OWNER_PASS = "Owner123";

	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager.getConnection(
					"jdbc:mysql://ec2-23-21-211-172.compute-1.amazonaws.com:3306/expensemanagementsystem", "contact-sukanth", "sukindi@");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	
	public static JFreeChart generatePieChart() {
        DefaultPieDataset dataSet = new DefaultPieDataset();
        dataSet.setValue("China", 19.64);
        dataSet.setValue("India", 17.3);
        dataSet.setValue("United States", 4.54);
        dataSet.setValue("Indonesia", 3.4);
        dataSet.setValue("Brazil", 2.83);
        dataSet.setValue("Pakistan", 2.48);
        dataSet.setValue("Bangladesh", 2.38);
 
        JFreeChart chart = ChartFactory.createPieChart(
                "World Population by countries", dataSet, true, true, false);
 
        return chart;
    }
	
	
	 public static JFreeChart generateBarChart() {
	        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
	        dataSet.setValue(791, "Population", "1750 AD");
	        dataSet.setValue(978, "Population", "1800 AD");
	        dataSet.setValue(1262, "Population", "1850 AD");
	        dataSet.setValue(1650, "Population", "1900 AD");
	        dataSet.setValue(2519, "Population", "1950 AD");
	        dataSet.setValue(6070, "Population", "2000 AD");
	 
	        JFreeChart chart = ChartFactory.createBarChart(
	                "World Population growth", "Year", "Population in millions",
	                dataSet, PlotOrientation.VERTICAL, false, true, false);
	 
	        return chart;
	    }
	    
	 
	 public static void writeChartToPDF(JFreeChart chart, int width, int height, String fileName) {
	        PdfWriter writer = null;
	     
	        Document document = new Document();
	     
	        try {
	            writer = PdfWriter.getInstance(document, new FileOutputStream(
	                    fileName));
	            document.open();
	            PdfContentByte contentByte = writer.getDirectContent();
	            PdfTemplate template = contentByte.createTemplate(width, height);
	            Graphics2D graphics2d = template.createGraphics(width, height,
	                    new DefaultFontMapper());
	            Rectangle2D rectangle2d = new Rectangle2D.Double(0, 0, width,
	                    height);
	     
	            chart.draw(graphics2d, rectangle2d);
	             
	            graphics2d.dispose();
	            contentByte.addTemplate(template, 0, 0);
	     
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        document.close();
	    }

	
	
	public OutputStream generateInvoice(ResultSet rs) throws MalformedURLException,
			IOException, DocumentException, SQLException {
		OutputStream file = new FileOutputStream(
				new File("/Users/sukanthgunda/Desktop/Expense_invoice.pdf"));

		Document document = new Document(PageSize.A4);
		Image image = Image.getInstance("image/exp.jpg");
		image.scaleAbsolute(120f, 70f);// image width,height
		image.setAlignment(50);
		 PdfWriter writer = PdfWriter.getInstance(document, file);
		PdfPTable table = new PdfPTable(3);
		PdfPCell cell = new PdfPCell(new Paragraph("Expense Management System"));
		//Generate BarCode
		 Barcode128 code128 = new Barcode128();
		    code128.setGenerateChecksum(true);
		    code128.setCode("45569346573434");
		cell.setColspan(3);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell.setPadding(10.0f);
		cell.setBackgroundColor(new BaseColor(140, 221, 8));
		table.addCell(cell);
		table.addCell("UserName");
		table.addCell("ExpenseName");
		table.addCell("amount");
		while(rs.next()){
			table.addCell(rs.getString(1));
			table.addCell(rs.getString(2));
			table.addCell(rs.getString(5));
		}
		table.setSpacingBefore(30.0f);
		table.setSpacingAfter(30.0f);
//		writer.setEncryption(USER_PASS.getBytes(), OWNER_PASS.getBytes(),
//				PdfWriter.ALLOW_PRINTING, PdfWriter.ENCRYPTION_AES_128);

		document.open();
		document.add(image);
		document.add(new Paragraph("Dear RoomMates,"));
		document.add(new Paragraph("Document Generated On - "
				+ new Date().toString()));
		document.add(code128.createImageWithBarcode(writer.getDirectContent(), null, null));
		document.add(table);
		document.close();

		file.close();

		System.out.println("Pdf created successfully..");
		return file;

	}

	public static void main(String[] args) throws SQLException, MalformedURLException, IOException, DocumentException {

		invoiceGenerationExample example = new invoiceGenerationExample();
		example.getConnection();
		System.out.println("connection established");
		DatabaseMetaData dbmd = (DatabaseMetaData) con.getMetaData();
		System.out.println("Database used is " + "'"
				+ dbmd.getDatabaseProductName() + "'");
		System.out.println("Driver Name is " + dbmd.getDriverName());
		st = (Statement) con.createStatement();
		ResultSet rs = st.executeQuery("select * from expense");
		ResultSetMetaData metadata = rs.getMetaData();
			example.generateInvoice(rs);
			writeChartToPDF(generateBarChart(), 300, 200, "/Users/sukanthgunda/Desktop/barchart.pdf");
    	    writeChartToPDF(generatePieChart(), 300, 200, "/Users/sukanthgunda/Desktop/piechart.pdf");
		rs.close();
		st.close();
		con.close();
		
	}

}
*/