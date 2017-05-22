package example.com.fragmentexample;

import android.app.Fragment;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by HPWorld on 5/22/2017.
 */

public class SimpleAddition extends Fragment {

TextView result;
    @Override
    public View onCreateView(LayoutInflater inflater,
                         ViewGroup container, Bundle savedInstanceState)
    {


        // Inflate the layout for this fragment
        View fragmentview;
        fragmentview=  inflater.inflate(R.layout.fragment_one, container, false);

        result = (TextView) fragmentview.findViewById(R.id.textview);
        return fragmentview;
    }
}


