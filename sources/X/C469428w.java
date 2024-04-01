package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.28w  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C469428w {
    public C29S A00;
    public C29T A01;
    public Long A02;
    public final AbstractC000600i A03;
    public final C41541u6 A04;
    public final AnonymousClass075 A05;
    public final C41691uM A06;
    public final C469228u A07;
    public final C0KQ A08;
    public final C469328v A09;
    public final C29R A0A;
    public final AnonymousClass012 A0C;
    public final C0CA A0D;
    public final C41401tr A0E;
    public final C0EC A0F;
    public final C05Y A0G;
    public final C0DW A0H;
    public final C0DV A0I;
    public final C29Q A0B = new C29Q() { // from class: X.29P
        @Override // X.C29Q
        public void AEK(String str, int i, int i2, long j) {
            C469428w c469428w = C469428w.this;
            c469428w.A02 = Long.valueOf(i2);
            StringBuilder sb = new StringBuilder("contactsyncmanager/handleSyncContactError/error sid=");
            sb.append(str);
            sb.append(" index=");
            sb.append(i);
            sb.append(" code=");
            sb.append(i2);
            sb.append(" backoff=");
            sb.append(j);
            Log.e(sb.toString());
            if (j > 0) {
                C000200d.A0d(c469428w.A08, "contact_sync_backoff", c469428w.A0C.A05() + j);
            }
        }

        @Override // X.C29Q
        public void AEL(String str, int i, C29T c29t) {
            List<Object> list;
            C469428w c469428w = C469428w.this;
            c469428w.A01 = c29t;
            C29L c29l = c29t.A00;
            C29N c29n = c29l.A01;
            C29N c29n2 = c29l.A05;
            C29N c29n3 = c29l.A06;
            C29N c29n4 = c29l.A04;
            C29N c29n5 = c29l.A00;
            C29N c29n6 = c29l.A02;
            C29N c29n7 = c29l.A03;
            StringBuilder sb = new StringBuilder("sync/result sid=");
            sb.append(str);
            sb.append(" index=");
            sb.append(i);
            sb.append(" users_count=");
            C29K[] c29kArr = c29t.A01;
            sb.append(c29kArr.length);
            sb.append(" version=");
            sb.append(c29l.A07);
            StringBuilder sb2 = new StringBuilder(sb.toString());
            if (c29n != null) {
                sb2.append(" contact=");
                sb2.append(c29n.toString());
                Long l = c29n.A02;
                if (l != null) {
                    C000200d.A0d(c469428w.A08, "contact_full_sync_wait", l.longValue());
                }
                Long l2 = c29n.A01;
                if (l2 != null) {
                    C000200d.A0d(c469428w.A08, "contact_sync_backoff", l2.longValue() + c469428w.A0C.A05());
                }
            }
            if (c29n2 != null) {
                sb2.append(" sidelist=");
                sb2.append(c29n2.toString());
                Long l3 = c29n2.A02;
                if (l3 != null) {
                    C000200d.A0d(c469428w.A08, "sidelist_full_sync_wait", l3.longValue());
                }
                Long l4 = c29n2.A01;
                if (l4 != null) {
                    C000200d.A0d(c469428w.A08, "sidelist_sync_backoff", l4.longValue() + c469428w.A0C.A05());
                }
            }
            if (c29n3 != null) {
                sb2.append(" status=");
                sb2.append(c29n3.toString());
                Long l5 = c29n3.A02;
                if (l5 != null) {
                    C000200d.A0d(c469428w.A08, "status_full_sync_wait", l5.longValue());
                }
                Long l6 = c29n3.A01;
                if (l6 != null) {
                    C000200d.A0d(c469428w.A08, "status_sync_backoff", l6.longValue() + c469428w.A0C.A05());
                }
            }
            if (c29n4 != null) {
                sb2.append(" picture=");
                sb2.append(c29n4.toString());
                Long l7 = c29n4.A02;
                if (l7 != null) {
                    C000200d.A0d(c469428w.A08, "picture_full_sync_wait", l7.longValue());
                }
                Long l8 = c29n4.A01;
                if (l8 != null) {
                    C000200d.A0d(c469428w.A08, "picture_sync_backoff", l8.longValue() + c469428w.A0C.A05());
                }
            }
            if (c29n5 != null) {
                sb2.append(" business=");
                sb2.append(c29n5.toString());
                Long l9 = c29n5.A02;
                if (l9 != null) {
                    C000200d.A0d(c469428w.A08, "business_full_sync_wait", l9.longValue());
                }
                Long l10 = c29n5.A01;
                if (l10 != null) {
                    C000200d.A0d(c469428w.A08, "business_sync_backoff", l10.longValue() + c469428w.A0C.A05());
                }
            }
            if (c29n6 != null) {
                sb2.append(" devices=");
                sb2.append(c29n6.toString());
                Long l11 = c29n6.A02;
                if (l11 != null) {
                    C000200d.A0d(c469428w.A08, "devices_full_sync_wait", l11.longValue());
                }
                Long l12 = c29n6.A01;
                if (l12 != null) {
                    C000200d.A0d(c469428w.A08, "devices_sync_backoff", l12.longValue() + c469428w.A0C.A05());
                }
            }
            if (c29n7 != null) {
                sb2.append(" payment=");
                sb2.append(c29n7.toString());
                Long l13 = c29n7.A02;
                if (l13 != null) {
                    C000200d.A0d(c469428w.A08, "payment_full_sync_wait", l13.longValue());
                }
                Long l14 = c29n7.A01;
                if (l14 != null) {
                    C000200d.A0d(c469428w.A08, "payment_sync_backoff", l14.longValue() + c469428w.A0C.A05());
                }
            }
            Log.i(sb2.toString());
            C469328v c469328v = c469428w.A09;
            HashSet A00 = c469328v.A00();
            for (C29K c29k : c29kArr) {
                int i2 = c29k.A03;
                if (i2 == 3) {
                    List list2 = c29k.A0A;
                    if (list2 == null) {
                        throw null;
                    }
                    A00.addAll(list2);
                } else {
                    if ((i2 == 1 || i2 == 2) && (list = c29k.A0A) != null) {
                        for (Object obj : list) {
                            c469428w.A0M.put(obj, c29k);
                        }
                    }
                    UserJid userJid = c29k.A07;
                    if (userJid != null) {
                        c469428w.A0K.put(userJid, c29k);
                    } else {
                        Log.w("sync/result/no-jid-found");
                    }
                }
            }
            if (c469328v != null) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(c469328v.A01.A00.getFilesDir(), "invalid_numbers"));
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                    try {
                        c469328v.A00 = A00;
                        objectOutputStream.writeObject(A00);
                        fileOutputStream.close();
                    } finally {
                    }
                } catch (IOException e) {
                    Log.e(e);
                }
            } else {
                throw null;
            }
        }

        @Override // X.C29Q
        public void AEM(String str, int i, int i2, long j) {
            C469428w c469428w = C469428w.this;
            c469428w.A02 = 1L;
            StringBuilder sb = new StringBuilder("contactsyncmanager/handleSyncSidelistError/error sid=");
            sb.append(str);
            sb.append(" index=");
            sb.append(i);
            sb.append(" code=");
            sb.append(i2);
            sb.append(" backoff=");
            sb.append(j);
            Log.e(sb.toString());
            if (j > 0) {
                C000200d.A0d(c469428w.A08, "sidelist_sync_backoff", c469428w.A0C.A05() + j);
            }
        }
    };
    public final Map A0M = new HashMap();
    public final Map A0K = new HashMap();
    public final Map A0J = new HashMap();
    public final Map A0L = new HashMap();

    public C469428w(C001200o c001200o, AnonymousClass012 anonymousClass012, AbstractC000600i abstractC000600i, C41541u6 c41541u6, C05Y c05y, C469328v c469328v, C02E c02e, C002301c c002301c, C0DV c0dv, C0EC c0ec, AnonymousClass075 anonymousClass075, C02F c02f, C000500h c000500h, C0CA c0ca, C41401tr c41401tr, C0DW c0dw, C41691uM c41691uM, C469228u c469228u, C0KQ c0kq) {
        this.A0C = anonymousClass012;
        this.A03 = abstractC000600i;
        this.A04 = c41541u6;
        this.A0G = c05y;
        this.A09 = c469328v;
        this.A0I = c0dv;
        this.A0F = c0ec;
        this.A05 = anonymousClass075;
        this.A0D = c0ca;
        this.A0E = c41401tr;
        this.A0H = c0dw;
        this.A06 = c41691uM;
        this.A07 = c469228u;
        this.A08 = c0kq;
        this.A0A = new C29R(c001200o, c469328v, c02e, c002301c, c02f, c000500h, c0kq);
    }

    public static final void A00(Map map, List list, Collection collection) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C06C c06c = (C06C) it.next();
            C04460Kg c04460Kg = c06c.A08;
            if (c04460Kg != null) {
                C29K c29k = (C29K) map.get(c04460Kg.A01);
                if (c29k == null) {
                    C000200d.A1O(C000200d.A0P("sync/phone-number/missing_response/"), c06c.A08.A01);
                } else {
                    int i = c29k.A03;
                    if (i == 0) {
                        C000200d.A1O(C000200d.A0P("sync/phone-number/unassigned/"), c06c.A08.A01);
                    } else {
                        boolean z = i == 1;
                        UserJid userJid = c29k.A07;
                        if (c06c.A0X != z || !AnonymousClass024.A0l(c06c.A02(), userJid)) {
                            c06c.A0X = z;
                            c06c.A09 = userJid;
                            if (collection != null) {
                                collection.add(c06c);
                            }
                        }
                    }
                }
            } else {
                throw null;
            }
        }
    }

    public final EnumC40721sl A01(InterfaceC04240Jk interfaceC04240Jk, String str) {
        C0HC c0hc = new C0HC(str);
        try {
            return (EnumC40721sl) interfaceC04240Jk.A5S(str);
        } catch (RuntimeException e) {
            Log.e("ContactSyncHelper/runAndHandleExceptions", e);
            this.A03.A09("ContactSyncHelper/runAndHandleExceptions", e.getMessage(), true);
            return EnumC40721sl.EXCEPTION;
        } finally {
            c0hc.A01();
        }
    }

    public final synchronized C29S A02() {
        C29S c29s;
        c29s = this.A00;
        if (c29s == null) {
            c29s = new C29S(this.A03, this.A0G, this.A0E.A08(), this.A0B);
            this.A00 = c29s;
        }
        return c29s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
        if (r4.A0W() == false) goto L101;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A03(java.util.List r11, java.util.List r12, java.util.List r13) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C469428w.A03(java.util.List, java.util.List, java.util.List):boolean");
    }

    public final boolean A04(Future future, String str, C05270Nz c05270Nz) {
        try {
            future.get(64000L, TimeUnit.MILLISECONDS);
            if (this.A01 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("/no result");
                Log.i(sb.toString());
                Long l = this.A02;
                if (l != null) {
                    c05270Nz.A08 = l;
                }
                return false;
            }
            return true;
        } catch (InterruptedException | TimeoutException unused) {
            return false;
        } catch (RuntimeException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("/exception");
            Log.e(sb2.toString(), e);
            this.A03.A09(str, e.getMessage(), true);
            return false;
        } catch (ExecutionException e2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append("/exception");
            Log.e(sb3.toString(), e2);
            if ((e2.getCause() instanceof RuntimeException) || ((e2.getCause() instanceof Error) && !(e2.getCause() instanceof AssertionError) && !(e2.getCause() instanceof OutOfMemoryError))) {
                this.A03.A09(str, e2.getMessage(), true);
                return false;
            }
            return false;
        }
    }
}
