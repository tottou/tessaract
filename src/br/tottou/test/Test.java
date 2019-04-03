package br.tottou.test;

import java.io.File;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class Test {

	
	 public static void main(String[] args){ 
         
	        File imageFile = new File("D:\\t4j\\13.pdf");
	        Tesseract instance = Tesseract.getInstance();
	        instance.setLanguage("por");
	         
	        try {
	            String result = instance.doOCR(imageFile);
	            System.out.println(result);
	        } catch (TesseractException e) {
	            System.err.println(e.getMessage());
	        }
	    }
	
}
