package X;

import android.content.Context;
import android.database.ContentObserver;
import android.provider.ContactsContract;
import com.whatsapp.util.Log;

/* renamed from: X.0Oj  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C05350Oj {
    public static volatile C05350Oj A03;
    public final ContentObserver A00;
    public final C02F A01;
    public volatile boolean A02;

    public C05350Oj(final C02L c02l, final C41321tj c41321tj, C02F c02f) {
        this.A01 = c02f;
        this.A00 = new ContentObserver() { // from class: X.0RK
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(null);
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                C02L c02l2 = C02L.this;
                c02l2.A05();
                if (c02l2.A00 != null) {
                    c41321tj.A05();
                }
            }
        };
    }

    public static C05350Oj A00() {
        if (A03 == null) {
            synchronized (C05350Oj.class) {
                if (A03 == null) {
                    A03 = new C05350Oj(C02L.A00(), C41321tj.A00(), C02F.A00());
                }
            }
        }
        return A03;
    }

    public void A01(Context context) {
        if (this.A02) {
            return;
        }
        synchronized (this) {
            if (!this.A02 && this.A01.A03()) {
                Log.i("androidcontactscontentobserver/registered");
                this.A02 = true;
                context.getContentResolver().registerContentObserver(ContactsContract.Contacts.CONTENT_URI, true, this.A00);
            }
        }
    }
}
