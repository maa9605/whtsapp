package X;

import java.util.Collection;

/* renamed from: X.3KZ */
/* loaded from: classes2.dex */
public class C3KZ extends AbstractC66593Bq {
    public final /* synthetic */ C66663By A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3KZ(C66663By c66663By, CharSequence charSequence, String str) {
        super(c66663By.A00, charSequence, str);
        this.A00 = c66663By;
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
