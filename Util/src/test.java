import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class test {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String fileName = "D:/workdoc/任务/2017年卡信息/20180416测试卡/路线/U形/1.txt";  
        //readFileByBytes(fileName);  
        //readFileByChars(fileName);  
        //readFileByLines(fileName);  
//		readFileByLines(fileName);  
		System.out.println(res(""));
//		System.out.println(dateToStamp("2018/4/1 08:05:45"));
//		System.out.println(stampToDate("1522541145000"));

	}
			public static void readFileByLines(String fileName) {  
	        File file = new File(fileName);  
	        BufferedReader reader = null;  
	        try {  
	            System.out.println("以行为单位读取文件内容，一次读一整行：");  
	            reader = new BufferedReader(new FileReader(file));  
	            String tempString = null;  
	            int line = 1;  
	            // 一次读入一行，直到读入null为文件结束  
	            while ((tempString = reader.readLine()) != null) {  
	                // 显示行号  
	                System.out.println("line " + line + ":"+Integer.toHexString(tempString.length()/8)+", "+ tempString);  
	                line++;  
	            }  
	            reader.close();  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        } finally {  
	            if (reader != null) {  
	                try {  
	                    reader.close();  
	                } catch (IOException e1) {  
	                }  
	            }  
	        }  
	    }  

			
	/*
	 * 将时间转换为时间戳
	 */
	public static String dateToStamp(String s) throws ParseException {
		String res;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
				"yyyy/MM/dd HH:mm:ss");
		Date date = simpleDateFormat.parse(s);
		long ts = date.getTime();
		res = String.valueOf(ts);
		return res;
	}
	
	 /* 
     * 将时间戳转换为时间
     */
    public static String stampToDate(String s){
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        long lt = new Long(s);
        Date date = new Date(lt);
        res = simpleDateFormat.format(date);
        return res;
    }

	 public static String res(String ooto){
		// '2017645160','蓝鄂M8Q75','10401','2018/3/1 00:03:45','10507','2018/3/2 00:14:05','011FA12800034BCDA12800060000000072179289707F6C05721643F0707D6BC8707D6AA5707D6A43707A68E5707A3EF9707A3F35707A3F37707A40A872153F9B721B893D721B648D7213376671765E58000000007071703B72128874717D536971102CBB71102D4771102DB67110272771123977711239F07112386971123A7C711287EB7112AC6E707362FE',''
		 String time = SetSystemProperty.readValue("","time");
		 String res = "";
		 String cardId = SetSystemProperty.readValue("","cardId");
		 String vehicle = "蓝鄂AM8Q75";
		 String entryId = "10000";
		 String entryTime = stampToDate(time);
		 String exitId = "10000";
		 String exitTime = stampToDate((Long.parseLong(time)+86400000)+"");
		 String r = ooto;
		 res = "'" + cardId + "','" + vehicle + "','" + entryId + "','" + entryTime + "','" + exitId + "','" + exitTime + "','" + ooto + "',''";
		 SetSystemProperty.updateProperties("cardId",(Long.parseLong(cardId)+1)+"");
		 SetSystemProperty.updateProperties("time",(Long.parseLong(entryTime)+86400000)+"");

		 return res;
			
		}

}
