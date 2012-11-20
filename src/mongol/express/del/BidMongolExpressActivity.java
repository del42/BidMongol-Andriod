package mongol.express.del;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class BidMongolExpressActivity extends Activity  implements View.OnClickListener{
	private Button customer;
	private Button driver;
	private Button visitWeb;
	
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        customer= (Button) findViewById(R.id.customer);
        driver= (Button) findViewById(R.id.driver);
        visitWeb= (Button) findViewById(R.id.visitWebButton);
        
        customer.setOnClickListener(this);
        driver.setOnClickListener(this);
        visitWeb.setOnClickListener(this);
   
    }
        public void onClick(View v) {
			// TODO Auto-generated method stub
			//File sdCard = Environment.getExternalStorageDirectory(); 
			
			//switches between onClick action.
			switch (v.getId()) {
        	case R.id.customer:
        		
        		 try {
        			 Intent intent = new Intent(BidMongolExpressActivity.this, CustomerPage.class);
      	    	   startActivity(intent);
        			Toast.makeText(getBaseContext(), "Worked..." , Toast.LENGTH_SHORT).show();
         	    } catch (IllegalArgumentException e) {
         	        // TODO Auto-generated catch block
         	        e.printStackTrace();
         	    } catch (IllegalStateException e) {
         	        // TODO Auto-generated catch block
         	        e.printStackTrace();
         	    }
        		break;
        		
        	case R.id.driver:
        		
        	    try {
        	    	   Intent intent = new Intent(BidMongolExpressActivity.this, DriverPage.class);
        	    	   startActivity(intent);
        	    	 
        	    } catch (IllegalArgumentException e) {
        	        // TODO Auto-generated catch block
        	        e.printStackTrace();
        	    } catch (IllegalStateException e) {
        	        // TODO Auto-generated catch block
        	        e.printStackTrace();
        	    }
        	    
        		break;
        		
        	case R.id.visitWebButton:
        		
        	    try {
        	    	   
        	    	   Uri uri = Uri.parse("http://www.bidmongol.com");
        	    	   Intent intent = new Intent(Intent.ACTION_VIEW, uri);
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