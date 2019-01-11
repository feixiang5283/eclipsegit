import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class readline {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getFileName();
      }  
	
	 public static void getFileName() {
		    String path = "D:/workdoc/任务/2017年卡信息/20180416测试卡/路线/基础路网数据整理/d"; // 路径
		    File f = new File(path);
		    if (!f.exists()) {
		      System.out.println(path + " not exists");
		    }
		    File fa[] = f.listFiles();
		    for (int i = 0; i < fa.length; i++) {
		      File fs = fa[i];
		      if (fs.isDirectory()) {
		    	  System.out.println(fs.getName());
		        getFileLine(fs.getName());
		      } else {
		    	  System.out.println(fs.getName());
		        getFileLine(fs.getName());
		      }
		    }
		  }
	 
	 public static void getFileLine2(String file){
		 try {  
	            // read file content from file  
	            String path = "D:/workdoc/任务/2017年卡信息/20180416测试卡/路线/基础路网数据整理/Data2018/";
	            FileReader reader = new FileReader(path+file);  
	            BufferedReader br = new BufferedReader(reader);  
	            String str = null;  
	            while((str = br.readLine()) != null) {  
	            	if(str.length()<40){
	            		if(str.indexOf("汉川")>-1)
	            		System.out.println("111111111111111111111111111111111111111111111111111111111");
	            		
	            	}
	            } 
	            br.close();  
	            reader.close();  
	      }  
	      catch(FileNotFoundException e) {  
	                  e.printStackTrace();  
	            }  
	            catch(IOException e) {  
	                  e.printStackTrace();  
	            }  
	 }
	 
	 public static void getFileLine(String file){
		 try {  
	            // read file content from file  
	            String path = "D:/workdoc/任务/2017年卡信息/20180416测试卡/路线/基础路网数据整理/d/";
	            FileReader reader = new FileReader(path+file);  
	            BufferedReader br = new BufferedReader(reader);  
	            ArrayList<String> list=new ArrayList<String>(); 
	            String str = null;  
	            while((str = br.readLine()) != null) {  
	            	if(str.length()<40){
//	            		if(!list.contains(str)){
	            			list.add(str);
//	            		}
	            	}
	            } 
	            for(int i=0;i<list.size();i++){
	            	System.out.println(list.get(i));
	            }
	            br.close();  
	            reader.close();  
	      }  
	      catch(FileNotFoundException e) {  
	                  e.printStackTrace();  
	            }  
	            catch(IOException e) {  
	                  e.printStackTrace();  
	            }  
	 }
	}
