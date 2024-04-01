package com.whatsapp.stickers;

import X.AbstractC04890Mh;
import X.AbstractC15200oF;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.AnonymousClass263;
import X.C000400f;
import X.C000800k;
import X.C02180Ae;
import X.C05050Nc;
import X.C0HS;
import X.C0JM;
import X.C0We;
import X.C25R;
import X.C2AS;
import X.C2Bk;
import X.C2IN;
import X.C2IU;
import X.C2IV;
import X.C2IW;
import X.C3Y5;
import X.C42531vt;
import X.C43791xz;
import X.C47552Br;
import X.C82503qc;
import X.C82613qn;
import X.C82773r3;
import X.C82793r5;
import X.InterfaceC001000m;
import X.InterfaceC002901k;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I0_5;
import com.google.android.search.verification.client.R;
import com.whatsapp.components.Button;
import com.whatsapp.stickers.StickerStorePackPreviewActivity;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape10S0100000_I0_2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class StickerStorePackPreviewActivity extends C2IU implements C2IV, C2IW, InterfaceC001000m {
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public ImageView A05;
    public ImageView A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public GridLayoutManager A0A;
    public RecyclerView A0B;
    public Button A0C;
    public Button A0D;
    public C000800k A0E;
    public C000400f A0F;
    public C47552Br A0G;
    public C43791xz A0H;
    public C2Bk A0I;
    public C3Y5 A0J;
    public C82613qn A0K;
    public C2AS A0L;
    public C82793r5 A0M;
    public StickerView A0N;
    public InterfaceC002901k A0O;
    public String A0P;
    public Map A0Q;
    public Map A0R;
    public Set A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public final C25R A0Y = new C2IN(this);
    public final AbstractC15200oF A0X = new AbstractC15200oF() { // from class: X.3r2
        {
            StickerStorePackPreviewActivity.this = this;
        }

        @Override // X.AbstractC15200oF
        public void A00(RecyclerView recyclerView, int i) {
            StickerStorePackPreviewActivity.A00(StickerStorePackPreviewActivity.this, recyclerView);
        }

        @Override // X.AbstractC15200oF
        public void A01(RecyclerView recyclerView, int i, int i2) {
            StickerStorePackPreviewActivity.A00(StickerStorePackPreviewActivity.this, recyclerView);
        }
    };
    public final C82773r3 A0Z = new C82773r3(this);
    public final ViewTreeObserver.OnGlobalLayoutListener A0W = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.3Y8
        {
            StickerStorePackPreviewActivity.this = this;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            StickerStorePackPreviewActivity stickerStorePackPreviewActivity = StickerStorePackPreviewActivity.this;
            int width = stickerStorePackPreviewActivity.A0B.getWidth() / stickerStorePackPreviewActivity.A0B.getContext().getResources().getDimensionPixelSize(R.dimen.sticker_store_preview_item);
            if (stickerStorePackPreviewActivity.A00 != width) {
                stickerStorePackPreviewActivity.A0A.A1q(width);
                stickerStorePackPreviewActivity.A00 = width;
                C82613qn c82613qn = stickerStorePackPreviewActivity.A0K;
                if (c82613qn != null) {
                    ((AbstractC04890Mh) c82613qn).A01.A00();
                }
            }
        }
    };

    public static void A00(StickerStorePackPreviewActivity stickerStorePackPreviewActivity, RecyclerView recyclerView) {
        if (stickerStorePackPreviewActivity != null) {
            boolean z = recyclerView.computeVerticalScrollOffset() > 0;
            View view = stickerStorePackPreviewActivity.A02;
            if (view != null) {
                view.setVisibility(z ? 0 : 8);
                return;
            }
            return;
        }
        throw null;
    }

    public static void A01(StickerStorePackPreviewActivity stickerStorePackPreviewActivity, C42531vt c42531vt) {
        C3Y5 c3y5 = stickerStorePackPreviewActivity.A0J;
        c3y5.A02 = c42531vt;
        c3y5.A01 = new SparseBooleanArray();
        c3y5.A00 = new SparseBooleanArray();
        stickerStorePackPreviewActivity.A0R = new HashMap();
        if (c42531vt != null) {
            stickerStorePackPreviewActivity.A0S = null;
            stickerStorePackPreviewActivity.A0O.ARy(new C0HS(new C82503qc(stickerStorePackPreviewActivity, c42531vt), stickerStorePackPreviewActivity.A0L) { // from class: X.3r4
                public final C82503qc A00;
                public final C2AS A01;

                {
                    this.A00 = r1;
                    this.A01 = r2;
                }

                @Override // X.C0HS
                public Object A07(Object[] objArr) {
                    C42531vt[] c42531vtArr = (C42531vt[]) objArr;
                    if (c42531vtArr != null) {
                        C000700j.A06(c42531vtArr.length == 1);
                        C42531vt c42531vt2 = c42531vtArr[0];
                        if (c42531vt2 != null) {
                            List<C0JM> list = c42531vt2.A04;
                            ArrayList arrayList = new ArrayList(list.size());
                            for (C0JM c0jm : list) {
                                arrayList.add(Boolean.valueOf(this.A01.A0O.A02(c0jm.A0B)));
                            }
                            return arrayList;
                        }
                        throw null;
                    }
                    throw null;
                }

                @Override // X.C0HS
                public void A09(Object obj) {
                    List list = (List) obj;
                    C82503qc c82503qc = this.A00;
                    StickerStorePackPreviewActivity stickerStorePackPreviewActivity2 = c82503qc.A01;
                    C42531vt c42531vt2 = c82503qc.A00;
                    stickerStorePackPreviewActivity2.A0S = new HashSet();
                    for (int i = 0; i < list.size(); i++) {
                        if (((Boolean) list.get(i)).booleanValue()) {
                            stickerStorePackPreviewActivity2.A0S.add(((C0JM) c42531vt2.A04.get(i)).A0B);
                        }
                    }
                    stickerStorePackPreviewActivity2.A1Q();
                }
            }, c42531vt);
            for (int i = 0; i < c42531vt.A04.size(); i++) {
                stickerStorePackPreviewActivity.A0R.put(((C0JM) c42531vt.A04.get(i)).A0B, Integer.valueOf(i));
            }
        }
        if (stickerStorePackPreviewActivity.A0K == null) {
            C82613qn c82613qn = new C82613qn(stickerStorePackPreviewActivity.A0L.A04(), stickerStorePackPreviewActivity.A0H, stickerStorePackPreviewActivity.getResources().getDimensionPixelSize(R.dimen.sticker_store_preview_item), stickerStorePackPreviewActivity.getResources().getDimensionPixelSize(R.dimen.sticker_store_preview_padding), true, stickerStorePackPreviewActivity.A0V, stickerStorePackPreviewActivity.A0N);
            stickerStorePackPreviewActivity.A0K = c82613qn;
            c82613qn.A05 = stickerStorePackPreviewActivity.A0Z;
            stickerStorePackPreviewActivity.A0B.setAdapter(c82613qn);
        }
        C82613qn c82613qn2 = stickerStorePackPreviewActivity.A0K;
        c82613qn2.A04 = stickerStorePackPreviewActivity.A0J;
        ((AbstractC04890Mh) c82613qn2).A01.A00();
        stickerStorePackPreviewActivity.A1Q();
    }

    public final void A1P() {
        C2AS c2as = this.A0L;
        c2as.A0S.ARy(new C0HS(c2as, new AnonymousClass263(this), c2as.A0J) { // from class: X.3qs
            public final C47522Bo A00;
            public final C2AS A01;
            public final AnonymousClass263 A02;

            {
                this.A01 = c2as;
                this.A02 = r2;
                this.A00 = r3;
            }

            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                Pair[] pairArr = (Pair[]) objArr;
                if (pairArr != null) {
                    Pair pair = pairArr[0];
                    if (pair != null) {
                        return this.A01.A03((String) pair.first, ((Boolean) pair.second).booleanValue(), this.A02);
                    }
                    throw null;
                }
                throw null;
            }

            @Override // X.C0HS
            public void A09(Object obj) {
                C42531vt c42531vt = (C42531vt) obj;
                if (c42531vt != null) {
                    C47522Bo c47522Bo = this.A00;
                    c42531vt.A05 = c47522Bo.A01.containsKey(c42531vt.A0D);
                }
                StickerStorePackPreviewActivity.A01(this.A02.A00, c42531vt);
            }
        }, new Pair(this.A0P, Boolean.TRUE));
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0099, code lost:
        if (r6 != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0131, code lost:
        if (r7.A01() == false) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A1Q() {
        /*
            Method dump skipped, instructions count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.stickers.StickerStorePackPreviewActivity.A1Q():void");
    }

    @Override // X.InterfaceC001000m
    public void AIx(C05050Nc c05050Nc) {
        if (c05050Nc.A02) {
            A1Q();
            C82613qn c82613qn = this.A0K;
            if (c82613qn != null) {
                ((AbstractC04890Mh) c82613qn).A01.A00();
            }
        }
    }

    @Override // X.C2IV
    public void AOo(C0JM c0jm) {
        this.A0K.A0G();
        Object obj = this.A0R.get(c0jm.A0B);
        if (obj != null) {
            int intValue = ((Number) obj).intValue();
            SparseBooleanArray sparseBooleanArray = this.A0J.A01;
            if (sparseBooleanArray != null) {
                sparseBooleanArray.put(intValue, true);
            }
            this.A0K.A02(intValue);
            return;
        }
        throw null;
    }

    @Override // X.C2IV
    public void AP3(C0JM c0jm) {
        ((ActivityC02290Ap) this).A0A.A07(R.string.sticker_failed_to_download, 1);
        Object obj = this.A0R.get(c0jm.A0B);
        if (obj != null) {
            int intValue = ((Number) obj).intValue();
            SparseBooleanArray sparseBooleanArray = this.A0J.A01;
            if (sparseBooleanArray != null) {
                sparseBooleanArray.put(intValue, false);
            }
            this.A0K.A02(intValue);
            return;
        }
        throw null;
    }

    @Override // X.C2IV
    public void AP8(C0JM c0jm) {
        Object obj = this.A0R.get(c0jm.A0B);
        if (obj != null) {
            int intValue = ((Number) obj).intValue();
            SparseBooleanArray sparseBooleanArray = this.A0J.A01;
            if (sparseBooleanArray != null) {
                sparseBooleanArray.put(intValue, false);
            }
            this.A0K.A02(intValue);
            return;
        }
        throw null;
    }

    @Override // X.C2IW
    public void AQ3(boolean z) {
        this.A0T = false;
        if (!z) {
            A1Q();
            return;
        }
        ((ActivityC02290Ap) this).A0A.A07(R.string.sticker_pack_delete_successfully, 1);
        if (!this.A0U) {
            finish();
        }
    }

    @Override // X.C2IW
    public void AQ4() {
        this.A0T = true;
        A1Q();
    }

    public /* synthetic */ void lambda$onCreate$2522$StickerStorePackPreviewActivity(View view) {
        finish();
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 28) {
            super.onActivityResult(i, i2, intent);
            finish();
        }
    }

    @Override // X.C2IU, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.sticker_store_pack_preview);
        this.A0P = getIntent().getStringExtra("sticker_pack_id");
        this.A0J = new C3Y5();
        String stringExtra = getIntent().getStringExtra("sticker_pack_preview_source");
        this.A0V = "sticker_store_my_tab".equals(stringExtra);
        this.A0U = "deeplink".equals(stringExtra);
        this.A0I.A01(this.A0Y);
        A1P();
        if (this.A0P == null) {
            Log.e("StickerStorePackPreviewActivity/onCreate no pack id passed");
            finish();
        }
        View view = ((ActivityC02290Ap) this).A04;
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(new C0We(((ActivityC02310Ar) this).A01, C02180Ae.A0O(this, R.drawable.ic_back_teal, R.color.tealActionBarItemDrawableTint)));
        toolbar.setTitle(R.string.sticker_store_pack_preview_title);
        toolbar.setNavigationContentDescription(R.string.sticker_pack_preview_back_button_content_description);
        toolbar.setNavigationOnClickListener(new ViewOnClickEBaseShape5S0100000_I0_5(this, 28));
        this.A01 = view.findViewById(R.id.details_container);
        this.A04 = view.findViewById(R.id.loading_progress);
        this.A08 = (TextView) view.findViewById(R.id.pack_preview_title);
        this.A09 = (TextView) view.findViewById(R.id.pack_preview_publisher);
        this.A07 = (TextView) view.findViewById(R.id.pack_preview_description);
        this.A03 = view.findViewById(R.id.pack_download_progress);
        this.A06 = (ImageView) view.findViewById(R.id.pack_tray_icon);
        this.A02 = view.findViewById(R.id.divider);
        this.A0D = (Button) view.findViewById(R.id.download_btn);
        this.A0C = (Button) view.findViewById(R.id.delete_btn);
        this.A05 = (ImageView) view.findViewById(R.id.sticker_pack_animation_icon);
        this.A0D.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_2(this, 48));
        this.A0C.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_2(this, 49));
        this.A0A = new GridLayoutManager(1);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.sticker_preview_recycler);
        this.A0B = recyclerView;
        recyclerView.setLayoutManager(this.A0A);
        this.A0B.A0m(this.A0X);
        this.A0B.getViewTreeObserver().addOnGlobalLayoutListener(this.A0W);
        StickerView stickerView = (StickerView) view.findViewById(R.id.sticker_preview_expanded_sticker);
        this.A0N = stickerView;
        stickerView.A02 = true;
        this.A0E.A01(this);
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.A0I.A00(this.A0Y);
        C43791xz c43791xz = this.A0H;
        if (c43791xz != null) {
            c43791xz.A04();
        }
        this.A0E.A00(this);
        C82793r5 c82793r5 = this.A0M;
        if (c82793r5 != null) {
            c82793r5.A05(true);
            this.A0M = null;
        }
        Map map = this.A0Q;
        if (map != null) {
            this.A0O.AS1(new RunnableEBaseShape6S0100000_I0_6(new ArrayList(map.values()), 47));
            this.A0Q.clear();
            this.A0Q = null;
        }
    }
}
