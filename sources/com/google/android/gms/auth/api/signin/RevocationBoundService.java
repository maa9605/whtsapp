package com.google.android.gms.auth.api.signin;

import X.C16Y;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class RevocationBoundService extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (!"com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect".equals(intent.getAction()) && !"com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState".equals(intent.getAction())) {
            String valueOf = String.valueOf(intent.getAction());
            Log.w("RevocationService", valueOf.length() != 0 ? "Unknown action sent to RevocationBoundService: ".concat(valueOf) : new String("Unknown action sent to RevocationBoundService: "));
            return null;
        }
        if (Log.isLoggable("RevocationService", 2)) {
            String valueOf2 = String.valueOf(intent.getAction());
            Log.v("RevocationService", valueOf2.length() != 0 ? "RevocationBoundService handling ".concat(valueOf2) : new String("RevocationBoundService handling "));
        }
        return new C16Y(this) { // from class: X.1qG
            public final Context A00;

            {
                super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
                this.A00 = this;
            }

            @Override // X.C16Y
            public final boolean A00(int i, Parcel parcel, Parcel parcel2, int i2) {
                if (i != 1) {
                    if (i != 2) {
                        return false;
                    }
                    A01();
                    C13X.A00(this.A00).A01();
                    return true;
                }
                A01();
                Context context = this.A00;
                C13U A00 = C13U.A00(context);
                GoogleSignInAccount A02 = A00.A02();
                GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.A0A;
                if (A02 != null) {
                    googleSignInOptions = A00.A03();
                }
                C227713y c227713y = new C227713y(context);
                C227413u c227413u = C13K.A05;
                C07K.A1Q(c227413u, "Api must not be null");
                C07K.A1Q(googleSignInOptions, "Null options are not permitted for this Api");
                c227713y.A0A.put(c227413u, googleSignInOptions);
                List A002 = c227413u.A00.A00(googleSignInOptions);
                c227713y.A0C.addAll(A002);
                c227713y.A0B.addAll(A002);
                final C0NE A003 = c227713y.A00();
                try {
                    if (A003.A03().A02()) {
                        if (A02 != null) {
                            Context context2 = ((C30691b1) A003).A07;
                            C230615b c230615b = C13W.A00;
                            Object[] objArr = new Object[0];
                            if (c230615b.A00 <= 3) {
                                Log.d("GoogleSignInCommon", c230615b.A00("Revoking access", objArr));
                            }
                            C13U.A00(context2).A04("refreshToken");
                            C13X.A00(context2).A01();
                            Set<C0NE> set = C0NE.A00;
                            synchronized (set) {
                            }
                            for (C0NE c0ne : set) {
                                c0ne.A08();
                            }
                            synchronized (AnonymousClass146.A0G) {
                                AnonymousClass146 anonymousClass146 = AnonymousClass146.A0D;
                                if (anonymousClass146 != null) {
                                    anonymousClass146.A0C.incrementAndGet();
                                    Handler handler = anonymousClass146.A05;
                                    handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
                                }
                            }
                            A003.A07(new C0NH(A003) { // from class: X.0tZ
                                {
                                    C227413u c227413u2 = C13K.A05;
                                }

                                @Override // com.google.android.gms.common.api.internal.BasePendingResult
                                public final /* synthetic */ C08H A04(Status status) {
                                    return status;
                                }

                                @Override // X.C0NH
                                public final void A0C(InterfaceC227113q interfaceC227113q) {
                                    C1A6 c1a6 = (C1A6) interfaceC227113q;
                                    ((C13Z) c1a6.A02()).AXE(new BinderC39511qF(this), c1a6.A00);
                                }
                            });
                        } else {
                            A003.A05();
                        }
                    }
                    return true;
                } finally {
                    A003.A0A();
                }
            }

            public final void A01() {
                if (C0CL.A03(this.A00, Binder.getCallingUid())) {
                    return;
                }
                int callingUid = Binder.getCallingUid();
                StringBuilder sb = new StringBuilder(52);
                sb.append("Calling UID ");
                sb.append(callingUid);
                sb.append(" is not Google Play services.");
                throw new SecurityException(sb.toString());
            }
        };
    }
}
