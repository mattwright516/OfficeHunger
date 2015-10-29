package mw.officehunger;

/**
 * Created by matt on 10/28/15.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PickActivity extends Activity implements View.OnClickListener {

    private Button mOrder, mAdmin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pickactivity);



        //setup buttons
        mOrder = (Button)findViewById(R.id.initiateOrderPage);
        mAdmin = (Button)findViewById(R.id.administerAccountPage);

        //register listeners
        mOrder.setOnClickListener(this);
        mAdmin.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch (v.getId()) {
            case R.id.initiateOrderPage:
                Intent i = new Intent(this, Order.class);
                startActivity(i);
                break;
            case R.id.administerAccountPage:
                Intent x = new Intent(this, Admin.class);
                startActivity(x);
                break;

            default:
                break;
        }
    }
}
