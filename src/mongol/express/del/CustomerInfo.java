package mongol.express.del;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CustomerInfo extends Activity implements View.OnClickListener{
	private Button submitCargoButton;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.infolayout);
        
        submitCargoButton= (Button) findViewById(R.id.submit_cargo);
        submitCargoButton.setOnClickListener(this);  
    
    }
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		
    	case R.id.submit_cargo:
    		
    	    try {
    	    	  Toast.makeText(getBaseContext(), 
    	    			  "Thank you for your business with us! \n Someone will be in touch shorthly. " ,
      	                   Toast.LENGTH_LONG).show();
  	 
    	    } catch (IllegalArgumentException e) {
    	        // TODO Auto-generated catch block
    	        e.printStackTrace();
    	    } catch (IllegalStateException e) {
    	        // TODO Auto-generated catch block
    	        e.printStackTrace();
    	    }
    	    
    		break;
   
	}
	}
}