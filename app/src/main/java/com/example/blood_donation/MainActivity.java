package com.example.blood_donation;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private TextView text_view_progress ,text_view_progress2;
    private Handler handler,handler2;
    private Runnable runnable,runnable2;
    private double progress= 100;
    private double progress2= 100;
    private ProgressBar progress_bar,progress_bar2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //to center the label
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.action_bar_layout);

        //for first timer
        progress_bar= findViewById(R.id.progress_bar);
        text_view_progress= (TextView) findViewById(R.id.text_view_progress);
        countDownFirstTimer();

        //for second timer
        progress_bar2= findViewById(R.id.progress_bar2);
        text_view_progress2= (TextView) findViewById(R.id.text_view_progress2);
        countDownSecondTimer();


    }

    public void countDownFirstTimer() {

        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                handler.postDelayed(this, 1000);
                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    // EndDate
                    Date EndDate = dateFormat.parse("2021-8-20");
                    Date currentDate = new Date();
                    if (!currentDate.after(EndDate)) {
                        long diff = EndDate.getTime() - currentDate.getTime();
                        long days = diff / (24 * 60 * 60 * 1000);
                        //diff -= days * (24 * 60 * 60 * 1000);
                        //long minutes = diff / (60 * 1000);
                        progress=1.666666666666667*days;
                        progress_bar.setProgress((int)progress);
                        //String x=String.format("%02d", days);
                        text_view_progress.setText(days+" يوم");
                    } else {
                        text_view_progress.setText("مؤهل الآن للتبرع");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        handler.postDelayed(runnable, 1 * 1000);
    }

    public void countDownSecondTimer() {

        handler2 = new Handler();
        runnable2 = new Runnable() {
            @Override
            public void run() {
                handler2.postDelayed(this, 1000);
                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    // EndDate
                    Date EndDate = dateFormat.parse("2021-7-5");
                    Date currentDate = new Date();
                    if (!currentDate.after(EndDate)) {
                        long diff = EndDate.getTime() - currentDate.getTime();
                        long days = diff / (24 * 60 * 60 * 1000);
                        //diff -= days * (24 * 60 * 60 * 1000);
                        //long minutes = diff / (60 * 1000);
                        progress2=7.142857142857143*days;
                        progress_bar2.setProgress((int)progress2);
                        //String x=String.format("%02d", days);
                        if(days==0){
                            diff -= days * (24 * 60 * 60 * 1000);
                            long hours = diff / (60 * 60 * 1000);
                            text_view_progress2.setText(hours + " ساعات");
                        }
                        else {
                            text_view_progress2.setText(days + " يوم");
                        }
                    } else {
                        text_view_progress2.setText("مؤهل الآن للتبرع");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        handler2.postDelayed(runnable2, 1 * 1000);
    }

}