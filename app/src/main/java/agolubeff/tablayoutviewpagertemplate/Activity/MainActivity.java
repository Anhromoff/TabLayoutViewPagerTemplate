package agolubeff.tablayoutviewpagertemplate.Activity;

import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import agolubeff.tablayoutviewpagertemplate.Adaptrer.TabsAdapter;
import agolubeff.tablayoutviewpagertemplate.R;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));

        InitTabLayout();
    }

    private void InitTabLayout()
    {
        TabsAdapter adapter = new TabsAdapter(getSupportFragmentManager());
        ViewPager view_pager = findViewById(R.id.container);
        TabLayout tabLayout = findViewById(R.id.tabs);

        view_pager.setAdapter(adapter);

        tabLayout.setupWithViewPager(view_pager);
    }
}
