package X;

import android.content.Context;
import com.google.android.search.verification.client.R;

/* renamed from: X.2MK  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2MK {
    public static volatile C2MK A02;
    public C658038p A00;
    public C658038p A01;

    public C2MK(final C001200o c001200o, final C002301c c002301c) {
        this.A00 = new C658038p(c001200o, c002301c) { // from class: X.3Ja
        };
        this.A01 = new C658038p(c001200o, c002301c);
    }

    public void A00(Context context) {
        C658038p c658038p = this.A00;
        if (c658038p != null) {
            int A00 = C02160Ac.A00(context, R.color.conversationRowSelectionColor);
            c658038p.A00 = A00;
            c658038p.A01.setColor(A00);
            C658038p c658038p2 = this.A01;
            if (c658038p2 != null) {
                int A002 = C02160Ac.A00(context, R.color.conversationRowSelectionColor);
                c658038p2.A00 = A002;
                c658038p2.A01.setColor(A002);
                return;
            }
            throw null;
        }
        throw null;
    }
}
