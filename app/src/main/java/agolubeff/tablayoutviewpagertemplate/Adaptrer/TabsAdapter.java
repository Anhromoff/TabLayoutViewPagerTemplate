package agolubeff.tablayoutviewpagertemplate.Adaptrer;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import agolubeff.tablayoutviewpagertemplate.Fragment.Fragment1;
import agolubeff.tablayoutviewpagertemplate.Fragment.Fragment2;
import agolubeff.tablayoutviewpagertemplate.Fragment.Fragment3;

public class TabsAdapter extends FragmentPagerAdapter
{

    public TabsAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position)
    {
        Fragment fr = null;

        switch (position)
        {
            case 0:
                fr = new Fragment1();
                break;
            case 1:
                fr = new Fragment2();
                break;
            case 2:
                fr = new Fragment3();
                break;
        }

        return fr;
    }

    @Override
    public int getCount()
    {
        // Show 3 total pages.
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position)
    {
        CharSequence cs = null;

        switch (position)
        {
            case 0:
                cs = "Fragment 1";
                break;
            case 1:
                cs = "Fragment 2";
                break;
            case 2:
                cs = "Fragment 3";
                break;
        }

        return cs;
    }
}
