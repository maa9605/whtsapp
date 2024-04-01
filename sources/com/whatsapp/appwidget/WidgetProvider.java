package com.whatsapp.appwidget;

import X.AnonymousClass029;
import X.C000200d;
import X.C002301c;
import X.C018508q;
import X.C03160Eo;
import X.C03170Ep;
import X.C03180Eq;
import X.C05M;
import X.C0C5;
import X.C0CA;
import X.C1MP;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class WidgetProvider extends AppWidgetProvider {
    public static ArrayList A0A;
    public C018508q A00;
    public C1MP A01;
    public C03160Eo A02;
    public C03170Ep A03;
    public C002301c A04;
    public C05M A05;
    public C0CA A06;
    public C03180Eq A07;
    public final Object A08;
    public volatile boolean A09;

    public WidgetProvider() {
        this(0);
    }

    public WidgetProvider(int i) {
        this.A09 = false;
        this.A08 = new Object();
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x000b, code lost:
        if (r15 <= 100) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.widget.RemoteViews A00(android.content.Context r10, X.C03170Ep r11, X.C002301c r12, int r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.appwidget.WidgetProvider.A00(android.content.Context, X.0Ep, X.01c, int, int, int):android.widget.RemoteViews");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0017, code lost:
        if (r5 != 0) goto L5;
     */
    @Override // android.appwidget.AppWidgetProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onAppWidgetOptionsChanged(android.content.Context r7, android.appwidget.AppWidgetManager r8, int r9, android.os.Bundle r10) {
        /*
            r6 = this;
            if (r10 == 0) goto L19
            java.lang.String r0 = "appWidgetMinWidth"
            int r4 = r10.getInt(r0)
            java.lang.String r0 = "appWidgetMinHeight"
            int r5 = r10.getInt(r0)
            java.lang.String r1 = "widgetprovider/onappwidgetoptionschanged "
            java.lang.String r0 = "x"
            X.C000200d.A0t(r1, r4, r0, r5)
            if (r4 == 0) goto L19
            if (r5 != 0) goto L1f
        L19:
            r4 = 2147483647(0x7fffffff, float:NaN)
            r5 = 2147483647(0x7fffffff, float:NaN)
        L1f:
            X.0Ep r1 = r6.A03
            X.01c r2 = r6.A04
            r0 = r7
            r3 = r9
            android.widget.RemoteViews r0 = A00(r0, r1, r2, r3, r4, r5)
            r8.updateAppWidget(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.appwidget.WidgetProvider.onAppWidgetOptionsChanged(android.content.Context, android.appwidget.AppWidgetManager, int, android.os.Bundle):void");
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!this.A09) {
            synchronized (this.A08) {
                if (!this.A09) {
                    ((C0C5) AnonymousClass029.A0Y(context)).A20(this);
                    this.A09 = true;
                }
            }
        }
        super.onReceive(context, intent);
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        C000200d.A1F(C000200d.A0P("widgetprovider/update "), iArr.length);
        C1MP c1mp = this.A01;
        if (c1mp != null) {
            c1mp.A08.set(true);
            this.A02.A01().removeCallbacks(this.A01);
        }
        this.A01 = new C1MP(context, this.A00, this.A05, this.A03, this.A04, appWidgetManager, this.A07, this.A06, iArr);
        this.A02.A01().post(this.A01);
        super.onUpdate(context, appWidgetManager, iArr);
    }
}
