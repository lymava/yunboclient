

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 
 * @author lymava
 *
 */
public class IOUtil {
	
	public static final String charsetName_default = "UTF-8";
	
	public static void copy(InputStream input, OutputStream output) throws IOException{
		
		int read = input.read();
		
		while(read != -1){
			output.write(read);
			read = input.read();
		}
		output.flush();
		
		input.close();
		output.close();
	}
	
	/**
	 * 读取流的字节
	 * @param inputStream
	 * @return
	 * @throws IOException
	 */
	public static String readData(InputStream inputStream,String charsetName) throws IOException{
		
		int read = inputStream.read();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		while(read != -1){
			baos.write(read);
			read = inputStream.read();
		}
		return baos.toString(charsetName);
	}
	/**
	 * 读取流的字节
	 * @param inputStream
	 * @return
	 * @throws IOException
	 */
	public static byte[] readByte(String file_path) throws IOException{
		
		InputStream inputStream = new FileInputStream(file_path);
		
		int read = inputStream.read();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		while(read != -1){
			baos.write(read);
			read = inputStream.read();
		}
		return baos.toByteArray();
	}
	/**
	 * 读取流的字节
	 * @param inputStream
	 * @return
	 * @throws IOException
	 */
	public static byte[] readByte(InputStream inputStream) throws IOException{
		
		int read = inputStream.read();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		while(read != -1){
			baos.write(read);
			read = inputStream.read();
		}
		return baos.toByteArray();
	}
	/**
	 * 读取流的字节
	 * @param inputStream
	 * @return
	 * @throws IOException
	 */
	public static String readData(InputStream inputStream) throws IOException{
		return readData(inputStream, charsetName_default);
	}
	/**
	 * 读取流的字节
	 * @param inputStream
	 * @return
	 * @throws IOException
	 */
	public static String readData(File file,String charsetName) throws IOException{
		FileInputStream fis  =new FileInputStream(file);
		return readData(fis,charsetName);
	}
	/**
	 * 读取流的字节
	 * @param inputStream
	 * @return
	 * @throws IOException
	 */
	public static String readData(File file) throws IOException{
		FileInputStream fis  =new FileInputStream(file);
		return readData(fis,charsetName_default);
	}
	
	/**
	 * 读取流的字节
	 * @param inputStream
	 * @return
	 * @throws IOException
	 */
	public static String readData(String filePath,String charsetName) throws IOException{
		FileInputStream fis  =new FileInputStream(filePath);
		return readData(fis,charsetName);
	}
	/**
	 * 读取流的字节
	 * @param inputStream
	 * @return
	 * @throws IOException
	 */
	public static String readData(String filePath) throws IOException{
		FileInputStream fis  =new FileInputStream(filePath);
		return readData(fis);
	}
}
