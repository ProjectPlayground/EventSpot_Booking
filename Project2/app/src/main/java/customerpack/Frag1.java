package customerpack;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nikki.project2.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag1 extends Fragment {


    private RecyclerView recyclerView1;
    private CateringAdapter mAdapter;
    private ArrayList<CateringDataModel> data;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_frag1,container,false);

        recyclerView1 = (RecyclerView) view.findViewById(R.id.my_recycler_view_catering);

        mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView1.setLayoutManager(mLayoutManager);



        data = new ArrayList<CateringDataModel>();
        for (int i = 0; i < CateringMyData.nameArray.length; i++) {
            data.add(new CateringDataModel(
                    CateringMyData.nameArray[i],
                    CateringMyData.websiteArray[i],
                    CateringMyData.contactnoarray[i],
                    CateringMyData.imageArray[i]


            ));
        }

        mAdapter = new CateringAdapter(data);

        recyclerView1.setAdapter(mAdapter);



        return view;

    }



}
