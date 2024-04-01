package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1zb  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C44761zb extends AbstractC44571zI {
    public final C44581zJ A00;
    public final C44331yt A01;
    public final AnonymousClass012 A02;
    public final C05A A03;
    public final C0C9 A04;
    public final C05E A05;
    public final C43081wp A06;

    public C44761zb(AnonymousClass012 anonymousClass012, C05A c05a, C0C9 c0c9, C44581zJ c44581zJ, C44331yt c44331yt, C05E c05e, C43081wp c43081wp, C44351yv c44351yv) {
        super(c44351yv);
        this.A02 = anonymousClass012;
        this.A03 = c05a;
        this.A04 = c0c9;
        this.A00 = c44581zJ;
        this.A01 = c44331yt;
        this.A05 = c05e;
        this.A06 = c43081wp;
    }

    public final List A08(Cursor cursor, C0CD c0cd, boolean z) {
        ArrayList arrayList = new ArrayList();
        long A05 = this.A02.A05();
        while (cursor.moveToNext()) {
            AbstractC005302j A08 = this.A03.A08(cursor.getLong(cursor.getColumnIndexOrThrow("chat_row_id")));
            if (A08 != null) {
                C2FF A01 = this.A00.A01(A08, cursor, c0cd);
                arrayList.add(new C44771zc(null, new AnonymousClass094(A01.A01, A01.A04, A01.A03), z, A05, null, false, A01.A02));
            }
        }
        return arrayList;
    }

    public final void A09(C44771zc c44771zc, AnonymousClass092 anonymousClass092) {
        boolean z = c44771zc.A02;
        if (z && !anonymousClass092.A0j) {
            this.A06.A04(Collections.singleton(anonymousClass092), true, false);
        } else if (z || !anonymousClass092.A0j) {
        } else {
            this.A06.A06(Collections.singleton(anonymousClass092), false);
        }
    }
}
