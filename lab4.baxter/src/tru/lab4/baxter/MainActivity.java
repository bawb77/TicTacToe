package tru.lab4.baxter;

import java.util.ArrayList;
import java.util.Arrays;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;  
import android.widget.ListView;
import android.widget.AdapterView;

public class MainActivity extends ActionBarActivity {

	private ListView mainMenu ;  
	private ArrayAdapter<String> listAdapter ; 
	  
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainMenu = (ListView) findViewById( R.id.mainMenu );  
        
        // Create and populate a List of planet names.  
        String[] menuOptions = new String[] { "Play!", "Enter Players", "Rankings"};    
        ArrayList<String> menuList = new ArrayList<String>();  
        menuList.addAll( Arrays.asList(menuOptions) );  
          
        // Create ArrayAdapter using the planet list.  
        listAdapter = new ArrayAdapter<String>(this, R.layout.simplerow, menuList);
        mainMenu.setAdapter( listAdapter );
        
        mainMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,int pos, long id) {
            	switch(pos){
            		case 0:
            		Intent int0 = new Intent(MainActivity.this, Play.class);
            		startActivity(int0);
            		break;
            		case 1:
            		Intent int1 = new Intent(MainActivity.this, EnterPlayer.class);
            		startActivity(int1);
            		break;
            		case 2:
            		Intent int2 = new Intent(MainActivity.this, Rankings.class);
            		startActivity(int2);
            		break;
            	}
          	}
      });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
   
}
