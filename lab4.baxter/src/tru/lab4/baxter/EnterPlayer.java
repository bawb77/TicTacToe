package tru.lab4.baxter;

import java.util.ArrayList;
import java.util.Arrays;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;  
import android.widget.ListView;
import android.widget.AdapterView;

public class EnterPlayer extends ActionBarActivity {

	private ListView playerList;  
	private ArrayAdapter<String> ltAdapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_enter_player);
		
		playerList = (ListView) findViewById( R.id.playerList );  
        
        // Create and populate a List of planet names.  
        String[] menuOptions = new String[] {};    
        ArrayList<String> pList = new ArrayList<String>();  
        pList.addAll( Arrays.asList(menuOptions) );  
          
        // Create ArrayAdapter using the planet list.  
        ltAdapter = new ArrayAdapter<String>(this, R.layout.simplerow, pList);
        playerList.setAdapter( ltAdapter );
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.enter_player, menu);
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
