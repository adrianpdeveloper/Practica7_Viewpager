package com.example.practica7_viewpager.login;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.practica7_viewpager.databinding.ActivityLoginBinding;
import com.example.practica7_viewpager.login.fragments.LoginFragment;

public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.loginActivityToolbar);
        esconderToolbar();
        inflateFragment();
        listeners();
    }

    public void mostrarToolbar() {
        binding.loginActivityToolbar.setVisibility(View.VISIBLE);
    }

    public void esconderToolbar() {
        binding.loginActivityToolbar.setVisibility(View.GONE);
    }

    private void listeners() {
        binding.loginActivityToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inflateFragment();
            }
        });

    }

    private void inflateFragment() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(binding.loginActivityFrame.getId(), new LoginFragment())
                .addToBackStack(null)
                .commitAllowingStateLoss();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(binding.loginActivityFrame.getId(), new LoginFragment())
                .addToBackStack(null)
                .commitAllowingStateLoss();
    }
}