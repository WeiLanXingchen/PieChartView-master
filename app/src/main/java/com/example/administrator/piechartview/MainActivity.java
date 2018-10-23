package com.example.administrator.piechartview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.lwb.piechart.PieChartView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        PieChartView1 pieChartView = findViewById(R.id.pie_chart_view);
        PieChartView pieChartView = findViewById(R.id.pie_chart_view);
        pieChartView.addItemType(new PieChartView.ItemType("医院", 1600, 0xff20B2AA));
        pieChartView.addItemType(new PieChartView.ItemType("挂号", 1172, 0xff68228B));
        pieChartView.addItemType(new PieChartView.ItemType("门诊支付", 632, 0xff8B5A00));
        pieChartView.addItemType(new PieChartView.ItemType("住院", 888, 0xffCD3700));
        pieChartView.addItemType(new PieChartView.ItemType("外出旅游", 645, 0xff8968CD));
        pieChartView.addItemType(new PieChartView.ItemType("饮食", 533, 0xff437145));
        pieChartView.addItemType(new PieChartView.ItemType("其他", 732, 0xff8DB6CD));
//        pieChartView.addItemType(new PieChartView.ItemType("联想", 2, 0xff6B8E23));
//        pieChartView.addItemType(new PieChartView.ItemType("其他品牌", 20, 0xff999999));
        pieChartView.setCell(5);//设置环形图的间距
        pieChartView.setInnerRadius(0.4f);//设置环形图内环半径比例 0 - 1.0f
//        pieChartView.setPieCell(10);
//        pieChartView.setBackGroundColor(0xffFFFFE0);//设置背景颜色
//        pieChartView.setItemTextSize(30);//设置字体与横线距离
        pieChartView.setTextPadding(10);//设置字体与横线距离
    }

    public void btnClick(View view) {
//        startActivity(new Intent(this,Main2Activity.class));

    }
}

