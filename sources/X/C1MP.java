package X;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1MP  reason: invalid class name */
/* loaded from: classes.dex */
public class C1MP implements Runnable {
    public final AppWidgetManager A00;
    public final Context A01;
    public final C018508q A02;
    public final C03170Ep A03;
    public final C002301c A04;
    public final C05M A05;
    public final C0CA A06;
    public final C03180Eq A07;
    public final AtomicBoolean A08 = new AtomicBoolean();
    public final int[] A09;

    public C1MP(Context context, C018508q c018508q, C05M c05m, C03170Ep c03170Ep, C002301c c002301c, AppWidgetManager appWidgetManager, C03180Eq c03180Eq, C0CA c0ca, int[] iArr) {
        this.A01 = context;
        this.A02 = c018508q;
        this.A05 = c05m;
        this.A03 = c03170Ep;
        this.A04 = c002301c;
        this.A00 = appWidgetManager;
        this.A07 = c03180Eq;
        this.A06 = c0ca;
        this.A09 = iArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        AtomicBoolean atomicBoolean = this.A08;
        if (atomicBoolean.get()) {
            return;
        }
        ArrayList A08 = this.A06.A08();
        final ArrayList arrayList = new ArrayList();
        Iterator it = A08.iterator();
        while (it.hasNext()) {
            AbstractC005302j abstractC005302j = (AbstractC005302j) it.next();
            if (atomicBoolean.get()) {
                return;
            }
            int A01 = this.A05.A01(abstractC005302j);
            if (A01 > 0) {
                arrayList.addAll(this.A07.A07(abstractC005302j, Math.min(A01, 100)));
            }
        }
        Collections.sort(arrayList, C12590jj.A00);
        C018508q c018508q = this.A02;
        c018508q.A02.post(new Runnable() { // from class: X.1MO
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
                if (r11 != 0) goto L8;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    r12 = this;
                    X.1MP r5 = X.C1MP.this
                    java.util.ArrayList r0 = r2
                    com.whatsapp.appwidget.WidgetProvider.A0A = r0
                    int[] r4 = r5.A09
                    int r3 = r4.length
                    r2 = 0
                La:
                    if (r2 >= r3) goto L48
                    r9 = r4[r2]
                    android.appwidget.AppWidgetManager r1 = r5.A00
                    android.os.Bundle r6 = r1.getAppWidgetOptions(r9)
                    if (r6 == 0) goto L26
                    java.lang.String r0 = "appWidgetMinWidth"
                    int r10 = r6.getInt(r0)
                    java.lang.String r0 = "appWidgetMinHeight"
                    int r11 = r6.getInt(r0)
                    if (r10 == 0) goto L26
                    if (r11 != 0) goto L2c
                L26:
                    r10 = 2147483647(0x7fffffff, float:NaN)
                    r11 = 2147483647(0x7fffffff, float:NaN)
                L2c:
                    android.content.Context r6 = r5.A01
                    X.0Ep r7 = r5.A03
                    X.01c r8 = r5.A04
                    android.widget.RemoteViews r0 = com.whatsapp.appwidget.WidgetProvider.A00(r6, r7, r8, r9, r10, r11)
                    r1.updateAppWidget(r9, r0)
                    r0 = 100
                    if (r10 <= r0) goto L45
                    if (r11 <= r0) goto L45
                    r0 = 2131363375(0x7f0a062f, float:1.8346557E38)
                    r1.notifyAppWidgetViewDataChanged(r9, r0)
                L45:
                    int r2 = r2 + 1
                    goto La
                L48:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1MO.run():void");
            }
        });
    }
}
