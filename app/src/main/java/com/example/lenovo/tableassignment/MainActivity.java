package com.example.lenovo.tableassignment;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int i,j,k;
    LinearLayout chartlayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chartlayout=(LinearLayout)findViewById(R.id.chart_layout);

        displaychart();

    }
    public void displaychart()
    {
        TableLayout table=new TableLayout(this);
        table.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.FILL_PARENT,TableLayout.LayoutParams.WRAP_CONTENT));

        for(i=1,j=100,k=30;i<26;i++,j+=5,k--)
        {
            TableRow row=new TableRow(this);
            row.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT,TableRow.LayoutParams.WRAP_CONTENT));

            TextView text=new TextView(this);

            text.setText("Roll:"+i+"  Total Amount:"+j+"  Date:2018, March "+k);

            text.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT,TableRow.LayoutParams.WRAP_CONTENT));

            row.addView(text);
            table.addView(row);
        }
        chartlayout.addView(table);

    }
}
