package X;

import android.content.DialogInterface;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.1Sa  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C28451Sa extends C0MU {
    public DialogInterface.OnClickListener A02;
    public C11580hz A03;
    public AbstractC11700iC A04;
    public C11720iE A05;
    public C11740iG A06;
    public C11790iL A07;
    public C0HK A08;
    public C0HK A09;
    public C0HK A0A;
    public C0HK A0B;
    public C0HK A0C;
    public C0HK A0D;
    public C0HK A0E;
    public C0HK A0F;
    public CharSequence A0G;
    public Executor A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0M;
    public boolean A0N;
    public int A00 = 0;
    public boolean A0L = true;
    public int A01 = 0;

    public static void A00(C0HK c0hk, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            c0hk.A0B(obj);
        } else {
            c0hk.A0A(obj);
        }
    }

    public int A02() {
        C11740iG c11740iG = this.A06;
        if (c11740iG != null) {
            int i = this.A05 != null ? 15 : 255;
            return c11740iG.A03 ? i | 32768 : i;
        }
        return 0;
    }

    public CharSequence A03() {
        CharSequence charSequence = this.A0G;
        if (charSequence != null) {
            return charSequence;
        }
        C11740iG c11740iG = this.A06;
        if (c11740iG != null) {
            CharSequence charSequence2 = c11740iG.A00;
            return charSequence2 == null ? "" : charSequence2;
        }
        return null;
    }

    public void A04(int i) {
        C0HK c0hk = this.A0C;
        if (c0hk == null) {
            c0hk = new C0HK();
            this.A0C = c0hk;
        }
        A00(c0hk, Integer.valueOf(i));
    }

    public void A05(boolean z) {
        C0HK c0hk = this.A0F;
        if (c0hk == null) {
            c0hk = new C0HK();
            this.A0F = c0hk;
        }
        A00(c0hk, Boolean.valueOf(z));
    }
}
