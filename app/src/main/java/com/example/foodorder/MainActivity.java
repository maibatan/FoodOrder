package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.foodorder.adapter.AnotherFoodAdapter;
import com.example.foodorder.adapter.PopularFoodAdapter;
import com.example.foodorder.model.AnotherFood;
import com.example.foodorder.model.PopularFood;

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

        List<PopularFood> popularFoodList = new ArrayList<>();

      //  popularFoodList.add(new PopularFood("Trà sữa socola", "20.000đ", R.drawable.socola));
     //   popularFoodList.add(new PopularFood("Trà sữa matcha", "25.000đ", R.drawable.matcha1));
      //  popularFoodList.add(new PopularFood("Trà sữa matcha đậu đỏ", "30.000đ", R.drawable.matcha));
        popularFoodList.add(new PopularFood("Trà sữa đường đen", "30.000đ", R.drawable.duongden));
        popularFoodList.add(new PopularFood("Trà sữa dâu", "30.000đ", R.drawable.dau));
        popularFoodList.add(new PopularFood("Trà sữa đường đen", "30.000đ", R.drawable.duongden));
        popularFoodList.add(new PopularFood("Trà sữa dâu", "30.000đ", R.drawable.dau));
        popularFoodList.add(new PopularFood("Trà sữa đường đen", "30.000đ", R.drawable.duongden));
        popularFoodList.add(new PopularFood("Trà sữa dâu", "30.000đ", R.drawable.dau));

        setPopularRecycler(popularFoodList);

        // tạo list another food
        List<AnotherFood> anotherFoodList = new ArrayList<>();
        anotherFoodList.add(new AnotherFood("Bánh dâu","30.000đ",R.drawable.banhdau,"5.0","ChingChong"));
        anotherFoodList.add(new AnotherFood("Bánh dâu","30.000đ",R.drawable.banhnepcam,"5.0","ChingChong"));
        anotherFoodList.add(new AnotherFood("Bánh dâu","30.000đ",R.drawable.banhdau,"5.0","ChingChong"));
        anotherFoodList.add(new AnotherFood("Bánh dâu","30.000đ",R.drawable.banhnepcam,"5.0","ChingChong"));

        setAnotherRecycler(anotherFoodList);
    }

    private  void  setPopularRecycler(List<PopularFood> popularFoodList){
        popularRecycler = findViewById(R.id.popular_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        popularRecycler.setLayoutManager(layoutManager);
        popularFoodAdapter = new PopularFoodAdapter(this, popularFoodList);
        popularRecycler.setAdapter(popularFoodAdapter);
    }

    private  void  setAnotherRecycler(List<AnotherFood> anotherFoodList){
        anotherRecycler = findViewById(R.id.another_recycle);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        anotherRecycler.setLayoutManager(layoutManager);
        anotherFoodAdapter = new AnotherFoodAdapter(this, anotherFoodList);
        anotherRecycler.setAdapter(anotherFoodAdapter);
    }
}