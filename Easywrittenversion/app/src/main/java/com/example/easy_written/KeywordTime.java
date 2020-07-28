package com.example.easy_written;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

public class KeywordTime extends Fragment {
    private View view;

    public static KeywordTime newInstance(){
        KeywordTime keywordtime=new KeywordTime();
        return keywordtime;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view= inflater.inflate(R.layout.activity_keyword_time,container,false);
        SpannableString content1 = new SpannableString("안드로이드");
        content1.setSpan(new UnderlineSpan(), 0, content1.length(), 0);

        TextView Tandroid1=view.findViewById(R.id.Tandroid1);
        Tandroid1.setText(content1);
        TextView Tandroid2=view.findViewById(R.id.Tandroid2);
        Tandroid2.setText(content1);
        TextView Tandroid3=view.findViewById(R.id.Tandroid3);
        Tandroid3.setText(content1);

        int value=30;
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.progressBar) ;
        progressBar.setProgress(value) ;

        return view;
    }

}
