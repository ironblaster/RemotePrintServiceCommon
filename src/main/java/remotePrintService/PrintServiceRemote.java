package remotePrintService;

import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;

import javax.ejb.Remote;
import javax.print.PrintException;
/**
 * 
 * @author ironblaster,vidaniello
 *
 * this method allows connection to remote printing methods
 * based on locally installed printers (on the server)
 * Cups printers are used in the test environment.
 */
@Remote
public interface PrintServiceRemote extends Serializable {
	
	/**
	 * Return a list of installed printers
	 * @return Collection of printer names installed on server
	 */
	public Collection<String> getIntalledPrinters();
	
	/**
	 * Print the array to specified printer
	 * @param printerName Installed on server (use getInstalledPrinters)
	 * @param PdfDocument
	 * @throws PrintException
	 * @throws IOException
	 */
	public void printPdfDocument(String printerName, byte[] pdfDocument)throws PrintException, IOException;
	
	
	/**
	 * Print the array to specified printer
	 * @param printerName Installed on server (use getInstalledPrinters)
	 * @param PdfDocument
	 * @throws PrintException
	 * @throws IOException
	 */
	public void printPdfDocument(String printerName, byte[] pdfDocument,Integer nCopie)throws PrintException, IOException;

}
