package raj.game.cowsandbulls;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Welcome extends Activity {
	
	// Final
	public final String TAG = "GamePlay";
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome);
	}
	
	public void onNewGameClick(View view){
		Intent intent = new Intent(this, GamePlay.class);
		startActivity(intent);
	}
	
	public void onInstructionsClick(View view){
		
	}
}
