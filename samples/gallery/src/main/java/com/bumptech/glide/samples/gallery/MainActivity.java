package com.bumptech.glide.samples.gallery;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.MemoryCategory;

/**
 * Displays a {@link HorizontalGalleryFragment}.
 */
public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        //设置内存的种类
        Glide.get(this).setMemoryCategory(MemoryCategory.HIGH);
    }
}
