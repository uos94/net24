package kr.co.kcs.core.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SUtils {

	/**
	 * 현재 날짜
	 * */
    public static String getYear() {
        return getToDatePattern("yyyy");
    }

    public static String getMonth() {
        return getToDatePattern("MM");
    }

    public static String getDay() {
        return getToDatePattern("dd");
    }

    public static String getToDay() {
    	return getToDatePattern("yyyyMMdd");
    }

    public static String getDate(){
    	return getToDatePattern("yyyyMMddHHmmss");
    }

    public static String getToDatePattern(String format) {
        SimpleDateFormat formatter = new SimpleDateFormat(format, Locale.getDefault());
        return formatter.format(new Date());
    }

    /**
     * 문자열 값의 널 여부를 체크한다. 널인 경우 지정된 값으로 리턴한다.
     * */
	public static String nvl(Object obj){
		return nvl(String.valueOf(obj), "");
	}

	public static String nvl(Object obj, String defaultStr) {
		return nvl(String.valueOf(obj), defaultStr);
	}

	public static String nvl(String str){
		return nvl(str,"");
	}

	public static String nvl(String str,String defaultStr){
		return isNvl(str) ? defaultStr  : str.trim();
	}

    /**
     * 문자열이 null ? true : false
     */
    public static boolean isNvl(Object obj){
        return isNvl(String.valueOf(obj));
    }

    public static boolean isNvl(String str){
        return (str == null || str.equals("null") || str.trim().length() <= 0);
    }

    /**
     * byte[] 변환
     */
	public static short bytesToShort(byte[] b, int off) {
		return (short)(((b[off+0]&0xff)<<8) | (b[off+1]&0xff));
	}

	public static byte[] shortToBytes(short n) {
		byte[] b = new byte[2];
		b[1] = (byte)(n&0xff);
		b[0] = (byte)((n>>8)&0xff);
		return b;
	}

	public static int bytesToInt(byte[] b, int off) {
		return (int)(((b[off+0]&0xff)<<24) | ((b[off+1]&0xff)<<16) | ((b[off+2]&0xff)<<8) | (b[off+3]&0xff));
	}

	public static byte[] intToBytes(int n) {
		byte[] b = new byte[4];
		b[3] = (byte)(n&0xff);
		b[2] = (byte)((n>>8)&0xff);
		b[1] = (byte)((n>>16)&0xff);
		b[0] = (byte)((n>>24)&0xff);
		return b;
	}

	public static byte[] bytesExtend(byte[] arr1, byte[] arr2) {
		byte[] retrunByte = new byte[arr1.length + arr2.length];
		System.arraycopy(arr1	,0	,retrunByte	,0				,arr1.length);
		System.arraycopy(arr2	,0	,retrunByte	,arr1.length	,arr2.length);
		return retrunByte;
	}
}
