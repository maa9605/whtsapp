package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.util.Log;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0Tm */
/* loaded from: classes.dex */
public abstract class AbstractC06480Tm extends C2La {
    public static ProgressDialogC06500To A08;
    public static final AtomicReference A09 = new AtomicReference(null);
    public boolean A00;
    public final Activity A01;
    public final HandlerC07390Ya A02;
    public final C41541u6 A03;
    public final InterfaceC05880Qp A04;
    public final C42721wD A05;
    public final AtomicBoolean A06;
    public final boolean A07;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Ya] */
    public AbstractC06480Tm(Activity activity, C018508q c018508q, C02L c02l, InterfaceC002901k interfaceC002901k, C41181tV c41181tV, C0EG c0eg, C0EB c0eb, C41541u6 c41541u6, C0E6 c0e6, C05W c05w, C23Y c23y, C40291rx c40291rx, C03290Fc c03290Fc, C2CS c2cs, C0ES c0es, C40431sF c40431sF, AbstractC40441sG abstractC40441sG, C0CB c0cb, C000400f c000400f, C41321tj c41321tj, C0CC c0cc, C41511u2 c41511u2, C2Aa c2Aa, C02960Do c02960Do, C49552Lb c49552Lb, C26S c26s, C42711wC c42711wC, C0C8 c0c8, C42431vj c42431vj, C42721wD c42721wD, C05N c05n, C49562Lc c49562Lc, boolean z) {
        super(c018508q, interfaceC002901k, c41181tV, c0eg, c0eb, c0e6, c05w, c23y, c40291rx, c03290Fc, c2cs, c0es, c40431sF, abstractC40441sG, c0cb, c000400f, c41321tj, c0cc, c41511u2, c2Aa, c02960Do, c49552Lb, c26s, c42711wC, c0c8, c42431vj, c05n, c49562Lc);
        this.A06 = new AtomicBoolean(false);
        this.A04 = new InterfaceC05880Qp() { // from class: X.0YZ
            {
                AbstractC06480Tm.this = this;
            }

            @Override // X.InterfaceC05880Qp
            public void ANZ(String str) {
                throw new IllegalStateException("must not be called");
            }

            @Override // X.InterfaceC05880Qp
            public void ANa() {
                throw new IllegalStateException("must not be called");
            }

            @Override // X.InterfaceC05880Qp
            public void AQ0(String str) {
                C002701i.A19(AbstractC06480Tm.this.A01, 107);
            }

            @Override // X.InterfaceC05880Qp
            public void AQ1() {
                Activity activity2 = AbstractC06480Tm.this.A01;
                int i = Build.VERSION.SDK_INT;
                int i2 = R.string.permission_storage_need_write_access_on_restore_from_backup_v30;
                if (i < 30) {
                    i2 = R.string.permission_storage_need_write_access_on_restore_from_backup;
                }
                RequestPermissionActivity.A06(activity2, R.string.permission_storage_need_write_access_on_restore_from_backup_request, i2, false, 200);
            }
        };
        this.A01 = activity;
        this.A07 = z;
        this.A02 = new Handler(Looper.getMainLooper(), new WeakReference(activity)) { // from class: X.0Ya
            public final WeakReference A00;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(r2);
                if (r2 != null) {
                    this.A00 = r3;
                    return;
                }
                throw null;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                Activity activity2 = (Activity) this.A00.get();
                if (activity2 == null) {
                    removeMessages(1);
                } else if (message.what == 1) {
                    Log.e("verifymsgstorehelper/timeout");
                    removeMessages(1);
                    C002701i.A19(activity2, 200);
                }
            }
        };
        this.A03 = c41541u6;
        this.A05 = c42721wD;
    }

    @Override // X.C2La
    public void A00() {
        if (this.A00) {
            final Runnable runnable = new Runnable() { // from class: X.1JE
                {
                    AbstractC06480Tm.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC06480Tm.this.A05();
                }
            };
            final Runnable runnable2 = new Runnable() { // from class: X.1JS
                {
                    AbstractC06480Tm.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC06480Tm.this.A06();
                }
            };
            final C03290Fc c03290Fc = super.A06;
            if (c03290Fc != null) {
                Runnable runnable3 = new Runnable() { // from class: X.1Ni
                    @Override // java.lang.Runnable
                    public final void run() {
                        C03290Fc c03290Fc2 = c03290Fc;
                        Runnable runnable4 = runnable2;
                        Runnable runnable5 = runnable;
                        HashMap hashMap = c03290Fc2.A01;
                        hashMap.size();
                        for (C05740Qa c05740Qa : hashMap.values()) {
                            int i = c05740Qa.A00;
                            if (i >= 500) {
                                C000200d.A1G(C000200d.A0P("backupencryption/received/received/error "), i);
                                if (runnable4 != null) {
                                    runnable4.run();
                                    return;
                                }
                                return;
                            }
                        }
                        if (runnable5 == null) {
                            return;
                        }
                        runnable5.run();
                    }
                };
                File A0E = this.A0D.A0E();
                ArrayList arrayList = new ArrayList();
                arrayList.toString();
                Iterator it = ((AbstractCollection) C03460Fu.A05(EnumC03450Ft.A01(), EnumC03450Ft.A00())).iterator();
                while (it.hasNext()) {
                    ArrayList A04 = C03460Fu.A04(A0E, Collections.singletonList(it.next()));
                    A04.toString();
                    arrayList.addAll(A04);
                }
                if (c03290Fc.A01(arrayList, runnable3) != 0) {
                    sendEmptyMessageDelayed(1, 32000L);
                    return;
                }
            } else {
                throw null;
            }
        }
        this.A0S.ARy(new C03850Hj(this, this.A07, this.A00), new Object[0]);
    }

    public final Dialog A04(final int i, int i2) {
        C019208x c019208x = new C019208x(this.A01);
        C019308y c019308y = c019208x.A01;
        c019308y.A0E = c019308y.A0O.getText(i2);
        c019308y.A0J = false;
        c019208x.A06(R.string.retry, new DialogInterface.OnClickListener() { // from class: X.1JG
            {
                AbstractC06480Tm.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                AbstractC06480Tm abstractC06480Tm = AbstractC06480Tm.this;
                C002701i.A18(abstractC06480Tm.A01, i);
                abstractC06480Tm.A00 = true;
                abstractC06480Tm.A0A(true, false);
            }
        });
        c019208x.A04(R.string.msg_store_do_not_restore, new DialogInterface.OnClickListener() { // from class: X.1JJ
            {
                AbstractC06480Tm.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                AbstractC06480Tm abstractC06480Tm = AbstractC06480Tm.this;
                int i4 = i;
                Activity activity = abstractC06480Tm.A01;
                C002701i.A18(activity, i4);
                C002701i.A19(activity, 106);
            }
        });
        return c019208x.A00();
    }

    public void A05() {
        C018508q c018508q = super.A01;
        c018508q.A02.post(new Runnable() { // from class: X.1JL
            {
                AbstractC06480Tm.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC06480Tm.this.A09();
            }
        });
    }

    public void A06() {
        Log.i("verifymsgstore/preparedb/cannot-start-db-restore-missing-k");
        C018508q c018508q = super.A01;
        c018508q.A02.post(new Runnable() { // from class: X.1JN
            {
                AbstractC06480Tm.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC06480Tm abstractC06480Tm = AbstractC06480Tm.this;
                abstractC06480Tm.A02.removeMessages(1);
                C002701i.A19(abstractC06480Tm.A01, 201);
            }
        });
    }

    public void A07() {
        C002701i.A18(this.A01, 107);
        if (super.A05.A09(this.A04)) {
            A08();
        }
    }

    public void A08() {
        int A06 = this.A0D.A06();
        C000200d.A0q("verifymsgstore/usehistoryifexists/backupfilesfound ", A06);
        if (A06 > 0) {
            C002701i.A19(this.A01, 103);
        } else {
            A0A(false, true);
        }
    }

    public /* synthetic */ void A09() {
        removeMessages(1);
        this.A0S.ARy(new C03850Hj(this, this.A07, true), new Object[0]);
    }

    public void A0A(boolean z, boolean z2) {
        this.A00 = z;
        StringBuilder A0P = C000200d.A0P("verifymsgstore/preparemsgstore isregname=");
        boolean z3 = this.A07;
        A0P.append(z3);
        A0P.append(" restorefrombackup=");
        A0P.append(z);
        A0P.append(" skipdialog=");
        C000200d.A1N(A0P, z2 ? "true" : "false");
        if (!z2) {
            Activity activity = this.A01;
            if (!activity.isFinishing() && (!z3 || this.A00)) {
                C002701i.A19(activity, 100);
            }
        }
        A02();
    }
}
