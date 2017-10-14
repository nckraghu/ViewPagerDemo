package kalyan.com.viewpagerdemo;

import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerTitleStrip;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.TableLayout;

import kalyan.com.viewpagerdemo.views.ViewPagerAdapter;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ViewPager viewPager = findViewById(R.id.view_pager);

        android.support.design.widget.TabLayout tabLayout = findViewById(R.id.tab_layout);

        tabLayout.setupWithViewPager(viewPager);

        /*pagerTitleStrip.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        pagerTitleStrip.setTextColor(getResources().getColor(R.color.white, getTheme()));
        pagerTitleStrip.setBackgroundColor(getResources().getColor(R.color.colorPrimary, getTheme()));
*/

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(viewPagerAdapter);
    }
}
