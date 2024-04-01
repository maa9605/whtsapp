package X;

import android.app.Activity;
import android.database.Cursor;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.ViewOnClickCListenerShape10S0100000_I0_2;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2JP */
/* loaded from: classes2.dex */
public abstract class C2JP implements C25f {
    public Activity A00;
    public LayoutInflater A01;
    public View A02;
    public View A03;
    public View A04;
    public TextView A05;
    public AbstractC04890Mh A06;
    public RecyclerView A07;
    public InterfaceC48372Ez A08;

    public C2JP(Activity activity, LayoutInflater layoutInflater, InterfaceC48372Ez interfaceC48372Ez) {
        this.A00 = activity;
        this.A01 = layoutInflater;
        this.A08 = interfaceC48372Ez;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC04890Mh A00() {
        C3KY c3ky;
        AbstractC04890Mh abstractC04890Mh = this.A06;
        C3KY c3ky2 = abstractC04890Mh;
        if (abstractC04890Mh == null) {
            if (this instanceof C85713w6) {
                final C85713w6 c85713w6 = (C85713w6) this;
                C3KY c3ky3 = new C3KY(new ArrayList(), c85713w6.A04, c85713w6.A0A, c85713w6.A05, c85713w6.A03, c85713w6.A01, c85713w6.A08, ((C2JP) c85713w6).A08, c85713w6.A02, c85713w6.A09, c85713w6.A00.getResources().getDimensionPixelSize(R.dimen.gif_trend_preview_size));
                InterfaceC61372w2 interfaceC61372w2 = new InterfaceC61372w2() { // from class: X.3kN
                    /* JADX WARN: Code restructure failed: missing block: B:33:0x001e, code lost:
                        if (r5 == false) goto L18;
                     */
                    @Override // X.InterfaceC61372w2
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void AQ9(boolean r5) {
                        /*
                            r4 = this;
                            X.3w6 r3 = r1
                            android.view.View r1 = r3.A02
                            if (r1 == 0) goto L35
                            android.widget.TextView r0 = r3.A05
                            if (r0 == 0) goto L35
                            android.view.View r0 = r3.A04
                            if (r0 == 0) goto L35
                            r2 = 8
                            r1.setVisibility(r2)
                            android.widget.TextView r1 = r3.A05
                            X.0Mh r0 = r3.A06
                            int r0 = r0.A0C()
                            if (r0 != 0) goto L20
                            r0 = 0
                            if (r5 != 0) goto L22
                        L20:
                            r0 = 8
                        L22:
                            r1.setVisibility(r0)
                            android.view.View r1 = r3.A04
                            X.0Mh r0 = r3.A06
                            int r0 = r0.A0C()
                            if (r0 != 0) goto L32
                            if (r5 != 0) goto L32
                            r2 = 0
                        L32:
                            r1.setVisibility(r2)
                        L35:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C78703kN.AQ9(boolean):void");
                    }
                };
                c3ky3.A00 = interfaceC61372w2;
                boolean isEmpty = c3ky3.A02.isEmpty();
                c3ky = c3ky3;
                if (!isEmpty) {
                    interfaceC61372w2.AQ9(true);
                    c3ky = c3ky3;
                }
            } else if (!(this instanceof AbstractC85703w5)) {
                final C2JO c2jo = (C2JO) this;
                C3KX c3kx = new C3KX(new ArrayList(), c2jo.A01, c2jo.A06, c2jo.A08, c2jo.A00.getResources().getDimensionPixelSize(R.dimen.gif_trend_preview_size));
                InterfaceC61372w2 interfaceC61372w22 = new InterfaceC61372w2() { // from class: X.3Ba
                    /* JADX WARN: Code restructure failed: missing block: B:33:0x001e, code lost:
                        if (r5 == false) goto L18;
                     */
                    @Override // X.InterfaceC61372w2
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void AQ9(boolean r5) {
                        /*
                            r4 = this;
                            X.2JO r3 = r1
                            android.view.View r1 = r3.A02
                            if (r1 == 0) goto L35
                            android.widget.TextView r0 = r3.A05
                            if (r0 == 0) goto L35
                            android.view.View r0 = r3.A04
                            if (r0 == 0) goto L35
                            r2 = 8
                            r1.setVisibility(r2)
                            android.widget.TextView r1 = r3.A05
                            X.0Mh r0 = r3.A06
                            int r0 = r0.A0C()
                            if (r0 != 0) goto L20
                            r0 = 0
                            if (r5 != 0) goto L22
                        L20:
                            r0 = 8
                        L22:
                            r1.setVisibility(r0)
                            android.view.View r1 = r3.A04
                            X.0Mh r0 = r3.A06
                            int r0 = r0.A0C()
                            if (r0 != 0) goto L32
                            if (r5 != 0) goto L32
                            r2 = 0
                        L32:
                            r1.setVisibility(r2)
                        L35:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C66433Ba.AQ9(boolean):void");
                    }
                };
                c3kx.A00 = interfaceC61372w22;
                boolean isEmpty2 = c3kx.A02.isEmpty();
                c3ky = c3kx;
                if (!isEmpty2) {
                    interfaceC61372w22.AQ9(true);
                    c3ky = c3kx;
                }
            } else {
                final AbstractC85703w5 abstractC85703w5 = (AbstractC85703w5) this;
                C66553Bm c66553Bm = new C66553Bm(abstractC85703w5.A03, abstractC85703w5.A02, abstractC85703w5.A00, abstractC85703w5.A01, abstractC85703w5.A08, abstractC85703w5.A04, ((C2JP) abstractC85703w5).A00.getResources().getDimensionPixelSize(R.dimen.gif_trend_preview_size));
                c66553Bm.A00 = new InterfaceC61372w2() { // from class: X.3kM
                    /* JADX WARN: Code restructure failed: missing block: B:33:0x001e, code lost:
                        if (r5 == false) goto L18;
                     */
                    @Override // X.InterfaceC61372w2
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void AQ9(boolean r5) {
                        /*
                            r4 = this;
                            X.3w5 r3 = r1
                            android.view.View r1 = r3.A02
                            if (r1 == 0) goto L35
                            android.widget.TextView r0 = r3.A05
                            if (r0 == 0) goto L35
                            android.view.View r0 = r3.A04
                            if (r0 == 0) goto L35
                            r2 = 8
                            r1.setVisibility(r2)
                            android.widget.TextView r1 = r3.A05
                            X.0Mh r0 = r3.A06
                            int r0 = r0.A0C()
                            if (r0 != 0) goto L20
                            r0 = 0
                            if (r5 != 0) goto L22
                        L20:
                            r0 = 8
                        L22:
                            r1.setVisibility(r0)
                            android.view.View r1 = r3.A04
                            X.0Mh r0 = r3.A06
                            int r0 = r0.A0C()
                            if (r0 != 0) goto L32
                            if (r5 != 0) goto L32
                            r2 = 0
                        L32:
                            r1.setVisibility(r2)
                        L35:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C78693kM.AQ9(boolean):void");
                    }
                };
                c3ky = c66553Bm;
            }
            this.A06 = c3ky;
            c3ky2 = c3ky;
        }
        return c3ky2;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [X.3Bu] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.3Bv] */
    public void A01() {
        InterfaceC61372w2 interfaceC61372w2;
        AbstractC61452wB A01;
        InterfaceC61372w2 interfaceC61372w22;
        if (this instanceof C85713w6) {
            C3KY c3ky = (C3KY) A00();
            C66633Bv c66633Bv = c3ky.A01;
            if (c66633Bv != null) {
                c66633Bv.A05(true);
            }
            c3ky.A01 = new C0HS(c3ky.A08, c3ky.A0A, c3ky) { // from class: X.3Bv
                public final C47212Ai A00;
                public final C3KY A01;
                public final AnonymousClass227 A02;

                {
                    this.A00 = r1;
                    this.A02 = r2;
                    this.A01 = c3ky;
                }

                /* JADX WARN: Finally extract failed */
                @Override // X.C0HS
                public Object A07(Object[] objArr) {
                    C61352w0 c61352w0;
                    if (A04()) {
                        return null;
                    }
                    C2BQ c2bq = this.A00.A07;
                    synchronized (c2bq) {
                        c61352w0 = c2bq.A00;
                        if (c61352w0 == null) {
                            c61352w0 = new C61352w0(c2bq.A01());
                            c2bq.A00 = c61352w0;
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    AnonymousClass227 anonymousClass227 = this.A02;
                    if (anonymousClass227 != null) {
                        C000700j.A00();
                        C2BZ c2bz = anonymousClass227.A02;
                        if (c2bz != null) {
                            ArrayList arrayList2 = new ArrayList();
                            C0CD c0cd = new C0CD(null, c2bz.A00, false);
                            try {
                                Cursor A07 = c0cd.A02.A07("SELECT plain_file_hash,file_path,height,width,gif_attribution,timestamp FROM gifs JOIN starred_gifs ON plain_file_hash = plaintext_hash ORDER BY timestamp DESC", null);
                                int columnIndexOrThrow = A07.getColumnIndexOrThrow("timestamp");
                                int columnIndexOrThrow2 = A07.getColumnIndexOrThrow("plain_file_hash");
                                int columnIndexOrThrow3 = A07.getColumnIndexOrThrow("file_path");
                                int columnIndexOrThrow4 = A07.getColumnIndexOrThrow("height");
                                int columnIndexOrThrow5 = A07.getColumnIndexOrThrow("width");
                                int columnIndexOrThrow6 = A07.getColumnIndexOrThrow("gif_attribution");
                                while (A07.moveToNext()) {
                                    C2BR c2br = new C2BR();
                                    c2br.A04 = A07.getString(columnIndexOrThrow2);
                                    c2br.A03 = A07.getString(columnIndexOrThrow3);
                                    c2br.A01 = A07.getInt(columnIndexOrThrow4);
                                    c2br.A02 = A07.getInt(columnIndexOrThrow5);
                                    c2br.A00 = A07.getInt(columnIndexOrThrow6);
                                    arrayList2.add(new C2JJ(c2br, A07.getInt(columnIndexOrThrow)));
                                }
                                A07.close();
                                c0cd.close();
                                arrayList.addAll(arrayList2);
                                if (c61352w0 != null) {
                                    ArrayList arrayList3 = new ArrayList();
                                    c0cd = new C0CD(null, c61352w0.A00, false);
                                    try {
                                        Cursor A09 = c0cd.A02.A09("downloadable_gifs", null, null, null, "timestamp DESC", "getStarredDownloadGifItems/QUERY_DOWNLOADABLE_GIFS");
                                        int columnIndexOrThrow7 = A09.getColumnIndexOrThrow("timestamp");
                                        while (A09.moveToNext()) {
                                            int columnIndexOrThrow8 = A09.getColumnIndexOrThrow("gif_id");
                                            int columnIndexOrThrow9 = A09.getColumnIndexOrThrow("static_url");
                                            int columnIndexOrThrow10 = A09.getColumnIndexOrThrow("static_height");
                                            int columnIndexOrThrow11 = A09.getColumnIndexOrThrow("static_width");
                                            int columnIndexOrThrow12 = A09.getColumnIndexOrThrow("preview_url");
                                            int columnIndexOrThrow13 = A09.getColumnIndexOrThrow("preview_height");
                                            int columnIndexOrThrow14 = A09.getColumnIndexOrThrow("preview_width");
                                            int columnIndexOrThrow15 = A09.getColumnIndexOrThrow("content_url");
                                            int columnIndexOrThrow16 = A09.getColumnIndexOrThrow("content_height");
                                            int columnIndexOrThrow17 = A09.getColumnIndexOrThrow("content_width");
                                            int columnIndexOrThrow18 = A09.getColumnIndexOrThrow("gif_attribution");
                                            arrayList3.add(new C49312Jo(new C49302Jn(A09.getString(columnIndexOrThrow8), new C61422w7(A09.getString(columnIndexOrThrow12), A09.getInt(columnIndexOrThrow14), A09.getInt(columnIndexOrThrow13)), new C61422w7(A09.getString(columnIndexOrThrow9), A09.getInt(columnIndexOrThrow11), A09.getInt(columnIndexOrThrow10)), new C61422w7(A09.getString(columnIndexOrThrow15), A09.getInt(columnIndexOrThrow17), A09.getInt(columnIndexOrThrow16)), A09.getInt(columnIndexOrThrow18), false), A09.getInt(columnIndexOrThrow7)));
                                        }
                                        A09.close();
                                        c0cd.close();
                                        arrayList.addAll(arrayList3);
                                        Collections.sort(arrayList, new Comparator() { // from class: X.2vy
                                            @Override // java.util.Comparator
                                            public final int compare(Object obj, Object obj2) {
                                                return (((C2JK) obj2).ADV() > ((C2JK) obj).ADV() ? 1 : (((C2JK) obj2).ADV() == ((C2JK) obj).ADV() ? 0 : -1));
                                            }
                                        });
                                        return arrayList;
                                    } finally {
                                    }
                                } else {
                                    throw null;
                                }
                            } finally {
                                try {
                                    throw th;
                                } catch (Throwable th) {
                                    try {
                                        c0cd.close();
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        } else {
                            throw null;
                        }
                    } else {
                        throw null;
                    }
                }

                @Override // X.C0HS
                public void A09(Object obj) {
                    List list = (List) obj;
                    if (A04()) {
                        return;
                    }
                    C3KY c3ky2 = this.A01;
                    c3ky2.A02 = list;
                    ((AbstractC04890Mh) c3ky2).A01.A00();
                    InterfaceC61372w2 interfaceC61372w23 = c3ky2.A00;
                    if (interfaceC61372w23 != null) {
                        interfaceC61372w23.AQ9(true);
                    }
                }
            };
            if (!c3ky.A02.isEmpty() && (interfaceC61372w2 = c3ky.A00) != null) {
                interfaceC61372w2.AQ9(true);
            }
            c3ky.A0C.ARy(c3ky.A01, new Void[0]);
        } else if (!(this instanceof AbstractC85703w5)) {
            C2JO c2jo = (C2JO) this;
            C3KX c3kx = (C3KX) c2jo.A00();
            C47212Ai c47212Ai = c2jo.A02;
            C2BP c2bp = c2jo.A05;
            C3Bu c3Bu = c3kx.A01;
            if (c3Bu != null) {
                c3Bu.A05(true);
            }
            c3kx.A01 = new C0HS(c47212Ai, c2bp, c3kx) { // from class: X.3Bu
                public final C47212Ai A00;
                public final C3KX A01;
                public final C2BP A02;

                {
                    this.A00 = c47212Ai;
                    this.A02 = c2bp;
                    this.A01 = c3kx;
                }

                /* JADX WARN: Finally extract failed */
                @Override // X.C0HS
                public Object A07(Object[] objArr) {
                    if (A04()) {
                        return null;
                    }
                    C2BP c2bp2 = this.A02;
                    List A06 = c2bp2.A06(c2bp2.A00());
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((AbstractCollection) A06).iterator();
                    while (it.hasNext()) {
                        C47212Ai c47212Ai2 = this.A00;
                        String str = ((C2BW) it.next()).A00;
                        C2BS A02 = c47212Ai2.A07.A02();
                        if (A02 != null) {
                            String[] strArr = {str};
                            C2BT c2bt = A02.A00;
                            C2BR c2br = null;
                            C0CD c0cd = new C0CD(null, c2bt, false);
                            try {
                                Cursor A09 = c0cd.A02.A09("gifs", null, "plain_file_hash = ?", strArr, null, "getByPlainFileHash/QUERY_GIFS");
                                if (A09.moveToNext()) {
                                    int columnIndexOrThrow = A09.getColumnIndexOrThrow("plain_file_hash");
                                    int columnIndexOrThrow2 = A09.getColumnIndexOrThrow("file_path");
                                    int columnIndexOrThrow3 = A09.getColumnIndexOrThrow("height");
                                    int columnIndexOrThrow4 = A09.getColumnIndexOrThrow("width");
                                    int columnIndexOrThrow5 = A09.getColumnIndexOrThrow("gif_attribution");
                                    c2br = new C2BR();
                                    c2br.A04 = A09.getString(columnIndexOrThrow);
                                    c2br.A03 = A09.getString(columnIndexOrThrow2);
                                    c2br.A01 = A09.getInt(columnIndexOrThrow3);
                                    c2br.A02 = A09.getInt(columnIndexOrThrow4);
                                    c2br.A00 = A09.getInt(columnIndexOrThrow5);
                                }
                                A09.close();
                                c0cd.close();
                                arrayList.add(c2br);
                            } finally {
                            }
                        } else {
                            throw null;
                        }
                    }
                    return arrayList;
                }

                @Override // X.C0HS
                public void A09(Object obj) {
                    List list = (List) obj;
                    if (A04()) {
                        return;
                    }
                    C3KX c3kx2 = this.A01;
                    c3kx2.A02 = list;
                    ((AbstractC04890Mh) c3kx2).A01.A00();
                    InterfaceC61372w2 interfaceC61372w23 = c3kx2.A00;
                    if (interfaceC61372w23 != null) {
                        interfaceC61372w23.AQ9(true);
                    }
                }
            };
            if (!c3kx.A02.isEmpty() && (interfaceC61372w22 = c3kx.A00) != null) {
                interfaceC61372w22.AQ9(true);
            }
            c3kx.A06.ARy(c3kx.A01, new Void[0]);
        } else {
            AbstractC85703w5 abstractC85703w5 = (AbstractC85703w5) this;
            C66553Bm c66553Bm = (C66553Bm) abstractC85703w5.A00();
            if (!(abstractC85703w5 instanceof C86833yQ)) {
                A01 = ((C86823yP) abstractC85703w5).A00.A00();
            } else {
                C86833yQ c86833yQ = (C86833yQ) abstractC85703w5;
                A01 = c86833yQ.A00.A01(c86833yQ.A01, true);
            }
            c66553Bm.A0H(A01);
        }
    }

    @Override // X.C25f
    public void A5I(AbstractC15200oF abstractC15200oF) {
        this.A07.A0m(abstractC15200oF);
    }

    @Override // X.C25f
    public View AJ3(ViewGroup viewGroup, int i) {
        int i2;
        View inflate = this.A01.inflate(R.layout.gif_picker_page, viewGroup, false);
        this.A07 = (RecyclerView) inflate.findViewById(R.id.gif_grid);
        this.A02 = inflate.findViewById(R.id.progress_container);
        this.A05 = (TextView) inflate.findViewById(R.id.no_results);
        this.A04 = inflate.findViewById(R.id.retry_panel);
        this.A03 = inflate.findViewById(R.id.retry_button);
        TextView textView = this.A05;
        if (this instanceof C85713w6) {
            i2 = R.string.no_favorited_gifs;
        } else if (!(this instanceof C2JO)) {
            i2 = R.string.gif_search_no_results;
        } else {
            i2 = R.string.no_recent_gifs;
        }
        textView.setText(i2);
        final int dimensionPixelSize = this.A00.getResources().getDimensionPixelSize(R.dimen.selected_contacts_top_offset);
        RecyclerView recyclerView = this.A07;
        recyclerView.A0i = true;
        recyclerView.A0k(new AbstractC08920cK() { // from class: X.3kR
            @Override // X.AbstractC08920cK
            public void A01(Rect rect, View view, RecyclerView recyclerView2, C0Y0 c0y0) {
                int i3 = dimensionPixelSize;
                rect.set(0, 0, i3, i3);
            }
        });
        final GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
        gridLayoutManager.A01 = new AbstractC14890nk() { // from class: X.3kS
            {
                C2JP.this = this;
            }

            @Override // X.AbstractC14890nk
            public int A00(int i3) {
                boolean z;
                C2JP c2jp = C2JP.this;
                if (c2jp.A06 != null) {
                    if (c2jp instanceof C85713w6) {
                        z = false;
                    } else if (!(c2jp instanceof AbstractC85703w5)) {
                        z = false;
                    } else {
                        z = ((C66553Bm) c2jp.A00()).A0I(i3);
                    }
                    if (z) {
                        return gridLayoutManager.A00;
                    }
                    return 1;
                }
                return 1;
            }
        };
        this.A07.setLayoutManager(gridLayoutManager);
        this.A02.setVisibility(0);
        this.A05.setVisibility(8);
        this.A03.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_2(this, 7));
        this.A07.setAdapter(A00());
        A01();
        return inflate;
    }

    @Override // X.C25f
    public void AJJ(ViewGroup viewGroup, int i, View view) {
        if (this instanceof C85713w6) {
            C85713w6 c85713w6 = (C85713w6) this;
            ((C2JP) c85713w6).A07 = null;
            ((C2JP) c85713w6).A02 = null;
            ((C2JP) c85713w6).A05 = null;
            ((C2JP) c85713w6).A03 = null;
            ((C2JP) c85713w6).A04 = null;
            c85713w6.A07.A00(c85713w6.A06);
        } else if (!(this instanceof C2JO)) {
            this.A07 = null;
            this.A02 = null;
            this.A05 = null;
            this.A03 = null;
            this.A04 = null;
        } else {
            C2JO c2jo = (C2JO) this;
            c2jo.A07 = null;
            ((C2JP) c2jo).A02 = null;
            ((C2JP) c2jo).A05 = null;
            ((C2JP) c2jo).A03 = null;
            ((C2JP) c2jo).A04 = null;
            c2jo.A04.A00(c2jo.A03);
        }
    }

    @Override // X.C25f
    public void ARR(AbstractC15200oF abstractC15200oF) {
        List list = this.A07.A0b;
        if (list != null) {
            list.remove(abstractC15200oF);
        }
    }
}
