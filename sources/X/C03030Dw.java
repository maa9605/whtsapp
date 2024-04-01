package X;

import android.content.Intent;
import com.whatsapp.instrumentation.service.InstrumentationFGService;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0Dw  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C03030Dw {
    public static volatile C03030Dw A03;
    public final C001200o A00;
    public final C0ER A01;
    public final Set A02 = new HashSet();

    public C03030Dw(C001200o c001200o, C0ER c0er) {
        this.A00 = c001200o;
        this.A01 = c0er;
    }

    public final synchronized void A00(int i) {
        this.A02.add(Integer.valueOf(i));
        this.A01.A03(this.A00.A00, InstrumentationFGService.class, new Intent());
    }

    public final synchronized void A01(int i) {
        Set set = this.A02;
        set.remove(Integer.valueOf(i));
        if (set.isEmpty()) {
            this.A01.A02(this.A00.A00, InstrumentationFGService.class);
        }
    }
}
