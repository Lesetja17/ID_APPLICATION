package com.example.academy_intern.idapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etId;
    Button btnSub;
    TextView txtRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etId=findViewById(R.id.etID);
        btnSub=findViewById(R.id.btnSub);
        txtRes=findViewById(R.id.textResults);
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String idNum=etId.getText().toString().trim();
                String dob=idNum.substring(0,6);
                int gender=Integer.parseInt(Character.toString(idNum.charAt(6)));
                String sgender;
                if(gender<5){
                    sgender="Female";
                }
                else
                {
                    sgender="Male";
                }
                int nationality=Integer.parseInt(Character.toString(idNum.charAt(10)));
                String snationality;
                if(nationality==0){
                    snationality="SA citizen";
                }
                else
                {
                    snationality="Permanent citizen";
                }
                txtRes.setText(getString(R.string.dob)+ dob +"\n"+
                getString(R.string.gender)+"\n"+sgender+
                getString(R.string.nationality)+snationality);


            }
        });
    }
}
