package com.example.sirsuhail;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
private RecyclerView recyclerView;
    private List<items> listOfItems;
private itemsAdapter adapter;
private LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        recyclerView=findViewById(R.id.recyclerViewID);
        linearLayout=findViewById(R.id.linearLyout);
        loadMessages();
        onBackButton();
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this, "Items are send and attached", Toast.LENGTH_SHORT).show();
            }
        });
    }



    private void loadMessages() {
        listOfItems=new ArrayList<>();
        listOfItems.add(new items(true,true,"A o A\nHave you submitted your\nassignment","D","sudnay 4 aprail"));
        listOfItems.add(new items(true,false,"Have you submitted your\nassignment","S","sudnay 4 aprail"));
        listOfItems.add(new items(false,false,"Yes\nI have submitted our assingments","S","sudnay 4 aprail"));
        listOfItems.add(new items(true,true,"A o A\nHave you submitted your\nassignment","S","sudnay 4 aprail"));
        listOfItems.add(new items(true,false,"Have you submitted your\nassignment","S","sudnay 4 aprail"));
        listOfItems.add(new items(false,false,"Yes\nI have submitted our assingments","S","sudnay 4 aprail"));

        listOfItems.add(new items(true,true,"A o A\nHave you submitted your\nassignment","S","sudnay 4 aprail"));
        listOfItems.add(new items(true,false,"Have you submitted your\nassignment","S","sudnay 4 aprail"));
        listOfItems.add(new items(false,false,"Yes\nI have submitted our assingments","S","sudnay 4 aprail"));

        listOfItems.add(new items(true,true,"A o A\nHave you submitted your\nassignment","S","sudnay 4 aprail"));
        listOfItems.add(new items(true,false,"Have you submitted your\nassignment","S","sudnay 4 aprail"));
        listOfItems.add(new items(false,false,"Yes\nI have submitted our assingments","S","sudnay 4 aprail"));



        adapter=new itemsAdapter(MainActivity2.this,listOfItems);
        // mLayoutManager = new LinearLayoutManager(getApplicationContext());
        //recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(adapter);

    }


     @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.contactID:
                Toast.makeText(this, "Contact item selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.blockId:
                Toast.makeText(this, "Contact item is Blocked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ReportId:
                Toast.makeText(this, "Contact item is Reported", Toast.LENGTH_SHORT).show();
                break;
            case R.id.searchID:
                Toast.makeText(this, "Contact item is searched", Toast.LENGTH_SHORT).show();
                break;
            case R.id.videoCallID:
                Toast.makeText(this, "Make a video call", Toast.LENGTH_SHORT).show();
                break;
            case R.id.phonecallID:
                Toast.makeText(this, "Make a phone call", Toast.LENGTH_SHORT).show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
    private void onBackButton(){
        showBackButtonDailogue();
    }

    private void showBackButtonDailogue() {
        MaterialAlertDialogBuilder builder=new MaterialAlertDialogBuilder(MainActivity2.this);
        builder.setTitle("Message");
        builder.setMessage("Do you want to move back to activity!");
        builder.setNeutralButton("Dismiss", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                finish();
            }
        });
        builder.create().show();

    }
}
