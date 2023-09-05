package com.example.practica7_viewpager.OnBoarding.viewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.practica7_viewpager.OnBoarding.fragments.OnBoardingFragment1;
import com.example.practica7_viewpager.OnBoarding.fragments.OnBoardingFragment2;
import com.example.practica7_viewpager.OnBoarding.fragments.OnBoardingFragment3;

public class PageAdapter extends FragmentStateAdapter {


    public PageAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            default:
            case 0:
                return new OnBoardingFragment1();
            case 1:
                return new OnBoardingFragment2();
            case 2:
                return new OnBoardingFragment3();
        }

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
