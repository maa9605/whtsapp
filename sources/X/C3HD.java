package X;

import android.content.Context;

/* renamed from: X.3HD  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3HD implements C2K1 {
    public final C2CI A00;
    public final C40081rY A01;
    public final C43811y1 A02;

    @Override // X.C2K1
    public int ABm(Context context, int i) {
        return 0;
    }

    @Override // X.C2K1
    public int ACY(boolean z) {
        return 0;
    }

    @Override // X.C2K1
    public boolean ARe() {
        return true;
    }

    public C3HD(C2CI c2ci, C40081rY c40081rY, C43811y1 c43811y1) {
        this.A00 = c2ci;
        this.A01 = c40081rY;
        this.A02 = c43811y1;
    }

    public C3HD(String str, C40081rY c40081rY, C43811y1 c43811y1) {
        this.A00 = new C2CI(str);
        this.A01 = c40081rY;
        this.A02 = c43811y1;
    }

    public C3HD(int[] iArr, C40081rY c40081rY, C43811y1 c43811y1) {
        this.A00 = new C2CI(iArr);
        this.A01 = c40081rY;
        this.A02 = c43811y1;
    }

    @Override // X.C2K1
    public boolean A5u(C43811y1 c43811y1) {
        return c43811y1.A00;
    }

    @Override // X.C2K1
    public C2HG A6w(Context context, C002301c c002301c, boolean z) {
        return new C3L6(this.A00, context, this.A01, this.A02.A00, z);
    }

    @Override // X.C2K1
    public String A97(Context context) {
        return this.A00.toString();
    }

    @Override // X.C2K1
    public C2CI[] A9v() {
        return new C2CI[]{this.A00};
    }

    @Override // X.C2K1
    public String ADR() {
        StringBuilder A0P = C000200d.A0P("EmojiShapeCreator:");
        A0P.append(this.A00.toString());
        return A0P.toString();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C3HD) {
            return this.A00.equals(((C3HD) obj).A00);
        }
        return false;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
