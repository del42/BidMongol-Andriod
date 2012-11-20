package mongol.express.del;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CustomerPage extends Activity implements View.OnClickListener { 
	private Button nextButton;
    	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customerlayout);
    
            nextButton= (Button) findViewById(R.id.next);
             nextButton.setOnClickListener(this);            
       
        }
            public void onClick(View v) {
    			// TODO Auto-generated method stub
    			//File sdCard = Environment.getExternalStorageDirectory(); 
    			
    			//switches between onClick action.
    			switch (v.getId()) {
            		
            	case R.id.next:
            		
            	    try {
            	    	  //Toast.makeText(getBaseContext(), "Worked..." , Toast.LENGTH_SHORT).show();
            	    	   Intent intent = new Intent(CustomerPage.this, CustomerInfo.class);
            	    	   startActivity(intent);
            	    	 
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