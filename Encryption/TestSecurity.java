package com.icici.sec;

public class TestSecurity {

	public static void main(String...a)
	{
		final String secretKey = "sk1234$";

		String originalString = "icicibank.com";
		String encryptedString = JavaSecurity.encrypt(originalString, secretKey) ;
		String decryptedString = JavaSecurity.decrypt(encryptedString, secretKey) ;

		System.out.println(originalString);
		System.out.println(encryptedString);
		System.out.println(decryptedString);
	}
}
