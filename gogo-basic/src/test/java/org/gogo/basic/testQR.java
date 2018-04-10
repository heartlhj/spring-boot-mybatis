package org.gogo.basic;



import java.io.File; 
import java.util.Hashtable; 
import com.google.zxing.BarcodeFormat; 
import com.google.zxing.EncodeHintType; 
import com.google.zxing.MultiFormatWriter; 
import com.google.zxing.common.BitMatrix;
import com.lhj.gogo.basic.util.QRUtil; 
/**
 * 
 * @author 张新华 870775401@qq.com
 * @version 创建时间 ： 2016-8-8 上午09:02:06
 *
 */
public class testQR {
	   
    /**
     * @param args
     * @throws Exception 
     */ 
    public static void main(String[] args) throws Exception { 
        //二维码源地址
    	String text = "I love you!"; 
    	String[] lists = {"ss","dd","qq"};
    	//二维码宽高设置
        int width = 300; 
        int height = 300; 
        //二维码的图片格式
        String format = "gif"; 
        Hashtable hints = new Hashtable(); 
        //内容所使用编码 
        hints.put(EncodeHintType.CHARACTER_SET, "utf-8"); 
        for(int i =0;i<lists.length;i++) {
        	 BitMatrix bitMatrix = new MultiFormatWriter().encode(lists[i], 
                     BarcodeFormat.QR_CODE, width, height, hints); 
             //生成二维码 
             File outputFile = new File("d:"+File.separator+"image"+File.separator+"image"+i+".gif"); 
             QRUtil.writeToFile(bitMatrix, format, outputFile); 
        }
       
    } 
}
