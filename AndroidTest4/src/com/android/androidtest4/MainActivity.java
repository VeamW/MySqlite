package com.android.androidtest4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	
	public void addFile(View v){
		try {
			FileOutputStream fos = openFileOutput("test.txt", MODE_PRIVATE);
			fos.write("������ҵĲ����ļ�".getBytes());
			fos.close();
			Toast.makeText(getApplicationContext(), "�����ɹ�!", Toast.LENGTH_SHORT).show();;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updateFile(View v){
		try {
			FileOutputStream fos = openFileOutput("test.txt", MODE_APPEND);
			fos.write("�����������������".getBytes());
			fos.close();
			Toast.makeText(getApplicationContext(), "���³ɹ�", Toast.LENGTH_SHORT).show();;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteFile(View v ){
		File file = new File("/data/data/com.android.androidtest4/files/test.txt");
		if (file.exists()){
			file.delete();
			Toast.makeText(getApplicationContext(), "ɾ���ɹ�", Toast.LENGTH_SHORT).show();
		}else{
			Toast.makeText(getApplicationContext(), "ɾ��ʧ��", Toast.LENGTH_SHORT).show();
		}
		
	}

}
