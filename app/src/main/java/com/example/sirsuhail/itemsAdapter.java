package com.example.sirsuhail;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class itemsAdapter extends RecyclerView.Adapter<itemsAdapter.ViewHOlder> {
 private Context context;
 private List<items> itemsList;
    private LayoutInflater layoutInflater;

    public itemsAdapter(Context context, List<items> itemsList) {
        this.context = context;
        this.itemsList = itemsList;
        layoutInflater=LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public itemsAdapter.ViewHOlder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=layoutInflater.inflate(R.layout.recycler_items,parent,false);
        return new ViewHOlder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull itemsAdapter.ViewHOlder holder, int position) {
        items item=itemsList.get(position);
        if(itemsList.get(position).isFirstMEssage()==true){
            holder.dayAndTime.setVisibility(View.VISIBLE);
            holder.dayAndTime.setText(itemsList.get(position).getDayandTime());
        }
        else {
        holder.dayAndTime.setVisibility(View.GONE);
        }
        if(itemsList.get(position).isSeder()==true){
            holder.senderLayout.setVisibility(View.VISIBLE);
            holder.reciverLayout.setVisibility(View.GONE);
            holder.mysenderLetter.setText(itemsList.get(position).getSenderName());
            holder.senderMessage.setText(itemsList.get(position).getMessage());

        }
        else {
            holder.senderLayout.setVisibility(View.GONE);
            holder.reciverLayout.setVisibility(View.VISIBLE);

            holder.receiverMessage.setText(itemsList.get(position).getMessage());
        }
        holder.mysenderLetter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Welcome to letter", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(context,MainActivity3.class);
                String letter=holder.mysenderLetter.getText().toString();
                intent.putExtra("key",letter);
                    v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemsList==null?0: itemsList.size();
    }


    public class ViewHOlder extends RecyclerView.ViewHolder {
        private  TextView dayAndTime, mysenderLetter,receiverMessage,senderMessage;
        private LinearLayout senderLayout,reciverLayout;
        public ViewHOlder(@NonNull View itemView) {
            super(itemView);
            reciverLayout=itemView.findViewById(R.id.reciverLayout);
            senderLayout=itemView.findViewById(R.id.senderLayout);
            dayAndTime=itemView.findViewById(R.id.txtDayDate);
            mysenderLetter=itemView.findViewById(R.id.senderLetter);
            senderMessage=itemView.findViewById(R.id.senderMessage);
            receiverMessage=itemView.findViewById(R.id.reciverMessage);
        }
        private void setSenderMessage(String message){
this.senderMessage.setText(message);
        }
        private void setReceiverMessage(String receiverMessage){
            this.receiverMessage.setText(receiverMessage);
        }
        private void setDayAndTime(String dayAndTime){
            this.dayAndTime.setText(dayAndTime);
        }
        private void setSenderLetter(String senderLetter){
            this.mysenderLetter.setText(senderLetter);
        }

    }
}
