package X;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.0ND */
/* loaded from: classes.dex */
public class C0ND {
    public final int A00;
    public final Context A01;
    public final Looper A02;
    public final C227413u A03;
    public final C0NE A04;
    public final AnonymousClass143 A05;
    public final AnonymousClass146 A06;
    public final C228114c A07;

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0068, code lost:
        if (r5 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00a7, code lost:
        if (r0 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00e4, code lost:
        if (r5 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00f7, code lost:
        if (r0 != false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0ND(android.app.Activity r9, X.C227413u r10, X.C227613w r11) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ND.<init>(android.app.Activity, X.13u, X.13w):void");
    }

    public C0ND(Context context, C227413u c227413u, C227613w c227613w) {
        C07K.A1Q(context, "Null context is not permitted.");
        C07K.A1Q(c227413u, "Api must not be null.");
        C07K.A1Q(c227613w, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.A01 = context.getApplicationContext();
        this.A03 = c227413u;
        this.A02 = c227613w.A00;
        this.A07 = new C228114c(c227413u, null);
        this.A04 = new C0NE(this) { // from class: X.1qO
            public final C0ND A00;
            public final String A01 = "Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.";

            {
                this.A00 = this;
            }

            @Override // X.C0NE
            public final Looper A02() {
                return this.A00.A02;
            }

            @Override // X.C0NE
            public C30451ab A03() {
                throw new UnsupportedOperationException(this.A01);
            }

            @Override // X.C0NE
            public C0NJ A05() {
                throw new UnsupportedOperationException(this.A01);
            }

            @Override // X.C0NE
            public final C0NH A06(C0NH c0nh) {
                this.A00.A02(c0nh);
                return c0nh;
            }

            @Override // X.C0NE
            public final C0NH A07(C0NH c0nh) {
                this.A00.A02(c0nh);
                return c0nh;
            }

            @Override // X.C0NE
            public void A09() {
                throw new UnsupportedOperationException(this.A01);
            }

            @Override // X.C0NE
            public void A0A() {
                throw new UnsupportedOperationException(this.A01);
            }

            @Override // X.C0NE
            public boolean A0B() {
                throw new UnsupportedOperationException(this.A01);
            }
        };
        AnonymousClass146 A00 = AnonymousClass146.A00(this.A01);
        this.A06 = A00;
        this.A00 = A00.A0B.getAndIncrement();
        this.A05 = c227613w.A01;
        Handler handler = this.A06.A05;
        handler.sendMessage(handler.obtainMessage(7, this));
    }

    public C230014v A00() {
        C230014v c230014v = new C230014v();
        Set emptySet = Collections.emptySet();
        AnonymousClass036 anonymousClass036 = c230014v.A00;
        if (anonymousClass036 == null) {
            anonymousClass036 = new AnonymousClass036(0);
            c230014v.A00 = anonymousClass036;
        }
        anonymousClass036.addAll(emptySet);
        Context context = this.A01;
        c230014v.A03 = context.getClass().getName();
        c230014v.A02 = context.getPackageName();
        return c230014v;
    }

    public final C0AC A01(C14F c14f) {
        C0NR c0nr = new C0NR();
        AnonymousClass146 anonymousClass146 = this.A06;
        AbstractC30791bB abstractC30791bB = new AbstractC30791bB(c14f, c0nr, this.A05) { // from class: X.1qQ
            public final AnonymousClass143 A00;
            public final C14F A01;
            public final C0NR A02;

            {
                this.A02 = c0nr;
                this.A01 = c14f;
                this.A00 = r3;
            }

            @Override // X.C14J
            public final void A01(Status status) {
                C0NR c0nr2 = this.A02;
                if (this.A00 != null) {
                    c0nr2.A00(C07K.A0p(status));
                    return;
                }
                throw null;
            }

            @Override // X.C14J
            public final void A02(C39561qK c39561qK) {
                try {
                    this.A01.A00(c39561qK.A04, this.A02);
                } catch (DeadObjectException e) {
                    throw e;
                } catch (RemoteException e2) {
                    A01(C14J.A00(e2));
                } catch (RuntimeException e3) {
                    this.A02.A00(e3);
                }
            }

            @Override // X.C14J
            public final void A03(final C14G c14g, boolean z) {
                final C0NR c0nr2 = this.A02;
                c14g.A01.put(c0nr2, Boolean.valueOf(z));
                C0AD c0ad = c0nr2.A00;
                AnonymousClass192 anonymousClass192 = new AnonymousClass192() { // from class: X.1ap
                    @Override // X.AnonymousClass192
                    public final void AIm(C0AC c0ac) {
                        c14g.A01.remove(c0nr2);
                    }
                };
                if (c0ad == null) {
                    throw null;
                }
                c0ad.A03.A01(new C32061dO(C0AI.A00, anonymousClass192));
                c0ad.A07();
            }

            @Override // X.C14J
            public final void A04(RuntimeException runtimeException) {
                this.A02.A00(runtimeException);
            }

            @Override // X.AbstractC30791bB
            public final boolean A05(C39561qK c39561qK) {
                return false;
            }

            @Override // X.AbstractC30791bB
            public final C30461ac[] A06(C39561qK c39561qK) {
                return null;
            }
        };
        Handler handler = anonymousClass146.A05;
        handler.sendMessage(handler.obtainMessage(4, new C14W(abstractC30791bB, anonymousClass146.A0C.get(), this)));
        return c0nr.A00;
    }

    public final void A02(C0NH c0nh) {
        c0nh.A06();
        AnonymousClass146 anonymousClass146 = this.A06;
        C14J c14j = new C14J(c0nh) { // from class: X.1bD
            public final C0NH A00;

            {
                this.A00 = c0nh;
            }

            @Override // X.C14J
            public final void A01(Status status) {
                this.A00.A0D(status);
            }

            @Override // X.C14J
            public final void A02(C39561qK c39561qK) {
                try {
                    this.A00.A0B(c39561qK.A04);
                } catch (RuntimeException e) {
                    A04(e);
                }
            }

            @Override // X.C14J
            public final void A03(final C14G c14g, boolean z) {
                final C0NH c0nh2 = this.A00;
                c14g.A00.put(c0nh2, Boolean.valueOf(z));
                c0nh2.A01(new C0NT() { // from class: X.1ao
                    @Override // X.C0NT
                    public final void AIl(Status status) {
                        c14g.A00.remove(c0nh2);
                    }
                });
            }

            @Override // X.C14J
            public final void A04(RuntimeException runtimeException) {
                String simpleName = runtimeException.getClass().getSimpleName();
                String localizedMessage = runtimeException.getLocalizedMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(localizedMessage).length() + simpleName.length() + 2);
                sb.append(simpleName);
                sb.append(": ");
                sb.append(localizedMessage);
                this.A00.A0D(new Status(10, sb.toString()));
            }
        };
        Handler handler = anonymousClass146.A05;
        handler.sendMessage(handler.obtainMessage(4, new C14W(c14j, anonymousClass146.A0C.get(), this)));
    }
}
