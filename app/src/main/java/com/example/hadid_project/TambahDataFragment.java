package com.example.hadid_project;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ToggleButton;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class TambahDataFragment extends Fragment {

    ImageView mImage_off,mImage_on;
    ToggleButton mToggleButton;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }
    @Nullable
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.tambah_data, container, false);
        mImage_off = v.findViewById(R.id.lamp_off);
        mImage_on = v.findViewById(R.id.lamp_on);
        mToggleButton = v.findViewById(R.id.switch_button);
        mToggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mToggleButton.isChecked()){
                    mImage_off.setVisibility(View.VISIBLE);
                    mImage_on.setVisibility(View.GONE);
                }else {
                    mImage_on.setVisibility(View.VISIBLE);
                    mImage_off.setVisibility(View.GONE);
                }
            }
        });
        return v;
    }
}
