package com.example.homework21mouth3;

import static com.example.homework21mouth3.FirstFragment.KEY_FOR_BUNDLE;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class ThirdFragment extends Fragment {
    private EditText edName;
    private Button btnClick;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        edName = view.findViewById(R.id.ed_name3);
        btnClick = view.findViewById(R.id.btn_click3);

        if (getArguments() != null){
            edName.setText(getArguments().getString(KEY_FOR_BUNDLE));
        }
        btnClick.setOnClickListener(view1 -> {
            Bundle bundle = new Bundle();
            bundle.putString(KEY_FOR_BUNDLE, edName.getText().toString());
            FirstFragment firstFragment = new FirstFragment();
            firstFragment.setArguments(bundle);
            requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, firstFragment).addToBackStack(null).commit();
        });



    }
}