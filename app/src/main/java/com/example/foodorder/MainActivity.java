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

        popularFoodList.add(new PopularFood("Trà sữa đường đen", "25.000đ", R.drawable.duongden,R.string.den));
        popularFoodList.add(new PopularFood("Trà sữa dâu", "30.000đ",R.drawable.dau,R.string.tra_sua_dau));
        popularFoodList.add(new PopularFood("Trà sữa than tre", "30.000đ", R.drawable.thantre,R.string.thantre));
        popularFoodList.add(new PopularFood("Trà xanh kiwi", "25.000đ",R.drawable.kiwi,R.string.kiwi));
        popularFoodList.add(new PopularFood("Trà sữa trân châu", "25.000đ", R.drawable.tranchau,R.string.tranchau));
        popularFoodList.add(new PopularFood("Hồng trà bưởi", "35.000đ",R.drawable.hongtrabuoi,R.string.hongtrabuoi));
        popularFoodList.add(new PopularFood("Trà sữa trân châu baby", "35.000đ",R.drawable.tranchaubaby,R.string.tranchaubaby));
        popularFoodList.add(new PopularFood("Trà sữa khoai môn", "35.000đ",R.drawable.khoaimon,R.string.khoaimon));
        popularFoodList.add(new PopularFood("Trà sữa hồng long xoài", "35.000đ",R.drawable.honglongxoai,R.string.honglongxoai));
        popularFoodList.add(new PopularFood("Catcher Café", "35.000đ",R.drawable.catchercafe,R.string.catcher));

        setPopularRecycler(popularFoodList);

        // tạo list another food
        List<AnotherFood> anotherFoodList = new ArrayList<>();
        anotherFoodList.add(new AnotherFood("Bánh dâu","30.000đ",R.drawable.banhdau,"5.0","ChingChong",R.string.banhDau));
        anotherFoodList.add(new AnotherFood("Bánh crepe","30.000đ",R.drawable.crepe,"5.0","ChingChong",R.string.crepe));
        anotherFoodList.add(new AnotherFood("Bánh sừng bò","30.000đ",R.drawable.sungbo,"5.0","ChingChong",R.string.banhSungBo));
        anotherFoodList.add(new AnotherFood("Bánh nếp cẩm","30.000đ",R.drawable.banhnepcam,"5.0","ChingChong",R.string.banhNepCam));
        anotherFoodList.add(new AnotherFood("Bánh ngọt kem sữa","30.000đ",R.drawable.banhngot,"5.0","ChingChong",R.string.banhKemSua));

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