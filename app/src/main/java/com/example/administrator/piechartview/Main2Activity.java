package com.example.administrator.piechartview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends Activity {
    PieChartView1 pieChartView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


    }

    @Override
    protected void onResume() {
        super.onResume();
        pieChartView = findViewById(R.id.pie_chart_view);
        pieChartView.addItemType(new PieChartView1.ItemType("苹果", 25, 0xff20B2AA));
        pieChartView.addItemType(new PieChartView1.ItemType("华为", 17, 0xff68228B));
        pieChartView.addItemType(new PieChartView1.ItemType("小米", 13, 0xff8B5A00));
        pieChartView.addItemType(new PieChartView1.ItemType("三星", 8, 0xffCD3700));
        pieChartView.addItemType(new PieChartView1.ItemType("OPPO", 6, 0xff8968CD));
        pieChartView.addItemType(new PieChartView1.ItemType("VIVO", 5, 0xff437145));
        pieChartView.addItemType(new PieChartView1.ItemType("魅族", 4, 0xff8DB6CD));
        pieChartView.addItemType(new PieChartView1.ItemType("联想", 2, 0xff6B8E23));
        pieChartView.addItemType(new PieChartView1.ItemType("其他品牌", 20, 0xff999999));
        pieChartView.setCell(5);//设置环形图的间距
        pieChartView.setInnerRadius(0.4f);//设置环形图内环半径比例 0 - 1.0f
//        pieChartView.setPieCell(10);
        pieChartView.setBackGroundColor(0xffFFFFE0);//设置背景颜色
//        pieChartView.setItemTextSize(30);//设置字体与横线距离
        pieChartView.setTextPadding(10);//设置字体与横线距离
    }
}
