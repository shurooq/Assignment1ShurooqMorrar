package com.shurooq.assignment1;

import java.util.Random;



import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View.OnClickListener; 

public class MainActivity extends Activity {

	int n1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button startButton = (Button)findViewById(R.id.button1);
        startclick action=new startclick();
        startButton.setOnClickListener(action);
        
        
    	
        Button checkButton = (Button)findViewById(R.id.button2);
        final EditText val=(EditText)findViewById(R.id.editText1);
        checkButton.setOnClickListener(new OnClickListener()
        {
        	public void onClick(View v)
        	{
        		String data=val.getText().toString();
        		check(data);
        	}
        });
        
        
    }
    class startclick implements View.OnClickListener{
    	public void onClick( View arg0)
    	{
    		start();
    	}
    }
   
    
    private void start()
    {
    	Random r=new Random();
    	n1=r.nextInt(1000);
    	
    }
    private void check(String nom)
    {
    	
    	int yourNom = Integer.parseInt(nom);
    	
   	 	
    	if(yourNom==n1)
       		Toast.makeText(this, "congrates,you guess the number",Toast.LENGTH_LONG).show();	
       	
       	else if((yourNom-n1) >5)
       		Toast.makeText(this, "try smaller",Toast.LENGTH_LONG).show();
       	else if((n1-yourNom) >5)
       		Toast.makeText(this, "try Larger",Toast.LENGTH_LONG).show();	
       	else if((yourNom-n1) <5 || (n1-yourNom<5))
       	
       		Toast.makeText(this, "very closists",Toast.LENGTH_LONG).show();	
       	
       	else
       		Toast.makeText(this, "be careful , you should write an integer number in the box ",Toast.LENGTH_LONG).show();
       	

    	}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
