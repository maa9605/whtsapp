package com.whatsapp.service;

import X.C010605h;
import X.C018508q;
import X.C02180Ae;
import X.C09610eQ;
import X.C0C5;
import X.C0E7;
import X.C0EM;
import X.C1VF;
import X.C40291rx;
import X.InterfaceFutureC09630eS;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.whatsapp.service.RestoreChatConnectionWorker;
import com.whatsapp.util.Log;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class RestoreChatConnectionWorker extends ListenableWorker {
    public final Handler A00;
    public final C09610eQ A01;
    public final C018508q A02;
    public final C0E7 A03;
    public final C010605h A04;
    public final C40291rx A05;

    public RestoreChatConnectionWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.A00 = new Handler(Looper.getMainLooper());
        this.A01 = new C09610eQ();
        C0C5 c0c5 = (C0C5) C02180Ae.A0f(context.getApplicationContext(), C0C5.class);
        this.A02 = c0c5.A0K();
        this.A05 = c0c5.A1I();
        this.A03 = c0c5.A0c();
        this.A04 = c0c5.A1G();
    }

    @Override // androidx.work.ListenableWorker
    public InterfaceFutureC09630eS A00() {
        C010605h c010605h = this.A04;
        if (!c010605h.A03()) {
            C0EM c0em = new C0EM() { // from class: X.3oG
                {
                    RestoreChatConnectionWorker.this = this;
                }

                @Override // X.C0EM
                public final void AIL(boolean z) {
                    RestoreChatConnectionWorker restoreChatConnectionWorker = RestoreChatConnectionWorker.this;
                    if (z) {
                        restoreChatConnectionWorker.A01.A08(new C1VF());
                    }
                }
            };
            c010605h.A00(c0em);
            C09610eQ c09610eQ = this.A01;
            RunnableEBaseShape4S0200000_I0_4 runnableEBaseShape4S0200000_I0_4 = new RunnableEBaseShape4S0200000_I0_4(this, c0em, 11);
            Executor executor = this.A02.A06;
            c09610eQ.A5E(runnableEBaseShape4S0200000_I0_4, executor);
            RunnableEBaseShape6S0100000_I0_6 runnableEBaseShape6S0100000_I0_6 = new RunnableEBaseShape6S0100000_I0_6(this, 15);
            this.A00.postDelayed(runnableEBaseShape6S0100000_I0_6, 30000L);
            c09610eQ.A5E(new RunnableEBaseShape4S0200000_I0_4(this, runnableEBaseShape6S0100000_I0_6, 12), executor);
            this.A05.A0F(false, true, false, false, false, null, null, this.A03.A06(), 0);
            return c09610eQ;
        }
        Log.i("RestoreChatConnectionWorker/doWork nothing to do");
        C09610eQ c09610eQ2 = this.A01;
        c09610eQ2.A08(new C1VF());
        return c09610eQ2;
    }

    @Override // androidx.work.ListenableWorker
    public void A01() {
        this.A01.cancel(true);
    }
}
