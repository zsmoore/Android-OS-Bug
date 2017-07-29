package com.zachary_moore.androidosbug;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ConstraintLayout mainLayout = (ConstraintLayout) this.findViewById(R.id.main_layout);
        Button button = (Button) this.findViewById(R.id.activity_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainLayout.removeAllViews();

                Fragment newFragment = new BugFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.main_layout, newFragment);
                transaction.commit();
            }
        });
    }
}
