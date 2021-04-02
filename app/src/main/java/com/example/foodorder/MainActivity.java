package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.foodorder.adapter.AnotherFoodAdapter;
import com.example.foodorder.adapter.PopularFoodAdapter;
import com.example.foodorder.model.Food;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView popularRecycler,anotherRecycler;
    PopularFoodAdapter popularFoodAdapter;
    AnotherFoodAdapter anotherFoodAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // add some dummy data to out model class

        List<Food> popularFoodList = new ArrayList<>();



        popularFoodList.add(new Food("Trà sữa đường đen", "25.000đ", R.drawable.duongden,R.string.den,"Milk Tea","5.0","ChingChong"));
        popularFoodList.add(new Food("Trà sữa dâu", "30.000đ",R.drawable.dau,R.string.tra_sua_dau,"Milk Tea","5.0","ChingChong"));
        popularFoodList.add(new Food("Trà sữa than tre", "30.000đ", R.drawable.thantre,R.string.thantre,"Milk Tea","5.0","ChingChong"));
        popularFoodList.add(new Food("Trà xanh kiwi", "25.000đ",R.drawable.kiwi,R.string.kiwi,"Milk Tea","5.0","ChingChong"));
        popularFoodList.add(new Food("Trà sữa trân châu", "25.000đ", R.drawable.tranchau,R.string.tranchau,"Milk Tea","5.0","ChingChong"));


        setPopularRecycler(popularFoodList);

        // tạo list another food
        List<Food> anotherFoodList = new ArrayList<>();
        anotherFoodList.add(new Food("Bánh dâu","30.000đ",R.drawable.banhdau,R.string.banhDau,"Cake","4.5","ChingChong"));
        anotherFoodList.add(new Food("Bánh crepe","30.000đ",R.drawable.crepe,R.string.crepe,"Cake","4.5","ChingChong"));
        anotherFoodList.add(new Food("Bánh sừng bò","30.000đ",R.drawable.sungbo,R.string.banhSungBo,"Cake","4.8","ChingChong"));
        anotherFoodList.add(new Food("Bánh nếp cẩm","30.000đ",R.drawable.banhnepcam,R.string.banhNepCam,"Cake","4.8","ChingChong"));
        anotherFoodList.add(new Food("Hồng trà bưởi", "35.000đ",R.drawable.hongtrabuoi,R.string.hongtrabuoi,"Milk Tea","5.0","ChingChong"));
        anotherFoodList.add(new Food("Trà sữa trân châu baby", "35.000đ",R.drawable.tranchaubaby,R.string.tranchaubaby,"Milk Tea","4.9","ChingChong"));
        anotherFoodList.add(new Food("Trà sữa khoai môn", "35.000đ",R.drawable.khoaimon,R.string.khoaimon,"Milk Tea","4.9","ChingChong"));
        anotherFoodList.add(new Food("Trà sữa hồng long xoài", "35.000đ",R.drawable.honglongxoai,R.string.honglongxoai,"Milk Tea","4.95","ChingChong"));
        anotherFoodList.add(new Food("Catcher Café", "35.000đ",R.drawable.catchercafe,R.string.catcher,"Milk Tea","4.95","ChingChong"));

        setAnotherRecycler(anotherFoodList);
    }

    private  void  setPopularRecycler(List<Food> popularFoodList){
        popularRecycler = findViewById(R.id.popular_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        popularRecycler.setLayoutManager(layoutManager);
        popularFoodAdapter = new PopularFoodAdapter(this, popularFoodList);
        popularRecycler.setAdapter(popularFoodAdapter);
    }

    private  void  setAnotherRecycler(List<Food> anotherFoodList){
        anotherRecycler = findViewById(R.id.another_recycle);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        anotherRecycler.setLayoutManager(layoutManager);
        anotherFoodAdapter = new AnotherFoodAdapter(this, anotherFoodList);
        anotherRecycler.setAdapter(anotherFoodAdapter);
    }

    public void CheckMap(View view)
    {
        String Url="https://goo.gl/maps/YeLRXU2gkNzBkToQA";
        Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse(Url));

        startActivity(intent);
    }

}