package com.lhj.gogo.admin.util;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;

import javax.imageio.ImageIO; 
import java.io.File; 
import java.io.OutputStream;
import java.util.Hashtable;
import java.io.IOException; 
import java.awt.image.BufferedImage;

public class QRUtil {
	
   private static final int BLACK = 0xFF000000; 
   private static final int WHITE = 0xFFFFFFFF; 
    
   private QRUtil() {} 
    
      
   public static BufferedImage toBufferedImage(BitMatrix matrix) { 
     int width = matrix.getWidth(); 
     int height = matrix.getHeight(); 
     BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB); 
     for (int x = 0; x < width; x++) { 
       for (int y = 0; y < height; y++) { 
         image.setRGB(x, y, matrix.get(x, y) ? BLACK : WHITE); 
       } 
     } 
     return image; 
   } 
    
      
   public static void writeToFile(BitMatrix matrix, String format, File file) 
       throws IOException { 
     BufferedImage image = toBufferedImage(matrix); 
     if (!ImageIO.write(image, format, file)) { 
       throw new IOException("Could not write an image of format " + format + " to " + file); 
     } 
   } 
    
      
   public static void writeToStream(BitMatrix matrix, String format, OutputStream stream) 
       throws IOException { 
     BufferedImage image = toBufferedImage(matrix); 
     if (!ImageIO.write(image, format, stream)) { 
       throw new IOException("Could not write an image of format " + format); 
     } 
   } 
 
   public static void processImage(String text,String id) throws Exception {
	   //二维码源地址
		//二维码宽高设置
	   int width = 300; 
	   int height = 300; 
	   //二维码的图片格式
	   String format = "gif"; 
	   Hashtable hints = new Hashtable(); 
	   //内容所使用编码 
	   hints.put(EncodeHintType.CHARACTER_SET, "utf-8"); 
	   BitMatrix bitMatrix = new MultiFormatWriter().encode(text, 
	   BarcodeFormat.QR_CODE, width, height, hints); 
	    //生成二维码 
	    File outputFile = new File("e:"+File.separator+"image"+File.separator+id+".gif"); 
	    QRUtil.writeToFile(bitMatrix, format, outputFile); 
   }
}
