package X;

import android.content.Context;
import com.google.android.search.verification.client.R;

/* renamed from: X.3HS */
/* loaded from: classes2.dex */
public class C3HS implements C2K1 {
    public int A00 = 0;
    public C2CI A01;
    public String A02;
    public boolean A03;

    @Override // X.C2K1
    public int ACY(boolean z) {
        return 0;
    }

    @Override // X.C2K1
    public boolean ARe() {
        return true;
    }

    public C3HS(String str) {
        this.A02 = str;
    }

    public void A00(int[] iArr) {
        this.A01 = new C2CI(iArr);
    }

    @Override // X.C2K1
    public boolean A5u(C43811y1 c43811y1) {
        return !c43811y1.A00;
    }

    @Override // X.C2K1
    public C2HG A6w(Context context, C002301c c002301c, boolean z) {
        String str = this.A02;
        C68693Lb c68693Lb = new C68693Lb(context);
        c68693Lb.A04 = str;
        c68693Lb.A0H();
        c68693Lb.A06 = this.A03;
        c68693Lb.A01 = this.A00;
        return c68693Lb;
    }

    @Override // X.C2K1
    public String A97(Context context) {
        return this.A01.toString();
    }

    @Override // X.C2K1
    public C2CI[] A9v() {
        return new C2CI[]{this.A01};
    }

    @Override // X.C2K1
    public int ABm(Context context, int i) {
        return context.getResources().getDimensionPixelSize(R.dimen.doodle_shape_picker_grid_padding);
    }

    @Override // X.C2K1
    public String ADR() {
        StringBuilder A0P = C000200d.A0P("svg:");
        A0P.append(this.A02);
        A0P.append(":");
        A0P.append(this.A03 ? 1 : 0);
        A0P.append(":");
        A0P.append(this.A00);
        return A0P.toString();
    }
}
