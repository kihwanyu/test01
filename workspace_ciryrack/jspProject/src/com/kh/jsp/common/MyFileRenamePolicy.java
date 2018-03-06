package com.kh.jsp.common;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.oreilly.servlet.multipart.FileRenamePolicy;

public class MyFileRenamePolicy implements FileRenamePolicy {

	@Override
	public File rename(File oldFile) {
		File newFile = null;
		long currentTime = System.currentTimeMillis();
		System.out.println(currentTime);
		SimpleDateFormat ft = new SimpleDateFormat("yyyyMMddHHmmss");
		int randomNumber = (int)(Math.random() * 100000);
		
		//확장자명 가져오기
		String name = oldFile.getName();
		String body = null;
		String ext = null;
		int dot = name.lastIndexOf(".");
		if(dot != -1){
			//뽀보로.jpg
			//dot전까지 
			body = name.substring(0, dot);
			//뽀보로
			//dot포함
			//.jpg
			ext = name.substring(dot);
		} else {
			//확장자가 없는 경우 리눅스는 확장자가 없음.
			body = name;
			ext = "";
		}
		String fileName = ft.format(new Date(currentTime)) + randomNumber + ext;
		
		newFile = new File(oldFile.getParent(),fileName);
		//기존파일을가지고 이름만 변경.
		return newFile;
	}

}
