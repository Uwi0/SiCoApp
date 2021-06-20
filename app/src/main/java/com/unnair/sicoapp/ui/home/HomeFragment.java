package com.unnair.sicoapp.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.unnair.sicoapp.PentunjukIsolasiActivity;
import com.unnair.sicoapp.R;
import com.unnair.sicoapp.SelfCheckUpActivity;
import com.unnair.sicoapp.databinding.FragmentHomeBinding;

import org.jetbrains.annotations.NotNull;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(
            @NonNull LayoutInflater inflater,
            ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(
            @NonNull @NotNull View view,
            @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState
    ) {
        super.onViewCreated(view, savedInstanceState);

        binding.cvSelfCheck.setOnClickListener(v ->{
            Intent intent = new Intent(getActivity(), SelfCheckUpActivity.class);
            startActivity(intent);
        });

        binding.cvPetunjukIsolasi.setOnClickListener(v ->{
            Intent intent = new Intent(getActivity(), PentunjukIsolasiActivity.class);
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}