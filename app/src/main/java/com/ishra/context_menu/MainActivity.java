package com.ishra.context_menu;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.ContextMenu;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        btn=findViewById(R.id.button1);
        registerForContextMenu(btn);
    }



    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
    {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.setHeaderTitle("SMS options");
        menu.add(0, v.getId(), 0, "Copy");//groupId, itemId, order, title
        menu.add(0, v.getId(), 0, "Forward");
        menu.add(0, v.getId(), 0, "Delete");
        menu.add(0, v.getId(), 0, "Lock");
        menu.add(0, v.getId(), 0, "View details");
        menu.add(0, v.getId(), 0, "Select Text");
        menu.add(0, v.getId(), 0, "Sava message to SIM Card");

    }
    @Override
    public boolean onContextItemSelected(MenuItem item){

        // Toast.makeText(this, "Selected Item: " +item.getTitle(), Toast.LENGTH_SHORT).show();
        if(item.getTitle()=="Copy"){
            Toast.makeText(getApplicationContext(),"Copy code",Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="Forward"){
            Toast.makeText(getApplicationContext(),"Forward sms code",Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="Delete"){
            Toast.makeText(getApplicationContext(),"Delete code",Toast.LENGTH_LONG).show();
        }

        else if(item.getTitle()=="Lock"){
            Toast.makeText(getApplicationContext(),"Lock code",Toast.LENGTH_LONG).show();
        }

        else if(item.getTitle()=="View details"){
            Toast.makeText(getApplicationContext(),"View details code",Toast.LENGTH_LONG).show();
        }

        else if(item.getTitle()=="Select Text"){
            Toast.makeText(getApplicationContext(),"Select Text code",Toast.LENGTH_LONG).show();
        }

        else if(item.getTitle()=="Sava message to SIM Card"){
            Toast.makeText(getApplicationContext(),"Sava message to SIM Card code",Toast.LENGTH_LONG).show();
        }

        else{
            return false;
        }
        return true;
    }

}
