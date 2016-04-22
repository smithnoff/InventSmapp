package menu;


import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;

import com.sky.skynoff.inventsmapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentEstado extends Fragment {


    public FragmentEstado() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_estado, container, false);

        TabHost TbH;




            TbH = (TabHost) v.findViewById(R.id.tabHost); //llamamos al Tabhost
            TbH.setup();                                                         //lo activamos

            TabHost.TabSpec tab1 = TbH.newTabSpec("tab1");  //aspectos de cada Tab (pestaña)
            TabHost.TabSpec tab2 = TbH.newTabSpec("tab2");
            TabHost.TabSpec tab3 = TbH.newTabSpec("tab3");

            tab1.setIndicator("Activos");    //qué queremos que aparezca en las pestañas
            tab1.setContent(R.id.Activos); //definimos el id de cada Tab (pestaña)

            tab2.setIndicator("Inactivos");
            tab2.setContent(R.id.Inactivos);

            tab3.setIndicator("Reparar");
            tab3.setContent(R.id.Reparar);

            TbH.addTab(tab1); //añadimos los tabs ya programados
            TbH.addTab(tab2);
            TbH.addTab(tab3);
            //  FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        /*fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        return v;
    }

}
