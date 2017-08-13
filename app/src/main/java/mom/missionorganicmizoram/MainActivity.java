package mom.missionorganicmizoram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setEvents();
    }

    public void setEvents(){
        try{
            CardView notificationLink =  (CardView) findViewById(R.id.notification_link);
            notificationLink.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try{
                        Intent notificationsActivity = new Intent(MainActivity.this, Notifications.class);
                        startActivity(notificationsActivity);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            });

            CardView fpoLink =  (CardView) findViewById(R.id.fpo_link);
            fpoLink.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try{
                        Intent fpoActivity = new Intent(MainActivity.this, FPOActivity.class);
                        startActivity(fpoActivity);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
