package mongol.express.del;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DriverPage extends Activity implements View.OnClickListener{
	private Button cameraButton;
	private static final int CAMERA_PIC_REQUEST = 42;  
	private Button finishButton;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.driverlayout);
        
        cameraButton= (Button) findViewById(R.id.camera);
        cameraButton.setOnClickListener(this);   
        finishButton= (Button) findViewById(R.id.submit_PICKUP);
        finishButton.setOnClickListener(this);   
         
    
    }
	
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {  
        if (requestCode == CAMERA_PIC_REQUEST) {  
        	//Bitmap thumbnail = (Bitmap) data.getExtras().get("data"); 
        	//image = (ImageView) findViewById(R.id.camera); 
        	//image.setImageBitmap(thumbnail);
        }  
    }
    @Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		
    	case R.id.camera:
    		
    	    try {
    	    	Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE); 
    	    	startActivityForResult(cameraIntent, CAMERA_PIC_REQUEST);  

    	    	  Toast.makeText(getBaseContext(), 
    	    			  "Worked... " ,
      	                   Toast.LENGTH_LONG).show();
    	
    	    	  
    	    } catch (IllegalArgumentException e) {
    	        // TODO Auto-generated catch block
    	        e.printStackTrace();
    	    } catch (IllegalStateException e) {
    	        // TODO Auto-generated catch block
    	        e.printStackTrace();
    	    }
    	    
    		break;
    		
    		case R.id.submit_PICKUP:
    		
    	    try {
    	    	  Toast.makeText(getBaseContext(), 
    	    			  "Done!" ,
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
