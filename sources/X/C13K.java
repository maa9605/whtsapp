package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.13K  reason: invalid class name */
/* loaded from: classes.dex */
public final class C13K {
    public static final C13S A00;
    public static final AbstractC30501ag A01;
    public static final AbstractC30501ag A02;
    public static final C30521ai A03;
    public static final C30521ai A04;
    public static final C227413u A05;

    static {
        C30521ai c30521ai = new C30521ai();
        A03 = c30521ai;
        A04 = new C30521ai();
        AbstractC30501ag abstractC30501ag = new AbstractC30501ag() { // from class: X.1qI
            @Override // X.AbstractC30501ag
            public final /* synthetic */ InterfaceC30511ah A01(Context context, Looper looper, C230114w c230114w, Object obj, InterfaceC227813z interfaceC227813z, AnonymousClass140 anonymousClass140) {
                return new AbstractC39661qU(context, looper, c230114w, (C30341aM) obj, interfaceC227813z, anonymousClass140) { // from class: X.188
                    public final C30341aM A00;

                    {
                        this.A00 = r11;
                    }

                    @Override // X.AbstractC229914u
                    public final String A05() {
                        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
                    }

                    @Override // X.AbstractC229914u
                    public final String A06() {
                        return "com.google.android.gms.auth.api.credentials.service.START";
                    }

                    @Override // X.AbstractC39661qU, X.InterfaceC30511ah
                    public final int ABP() {
                        return 12800000;
                    }

                    @Override // X.AbstractC229914u
                    public final Bundle A01() {
                        C30341aM c30341aM = this.A00;
                        if (c30341aM == null) {
                            return new Bundle();
                        }
                        Bundle A022 = C000200d.A02("consumer_package", null);
                        A022.putBoolean("force_save_dialog", c30341aM.A00);
                        return A022;
                    }

                    @Override // X.AbstractC229914u
                    public final /* synthetic */ IInterface A03(IBinder iBinder) {
                        if (iBinder == null) {
                            return null;
                        }
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                        if (queryLocalInterface instanceof InterfaceC232916a) {
                            return queryLocalInterface;
                        }
                        return new C31401cD(iBinder);
                    }
                };
            }
        };
        A01 = abstractC30501ag;
        A02 = new AbstractC30501ag() { // from class: X.1qJ
            @Override // X.C13t
            public final /* synthetic */ List A00(Object obj) {
                GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
                if (googleSignInOptions == null) {
                    return Collections.emptyList();
                }
                return new ArrayList(googleSignInOptions.A06);
            }

            @Override // X.AbstractC30501ag
            public final /* synthetic */ InterfaceC30511ah A01(Context context, Looper looper, C230114w c230114w, Object obj, InterfaceC227813z interfaceC227813z, AnonymousClass140 anonymousClass140) {
                return new C1A6(context, looper, c230114w, (GoogleSignInOptions) obj, interfaceC227813z, anonymousClass140);
            }
        };
        C07K.A1Q(abstractC30501ag, "Cannot construct an Api with a null ClientBuilder");
        C07K.A1Q(c30521ai, "Cannot construct an Api with a null ClientKey");
        A05 = new C227413u("Auth.GOOGLE_SIGN_IN_API", A02, A04);
        A00 = new C13S() { // from class: X.1aX
        };
    }
}
