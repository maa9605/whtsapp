package X;

import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

/* renamed from: X.1el  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C32801el implements InterfaceC16350qG {
    public boolean A00;
    public final /* synthetic */ TabLayout A01;

    public C32801el(TabLayout tabLayout) {
        this.A01 = tabLayout;
    }

    @Override // X.InterfaceC16350qG
    public void AGw(ViewPager viewPager, C0ZT c0zt, C0ZT c0zt2) {
        TabLayout tabLayout = this.A01;
        if (tabLayout.A0L == viewPager) {
            tabLayout.A0C(c0zt2, this.A00);
        }
    }
}
