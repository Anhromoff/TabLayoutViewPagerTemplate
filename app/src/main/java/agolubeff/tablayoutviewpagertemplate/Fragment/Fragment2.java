package agolubeff.tablayoutviewpagertemplate.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import agolubeff.tablayoutviewpagertemplate.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment2 extends Fragment {


    public Fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        //((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Fragment 2");
        return inflater.inflate(R.layout.fragment_2, container, false);
    }

}
