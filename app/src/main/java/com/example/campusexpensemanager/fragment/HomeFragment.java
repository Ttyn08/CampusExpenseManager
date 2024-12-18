package com.example.campusexpensemanager.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.campusexpensemanager.Adapter.budgetAdapter2;
import com.example.campusexpensemanager.Adapter.expenseAdapter;
import com.example.campusexpensemanager.DataBase.DatabaseHandler1;
import com.example.campusexpensemanager.DataBase.ExpensesData;
import com.example.campusexpensemanager.Model.Expenses;
import com.example.campusexpensemanager.Model.incomeModel;
import com.example.campusexpensemanager.R;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private RecyclerView rv_income, rv_expense;
    private TextView tv_income, tv_expense;

    private expenseAdapter expenseAdapter;
    private budgetAdapter2 budgetAdapter2;

    private List<Expenses> expensesList = new ArrayList<>();
    private List<incomeModel> incomeModelList = new ArrayList<>();

    private ExpensesData expensesData;
    private DatabaseHandler1 databaseHandler1;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        init(view); // Khởi tạo các view
        setupData(); // Khởi tạo Database và các Adapter

        loadData(); // Nạp dữ liệu lên giao diện

        return view;
    }

    private void init(View view) {
        rv_income = view.findViewById(R.id.rv_income);
        rv_expense = view.findViewById(R.id.rv_expense);
        tv_income = view.findViewById(R.id.tv_income);
        tv_expense = view.findViewById(R.id.tv_expense);

        rv_income.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        rv_expense.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
    }

    private void setupData() {
        expensesData = new ExpensesData(getContext());
        databaseHandler1 = new DatabaseHandler1(getContext());

        expenseAdapter = new expenseAdapter(getContext(), expensesList);
        budgetAdapter2 = new budgetAdapter2(getContext(), incomeModelList);

        rv_expense.setAdapter(expenseAdapter);
        rv_income.setAdapter(budgetAdapter2);
    }

    private void loadData() {
        fillExpenseModel();
        fillIncomeModel();
    }

    private void fillExpenseModel() {
        expensesList.clear();
        expensesList.addAll(expensesData.getAllIncome());

        logListData("Expense", expensesList); // Ghi log dữ liệu
        calculateAndUpdateTotal(expensesList, tv_expense);

        expenseAdapter.notifyDataSetChanged();
    }

    private void fillIncomeModel() {
        incomeModelList.clear();
        incomeModelList.addAll(databaseHandler1.getAllIncome());

        logListData("Income", incomeModelList); // Ghi log dữ liệu
        calculateAndUpdateTotal(incomeModelList, tv_income);

        budgetAdapter2.notifyDataSetChanged();
    }

    // Hàm dùng chung để tính tổng và cập nhật TextView
    private <T> void calculateAndUpdateTotal(List<T> list, TextView textView) {
        int total = 0;
        for (T item : list) {
            String amount = item instanceof Expenses ? ((Expenses) item).getAmount()
                    : item instanceof incomeModel ? ((incomeModel) item).getAmount()
                    : "0";

            total += Integer.parseInt(amount);
        }
        textView.setText("$" + total);
    }

    // Hàm dùng chung để ghi log dữ liệu
    private <T> void logListData(String tag, List<T> list) {
        Log.d("HomeFragment", tag + " List Size: " + list.size());
        for (T item : list) {
            Log.d("HomeFragment", tag + " Data: " + item.toString());
        }
    }

    // Hàm refresh giao diện khi có dữ liệu mới (nếu cần)
    public void refreshData() {
        fillExpenseModel();
        fillIncomeModel();
    }
}
