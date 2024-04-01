package com.whatsapp.profile;

import X.AbstractActivityC457823r;
import X.ActivityC02270An;
import X.ActivityC02290Ap;
import X.AnonymousClass241;
import X.AnonymousClass242;
import X.C000400f;
import X.C001200o;
import X.C002701i;
import X.C003301p;
import X.C004902f;
import X.C02160Ac;
import X.C02E;
import X.C0U1;
import X.C3TA;
import X.C3TB;
import X.C3TC;
import X.C3l2;
import X.C41451tw;
import X.C79073l1;
import X.InterfaceC002901k;
import X.InterfaceC05880Qp;
import X.InterfaceC07650Zd;
import X.InterfaceC11420hj;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.facebook.redex.ViewOnClickEBaseShape3S0100000_I0_3;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.profile.WebImagePicker;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class WebImagePicker extends AbstractActivityC457823r {
    public int A01;
    public Uri A02;
    public View.OnClickListener A03;
    public View A04;
    public View A05;
    public ProgressBar A06;
    public SearchView A07;
    public C000400f A08;
    public C02E A09;
    public C001200o A0A;
    public C41451tw A0B;
    public C79073l1 A0C;
    public C3TB A0D;
    public C3TC A0E;
    public AnonymousClass241 A0F;
    public C004902f A0G;
    public InterfaceC002901k A0H;
    public File A0I;
    public final ArrayList A0K = new ArrayList();
    public int A00 = 4;
    public final InterfaceC05880Qp A0J = new InterfaceC05880Qp() { // from class: X.3kz
        {
            WebImagePicker.this = this;
        }

        @Override // X.InterfaceC05880Qp
        public void ANZ(String str) {
            throw new IllegalStateException("must not be called");
        }

        @Override // X.InterfaceC05880Qp
        public void ANa() {
            throw new IllegalStateException("must not be called");
        }

        @Override // X.InterfaceC05880Qp
        public void AQ0(String str) {
            WebImagePicker webImagePicker = WebImagePicker.this;
            C018508q c018508q = ((ActivityC02290Ap) webImagePicker).A0A;
            boolean A01 = C000400f.A01();
            int i = R.string.need_sd_card_shared_storage;
            if (A01) {
                i = R.string.need_sd_card;
            }
            c018508q.A07(i, 1);
            webImagePicker.finish();
        }

        @Override // X.InterfaceC05880Qp
        public void AQ1() {
            WebImagePicker webImagePicker = WebImagePicker.this;
            int i = Build.VERSION.SDK_INT;
            int i2 = R.string.permission_storage_need_write_access_on_web_image_picking_v30;
            if (i < 30) {
                i2 = R.string.permission_storage_need_write_access_on_web_image_picking;
            }
            RequestPermissionActivity.A05(webImagePicker, R.string.permission_storage_need_write_access_on_web_image_picking_request, i2);
        }
    };

    public final void A1R() {
        int i = (int) (getResources().getDisplayMetrics().density * 3.3333333f);
        this.A01 = (((int) (getResources().getDisplayMetrics().density * 1.3333334f)) << 1) + C003301p.A01(this) + i;
        Point point = new Point();
        getWindowManager().getDefaultDisplay().getSize(point);
        int i2 = point.x;
        int i3 = i2 / this.A01;
        this.A00 = i3;
        this.A01 = (i2 / i3) - i;
        AnonymousClass241 anonymousClass241 = this.A0F;
        if (anonymousClass241 != null) {
            anonymousClass241.A00();
        }
        AnonymousClass242 anonymousClass242 = new AnonymousClass242(((ActivityC02290Ap) this).A0A, this.A0B, this.A0I);
        anonymousClass242.A01 = this.A01;
        anonymousClass242.A02 = 4194304L;
        anonymousClass242.A04 = C02160Ac.A03(this, R.drawable.picture_loading);
        anonymousClass242.A03 = C02160Ac.A03(this, R.drawable.ic_missing_thumbnail_picture);
        this.A0F = anonymousClass242.A00();
    }

    public final void A1S() {
        String charSequence = this.A07.getQuery().toString();
        if (TextUtils.isEmpty(charSequence)) {
            ((ActivityC02290Ap) this).A0A.A07(R.string.photo_nothing_to_search, 0);
            return;
        }
        ((ActivityC02270An) this).A0F.A01(this.A07);
        this.A06.setVisibility(0);
        ((TextView) A1P().getEmptyView()).setText("");
        this.A0D.A00(charSequence);
    }

    public /* synthetic */ void lambda$onCreate$2085$WebImagePicker(View view) {
        A1S();
    }

    public void lambda$onCreate$2086$WebImagePicker(View view) {
        String str = (String) view.getTag(R.id.web_image_picker_url);
        if (str == null || this.A02 == null) {
            return;
        }
        Iterator it = this.A0K.iterator();
        while (it.hasNext()) {
            C3TA c3ta = (C3TA) it.next();
            if (str.equals(c3ta.A07)) {
                C79073l1 c79073l1 = this.A0C;
                if (c79073l1 != null) {
                    c79073l1.A05(true);
                }
                C79073l1 c79073l12 = new C79073l1(this, c3ta);
                this.A0C = c79073l12;
                this.A0H.ARy(c79073l12, new Void[0]);
                return;
            }
        }
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 151) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            A1S();
        } else {
            finish();
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A1R();
        this.A0D.notifyDataSetChanged();
    }

    @Override // X.AbstractActivityC457823r, X.AbstractActivityC02260Am, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.search_web);
        this.A0I = new File(getCacheDir(), "Thumbs");
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            A0c.A0O(false);
            A0c.A0M(true);
            this.A0I.mkdirs();
            C3TC c3tc = new C3TC(this.A0A, this.A0B, "");
            this.A0E = c3tc;
            File[] listFiles = c3tc.A06.listFiles();
            if (listFiles != null) {
                Arrays.sort(listFiles, new Comparator() { // from class: X.3T2
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return Long.valueOf(((File) obj).lastModified()).compareTo(Long.valueOf(((File) obj2).lastModified()));
                    }
                });
                int i = 0;
                while (true) {
                    int length = listFiles.length;
                    if (i >= length) {
                        break;
                    }
                    File file = listFiles[i];
                    if (i <= length - 16 || file.lastModified() + 86400000 <= System.currentTimeMillis()) {
                        file.delete();
                    }
                    i++;
                }
            }
            setContentView(R.layout.web_image_picker);
            this.A06 = (ProgressBar) findViewById(R.id.indefiniteProgressBar);
            String stringExtra = getIntent().getStringExtra("query");
            if (stringExtra != null) {
                stringExtra = C002701i.A0q(stringExtra);
            }
            SearchView searchView = new SearchView(A0c.A02()) { // from class: X.3wB
                @Override // androidx.appcompat.widget.SearchView
                public boolean A0K() {
                    return false;
                }
            };
            this.A07 = searchView;
            ((TextView) searchView.findViewById(R.id.search_src_text)).setTextColor(C02160Ac.A00(this, R.color.search_text_color_dark));
            this.A07.setQueryHint(getString(R.string.search_hint));
            this.A07.setIconified(false);
            SearchView searchView2 = this.A07;
            searchView2.A0A = new InterfaceC11420hj() { // from class: X.3km
                @Override // X.InterfaceC11420hj
                public final boolean AId() {
                    return true;
                }
            };
            searchView2.A0H(stringExtra);
            SearchView searchView3 = this.A07;
            searchView3.A07 = new ViewOnClickEBaseShape3S0100000_I0_3(this, 25);
            searchView3.A0B = new InterfaceC07650Zd() { // from class: X.3l0
                @Override // X.InterfaceC07650Zd
                public boolean ANX(String str) {
                    return false;
                }

                {
                    WebImagePicker.this = this;
                }

                @Override // X.InterfaceC07650Zd
                public boolean ANY(String str) {
                    WebImagePicker.this.A1S();
                    return true;
                }
            };
            A0c.A0D(searchView3);
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                this.A02 = (Uri) extras.getParcelable("output");
            }
            ListView A1P = A1P();
            A1P.requestFocus();
            A1P.setClickable(false);
            A1P.setBackground(null);
            A1P.setDividerHeight(0);
            View inflate = getLayoutInflater().inflate(R.layout.web_image_picker_footer, (ViewGroup) A1P, false);
            A1P.addFooterView(inflate, null, false);
            A1P.setFooterDividersEnabled(false);
            this.A05 = inflate.findViewById(R.id.progress);
            this.A04 = inflate.findViewById(R.id.attribution);
            C3TB c3tb = new C3TB(this);
            this.A0D = c3tb;
            A1Q(c3tb);
            this.A03 = new ViewOnClickEBaseShape3S0100000_I0_3(this, 24);
            A1R();
            this.A08.A09(this.A0J);
            this.A07.requestFocus();
            return;
        }
        throw null;
    }

    @Override // X.ActivityC02250Al, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.A0K.clear();
        this.A0F.A01.A01(true);
        C79073l1 c79073l1 = this.A0C;
        if (c79073l1 != null) {
            c79073l1.A05(true);
            Log.i("webimagesearch/cancel_image_download_task");
            if (this.A0C.A00 != null) {
                Log.i("webimagesearch/cancel_dialog");
                this.A0C.A00.dismiss();
                this.A0C.A00 = null;
            }
            this.A0C = null;
        }
        C3l2 c3l2 = this.A0D.A00;
        if (c3l2 != null) {
            c3l2.A05(false);
        }
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
