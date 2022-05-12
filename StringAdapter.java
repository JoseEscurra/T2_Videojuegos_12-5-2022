package com.example.myapplication.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.List;

public class StringAdapter extends RecyclerView.Adapter<StringAdapter.StringViewHolder>{

    List<String> contacts;
    public StringAdapter(List<String> contacts){
        this.contacts = contacts;
    }



    @NonNull
    @Override
    public StringViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_string, parent, false);
        StringViewHolder sh = new StringViewHolder(v);
        return sh;
    }

    @Override
    public void onBindViewHolder(@NonNull StringViewHolder holder, int position) {
        String contactsName = contacts.get(position);
        TextView tvContacts = holder.itemView.findViewById(R.id.textContact);
        tvContacts.setText(contactsName);
    }


    @Override
    public int getItemCount() {
        return contacts.size();
    }

    class StringViewHolder extends RecyclerView.ViewHolder{

        public StringViewHolder(@NonNull View itemView){
            super(itemView);
        }
    }
}
