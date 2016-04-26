package com.example.sung.a5longestenglishwords;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by sung on 4/24/16.
 */
public class WordsListFrag extends ListFragment {
    FragmentTransaction transaction;

    String wordLists[]=new String[]{
            "antidisestablishmentarianism","floccinaucinihilipilification",
            "pneumonoultramicroscopicsilicovolcanoconiosis","pseudopseudohypoparathyroidism",
            "immunoelectrophoresis"


    };

    public WordsListFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        List<HashMap<String, String>> _list = new ArrayList<>();
        for (int i = 0; i < wordLists.length; i++) {
            HashMap<String, String> hm = new HashMap<>();
            hm.put("name", wordLists[i]);
            _list.add(hm);
        }
        //Key used in HashMap
        String[] from = {"name"};
        int[] to = {R.id.listviewitems};
        SimpleAdapter adapter = new SimpleAdapter(getActivity().getBaseContext(), _list, R.layout.wordslistlayoutfrag, from, to);
        setListAdapter(adapter);
        //return inflater.inflate(R.layout.listviewlayout,container,false);
        return super.onCreateView(inflater, container, savedInstanceState);

    }


    public void onListItemClick(ListView l, View v, int position, long id) {
        if(position==0){
            transaction=getFragmentManager().beginTransaction();
            transaction.replace(R.id.container_frag,new ant_Frag());
            transaction.addToBackStack(null);
            transaction.commit();
        }
        else if(position==1){
            transaction=getFragmentManager().beginTransaction();
            transaction.replace(R.id.container_frag,new floc_Frag());
            transaction.addToBackStack(null);
            transaction.commit();

        }else if(position==2){
            transaction=getFragmentManager().beginTransaction();
            transaction.replace(R.id.container_frag,new pne_Frag());
            transaction.addToBackStack(null);
            transaction.commit();
        }else if(position==3){
            transaction=getFragmentManager().beginTransaction();
            transaction.replace(R.id.container_frag,new pse_Frag());
            transaction.addToBackStack(null);
            transaction.commit();
        }else if(position==4){
            transaction=getFragmentManager().beginTransaction();
            transaction.replace(R.id.container_frag,new imm_Frag());
            transaction.addToBackStack(null);
            transaction.commit();
        }
    }
}
