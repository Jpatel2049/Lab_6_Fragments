package edu.temple.lab_6;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
        implements PaletteFragment.OnColorSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] androidColors = getResources().getStringArray(R.array.android_colors_array);
        final String[] colorNames = getResources().getStringArray(R.array.colors_array);

        PaletteFragment paletteFragment = PaletteFragment.newInstance(androidColors, colorNames);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.main_layout, paletteFragment)
                .addToBackStack(null)
                .commit();
    }

    @Override
    public void onColorSelected(int position) {
        final String[] androidColors = getResources().getStringArray(R.array.android_colors_array);
        CanvasFragment canvasFragment = CanvasFragment.newInstance(androidColors, position);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.palette_layout, canvasFragment)
                .addToBackStack(null)
                .commit();
    }
}


