package remotePrintService;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;

import javax.ejb.Remote;
import javax.print.PrintException;
/**
 * 
 * @author ironblaster,Vidaniello
 *
 * this method allows connection to remote printing methods
 * based on locally installed printers (on the server)
 * Cups printers are used in the test environment.
 */
@Remote
public interface PrintServiceRemote extends Serializable {
	
	/**
	 * 
	 * @return Collection of printer names installed on server
	 */
	public Collection<String> getIntalledPrinters();
	
	/**
	 * 
	 * @param printerName Installed on server (use getInstalledPrinters)
	 * @param PdfDocument
	 * @throws PrintException
	 * @throws IOException
	 */
	public void PrintPdfDocument(String printerName,ByteArrayOutputStream PdfDocument)throws PrintException, IOException;

}
