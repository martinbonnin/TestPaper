package testpaper.mbonnin.net.testpaper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;

import io.paperdb.Paper;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        com.esotericsoftware.minlog.Log.TRACE();
        Paper.init(this);

        setContentView(R.layout.activity_main);

        ArrayList<Recipe> list = Paper.book().read("cookbook");
        Recipe recipe;
        if (list == null) {
            list = new ArrayList<>();
            recipe = new Recipe();
            recipe.name = "chocolate cake";
            recipe.ingredients = new HashMap<String, Integer>();
            recipe.ingredients.put("flour", 300);
            recipe.ingredients.put("eggs", 4);
            recipe.ingredients.put("chocolate", 200);
            recipe.duration = 30;
            list.add(recipe);

            recipe = new Recipe();
            recipe.name = "pancakes";
            recipe.ingredients = new HashMap<String, Integer>();
            recipe.ingredients.put("flour", 300);
            recipe.ingredients.put("eggs", 1);
            recipe.ingredients.put("milk", 500);
            recipe.duration = 20;
            list.add(recipe);

            Paper.book().write("cookbook", list);

            Log.d("TAG", "write new recipe");
        } else {
            Log.d("TAG", "reuse recipe: " + list.get(0).name);
        }
    }
}
