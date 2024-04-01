package X;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.IAccountAccessor;

/* renamed from: X.171  reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass171 extends AbstractC39661qU implements InterfaceC33101fM {
    public Integer A00;
    public final Bundle A01;
    public final C230114w A02;
    public final boolean A03;

    @Override // X.AbstractC229914u
    public String A05() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // X.AbstractC229914u
    public String A06() {
        return "com.google.android.gms.signin.service.START";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass171(Context context, Looper looper, C230114w c230114w, InterfaceC227813z interfaceC227813z, AnonymousClass140 anonymousClass140) {
        super(context, looper, 44, c230114w, interfaceC227813z, anonymousClass140);
        C31971dF c31971dF = c230114w.A01;
        Integer num = c230114w.A00;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        if (c31971dF != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        }
        this.A03 = true;
        this.A02 = c230114w;
        this.A01 = bundle;
        this.A00 = c230114w.A00;
    }

    @Override // X.AbstractC229914u
    public Bundle A01() {
        String str = this.A02.A02;
        if (!this.A0F.getPackageName().equals(str)) {
            this.A01.putString("com.google.android.gms.signin.internal.realClientPackageName", str);
        }
        return this.A01;
    }

    @Override // X.AbstractC229914u
    public /* synthetic */ IInterface A03(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof InterfaceC239318v) {
            return queryLocalInterface;
        }
        return new C32001dI(iBinder);
    }

    @Override // X.AbstractC229914u, X.InterfaceC30511ah
    public boolean ARg() {
        return true;
    }

    @Override // X.InterfaceC33101fM
    public final void AWN(IAccountAccessor iAccountAccessor, boolean z) {
        try {
            ((InterfaceC239318v) A02()).AWM(iAccountAccessor, this.A00.intValue(), z);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    @Override // X.InterfaceC33101fM
    public final void AWQ(InterfaceC239218u interfaceC239218u) {
        C07K.A1Q(interfaceC239218u, "Expecting a valid ISignInCallbacks");
        try {
            Account account = new Account("<<default account>>", "com.google");
            ((InterfaceC239318v) A02()).AWR(new C32011dJ(new C31031bb(account, this.A00.intValue(), "<<default account>>".equals(account.name) ? C13U.A00(this.A0F).A02() : null)), interfaceC239218u);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                interfaceC239218u.AWU(new C32021dK());
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // X.InterfaceC33101fM
    public final void AWX() {
        try {
            ((InterfaceC239318v) A02()).AWY(this.A00.intValue());
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    @Override // X.InterfaceC33101fM
    public final void connect() {
        A6Q(new InterfaceC229514q() { // from class: X.1bU
            @Override // X.InterfaceC229514q
            public void ANu(C30451ab c30451ab) {
                if (c30451ab.A02()) {
                    AbstractC229914u abstractC229914u = AbstractC229914u.this;
                    abstractC229914u.ACl(null, ((AbstractC39661qU) abstractC229914u).A01);
                    return;
                }
                InterfaceC229414p interfaceC229414p = AbstractC229914u.this.A0I;
                if (interfaceC229414p != null) {
                    ((C31131bl) interfaceC229414p).A00.AIv(c30451ab);
                }
            }
        });
    }
}
