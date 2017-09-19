package testpaper.mbonnin.net.testpaper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.HashMap;

import io.paperdb.Paper;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        com.esotericsoftware.minlog.Log.TRACE();
        Paper.init(this);

        setContentView(R.layout.activity_main);

        Recipe recipe = Paper.book().read("recipe");
        if (recipe == null) {
            recipe = new Recipe();
            recipe.name = "chocolate cake";
            recipe.ingredients = new HashMap<String, Integer>();
            recipe.ingredients.put("flour", 300);
            recipe.ingredients.put("eggs", 4);
            recipe.ingredients.put("chocolate", 200);
            recipe.duration = 30;
            Paper.book().write("recipe", recipe);

            Log.d("TAG", "write new recipe");
        } else {
            Log.d("TAG", "reuse recipe: " + recipe.name);
        }
    }
}
