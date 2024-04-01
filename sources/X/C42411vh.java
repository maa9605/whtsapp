package X;

import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.1vh  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C42411vh extends AnonymousClass009 {
    public static final C42411vh A00 = new C42411vh();

    public void A02() {
        Log.i("messageaudio/play");
        C000700j.A01();
        Iterator it = this.A00.iterator();
        while (true) {
            C0G5 c0g5 = (C0G5) it;
            if (!c0g5.hasNext()) {
                return;
            }
            ((C59022s5) c0g5.next()).A00();
        }
    }
}
