package com.example.whattododo;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.preference.PreferenceManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import io.realm.Realm;
import io.realm.RealmChangeListener;
import io.realm.RealmResults;
import io.realm.Sort;

public class HomeFragment extends Fragment {

    private TextView textView, textView2, textView3, textView4, textView5, textView6, textView7;

    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String TEXT = "text";

    private String text, results;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SharedPreferences SP = PreferenceManager.getDefaultSharedPreferences(getActivity().getBaseContext());
        String strUserName = SP.getString("username", "NA");
        TextView TextView4usr = (TextView) view.findViewById(R.id.username);
        if(strUserName == "NA"){
            TextView4usr.setText("Lets get to work");
        } else {
            TextView4usr.setText("Lets get to work " + strUserName);
        }


        textView = (TextView) view.findViewById(R.id.textView);
        textView2 = (TextView) view.findViewById(R.id.textView2);
        textView3 = (TextView) view.findViewById(R.id.textView3);
        textView4 = (TextView) view.findViewById(R.id.textView4);
        textView5 = (TextView) view.findViewById(R.id.textView5);
        textView6 = (TextView) view.findViewById(R.id.textView6);
        textView7 = (TextView) view.findViewById(R.id.textView7);

        getParentFragmentManager().setFragmentResultListener("requestKey", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle bundle) {
                // We use a String here, but any type that can be put in a Bundle is supported
                String result = bundle.getString("bundleKey");
                textView.setText(result);
            }});

        getParentFragmentManager().setFragmentResultListener("requestKey2", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey2, @NonNull Bundle bundle2) {
                // We use a String here, but any type that can be put in a Bundle is supported
                String result2 = bundle2.getString("bundleKey2");
                textView2.setText(result2);
            }});

        getParentFragmentManager().setFragmentResultListener("requestKey3", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey3, @NonNull Bundle bundle3) {
                // We use a String here, but any type that can be put in a Bundle is supported
                String result3 = bundle3.getString("bundleKey3");
                textView3.setText(result3);
            }});

        getParentFragmentManager().setFragmentResultListener("requestKey4", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey4, @NonNull Bundle bundle4) {
                // We use a String here, but any type that can be put in a Bundle is supported
                String result4 = bundle4.getString("bundleKey4");
                textView4.setText(result4);
            }});

        getParentFragmentManager().setFragmentResultListener("requestKey5", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey5, @NonNull Bundle bundle5) {
                // We use a String here, but any type that can be put in a Bundle is supported
                String result5 = bundle5.getString("bundleKey5");
                textView5.setText(result5);
            }});

        getParentFragmentManager().setFragmentResultListener("requestKey6", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey6, @NonNull Bundle bundle6) {
                // We use a String here, but any type that can be put in a Bundle is supported
                String result6 = bundle6.getString("bundleKey6");
                textView6.setText(result6);
            }});

        getParentFragmentManager().setFragmentResultListener("requestKey7", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey7, @NonNull Bundle bundle7) {
                // We use a String here, but any type that can be put in a Bundle is supported
                String result7 = bundle7.getString("bundleKey7");
                textView7.setText(result7);
            }});





        Button btn1 = view.findViewById(R.id.button25);
        Button btn2 = view.findViewById(R.id.button26);
        Button btn3 = view.findViewById(R.id.button27);
        Button btn4 = view.findViewById(R.id.button28);
        Button btn5 = view.findViewById(R.id.button29);
        Button btn6 = view.findViewById(R.id.button30);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("");
                textView7.setText("");
                saveData();
                loadData();
                updateViews();

                Bundle results = new Bundle();
                results.putString("bundleKey11", textView7.getText().toString());
                getParentFragmentManager().setFragmentResult("requestKey11", results);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView2.setText("");
                textView7.setText("");
                saveData();
                loadData();
                updateViews();

                Bundle results2 = new Bundle();
                results2.putString("bundleKey12", textView7.getText().toString());
                getParentFragmentManager().setFragmentResult("requestKey12", results2);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView3.setText("");
                textView7.setText("");
                saveData();
                loadData();
                updateViews();

                Bundle results3 = new Bundle();
                results3.putString("bundleKey13", textView7.getText().toString());
                getParentFragmentManager().setFragmentResult("requestKey13", results3);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView4.setText("");
                textView7.setText("");
                saveData();
                loadData();
                updateViews();

                Bundle results4 = new Bundle();
                results4.putString("bundleKey14", textView7.getText().toString());
                getParentFragmentManager().setFragmentResult("requestKey14", results4);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView5.setText("");
                textView7.setText("");
                saveData();
                loadData();
                updateViews();

                Bundle results5 = new Bundle();
                results5.putString("bundleKey15", textView7.getText().toString());
                getParentFragmentManager().setFragmentResult("requestKey15", results5);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView6.setText("");
                textView7.setText("");
                saveData();
                loadData();
                updateViews();

                Bundle results6 = new Bundle();
                results6.putString("bundleKey16", textView7.getText().toString());
                getParentFragmentManager().setFragmentResult("requestKey16", results6);
            }
        });




        Realm.init(getActivity().getApplicationContext());
        Realm realm2 = Realm.getDefaultInstance();

        RealmResults<NoteForHome> notesList2 = realm2.where(NoteForHome.class).findAllSorted("createdTime", Sort.DESCENDING);

        RecyclerView recyclerView2 = view.findViewById(R.id.recyclerview2);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getActivity()));

        MyAdapterForHomeNotes MyAdapterForHomeNotes = new MyAdapterForHomeNotes(getActivity().getApplicationContext(),notesList2);
        recyclerView2.setAdapter(MyAdapterForHomeNotes);

        notesList2.addChangeListener(new RealmChangeListener<RealmResults<NoteForHome>>() {
            @Override
            public void onChange(RealmResults<NoteForHome> notes) {
                MyAdapterForHomeNotes.notifyDataSetChanged();
            }
        });

    }





    public void saveData(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString(TEXT, textView7.getText().toString());
        editor.apply();

        /*Toast.makeText(this,
                "Data saved",
                Toast.LENGTH_SHORT).show();*/
    }

    public void loadData(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS, Context.MODE_PRIVATE);
        text = sharedPreferences.getString(TEXT, "");
    }

    public void updateViews(){
        textView7.setText(text);
    }
}