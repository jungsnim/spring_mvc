package com.websol.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUp {

   public boolean extChk(String filename)
   {
	   ArrayList<String> imgArr = new ArrayList<String>();
	      
      imgArr.add("jpg");
      imgArr.add("bmp");
      imgArr.add("png");
      imgArr.add("gif");
      
      String ext = filename.substring(filename.lastIndexOf(".")+1);
      
      ext = ext.toLowerCase();
      return imgArr.contains(ext); //이미지가 아니면
     
   }
   
   
   public void print(Integer num, MultipartFile upfile){
      System.out.println(num+":"+upfile.getOriginalFilename());
   }
   
   //파일 갖고 오기 위해서
   public String fileUpload(MultipartFile upfile, HttpServletRequest request){
      
      //리퀘스트를 선언해서 사용 할 수도 있따.
      //HttpServletRequest request;
      //이렇게 가면 위험하다
     
      //파일을 저장하기 위한 dir경로 -----webapp 을 root 디렉토리로 인지함. (webapp이후경로라는 말)
      //이러한 연유로 webapp 하위 디렉토리에 저장  위치를 잡아야 한다.
      
	   //String path = request.getRealPath("/resources/up");
      //저장할 폴더 위치를 지정하자 로컬폴더위치
      String path ="D:\\STSWork\\spring_mvc\\src\\main\\webapp\\resources\\up";
      
      //파일의 원본 이름을 가져 오자
      String filename = path+"\\"+upfile.getOriginalFilename();
      
     
      File file = new File(filename);
      
      String ext = filename.substring(filename.lastIndexOf(".")+1);
      
      //파일 이름의 구조를 가져 오는 방법 : 파일명_번호.확장자
      //같은 이름이 있다면
      if(file.exists()){
         //확장자가 빠진 이름
         String fname = filename.substring(0, filename.lastIndexOf("."));
         
         
         filename = fname+"_1."+ext;
         
      }
      //또 중복 파일이 있을 수 있을땐 다시 검사 한다
      file = new File(filename);
      while(true){
         
         if(file.exists()){
            
            //번호 앞부분까지 언더바까지 짜름거임(파일이름)
            String fname = filename.substring(0, filename.lastIndexOf("_")+1);
            
            //시작은 언더바 다음 부터 . 있는 대 까지 가서 잘라온다(현재파일의 중복번호)
            int num = Integer.parseInt(filename.substring(filename.lastIndexOf("_")+1, filename.lastIndexOf(".")));
            
            //빼내온 넘버의 값을 올린다.(중복확인번호++)
            num++;
            
            //파일 이름 조합 성공(파일이름+_num+.ext)
            filename = fname+num+"."+ext;
            
            //새로 조합된 이름으로 파일을 다시 만든다
            file = new File(filename);
            
         }else  //같은 파일명이 없으면 나간다.
            break;

      }
      
      //바이트 스트림으로 빼보자 배열로 만들어 진다
      try {
         byte [] byteArr = upfile.getBytes();
         
         FileOutputStream fos = new FileOutputStream(file);
         fos.write(byteArr);
         fos.close();
         
         
         //파일 저장끝
         
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      return filename;
   }
}
