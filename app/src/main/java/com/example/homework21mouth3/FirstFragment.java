package com.example.homework21mouth3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class FirstFragment extends Fragment {
    private EditText edName;
    private Button btnClick;
    public static final String KEY_FOR_BUNDLE = "key";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        edName = view.findViewById(R.id.ed_name1);
        btnClick = view.findViewById(R.id.btn_click1);

        btnClick.setOnClickListener(view1 -> {
            Bundle bundle = new Bundle();
            bundle.putString(KEY_FOR_BUNDLE, edName.getText().toString());
            SecondFragment secondFragment = new SecondFragment();
            secondFragment.setArguments(bundle);
            requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, secondFragment).addToBackStack(null).commit();
        });

    }
}