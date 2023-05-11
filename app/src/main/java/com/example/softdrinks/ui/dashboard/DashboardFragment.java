package com.example.softdrinks.ui.dashboard;

import static androidx.fragment.app.FragmentManager.TAG;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.example.softdrinks.Default;
import com.example.softdrinks.MainActivity;
import com.example.softdrinks.R;
import com.example.softdrinks.databinding.FragmentDashboardBinding;
import com.example.softdrinks.fanta_recipe;
import com.example.softdrinks.malta_recipe;
import com.example.softdrinks.mirinda_recipe;
import com.example.softdrinks.pepsi_recipes;

public class DashboardFragment extends Fragment {
    private FragmentDashboardBinding binding;
   
    public View onCreateView(@NonNull LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        DashboardViewModel dashboardViewModel =new ViewModelProvider(this).get(DashboardViewModel.class);
        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // Initialize and assign variable
        //Navigation to pepsi Link One
        binding.catItm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getContext(), "Hello", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getActivity(), pepsi_recipes.class);
                startActivity(i);
                ((Activity) getActivity()).overridePendingTransition(0, 0);
            }
        });
        //Navigate to pepsi Link two
        binding.catItm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getContext(), "Hello", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getActivity(), pepsi_recipes.class);
                startActivity(i);
                ((Activity) getActivity()).overridePendingTransition(0, 0);
            }
        });

        //Navigate to fanta Link one
        binding.fantaContainer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getContext(), "Hello", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getActivity(), fanta_recipe.class);
                startActivity(i);
                ((Activity) getActivity()).overridePendingTransition(0, 0);
            }
        });
        //Navigate to fanta Link two
        binding.fantaContainer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getContext(), "Hello", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getActivity(), fanta_recipe.class);
                startActivity(i);
                ((Activity) getActivity()).overridePendingTransition(0, 0);
            }
        });

        //Navigate to malta Link one
        binding.maltaP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getContext(), "Hello", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getActivity(), malta_recipe.class);
                startActivity(i);
                ((Activity) getActivity()).overridePendingTransition(0, 0);
            }
        });
        //Navigate to malta Link two
        binding.maltaContainer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getContext(), "Hello", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getActivity(), malta_recipe.class);
                startActivity(i);
                ((Activity) getActivity()).overridePendingTransition(0, 0);
            }
        });
        //Navigate to malta Link two
        binding.mirindaP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getContext(), "Hello", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getActivity(), mirinda_recipe.class);
                startActivity(i);
                ((Activity) getActivity()).overridePendingTransition(0, 0);
            }
        });

        //Navigate to mirinda Link one
        binding.mirindaContainer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getContext(), "Hello", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getActivity(), mirinda_recipe.class);
                startActivity(i);
                ((Activity) getActivity()).overridePendingTransition(0, 0);
            }
        });

        //Navigate to mirinda Link two
        binding.maltaContainer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getContext(), "Hello", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getActivity(), mirinda_recipe.class);
                startActivity(i);
                ((Activity) getActivity()).overridePendingTransition(0, 0);
            }
        });
        return root;
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


}