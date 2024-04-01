package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: X.1aO  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C30361aO extends C0ND {
    public static final AbstractC30501ag A00;
    public static final C30521ai A01;
    public static final C227413u A02;

    static {
        C30521ai c30521ai = new C30521ai();
        A01 = c30521ai;
        AbstractC30501ag abstractC30501ag = new AbstractC30501ag() { // from class: X.1qB
            @Override // X.AbstractC30501ag
            public final /* synthetic */ InterfaceC30511ah A01(Context context, Looper looper, C230114w c230114w, Object obj, InterfaceC227813z interfaceC227813z, AnonymousClass140 anonymousClass140) {
                return new AbstractC39661qU(context, looper, c230114w, interfaceC227813z, anonymousClass140) { // from class: X.186
                    public final Bundle A00 = new Bundle();

                    @Override // X.AbstractC229914u
                    public final String A05() {
                        return "com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService";
                    }

                    @Override // X.AbstractC229914u
                    public final String A06() {
                        return "com.google.android.gms.auth.api.accounttransfer.service.START";
                    }

                    @Override // X.AbstractC229914u
                    public final Bundle A01() {
                        return this.A00;
                    }

                    @Override // X.AbstractC229914u
                    public final /* synthetic */ IInterface A03(IBinder iBinder) {
                        if (iBinder == null) {
                            return null;
                        }
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService");
                        if (queryLocalInterface instanceof InterfaceC234016m) {
                            return queryLocalInterface;
                        }
                        return new C31411cE(iBinder);
                    }
                };
            }
        };
        A00 = abstractC30501ag;
        A02 = new C227413u("AccountTransfer.ACCOUNT_TRANSFER_API", abstractC30501ag, c30521ai);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C30361aO(android.app.Activity r5) {
        /*
            r4 = this;
            X.13u r3 = X.C30361aO.A02
            X.143 r2 = new X.143
            r2.<init>()
            java.lang.String r0 = "StatusExceptionMapper must not be null."
            X.C07K.A1Q(r2, r0)
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            X.13w r0 = new X.13w
            r0.<init>(r2, r1)
            r4.<init>(r5, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30361aO.<init>(android.app.Activity):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C30361aO(android.content.Context r5) {
        /*
            r4 = this;
            X.13u r3 = X.C30361aO.A02
            X.143 r2 = new X.143
            r2.<init>()
            java.lang.String r0 = "StatusExceptionMapper must not be null."
            X.C07K.A1Q(r2, r0)
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            X.13w r0 = new X.13w
            r0.<init>(r2, r1)
            r4.<init>(r5, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30361aO.<init>(android.content.Context):void");
    }
}
