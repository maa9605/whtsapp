package com.whatsapp.appwidget;

import X.AbstractC35821jn;
import X.AnonymousClass012;
import X.C002301c;
import X.C018708s;
import X.C03170Ep;
import X.C05W;
import X.C0DU;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import com.google.android.search.verification.client.R;
import com.whatsapp.appwidget.WidgetProvider;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class WidgetService extends AbstractC35821jn {
    public C03170Ep A00;
    public C05W A01;
    public C018708s A02;
    public AnonymousClass012 A03;
    public C002301c A04;
    public C0DU A05;

    @Override // android.widget.RemoteViewsService
    public RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new RemoteViewsService.RemoteViewsFactory(getApplicationContext(), this.A03, this.A00, this.A01, this.A02, this.A04, this.A05) { // from class: X.1MT
            public final Context A00;
            public final C03170Ep A01;
            public final C05W A02;
            public final C018708s A03;
            public final AnonymousClass012 A04;
            public final C002301c A05;
            public final C0DU A06;
            public final ArrayList A07 = new ArrayList();

            @Override // android.widget.RemoteViewsService.RemoteViewsFactory
            public long getItemId(int i) {
                return i;
            }

            @Override // android.widget.RemoteViewsService.RemoteViewsFactory
            public RemoteViews getLoadingView() {
                return null;
            }

            @Override // android.widget.RemoteViewsService.RemoteViewsFactory
            public int getViewTypeCount() {
                return 1;
            }

            @Override // android.widget.RemoteViewsService.RemoteViewsFactory
            public boolean hasStableIds() {
                return true;
            }

            {
                this.A00 = r2;
                this.A04 = r3;
                this.A01 = r4;
                this.A02 = r5;
                this.A03 = r6;
                this.A05 = r7;
                this.A06 = r8;
            }

            @Override // android.widget.RemoteViewsService.RemoteViewsFactory
            public int getCount() {
                return this.A07.size();
            }

            @Override // android.widget.RemoteViewsService.RemoteViewsFactory
            public RemoteViews getViewAt(int i) {
                ArrayList arrayList = this.A07;
                if (i >= arrayList.size()) {
                    return null;
                }
                RemoteViews remoteViews = new RemoteViews(this.A00.getPackageName(), (int) R.layout.widget_row);
                C1MS c1ms = (C1MS) arrayList.get(i);
                remoteViews.setTextViewText(R.id.heading, c1ms.A02);
                remoteViews.setTextViewText(R.id.content, c1ms.A01);
                remoteViews.setTextViewText(R.id.date, c1ms.A04);
                remoteViews.setContentDescription(R.id.date, c1ms.A03);
                Intent intent2 = new Intent();
                Bundle bundle = new Bundle();
                bundle.putString("jid", C003101m.A07(c1ms.A00));
                intent2.putExtras(bundle);
                remoteViews.setOnClickFillInIntent(R.id.widget_row, intent2);
                return remoteViews;
            }

            @Override // android.widget.RemoteViewsService.RemoteViewsFactory
            public void onCreate() {
                Log.i("widgetviewsfactory/oncreate");
                onDataSetChanged();
            }

            @Override // android.widget.RemoteViewsService.RemoteViewsFactory
            public void onDataSetChanged() {
                Log.i("widgetviewsfactory/ondatasetchanged");
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    ArrayList arrayList = WidgetProvider.A0A;
                    ArrayList arrayList2 = this.A07;
                    arrayList2.clear();
                    if (arrayList != null && this.A01.A09()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            AnonymousClass092 anonymousClass092 = (AnonymousClass092) it.next();
                            C1MS c1ms = new C1MS(null);
                            C05W c05w = this.A02;
                            AbstractC005302j abstractC005302j = anonymousClass092.A0n.A00;
                            C06C A0A = c05w.A0A(abstractC005302j);
                            c1ms.A00 = abstractC005302j;
                            c1ms.A02 = C002701i.A0p(this.A03.A08(A0A, false));
                            c1ms.A01 = this.A06.A0E(anonymousClass092, A0A, false, false);
                            C002301c c002301c = this.A05;
                            AnonymousClass012 anonymousClass012 = this.A04;
                            c1ms.A04 = AnonymousClass029.A0n(c002301c, anonymousClass012.A06(anonymousClass092.A0E), false);
                            c1ms.A03 = AnonymousClass029.A0n(c002301c, anonymousClass012.A06(anonymousClass092.A0E), true);
                            arrayList2.add(c1ms);
                        }
                    }
                } finally {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }

            @Override // android.widget.RemoteViewsService.RemoteViewsFactory
            public void onDestroy() {
                Log.i("widgetviewsfactory/ondestroy");
            }
        };
    }
}
