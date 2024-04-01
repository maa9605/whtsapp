package X;

import android.content.Context;
import com.google.android.search.verification.client.R;

/* renamed from: X.2K2  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2K2 implements C2K1 {
    public final C43811y1 A00;
    public final C0JM A01;
    public final C43791xz A02;

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

    public C2K2(C0JM c0jm, C43811y1 c43811y1, C43791xz c43791xz) {
        this.A01 = c0jm;
        this.A00 = c43811y1;
        this.A02 = c43791xz;
    }

    @Override // X.C2K1
    public boolean A5u(C43811y1 c43811y1) {
        return c43811y1.A01;
    }

    @Override // X.C2K1
    public C2HG A6w(Context context, C002301c c002301c, boolean z) {
        return new C3L7(context, this.A01, this.A00.A02, this.A02);
    }

    @Override // X.C2K1
    public String A97(Context context) {
        return context.getString(R.string.sticker_message_content_description);
    }

    @Override // X.C2K1
    public C2CI[] A9v() {
        C2CI[] c2ciArr;
        C04050If c04050If = this.A01.A04;
        return (c04050If == null || (c2ciArr = c04050If.A06) == null) ? C2K1.A00 : c2ciArr;
    }

    @Override // X.C2K1
    public String ADR() {
        StringBuilder A0P = C000200d.A0P("StickerShapeCreator:");
        String str = this.A01.A0B;
        if (str != null) {
            A0P.append(str);
            return A0P.toString();
        }
        throw null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2K2) {
            String str = ((C2K2) obj).A01.A0B;
            if (str != null) {
                return str.equals(this.A01.A0B);
            }
            throw null;
        }
        return false;
    }

    public int hashCode() {
        String str = this.A01.A0B;
        if (str != null) {
            return str.hashCode();
        }
        throw null;
    }
}
