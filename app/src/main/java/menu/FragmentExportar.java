package menu;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sky.skynoff.inventsmapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentExportar extends Fragment {


    public FragmentExportar() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_exportar, container, false);
        // Inflate the layout for this fragment
        return v;
    }

}
