package X;

import android.os.Handler;
import com.whatsapp.status.playback.MyStatusesActivity;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3xN  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C86393xN extends C2KV {
    public final /* synthetic */ MyStatusesActivity A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86393xN(MyStatusesActivity myStatusesActivity, ActivityC02320As activityC02320As, C018508q c018508q, C02980Dr c02980Dr, C2M4 c2m4, C02L c02l, InterfaceC002901k interfaceC002901k, C2MG c2mg, AnonymousClass011 anonymousClass011, C01B c01b, C41541u6 c41541u6, C018608r c018608r, C2MN c2mn, C018308n c018308n, C05W c05w, C0ED c0ed, C02E c02e, C018708s c018708s, C002301c c002301c, C0ES c0es, C2AR c2ar, C2AT c2at, C43081wp c43081wp, C42451vl c42451vl, C41771uU c41771uU, C0C8 c0c8, C02O c02o) {
        super(activityC02320As, c018508q, c02980Dr, c2m4, c02l, interfaceC002901k, c2mg, anonymousClass011, c01b, c41541u6, c018608r, c2mn, c018308n, c05w, c0ed, c02e, c018708s, c002301c, c0es, c2ar, c2at, c43081wp, c42451vl, c41771uU, c0c8, c02o);
        this.A00 = myStatusesActivity;
    }

    @Override // X.C0O8
    public void AJK(C0U0 c0u0) {
        MyStatusesActivity myStatusesActivity = this.A00;
        Set set = myStatusesActivity.A0v;
        set.clear();
        Map map = myStatusesActivity.A0u;
        set.addAll(map.keySet());
        Handler handler = myStatusesActivity.A0l;
        Runnable runnable = myStatusesActivity.A0q;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 200L);
        map.clear();
        myStatusesActivity.A01 = null;
        myStatusesActivity.A0f.notifyDataSetChanged();
    }
}