package X;

import android.os.Message;
import android.os.SystemClock;
import com.google.android.search.verification.client.R;
import com.whatsapp.invites.ViewGroupInviteActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3DV  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3DV extends C0HS {
    public int A00;
    public C52622b3 A01;
    public final C02L A02;
    public final C05W A03;
    public final C018708s A04;
    public final C0C8 A05;
    public final C05Y A06;
    public final C0EG A07;
    public final C07700Zi A08;
    public final C04570Ky A09;
    public final WeakReference A0A;

    public C3DV(C02L c02l, C0EG c0eg, C05Y c05y, C05W c05w, C018708s c018708s, C0C8 c0c8, ViewGroupInviteActivity viewGroupInviteActivity, C04570Ky c04570Ky, C07700Zi c07700Zi) {
        this.A02 = c02l;
        this.A07 = c0eg;
        this.A06 = c05y;
        this.A03 = c05w;
        this.A04 = c018708s;
        this.A05 = c0c8;
        this.A0A = new WeakReference(viewGroupInviteActivity);
        this.A09 = c04570Ky;
        this.A08 = c07700Zi;
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        long elapsedRealtime;
        C0EG c0eg;
        C07700Zi c07700Zi;
        InterfaceC07690Zh interfaceC07690Zh;
        C010005b c010005b;
        Future A05;
        C06C A09;
        if (this.A09.A0n.A02) {
            C011005l A03 = C011005l.A03(this.A08.A01);
            if (A03 != null) {
                C05W c05w = this.A03;
                C06C A0A = c05w.A0A(A03);
                UserJid userJid = null;
                if (A03 != null && (A09 = c05w.A09(A03)) != null) {
                    userJid = A09.A0A;
                }
                C07D A052 = this.A05.A01(A03).A05();
                HashSet hashSet = new HashSet(A052.A00.size());
                Iterator it = A052.iterator();
                while (true) {
                    C04250Jl c04250Jl = (C04250Jl) it;
                    if (!c04250Jl.hasNext()) {
                        A0A(A03, userJid, this.A04.A08(A0A, false), hashSet, hashSet.size(), A0A.A0B);
                        return null;
                    }
                    hashSet.add(((C0D7) c04250Jl.next()).A03);
                }
            } else {
                throw null;
            }
        } else {
            try {
                this.A06.A08(32000L);
                elapsedRealtime = SystemClock.elapsedRealtime();
                c0eg = this.A07;
                c07700Zi = this.A08;
                interfaceC07690Zh = new InterfaceC07690Zh() { // from class: X.3DU
                    @Override // X.InterfaceC07690Zh
                    public void AJp(int i) {
                        C3DV.this.A00 = i;
                    }

                    @Override // X.InterfaceC07690Zh
                    public void AKt(C011005l c011005l, UserJid userJid2, long j, String str, long j2, String str2, Map map, int i, C04410Kb c04410Kb) {
                        C3DV.this.A0A(c011005l, userJid2, str, map.keySet(), i, c04410Kb);
                    }
                };
                c010005b = c0eg.A02;
            } catch (C1PZ unused) {
            }
            if (c010005b.A06 && c010005b.A02) {
                C05Y c05y = c0eg.A07;
                String A02 = c05y.A02();
                try {
                    A05 = c05y.A05(A02, Message.obtain(null, 0, 208, 0, new C07490Yk(A02, c07700Zi, interfaceC07690Zh)), false);
                } catch (C0S4 unused2) {
                }
                if (A05 != null) {
                    try {
                        A05.get(32000L, TimeUnit.MILLISECONDS);
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        if (elapsedRealtime2 < 500) {
                            SystemClock.sleep(500 - elapsedRealtime2);
                            return null;
                        }
                        return null;
                    } catch (Exception e) {
                        Log.w("ViewGroupInviteActivity/failed/timeout", e);
                        return null;
                    }
                }
            }
            Log.e("ViewGroupInviteActivity/failed/callback is null");
            return null;
        }
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        C06C A09;
        ViewGroupInviteActivity viewGroupInviteActivity = (ViewGroupInviteActivity) this.A0A.get();
        if (viewGroupInviteActivity != null) {
            C52622b3 c52622b3 = this.A01;
            int i = this.A00;
            if (c52622b3 != null) {
                viewGroupInviteActivity.A02.setVisibility(0);
                C2JZ c2jz = viewGroupInviteActivity.A0J;
                C07700Zi c07700Zi = viewGroupInviteActivity.A0O;
                if (c07700Zi != null) {
                    c2jz.A01(c52622b3, c07700Zi.A00 * 1000);
                    viewGroupInviteActivity.A03.setVisibility(8);
                    C07700Zi c07700Zi2 = viewGroupInviteActivity.A0O;
                    if (c07700Zi2 != null) {
                        if (viewGroupInviteActivity.A0S && (A09 = viewGroupInviteActivity.A09.A09(c07700Zi2.A01)) != null) {
                            viewGroupInviteActivity.A0B.A02(A09, viewGroupInviteActivity.A04);
                            return;
                        }
                        C0EG c0eg = viewGroupInviteActivity.A0N;
                        C07700Zi c07700Zi3 = viewGroupInviteActivity.A0O;
                        C2JY c2jy = new C2JY(viewGroupInviteActivity);
                        if (!c0eg.A02.A06 || !c0eg.A02.A02) {
                            return;
                        }
                        C05Y c05y = c0eg.A07;
                        String A02 = c05y.A02();
                        try {
                            c05y.A05(A02, Message.obtain(null, 0, 212, 0, new C07460Yh(A02, c07700Zi3, c2jy)), false);
                            return;
                        } catch (C0S4 unused) {
                            return;
                        }
                    }
                    return;
                }
                throw null;
            }
            viewGroupInviteActivity.A02.setVisibility(4);
            viewGroupInviteActivity.A03.setVisibility(4);
            if (i == 403) {
                viewGroupInviteActivity.A1P(R.string.group_info_fetch_invalid_invite);
            } else if (i != 404 && i != 406) {
                viewGroupInviteActivity.A1P(R.string.group_info_fetch_failure);
            } else {
                viewGroupInviteActivity.A1P(R.string.group_info_fetch_invalid_group);
            }
        }
    }

    public final void A0A(C011005l c011005l, UserJid userJid, String str, Collection collection, int i, C04410Kb c04410Kb) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C06C A09 = this.A03.A09((AbstractC005302j) it.next());
            if (A09 != null && A09.A08 != null) {
                arrayList.add(A09);
            }
        }
        final C02L c02l = this.A02;
        final C018708s c018708s = this.A04;
        Collections.sort(arrayList, new C61772wh(c02l, c018708s) { // from class: X.3DT
            @Override // X.C61772wh
            public int A00(C06C c06c, C06C c06c2) {
                String str2 = c06c.A0F;
                if (str2 != null || c06c2.A0F == null) {
                    if (str2 == null || c06c2.A0F != null) {
                        return super.compare(c06c, c06c2);
                    }
                    return -1;
                }
                return 1;
            }
        });
        this.A01 = new C52622b3(c011005l, userJid, str, arrayList, i, c04410Kb);
    }
}
