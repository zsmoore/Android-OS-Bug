package com.zachary_moore.androidosbug;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by zsmoore on 7/29/17.
 */

public class BugFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        View ret = inflater.inflate(R.layout.bug_fragment, container, false);

        final Context context = getActivity().getBaseContext();
        Button bugButton = (Button) ret.findViewById(R.id.bug_button);
        bugButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MainActivity.class);

                //Add the following code to not crash in pre 7.0
                //Note: not needed in 7.0+

                //intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                context.startActivity(intent);
            }
        });

        return ret;
    }
}
