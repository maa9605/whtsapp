package X;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.26r  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C464026r {
    public static volatile C464026r A03;
    public final C001200o A00;
    public final C0EG A01;
    public final AnonymousClass286 A02 = new C0EK(this) { // from class: X.286
        public final C464026r A00;

        {
            this.A00 = this;
        }

        @Override // X.C0EK
        public int[] AAP() {
            return new int[]{179, 223};
        }

        @Override // X.C0EK
        public boolean AEN(int i, Message message) {
            if (i == 179) {
                Bundle data = message.getData();
                String string = data.getString("nonce");
                if (string != null) {
                    final String string2 = data.getString("apiKey");
                    if (string2 != null) {
                        final C464026r c464026r = this.A00;
                        C001200o c001200o = c464026r.A00;
                        int A02 = AnonymousClass029.A02(c001200o.A00);
                        if (A02 == 0) {
                            final Application application = c001200o.A00;
                            C0ND c0nd = new C0ND(application) { // from class: X.0NC
                                {
                                    C227413u c227413u = C238718l.A02;
                                    AnonymousClass143 anonymousClass143 = new AnonymousClass143();
                                    C07K.A1Q(anonymousClass143, "StatusExceptionMapper must not be null.");
                                    C227613w c227613w = new C227613w(anonymousClass143, Looper.getMainLooper());
                                }
                            };
                            final byte[] bytes = string.getBytes();
                            final C0NE c0ne = c0nd.A04;
                            final C0NH A06 = c0ne.A06(new C0NG(c0ne) { // from class: X.0NF
                                public InterfaceC237217v A00 = new BinderC39911qv() { // from class: X.17o
                                    @Override // X.BinderC39911qv, X.InterfaceC237217v
                                    public final void AWo(Status status, C31931dB c31931dB) {
                                        A07(new C39921qw(status, c31931dB));
                                    }
                                };

                                @Override // com.google.android.gms.common.api.internal.BasePendingResult
                                public /* synthetic */ C08H A04(Status status) {
                                    return new C39921qw(status, null);
                                }

                                @Override // X.C0NH
                                public final void A0C(InterfaceC227113q interfaceC227113q) {
                                    ApplicationInfo applicationInfo;
                                    Bundle bundle;
                                    C17R c17r = (C17R) interfaceC227113q;
                                    InterfaceC237217v interfaceC237217v = this.A00;
                                    byte[] bArr = bytes;
                                    String str = string2;
                                    if (TextUtils.isEmpty(str)) {
                                        if (c17r == null) {
                                            throw null;
                                        }
                                        try {
                                            Context context = c17r.A00;
                                            PackageManager packageManager = context.getPackageManager();
                                            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null) {
                                                str = (String) bundle.get("com.google.android.safetynet.ATTEST_API_KEY");
                                            }
                                        } catch (PackageManager.NameNotFoundException unused) {
                                        }
                                        str = null;
                                    }
                                    ((InterfaceC237317w) c17r.A02()).AWw(interfaceC237217v, bArr, str);
                                }
                            });
                            final C0NN c0nn = new C0NN(new C0NM() { // from class: X.0NL
                            });
                            final C0NQ c0nq = C0NP.A00;
                            final C0NR c0nr = new C0NR();
                            A06.A01(new C0NT() { // from class: X.0NS
                                @Override // X.C0NT
                                public final void AIl(Status status) {
                                    if (status.A01 <= 0) {
                                        C0NJ c0nj = C0NJ.this;
                                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                        BasePendingResult basePendingResult = (BasePendingResult) c0nj;
                                        if (basePendingResult != null) {
                                            C07K.A1c(!basePendingResult.A0C, "Result has already been consumed.");
                                            C07K.A1c(true, "Cannot await if then() has been called.");
                                            try {
                                                if (!basePendingResult.A0A.await(0L, timeUnit)) {
                                                    basePendingResult.A09(Status.A08);
                                                }
                                            } catch (InterruptedException unused) {
                                                basePendingResult.A09(Status.A06);
                                            }
                                            C07K.A1c(basePendingResult.A0A(), "Result is not ready.");
                                            C08H A032 = basePendingResult.A03();
                                            C0NR c0nr2 = c0nr;
                                            C0NM c0nm = ((C0NN) c0nn).A00;
                                            c0nm.A00 = A032;
                                            c0nr2.A00.A09(c0nm);
                                            return;
                                        }
                                        throw null;
                                    }
                                    C0NR c0nr3 = c0nr;
                                    if (c0nq != null) {
                                        c0nr3.A00.A08(C07K.A0p(status));
                                        return;
                                    }
                                    throw null;
                                }
                            });
                            C0AD c0ad = c0nr.A00;
                            C0AH c0ah = new C0AH() { // from class: X.3ml
                                @Override // X.C0AH
                                public final void APH(Object obj) {
                                    C464026r c464026r2 = C464026r.this;
                                    String AAm = ((InterfaceC31911d9) ((C0NM) obj).A00).AAm();
                                    if (AAm != null) {
                                        c464026r2.A01.A0O(AAm, 0, null);
                                    } else {
                                        c464026r2.A01.A0O(null, SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS, "Attestation API returned NULL as JWS result");
                                    }
                                }
                            };
                            if (c0ad != null) {
                                Executor executor = C0AI.A00;
                                c0ad.A02(executor, c0ah);
                                c0ad.A01(executor, new C0AG() { // from class: X.3mk
                                    @Override // X.C0AG
                                    public final void AKE(Exception exc) {
                                        C464026r c464026r2 = C464026r.this;
                                        c464026r2.A01.A0O(null, exc instanceof C08K ? ((C08K) exc).mStatus.A01 : 500, exc.getMessage());
                                        Log.e("requestAttestation/onError", exc);
                                    }
                                });
                                return true;
                            }
                            throw null;
                        }
                        C0EG c0eg = c464026r.A01;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Google Play Services Unavailable. Connection result code: ");
                        sb.append(A02);
                        c0eg.A0O(null, 1001, sb.toString());
                        Log.i("requestAttestation/cannot request attestation Google APIs unavailable");
                        return true;
                    }
                    throw null;
                }
                throw null;
            } else if (i == 223) {
                final int i2 = message.getData().getInt("maxAppsCount");
                final C464026r c464026r2 = this.A00;
                C001200o c001200o2 = c464026r2.A00;
                int A022 = AnonymousClass029.A02(c001200o2.A00);
                if (A022 == 0) {
                    final Application application2 = c001200o2.A00;
                    final C0NE c0ne2 = new C0ND(application2) { // from class: X.0NC
                        {
                            C227413u c227413u = C238718l.A02;
                            AnonymousClass143 anonymousClass143 = new AnonymousClass143();
                            C07K.A1Q(anonymousClass143, "StatusExceptionMapper must not be null.");
                            C227613w c227613w = new C227613w(anonymousClass143, Looper.getMainLooper());
                        }
                    }.A04;
                    final C0NH A062 = c0ne2.A06(new C0NG(c0ne2) { // from class: X.0NU
                        public final InterfaceC237217v A00 = new BinderC39911qv() { // from class: X.17n
                            @Override // X.BinderC39911qv, X.InterfaceC237217v
                            public final void AWp(Status status, C31941dC c31941dC) {
                                A07(new C39931qx(status, c31941dC));
                            }
                        };

                        @Override // com.google.android.gms.common.api.internal.BasePendingResult
                        public /* synthetic */ C08H A04(Status status) {
                            return new C39931qx(status, null);
                        }

                        @Override // X.C0NH
                        public final /* synthetic */ void A0C(InterfaceC227113q interfaceC227113q) {
                            ((InterfaceC237317w) ((AbstractC229914u) interfaceC227113q).A02()).AXC(this.A00);
                        }
                    });
                    final C0NN c0nn2 = new C0NN(new C0NM() { // from class: X.0NV
                    });
                    final C0NQ c0nq2 = C0NP.A00;
                    final C0NR c0nr2 = new C0NR();
                    A062.A01(new C0NT() { // from class: X.0NS
                        @Override // X.C0NT
                        public final void AIl(Status status) {
                            if (status.A01 <= 0) {
                                C0NJ c0nj = C0NJ.this;
                                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                BasePendingResult basePendingResult = (BasePendingResult) c0nj;
                                if (basePendingResult != null) {
                                    C07K.A1c(!basePendingResult.A0C, "Result has already been consumed.");
                                    C07K.A1c(true, "Cannot await if then() has been called.");
                                    try {
                                        if (!basePendingResult.A0A.await(0L, timeUnit)) {
                                            basePendingResult.A09(Status.A08);
                                        }
                                    } catch (InterruptedException unused) {
                                        basePendingResult.A09(Status.A06);
                                    }
                                    C07K.A1c(basePendingResult.A0A(), "Result is not ready.");
                                    C08H A032 = basePendingResult.A03();
                                    C0NR c0nr22 = c0nr2;
                                    C0NM c0nm = ((C0NN) c0nn2).A00;
                                    c0nm.A00 = A032;
                                    c0nr22.A00.A09(c0nm);
                                    return;
                                }
                                throw null;
                            }
                            C0NR c0nr3 = c0nr2;
                            if (c0nq2 != null) {
                                c0nr3.A00.A08(C07K.A0p(status));
                                return;
                            }
                            throw null;
                        }
                    });
                    C0AD c0ad2 = c0nr2.A00;
                    C0AH c0ah2 = new C0AH() { // from class: X.3mj
                        @Override // X.C0AH
                        public final void APH(Object obj) {
                            C464026r c464026r3 = C464026r.this;
                            int i3 = i2;
                            List<C31891d7> AAQ = ((InterfaceC31921dA) ((C0NM) obj).A00).AAQ();
                            C0NW c0nw = new C0NW(AAQ.size());
                            int i4 = 0;
                            for (C31891d7 c31891d7 : AAQ) {
                                if (i4 >= i3) {
                                    break;
                                }
                                c0nw.A01.add(new C2T5(c31891d7.A01, AnonymousClass024.A0M(c31891d7.A02), c31891d7.A00));
                                i4++;
                            }
                            c464026r3.A01.A0N(c0nw, 0, null);
                        }
                    };
                    if (c0ad2 != null) {
                        Executor executor2 = C0AI.A00;
                        c0ad2.A02(executor2, c0ah2);
                        c0ad2.A01(executor2, new C0AG() { // from class: X.3mm
                            @Override // X.C0AG
                            public final void AKE(Exception exc) {
                                int i3;
                                C464026r c464026r3 = C464026r.this;
                                Log.e("requestHarmfulApps/onError", exc);
                                String message2 = exc.getMessage();
                                if (exc instanceof C08K) {
                                    i3 = ((C08K) exc).mStatus.A01;
                                } else {
                                    i3 = 500;
                                }
                                c464026r3.A01.A0N(null, i3, message2);
                            }
                        });
                        return true;
                    }
                    throw null;
                }
                C0EG c0eg2 = c464026r2.A01;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Google Play Services Unavailable. Connection result code: ");
                sb2.append(A022);
                c0eg2.A0N(null, 1001, sb2.toString());
                Log.i("requestHarmfulApps/Google APIs unavailable");
                return true;
            } else {
                return false;
            }
        }
    };

    /* JADX WARN: Type inference failed for: r0v0, types: [X.286] */
    public C464026r(C001200o c001200o, C0EG c0eg) {
        this.A00 = c001200o;
        this.A01 = c0eg;
    }
}
