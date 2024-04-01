package com.whatsapp.settings.chat.wallpaper;

import X.AbstractActivityC50032Pg;
import X.AbstractC000600i;
import X.AbstractC005302j;
import X.AbstractC04890Mh;
import X.AbstractC40441sG;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.AnonymousClass029;
import X.C000200d;
import X.C001200o;
import X.C011605s;
import X.C018508q;
import X.C01B;
import X.C02C;
import X.C02E;
import X.C02F;
import X.C03410Fp;
import X.C0HK;
import X.C0HS;
import X.C0O6;
import X.C0U1;
import X.C0VJ;
import X.C2AQ;
import X.C35301iv;
import X.C42501vq;
import X.C59452sm;
import X.C659739g;
import X.C81393op;
import X.C81433ot;
import X.C81513p1;
import X.InterfaceC002901k;
import X.InterfaceC05620Pl;
import X.InterfaceC59442sl;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.backup.google.PromptDialogFragment;
import com.whatsapp.settings.chat.wallpaper.WallpaperCategoriesActivity;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class WallpaperCategoriesActivity extends AbstractActivityC50032Pg implements C0O6 {
    public RecyclerView A00;
    public AbstractC000600i A01;
    public C01B A02;
    public C011605s A03;
    public InterfaceC59442sl A04;
    public C659739g A05;
    public C02E A06;
    public C001200o A07;
    public C02F A08;
    public C2AQ A0A;
    public AbstractC40441sG A0B;
    public C81433ot A0C;
    public C02C A0D;
    public InterfaceC002901k A0E;
    public boolean A0F;
    public final C59452sm A0H = new C59452sm();
    public AbstractC005302j A09 = null;
    public boolean A0G = false;

    @Override // X.C0O6
    public void AJN(int i) {
    }

    @Override // X.C0O6
    public void AJO(int i) {
    }

    public static Intent A00(Activity activity, AbstractC005302j abstractC005302j) {
        Intent intent = new Intent(activity, WallpaperCategoriesActivity.class);
        intent.putExtra("chat_jid", abstractC005302j);
        return intent;
    }

    @Override // X.C0O6
    public void AJP(int i) {
        if (i == 112) {
            AbstractC40441sG abstractC40441sG = this.A0B;
            AbstractC005302j abstractC005302j = this.A09;
            if (abstractC40441sG instanceof C42501vq) {
                ((C42501vq) abstractC40441sG).A0G(abstractC005302j, null, this);
            }
            setResult(-1);
            finish();
        } else if (i != 113) {
        } else {
            AbstractC40441sG abstractC40441sG2 = this.A0B;
            if (abstractC40441sG2 instanceof C42501vq) {
                C42501vq c42501vq = (C42501vq) abstractC40441sG2;
                c42501vq.A06.AS1(new RunnableEBaseShape6S0100000_I0_6(c42501vq, 25));
            }
        }
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 0) {
            return;
        }
        setResult(i2);
        if (this.A05.onActivityResult(i, i2, intent)) {
            finish();
        }
    }

    @Override // X.AbstractActivityC50032Pg, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_wallpaper_categories);
        C018508q c018508q = ((ActivityC02290Ap) this).A0A;
        C81513p1 c81513p1 = new C81513p1(c018508q);
        this.A04 = c81513p1;
        this.A05 = new C659739g(this, c018508q, this.A02, this.A06, this.A0B, this, c81513p1, this.A0H);
        this.A09 = C03410Fp.A05(getIntent());
        this.A0G = getIntent().getBooleanExtra("is_using_global_wallpaper", false);
        A0k((Toolbar) C0VJ.A0A(this, R.id.wallpaper_categories_toolbar));
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            if (this.A09 != null && !this.A0G) {
                setTitle(R.string.wallpaper_custom_wallpaper_header);
            } else if (AnonymousClass029.A1K(this)) {
                setTitle(R.string.wallpaper_dark_theme_header);
            } else {
                setTitle(R.string.wallpaper_light_theme_header);
            }
            this.A09 = C03410Fp.A05(getIntent());
            this.A0F = this.A08.A06();
            AbstractC40441sG abstractC40441sG = this.A0B;
            C0HK c0hk = !(abstractC40441sG instanceof C42501vq) ? null : ((C42501vq) abstractC40441sG).A00;
            if (c0hk != null) {
                c0hk.A05(this, new InterfaceC05620Pl() { // from class: X.3oq
                    {
                        WallpaperCategoriesActivity.this = this;
                    }

                    @Override // X.InterfaceC05620Pl
                    public final void AIK(Object obj) {
                        WallpaperCategoriesActivity wallpaperCategoriesActivity = WallpaperCategoriesActivity.this;
                        int intValue = ((Number) obj).intValue();
                        if (intValue == 1) {
                            wallpaperCategoriesActivity.A12(R.string.wallpaper_reset);
                        } else if (intValue != 2) {
                            return;
                        }
                        AbstractC40441sG abstractC40441sG2 = wallpaperCategoriesActivity.A0B;
                        if (abstractC40441sG2 instanceof C42501vq) {
                            ((C42501vq) abstractC40441sG2).A00.A0B(0);
                        }
                        wallpaperCategoriesActivity.setResult(-1);
                        wallpaperCategoriesActivity.finish();
                    }
                });
                ArrayList arrayList = new ArrayList();
                arrayList.add(0);
                arrayList.add(1);
                arrayList.add(2);
                arrayList.add(3);
                arrayList.add(5);
                boolean z = this.A0B.A04(this.A09, this).A03;
                if (!z) {
                    arrayList.add(4);
                }
                this.A00 = (RecyclerView) C0VJ.A0A(this, R.id.categories);
                C81433ot c81433ot = new C81433ot(arrayList, new C81393op(this, z), new Handler(Looper.getMainLooper()), getContentResolver(), this.A03, ((ActivityC02290Ap) this).A0I, this.A01, this.A07, this.A0E, this.A02, this.A0A, this.A08, this.A0D);
                this.A0C = c81433ot;
                this.A00.setLayoutManager(new WallpaperGridLayoutManager(c81433ot));
                this.A00.A0k(new C35301iv(((ActivityC02310Ar) this).A01, getResources().getDimensionPixelSize(R.dimen.wallpaper_category_view_padding)));
                this.A00.setAdapter(this.A0C);
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.A09 == null) {
            menu.add(0, 999, 0, R.string.wallpaper_reset_wallpapers_overflow_menu_option).setShowAsAction(0);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        for (C0HS c0hs : this.A0C.A0E.values()) {
            c0hs.A05(true);
        }
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 999) {
            Bundle A01 = C000200d.A01("dialog_id", 113);
            A01.putString("message", getString(R.string.wallpaper_reset_wallpapers_dialog_description));
            A01.putString("positive_button", getString(R.string.wallpaper_reset_wallpapers_dialog_reset_button));
            A01.putString("negative_button", getString(R.string.cancel));
            PromptDialogFragment promptDialogFragment = new PromptDialogFragment();
            promptDialogFragment.A0P(A01);
            AUh(promptDialogFragment);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.A0F != this.A08.A06()) {
            this.A0F = this.A08.A06();
            ((AbstractC04890Mh) this.A0C).A01.A00();
        }
    }
}
