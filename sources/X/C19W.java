package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Set;

/* renamed from: X.19W  reason: invalid class name */
/* loaded from: classes.dex */
public final class C19W extends BinderC35171ii implements InterfaceC227813z, AnonymousClass140 {
    public static AbstractC30501ag A07 = C239618y.A00;
    public C14Z A00;
    public C230114w A01;
    public InterfaceC33101fM A02;
    public Set A03;
    public final Context A04;
    public final Handler A05;
    public final AbstractC30501ag A06;

    public C19W(Context context, Handler handler, C230114w c230114w, AbstractC30501ag abstractC30501ag) {
        this.A04 = context;
        this.A05 = handler;
        C07K.A1Q(c230114w, "ClientSettings must not be null");
        this.A01 = c230114w;
        this.A03 = c230114w.A05;
        this.A06 = abstractC30501ag;
    }

    @Override // X.InterfaceC227813z
    public final void AIu(Bundle bundle) {
        this.A02.AWQ(this);
    }

    @Override // X.AnonymousClass140
    public final void AIv(C30451ab c30451ab) {
        ((C30541al) this.A00).A00(c30451ab);
    }

    @Override // X.InterfaceC227813z
    public final void AIw(int i) {
        this.A02.A7H();
    }

    @Override // X.InterfaceC239218u
    public final void AWU(final C32021dK c32021dK) {
        this.A05.post(new Runnable() { // from class: X.14Y
            @Override // java.lang.Runnable
            public final void run() {
                C19W c19w = C19W.this;
                C32021dK c32021dK2 = c32021dK;
                if (c19w != null) {
                    C30451ab c30451ab = c32021dK2.A01;
                    if (c30451ab.A02()) {
                        C31041bc c31041bc = c32021dK2.A02;
                        C30451ab c30451ab2 = c31041bc.A01;
                        if (!c30451ab2.A02()) {
                            String valueOf = String.valueOf(c30451ab2);
                            StringBuilder sb = new StringBuilder(valueOf.length() + 48);
                            sb.append("Sign-in succeeded with resolve account failure: ");
                            sb.append(valueOf);
                            Log.wtf("SignInCoordinator", sb.toString(), new Exception());
                            ((C30541al) c19w.A00).A00(c30451ab2);
                            c19w.A02.A7H();
                            return;
                        }
                        C14Z c14z = c19w.A00;
                        IAccountAccessor A00 = c31041bc.A00();
                        Set set = c19w.A03;
                        C30541al c30541al = (C30541al) c14z;
                        if (c30541al == null) {
                            throw null;
                        }
                        if (A00 != null && set != null) {
                            c30541al.A00 = A00;
                            c30541al.A01 = set;
                            if (c30541al.A02) {
                                c30541al.A03.ACl(A00, set);
                            }
                        } else {
                            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                            c30541al.A00(new C30451ab(4));
                        }
                    } else {
                        ((C30541al) c19w.A00).A00(c30451ab);
                    }
                    c19w.A02.A7H();
                    return;
                }
                throw null;
            }
        });
    }
}
