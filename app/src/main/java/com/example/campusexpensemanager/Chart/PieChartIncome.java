package com.example.campusexpensemanager.Chart;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.campusexpensemanager.DataBase.DatabaseHandler1;
import com.example.campusexpensemanager.Model.incomeModel;
import com.example.campusexpensemanager.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import lecho.lib.hellocharts.model.PieChartData;
import lecho.lib.hellocharts.model.SliceValue;
import lecho.lib.hellocharts.view.PieChartView;

public class PieChartIncome extends AppCompatActivity {
    private List<String> xDataIncome = new ArrayList<>();

    ArrayList pieEntries;

    private DatabaseHandler1 databaseHandler1;

    HashMap<String, String> map;

    PieChartView pieChartView;
    List<SliceValue> pieData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart_income); // Sử dụng đúng layout

        pieChartView = findViewById(R.id.chart_income);

        databaseHandler1 = new DatabaseHandler1(PieChartIncome.this);

        addData();
        getEntries();

        PieChartData pieChartData = new PieChartData(pieData);
        pieChartData.setHasLabels(true).setValueLabelTextSize(14);
        pieChartData.setHasCenterCircle(true)
                .setCenterText1("Income") // Đặt tiêu đề trung tâm
                .setCenterText1FontSize(20)
                .setCenterText1Color(Color.parseColor("#0097A7"));
        pieChartView.setPieChartData(pieChartData);
    }

    private void addData() {
        List<incomeModel> incomeModelList = databaseHandler1.getAllIncome(); // Lấy dữ liệu thu nhập

        for (incomeModel model : incomeModelList) {
            xDataIncome.add(model.getType());
        }

        map = new HashMap<>();
        for (incomeModel model : incomeModelList) {
            int amount = Integer.parseInt(model.getAmount());
            if (map.containsKey(model.getType())) {
                int a = Integer.parseInt(map.get(model.getType()));
                map.put(model.getType(), String.valueOf(a + amount));
            } else {
                map.put(model.getType(), model.getAmount());
            }
        }
    }

    private void getEntries() {
        pieEntries = new ArrayList<>();
        int i = 0;

        pieData = new ArrayList<>();

        ArrayList<Integer> colors = new ArrayList<>();
        colors.add(Color.MAGENTA);
        colors.add(Color.BLUE);
        colors.add(Color.YELLOW);
        colors.add(Color.RED);
        colors.add(Color.GREEN);
        colors.add(Color.GRAY);

        for (String type : xDataIncome) {
            pieData.add(new SliceValue(Float.parseFloat(map.get(type)), colors.get(i % 6)).setLabel(type));
            i++;
        }
    }
}
