package com.example.user.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class AgeActivity extends BasicActivity {

    private EditText edage;
    int[] numbers = {17,18,19,20,21,22,23,24,25};
    String[] rainbow = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);
        rainbow = getResources().getStringArray(R.array.rainbow);
        RecyclerView recyclerView = findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //TODO:set Adapter
        AgeAdapter adapter = new AgeAdapter();
        recyclerView.setAdapter(adapter);
        edage = findViewById(R.id.ed_age);
    }
    public void next(View view){
        int age = Integer.parseInt(edage.getText().toString());
        user.setAge(age);
        Intent intent = new Intent(this,GenderActivity.class);
        startActivity(intent);
    }
    public void back(View view){
        finish();
    }
    class AgeAdapter extends RecyclerView.Adapter<AgeAdapter.AgeHolder>{
        @NonNull
        @Override
        public AgeAdapter.AgeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = getLayoutInflater().inflate(R.layout.age_row,parent,false);
            return new AgeHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull AgeAdapter.AgeHolder holder, final int position) {
            holder.ageText.setText(numbers[position] + "");
            holder.itemView.setBackgroundColor(Color.parseColor(rainbow[position%7]));
//            if(numbers[position] == 19){
//                holder.ageText.setTextColor(Color.RED);
//            }
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.d("AgeActivity", "onClick: " + numbers[position]);
                    edage.setText(numbers[position] + "");
                }
            });
        }

        @Override
        public int getItemCount() {
            return numbers.length;
        }

    class  AgeHolder extends RecyclerView.ViewHolder{
            TextView ageText;
            public AgeHolder(View itemView) {
                super(itemView);
                ageText = itemView.findViewById(R.id.tv_age);
            }
        }
    }
}
