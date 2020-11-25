package com.sargam.college.recyclerviewpractice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LanguageAdapter extends RecyclerView.Adapter<LanguageAdapter.LanguageViewHolder> implements View.OnClickListener {

    String [] mLanguages;


    public LanguageAdapter(String [] mLanguages) {

        this.mLanguages = mLanguages;
    }

    @NonNull
    @Override
    public LanguageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View languageItem = inflater.inflate(R.layout.language_item,parent,false);

        LanguageViewHolder viewHolder = new LanguageViewHolder(languageItem);

        languageItem.setOnClickListener(this);


        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull LanguageViewHolder holder, int position) {

        String currentLang = mLanguages[position];
        holder.textLang.setText(currentLang);





    }

    @Override
    public int getItemCount() {
        return mLanguages.length;
    }

    @Override
    public void onClick(View v) {

        TextView textLang = v.findViewById(R.id.text_lang);
        Context context = v.getContext();
        String value = textLang.getText().toString();
        Toast.makeText(context, value, Toast.LENGTH_SHORT).show();

    }

    public class LanguageViewHolder extends RecyclerView.ViewHolder{
        TextView textLang;


        public LanguageViewHolder(@NonNull View itemView) {
            super(itemView);
            textLang = itemView.findViewById(R.id.text_lang);
        }
    }


}
