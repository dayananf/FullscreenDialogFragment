package com.fullscreenialog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnFullscreen = findViewById(R.id.btnFullscreen);
        btnFullscreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment dialogFragment = FullScreenDialog.newInstance();
                ((FullScreenDialog)dialogFragment).setCallBack(new FullScreenDialog.CallBack() {
                    @Override
                    public void onActionClick(String abc) {
                        Toast.makeText(MainActivity.this, abc, Toast.LENGTH_SHORT).show();
                    }
                });
                dialogFragment.show(getSupportFragmentManager(),"FullScreenDialog");


            }
        });
    }
}
