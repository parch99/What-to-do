package com.example.whattododo;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;

public class ScheduleFragment extends Fragment {

    private TextView textView,textView8,textView9,textView10,textView11,textView12,textView13,textView14;

    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String TEXT = "text";

    private String text, result;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_schedule, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        textView = (TextView) view.findViewById(R.id.textView);
        textView8 = (TextView) view.findViewById(R.id.textView8);
        textView9 = (TextView) view.findViewById(R.id.textView9);
        textView10 = (TextView) view.findViewById(R.id.textView10);
        textView11 = (TextView) view.findViewById(R.id.textView11);
        textView12 = (TextView) view.findViewById(R.id.textView12);
        textView13 = (TextView) view.findViewById(R.id.textView13);
        textView14 = (TextView) view.findViewById(R.id.textView14);

        Button b1 = view.findViewById(R.id.button);
        Button b2 = view.findViewById(R.id.button2);
        Button b3 = view.findViewById(R.id.button3);
        Button b4 = view.findViewById(R.id.button4);
        Button b5 = view.findViewById(R.id.button5);
        Button b6 = view.findViewById(R.id.button6);
        Button b7 = view.findViewById(R.id.button7);
        Button b8 = view.findViewById(R.id.button8);
        Button b9 = view.findViewById(R.id.button9);
        Button b10 = view.findViewById(R.id.button10);
        Button b11 = view.findViewById(R.id.button11);
        Button b12 = view.findViewById(R.id.button12);
        Button b13 = view.findViewById(R.id.button13);
        Button b14 = view.findViewById(R.id.button14);
        Button b15 = view.findViewById(R.id.button15);
        Button b16 = view.findViewById(R.id.button16);
        Button b17 = view.findViewById(R.id.button17);
        Button b18 = view.findViewById(R.id.button18);
        Button b19 = view.findViewById(R.id.button19);
        Button b20 = view.findViewById(R.id.button20);
        Button b21 = view.findViewById(R.id.button21);
        Button b22 = view.findViewById(R.id.button22);
        Button b23 = view.findViewById(R.id.button23);
        Button b24 = view.findViewById(R.id.button24);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Dinner");
                saveData();
                loadData();
                updateViews();
                result = textView.getText().toString();
                addDataToR();

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Lunch");
                saveData();
                loadData();
                updateViews();
                result = textView.getText().toString();
                addDataToR();
            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Breakfast");
                saveData();
                loadData();
                updateViews();
                result = textView.getText().toString();
                addDataToR();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Snack");
                saveData();
                loadData();
                updateViews();
                result = textView.getText().toString();
                addDataToR();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Brunch");
                saveData();
                loadData();
                updateViews();
                result = textView.getText().toString();
                addDataToR();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Coffee");
                saveData();
                loadData();
                updateViews();
                result = textView.getText().toString();
                addDataToR();
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Meeting");
                saveData();
                loadData();
                updateViews();
                result = textView.getText().toString();
                addDataToR();
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Break");
                saveData();
                loadData();
                updateViews();
                result = textView.getText().toString();
                addDataToR();
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Work");
                saveData();
                loadData();
                updateViews();
                result = textView.getText().toString();
                addDataToR();
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Homework");
                saveData();
                loadData();
                updateViews();
                result = textView.getText().toString();
                addDataToR();
            }
        });

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Class");
                saveData();
                loadData();
                updateViews();
                result = textView.getText().toString();
                addDataToR();
            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Study");
                saveData();
                loadData();
                updateViews();
                result = textView.getText().toString();
                addDataToR();
            }
        });

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Sleep");
                saveData();
                loadData();
                updateViews();
                result = textView.getText().toString();
                addDataToR();
            }
        });

        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Gaming");
                saveData();
                loadData();
                updateViews();
                result = textView.getText().toString();
                addDataToR();
            }
        });

        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Sport");
                saveData();
                loadData();
                updateViews();
                result = textView.getText().toString();
                addDataToR();
            }
        });

        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Movie");
                saveData();
                loadData();
                updateViews();
                result = textView.getText().toString();
                addDataToR();
            }
        });

        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Shopping");
                saveData();
                loadData();
                updateViews();
                result = textView.getText().toString();
                addDataToR();
            }
        });

        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Workout");
                saveData();
                loadData();
                updateViews();
                result = textView.getText().toString();
                addDataToR();
            }
        });

        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Barber");
                saveData();
                loadData();
                updateViews();
                result = textView.getText().toString();
                addDataToR();
            }
        });

        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Dentist");
                saveData();
                loadData();
                updateViews();
                result = textView.getText().toString();
                addDataToR();
            }
        });

        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Doctor");
                saveData();
                loadData();
                updateViews();
                result = textView.getText().toString();
                addDataToR();
            }
        });

        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Party");
                saveData();
                loadData();
                updateViews();
                result = textView.getText().toString();
                addDataToR();
            }
        });

        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Date");
                saveData();
                loadData();
                updateViews();
                result = textView.getText().toString();
                addDataToR();
            }
        });

        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Friends");
                saveData();
                loadData();
                updateViews();
                result = textView.getText().toString();
                addDataToR();
            }
        });

        deleteData();





    }

    public void deleteData(){
        getParentFragmentManager().setFragmentResultListener("requestKey11", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle bundle) {
                // We use a String here, but any type that can be put in a Bundle is supported
                String result = bundle.getString("bundleKey11");
                textView8.setText(result);
                textView14.setText("");
            }});

        getParentFragmentManager().setFragmentResultListener("requestKey12", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey2, @NonNull Bundle bundle2) {
                // We use a String here, but any type that can be put in a Bundle is supported
                String result2 = bundle2.getString("bundleKey12");
                textView9.setText(result2);
                textView14.setText("");
            }});

        getParentFragmentManager().setFragmentResultListener("requestKey13", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey3, @NonNull Bundle bundle3) {
                // We use a String here, but any type that can be put in a Bundle is supported
                String result3 = bundle3.getString("bundleKey13");
                textView10.setText(result3);
                textView14.setText("");
            }});

        getParentFragmentManager().setFragmentResultListener("requestKey14", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey4, @NonNull Bundle bundle4) {
                // We use a String here, but any type that can be put in a Bundle is supported
                String result4 = bundle4.getString("bundleKey14");
                textView11.setText(result4);
                textView14.setText("");
            }});

        getParentFragmentManager().setFragmentResultListener("requestKey15", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey5, @NonNull Bundle bundle5) {
                // We use a String here, but any type that can be put in a Bundle is supported
                String result5 = bundle5.getString("bundleKey15");
                textView12.setText(result5);
                textView14.setText("");
            }});

        getParentFragmentManager().setFragmentResultListener("requestKey16", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey6, @NonNull Bundle bundle6) {
                // We use a String here, but any type that can be put in a Bundle is supported
                String result6 = bundle6.getString("bundleKey16");
                textView13.setText(result6);
                textView14.setText("");
            }});
    }

    public void addDataToR(){
        if(textView8.getText().toString().equals("")){
            textView8.setText(result);
            sendData();
        }
        else {
            if (textView9.getText().toString().equals("")) {
                textView9.setText(result);
                sendData();
            } else {
                if (textView10.getText().toString().equals("")) {
                    textView10.setText(result);
                    sendData();
                } else {
                    if (textView11.getText().toString().equals("")) {
                        textView11.setText(result);
                        sendData();
                    } else {
                        if (textView12.getText().toString().equals("")) {
                            textView12.setText(result);
                            sendData();
                        } else {
                            if (textView13.getText().toString().equals("")) {
                                textView13.setText(result);
                                sendData();
                            } else {
                                textView14.setText("NO MORE SPACE");
                                sendData();
                            }
                        }
                    }
                }
            }
        }
    }

    public void saveData(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString(TEXT, textView.getText().toString());
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
        textView.setText(text);
    }

    public void sendData(){
        Bundle result = new Bundle();
        result.putString("bundleKey", textView8.getText().toString());
        getParentFragmentManager().setFragmentResult("requestKey", result);

        Bundle result2 = new Bundle();
        result2.putString("bundleKey2", textView9.getText().toString());
        getParentFragmentManager().setFragmentResult("requestKey2", result2);

        Bundle result3 = new Bundle();
        result3.putString("bundleKey3", textView10.getText().toString());
        getParentFragmentManager().setFragmentResult("requestKey3", result3);

        Bundle result4 = new Bundle();
        result4.putString("bundleKey4", textView11.getText().toString());
        getParentFragmentManager().setFragmentResult("requestKey4", result4);

        Bundle result5 = new Bundle();
        result5.putString("bundleKey5", textView12.getText().toString());
        getParentFragmentManager().setFragmentResult("requestKey5", result5);

        Bundle result6 = new Bundle();
        result6.putString("bundleKey6", textView13.getText().toString());
        getParentFragmentManager().setFragmentResult("requestKey6", result6);

        Bundle result7 = new Bundle();
        result7.putString("bundleKey7", textView14.getText().toString());
        getParentFragmentManager().setFragmentResult("requestKey7", result7);
    }

    public void removeData(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.remove(TEXT);
        editor.apply();
    }







}