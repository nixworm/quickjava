/**
 * Input class for easy use QuickJava
 * Emanuele Paiano - nixw0rm@gmail.com
 *
 */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Input {
	private static String _string;
	private static int _integer;
	private static float _float;
	private static double _double;
	private static char _char;
	private static long _long;
	private static short _short;
	private static byte _byte;
	private static BufferedReader buffer;
	
	/**
	 * Read characters sequence from keyboard 
	 * */
	public static String getString()
	{
		buffer = new BufferedReader(new InputStreamReader(System.in));
		try {
			_string=buffer.readLine();
		} catch (IOException e) {
			errorMessage();
		}
		return _string;
		
	}
	
	/**
	 * read integer value from keyboard
	 * */
	public static int getInt()
	{
		buffer=new BufferedReader(new InputStreamReader(System.in));
		try {
			_string=buffer.readLine();
		} catch (IOException e) {
			errorMessage();
		}
		_integer=Integer.parseInt(_string);
		return _integer;
	}
	
	/**
	 * read single precision real value from keyboard
	 * */
	public static float getFloat()
	{
		buffer=new BufferedReader(new InputStreamReader(System.in));
		try {
			_string=buffer.readLine();
		} catch (IOException e) {
			errorMessage();
		}
		_float=Float.parseFloat(_string);
		return _float;
	}
	
	/**
	 * read long value from keyboard
	 * */
	public static long getLong()
	{
		buffer=new BufferedReader(new InputStreamReader(System.in));
		try {
			_string=buffer.readLine();
		} catch (IOException e) {
			errorMessage();
		}
		_long=Long.parseLong(_string);
		return _long;
	}
	
	/**
	 * read double precision real value from keyboard
	 * */
	public static double getDouble()
	{
		buffer=new BufferedReader(new InputStreamReader(System.in));
		try {
			_string=buffer.readLine();
		} catch (IOException e) {
			errorMessage();
		}
		_double=Double.parseDouble(_string);
		return _double;
	}
	
	/**
	 * read short value from keyboard
	 * */
	public static short getShort()
	{
		buffer=new BufferedReader(new InputStreamReader(System.in));
		try {
			_string=buffer.readLine();
		} catch (IOException e) {
			errorMessage();
		}
		_short=Short.parseShort(_string);
		return _short;
	}
	
	/**
	 * read single char value from keyboard
	 * */
	public static char getChar()
	{
		buffer=new BufferedReader(new InputStreamReader(System.in));
		try {
			_string=buffer.readLine();
		} catch (IOException e) {
			errorMessage();
		}
		_char=_string.charAt(0);
		return _char;		
	}
	
	/**
	 * read byte value from keyboard
	 * */
	public static byte getByte()
	{
		buffer=new BufferedReader(new InputStreamReader(System.in));
		try {
			_string=buffer.readLine();
		} catch (IOException e) {
			errorMessage();
		} 
		_byte=Byte.parseByte(_string);
		return _byte;
	}
	
	private static void errorMessage()
	{
		System.out.println("Input: Error while reading...");
	}

}
