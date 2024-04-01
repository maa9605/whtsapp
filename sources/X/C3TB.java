package X;

import android.widget.BaseAdapter;
import com.google.android.search.verification.client.R;
import com.whatsapp.profile.WebImagePicker;

/* renamed from: X.3TB  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3TB extends BaseAdapter {
    public C3l2 A00;
    public boolean A01;
    public final /* synthetic */ WebImagePicker A02;

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public C3TB(WebImagePicker webImagePicker) {
        this.A02 = webImagePicker;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0HS, X.3l2] */
    public final void A00(String str) {
        if (str != null) {
            C3l2 c3l2 = this.A00;
            if (c3l2 != null) {
                c3l2.A05(false);
            }
            this.A01 = true;
            WebImagePicker webImagePicker = this.A02;
            webImagePicker.A0E = new C3TC(webImagePicker.A0A, webImagePicker.A0B, str);
            webImagePicker.A0K.clear();
            webImagePicker.A0F.A00();
            AnonymousClass242 anonymousClass242 = new AnonymousClass242(((ActivityC02290Ap) webImagePicker).A0A, webImagePicker.A0B, webImagePicker.A0I);
            anonymousClass242.A01 = webImagePicker.A01;
            anonymousClass242.A02 = 4194304L;
            anonymousClass242.A04 = C02160Ac.A03(webImagePicker, R.drawable.gray_rectangle);
            anonymousClass242.A03 = C02160Ac.A03(webImagePicker, R.drawable.ic_missing_thumbnail_picture);
            webImagePicker.A0F = anonymousClass242.A00();
        }
        ?? r2 = new C0HS() { // from class: X.3l2
            /* JADX WARN: Finally extract failed */
            /* JADX WARN: Removed duplicated region for block: B:48:0x0113 A[Catch: IOException -> 0x0230, JSONException -> 0x0232, TRY_LEAVE, TryCatch #10 {IOException -> 0x0230, blocks: (B:2:0x0000, B:4:0x004d, B:5:0x0053, B:8:0x005d, B:10:0x0092, B:48:0x0113, B:49:0x0119, B:52:0x012c, B:53:0x0143, B:55:0x0149, B:57:0x017f, B:58:0x0185, B:65:0x01c1, B:66:0x01c7, B:68:0x01cd, B:70:0x01d1, B:72:0x01d8, B:61:0x01ae, B:63:0x01b6, B:74:0x01e1, B:50:0x0128, B:75:0x0204, B:28:0x00c5, B:29:0x00c9, B:46:0x010c, B:89:0x022f), top: B:108:0x0000 }] */
            @Override // X.C0HS
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.lang.Object A07(java.lang.Object[] r11) {
                /*
                    Method dump skipped, instructions count: 568
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C3l2.A07(java.lang.Object[]):java.lang.Object");
            }

            /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
                if (r6.A0K.size() >= 100) goto L21;
             */
            @Override // X.C0HS
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void A09(java.lang.Object r9) {
                /*
                    r8 = this;
                    java.util.List r9 = (java.util.List) r9
                    X.3TB r4 = X.C3TB.this
                    com.whatsapp.profile.WebImagePicker r6 = r4.A02
                    android.widget.ProgressBar r0 = r6.A06
                    r7 = 8
                    r0.setVisibility(r7)
                    X.3TC r0 = r6.A0E
                    int r2 = r0.A02
                    int r0 = r0.A00
                    r5 = 0
                    r1 = 1
                    if (r2 <= r0) goto L22
                    java.util.ArrayList r0 = r6.A0K
                    int r3 = r0.size()
                    r0 = 100
                    r2 = 1
                    if (r3 < r0) goto L23
                L22:
                    r2 = 0
                L23:
                    r4.A01 = r2
                    android.view.View r0 = r6.A04
                    if (r2 == 0) goto L6f
                    r0.setVisibility(r7)
                    android.view.View r0 = r6.A05
                    r0.setVisibility(r5)
                L31:
                    r0 = 0
                    r4.A00 = r0
                    if (r9 == 0) goto L3e
                    java.util.ArrayList r0 = r6.A0K
                    r9.removeAll(r0)
                    r0.addAll(r9)
                L3e:
                    java.util.ArrayList r0 = r6.A0K
                    boolean r0 = r0.isEmpty()
                    if (r0 == 0) goto L58
                    android.widget.ListView r0 = r6.A1P()
                    android.view.View r3 = r0.getEmptyView()
                    android.widget.TextView r3 = (android.widget.TextView) r3
                    if (r9 != 0) goto L5c
                    r0 = 2131889213(0x7f120c3d, float:1.9413083E38)
                    r3.setText(r0)
                L58:
                    r4.notifyDataSetChanged()
                    return
                L5c:
                    r2 = 2131889208(0x7f120c38, float:1.9413073E38)
                    java.lang.Object[] r1 = new java.lang.Object[r1]
                    X.3TC r0 = r6.A0E
                    java.lang.String r0 = r0.A03
                    r1[r5] = r0
                    java.lang.String r0 = r6.getString(r2, r1)
                    r3.setText(r0)
                    goto L58
                L6f:
                    r0.setVisibility(r5)
                    android.view.View r0 = r6.A05
                    r0.setVisibility(r7)
                    goto L31
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C3l2.A09(java.lang.Object):void");
            }
        };
        this.A00 = r2;
        this.A02.A0H.ARy(r2, new Void[0]);
        if (str != null) {
            notifyDataSetChanged();
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        WebImagePicker webImagePicker = this.A02;
        int size = webImagePicker.A0K.size();
        int i = webImagePicker.A00;
        return ((size + i) - 1) / i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r1 != r5.A00) goto L40;
     */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View getView(int r13, android.view.View r14, android.view.ViewGroup r15) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3TB.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
