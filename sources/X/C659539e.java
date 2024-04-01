package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.settings.chat.wallpaper.WallPaperView;
import java.lang.ref.WeakReference;

/* renamed from: X.39e  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C659539e extends C06020Rf {
    public final Activity A00;
    public final ViewGroup A01;
    public final C659739g A02;
    public final AbstractC005302j A03;
    public final AbstractC40441sG A04;
    public final WallPaperView A05;
    public final InterfaceC002901k A06;

    public C659539e(AbstractC005302j abstractC005302j, Activity activity, C018508q c018508q, InterfaceC002901k interfaceC002901k, C01B c01b, C02E c02e, AbstractC40441sG abstractC40441sG, C0B5 c0b5, final Runnable runnable, ViewGroup viewGroup, final WallPaperView wallPaperView, C59452sm c59452sm) {
        this.A03 = abstractC005302j;
        this.A00 = activity;
        this.A06 = interfaceC002901k;
        this.A04 = abstractC40441sG;
        this.A01 = viewGroup;
        this.A05 = wallPaperView;
        this.A02 = new C659739g(activity, c018508q, c01b, c02e, abstractC40441sG, c0b5, new InterfaceC59442sl() { // from class: X.39d
            @Override // X.InterfaceC59442sl
            public void A6D() {
                WallPaperView wallPaperView2 = wallPaperView;
                wallPaperView2.A02 = false;
                wallPaperView2.setImageDrawable(null);
                wallPaperView2.invalidate();
            }

            @Override // X.InterfaceC59442sl
            public void AUA(Drawable drawable) {
                C659539e.this.A01(drawable);
            }

            @Override // X.InterfaceC59442sl
            public void AWF() {
                runnable.run();
            }
        }, c59452sm);
    }

    public final void A00() {
        InterfaceC002901k interfaceC002901k = this.A06;
        final AbstractC005302j abstractC005302j = this.A03;
        final Activity activity = this.A00;
        final AbstractC40441sG abstractC40441sG = this.A04;
        final C659339c c659339c = new C659339c(this);
        interfaceC002901k.ARy(new C0HS(abstractC005302j, activity, abstractC40441sG, c659339c) { // from class: X.39f
            public final C659339c A00;
            public final AbstractC005302j A01;
            public final AbstractC40441sG A02;
            public final WeakReference A03;

            {
                this.A03 = new WeakReference(activity);
                this.A01 = abstractC005302j;
                this.A02 = abstractC40441sG;
                this.A00 = c659339c;
            }

            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                AbstractC40441sG abstractC40441sG2 = this.A02;
                return abstractC40441sG2.A0A(abstractC40441sG2.A04(this.A01, (Context) this.A03.get()));
            }

            @Override // X.C0HS
            public void A09(Object obj) {
                this.A00.A00.A01((Drawable) obj);
            }
        }, new Void[0]);
    }

    public final void A01(Drawable drawable) {
        if (drawable != null) {
            this.A05.setDrawable(drawable);
            this.A01.setBackgroundResource(0);
            return;
        }
        WallPaperView wallPaperView = this.A05;
        wallPaperView.A02 = false;
        wallPaperView.setImageDrawable(null);
        wallPaperView.invalidate();
        this.A01.setBackgroundResource(R.color.conversation_background);
    }

    @Override // X.C06020Rf, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        A01(null);
        A00();
    }

    @Override // X.C06020Rf, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        AbstractC40441sG abstractC40441sG = this.A04;
        if (abstractC40441sG.A00) {
            A00();
            abstractC40441sG.A00 = false;
        }
    }
}
