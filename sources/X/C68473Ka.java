package X;

import java.util.Collection;

/* renamed from: X.3Ka */
/* loaded from: classes2.dex */
public class C68473Ka extends AbstractC66593Bq {
    public final /* synthetic */ C3C1 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68473Ka(C3C1 c3c1, CharSequence charSequence, String str) {
        super(c3c1.A00, charSequence, str);
        this.A00 = c3c1;
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        C0FK c0fk = (C0FK) obj;
        if (c0fk == null) {
            this.A00.A00(null, null, true);
        } else {
            this.A00.A00((String) c0fk.A00, (Collection) c0fk.A01, false);
        }
    }
}
