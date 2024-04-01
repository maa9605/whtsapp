package com.whatsapp.wamsys;

import X.AbstractC000600i;
import X.AbstractC19910wT;
import X.AnonymousClass011;
import X.AnonymousClass015;
import X.AnonymousClass024;
import X.C000200d;
import X.C002701i;
import X.C009304p;
import X.C01F;
import X.C01G;
import X.C01I;
import X.C01J;
import X.C01L;
import X.C01N;
import X.C01P;
import X.C01Q;
import X.C01R;
import X.C01S;
import X.C01T;
import X.C04X;
import X.C04o;
import X.C04r;
import X.C05000Mw;
import X.C05240Nw;
import X.C07920aJ;
import X.C0AZ;
import X.C0CD;
import X.C0CE;
import X.C0IO;
import X.C0IP;
import X.C0J1;
import X.C0OC;
import X.C0QS;
import X.C0XX;
import X.C0b9;
import X.C12560jg;
import X.C13260kr;
import X.C13510lN;
import X.C13520lO;
import X.C19920wU;
import X.C19980wa;
import X.C19990wb;
import X.C1RN;
import X.C1RP;
import X.C20020we;
import X.C27291Mu;
import X.C27301Mv;
import X.C27311Mw;
import X.InterfaceC19930wV;
import X.InterfaceC19940wW;
import android.database.Cursor;
import android.text.TextUtils;
import com.facebook.simplejni.NativeHolder;
import com.whatsapp.protocol.ProtocolJniHelper;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class JniBridge {
    public static volatile JniBridge INSTANCE;
    public final C04X jniBridgeExceptionHandler;
    public final AtomicReference wajContext = new AtomicReference();
    public C01F jniCallbacks = null;

    public static native double jvidispatchDIO(int i, long j, Object obj);

    public static native long jvidispatchI();

    public static native long jvidispatchIIDO(int i, long j, double d, Object obj);

    public static native long jvidispatchIIIIIIOOOOOOO(long j, long j2, long j3, long j4, long j5, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7);

    public static native long jvidispatchIIIIIOOOO(long j, long j2, long j3, long j4, Object obj, Object obj2, Object obj3, Object obj4);

    public static native long jvidispatchIIIIOOOOOOOOO(long j, long j2, long j3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9);

    public static native long jvidispatchIIIO(int i, long j, long j2, Object obj);

    public static native long jvidispatchIIIOO(long j, long j2, Object obj, Object obj2);

    public static native long jvidispatchIIO(int i, long j, Object obj);

    public static native long jvidispatchIIOO(int i, long j, Object obj, Object obj2);

    public static native long jvidispatchIIOOOO(int i, long j, Object obj, Object obj2, Object obj3, Object obj4);

    public static native long jvidispatchIIOOOOO(long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static native long jvidispatchIIOOOOOOOO(long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8);

    public static native long jvidispatchIO(int i, Object obj);

    public static native long jvidispatchIOO(Object obj, Object obj2);

    public static native long jvidispatchIOOO(Object obj, Object obj2, Object obj3);

    public static native long jvidispatchIOOOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7);

    public static native long jvidispatchIOOOOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8);

    public static native Object jvidispatchO();

    public static native Object jvidispatchOII(long j, long j2);

    public static native Object jvidispatchOIIIIIOOO(long j, long j2, long j3, long j4, long j5, Object obj, Object obj2, Object obj3);

    public static native Object jvidispatchOIIIOOOO(long j, long j2, long j3, Object obj, Object obj2, Object obj3, Object obj4);

    public static native Object jvidispatchOIIIOOOOO(long j, long j2, long j3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static native Object jvidispatchOIIO(int i, long j, long j2, Object obj);

    public static native Object jvidispatchOIIOO(long j, long j2, Object obj, Object obj2);

    public static native Object jvidispatchOIO(int i, long j, Object obj);

    public static native Object jvidispatchOIOO(int i, long j, Object obj, Object obj2);

    public static native Object jvidispatchOIOOO(int i, long j, Object obj, Object obj2, Object obj3);

    public static native Object jvidispatchOIOOOO(int i, long j, Object obj, Object obj2, Object obj3, Object obj4);

    public static native Object jvidispatchOIOOOOO(int i, long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static native Object jvidispatchOO(int i, Object obj);

    public static native Object jvidispatchOOO(int i, Object obj, Object obj2);

    public static native Object jvidispatchOOOO(int i, Object obj, Object obj2, Object obj3);

    public static native Object jvidispatchOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4);

    public static native Object jvidispatchOOOOOO(Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static native Object jvidispatchOOOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);

    public JniBridge(C04X c04x) {
        this.jniBridgeExceptionHandler = c04x;
    }

    public static JniBridge getInstance() {
        if (INSTANCE == null) {
            synchronized (JniBridge.class) {
                if (INSTANCE == null) {
                    if (C04X.A01 == null) {
                        synchronized (C04X.class) {
                            if (C04X.A01 == null) {
                                C04X.A01 = new C04X(AbstractC000600i.A00());
                            }
                        }
                    }
                    INSTANCE = new JniBridge(C04X.A01);
                }
            }
        }
        return INSTANCE;
    }

    public C01F getJniCallbacks(NativeHolder nativeHolder) {
        NativeHolder wajContext = getWajContext();
        if (wajContext != null && nativeHolder != null && !wajContext.isNativeEqual(nativeHolder) && this.jniCallbacks == null) {
            throw null;
        }
        return this.jniCallbacks;
    }

    public NativeHolder getWajContext() {
        return (NativeHolder) this.wajContext.get();
    }

    public void initWajContext() {
        AtomicReference atomicReference = this.wajContext;
        if (this.jniCallbacks != null) {
            NativeHolder nativeHolder = (NativeHolder) atomicReference.getAndSet(jvidispatchO());
            if (nativeHolder != null) {
                nativeHolder.release();
                return;
            }
            return;
        }
        throw null;
    }

    public static long jnidispatchI(int i) {
        try {
            if (i != 0) {
                if (i == 1 && INSTANCE.jniCallbacks == null) {
                    throw null;
                }
                return 0L;
            }
            return INSTANCE.jniCallbacks.A0A.A05() / 1000;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0L;
        }
    }

    public static long jnidispatchIIIIIIIIIIIIIOOOOO(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        try {
            ((AbstractC19910wT) obj5).A02((int) j, (int) j2, (int) j3, (String) obj, j6, (int) j4, (int) j5, j7, j8, j9, (String) obj2, (String) obj3, j10, j11, 0 != j12, (String) obj4);
            return 0L;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0L;
        }
    }

    public static long jnidispatchIIIIIIIIIIIOOOOOOO(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        try {
            ((AbstractC19910wT) obj7).A01((int) j, (int) j2, (int) j3, (String) obj, (int) j4, j6, (String) obj2, (String) obj3, j7, j8, j9, 0 != j10, (int) j5, (String) obj4, (String) obj5, (String) obj6);
            return 0L;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0L;
        }
    }

    public static long jnidispatchIIIIIIIIIIOOOOOOO(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        try {
            ((AbstractC19910wT) obj7).A04((int) j, (int) j2, (String) obj, (int) j3, j6, (String) obj2, (String) obj3, j7, j8, (String) obj4, (String) obj5, j9, (int) j4, (int) j5, (String) obj6);
            return 0L;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0L;
        }
    }

    public static long jnidispatchIIIIIIO(long j, long j2, long j3, long j4, long j5, Object obj) {
        try {
            C01F c01f = INSTANCE.jniCallbacks;
            final int i = (int) j;
            final byte[] bArr = (byte[]) obj;
            final int i2 = (int) j2;
            int i3 = (int) j3;
            int i4 = (int) j4;
            int i5 = (int) j5;
            if (c01f != null) {
                AnonymousClass015 anonymousClass015 = new AnonymousClass015(i3, i4, i5, false);
                final AnonymousClass011 anonymousClass011 = c01f.A0C;
                Integer A02 = anonymousClass011.A02(i, anonymousClass015, false);
                if (A02 != null) {
                    final int intValue = A02.intValue();
                    if (i2 != 2) {
                        anonymousClass011.A0F.A01.execute(new Runnable() { // from class: X.1PD
                            @Override // java.lang.Runnable
                            public final void run() {
                                AnonymousClass011 anonymousClass0112 = anonymousClass011;
                                int i6 = i2;
                                int i7 = i;
                                byte[] bArr2 = bArr;
                                int i8 = intValue;
                                if (i6 == 1) {
                                    if (anonymousClass0112.A0H()) {
                                        anonymousClass0112.A04.A03(i7, bArr2, i8);
                                        anonymousClass0112.A04.A01();
                                        anonymousClass0112.A04();
                                    }
                                } else if (!anonymousClass0112.A0F()) {
                                } else {
                                    anonymousClass0112.A05.A03(i7, bArr2, i8);
                                    anonymousClass0112.A05.A01();
                                    anonymousClass0112.A0E(false);
                                    anonymousClass0112.A00.A0C();
                                }
                            }
                        });
                        return 0L;
                    }
                    throw new UnsupportedOperationException("WamRuntime/logEvent hasn't implemented for privatestats yet");
                }
                return 0L;
            }
            throw null;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0L;
        }
    }

    public static long jnidispatchIIIIIIOOOOOOO(long j, long j2, long j3, long j4, long j5, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        try {
            ((AbstractC19910wT) obj7).A03((int) j, (int) j2, (int) j3, (String) obj, j4, (String) obj2, (String) obj3, j5, (String) obj4, (String) obj5, (String) obj6);
            return 0L;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0L;
        }
    }

    public static long jnidispatchIIIIO(int i, long j, long j2, long j3, Object obj) {
        try {
            if (i == 0) {
                ((InterfaceC19940wW) obj).AQt(j, j2, j3);
            } else if (i == 1) {
                ((InterfaceC19930wV) obj).AQt(j, j2, j3);
                return 0L;
            }
            return 0L;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0L;
        }
    }

    public static long jnidispatchIIIO(long j, long j2, Object obj) {
        try {
            ((AbstractC19910wT) obj).A00((int) j, (int) j2);
            return 0L;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0L;
        }
    }

    public static long jnidispatchIIO(int i, long j, Object obj) {
        try {
            if (i == 0) {
                ((InterfaceC19930wV) obj).A6M((int) j);
            } else if (i == 1) {
                return ((C0J1) obj).A77(j) ? 1L : 0L;
            } else if (i == 2) {
                int i2 = (int) j;
                C0CD A01 = INSTANCE.getJniCallbacks((NativeHolder) obj).A09.A00.A0D.A00.A01();
                Cursor A09 = A01.A02.A09("signed_prekeys", new String[]{"record"}, "prekey_id = ?", new String[]{String.valueOf(i2)}, null, "SignalSignedPreKeyStore/containsSignedPreKey");
                boolean moveToNext = A09.moveToNext();
                StringBuilder sb = new StringBuilder();
                sb.append("axolotl has a signed pre key with id ");
                sb.append(i2);
                sb.append(": ");
                sb.append(moveToNext);
                Log.i(sb.toString());
                A09.close();
                A01.close();
                return moveToNext ? 1L : 0L;
            } else if (i == 3) {
                int i3 = (int) j;
                C0CD A02 = INSTANCE.getJniCallbacks((NativeHolder) obj).A09.A00.A0D.A00.A02();
                C0CE c0ce = A02.A02;
                String[] strArr = {String.valueOf(i3)};
                StringBuilder sb2 = new StringBuilder();
                sb2.append("axolotl deleted ");
                sb2.append(c0ce.A01("signed_prekeys", "prekey_id = ?", strArr));
                sb2.append(" signed pre keys with id ");
                sb2.append(i3);
                Log.i(sb2.toString());
                A02.close();
                return 1L;
            } else if (i == 4) {
                int i4 = (int) j;
                C0CD A012 = INSTANCE.getJniCallbacks((NativeHolder) obj).A05.A00.A0A.A01.A01();
                Cursor A092 = A012.A02.A09("prekeys", new String[]{"record"}, "prekey_id = ?", new String[]{String.valueOf(i4)}, null, "SignalPreKeyStore/containsPreKey");
                boolean moveToNext2 = A092.moveToNext();
                A092.close();
                A012.close();
                StringBuilder sb3 = new StringBuilder("axolotl has a pre key with id ");
                sb3.append(i4);
                sb3.append(": ");
                sb3.append(moveToNext2);
                Log.i(sb3.toString());
                return moveToNext2 ? 1L : 0L;
            } else if (i == 5) {
                INSTANCE.getJniCallbacks((NativeHolder) obj).A05.A00.A0A.A02((int) j);
                return 1L;
            }
            return 0L;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0L;
        }
    }

    public static long jnidispatchIIOO(int i, long j, Object obj, Object obj2) {
        try {
            if (i == 0) {
                int i2 = (int) j;
                byte[] bArr = (byte[]) obj2;
                C01S c01s = INSTANCE.getJniCallbacks((NativeHolder) obj).A09;
                if (c01s != null) {
                    if (bArr == null || bArr.length <= 0) {
                        return 0L;
                    }
                    c01s.A00.A0D.A00(i2, bArr);
                    return 1L;
                }
                throw null;
            } else if (i == 1) {
                C01J c01j = INSTANCE.getJniCallbacks((NativeHolder) obj).A0B;
                c01j.A0H.A00();
                int i3 = (((int) j) % 16777214) + 1;
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : ((Map) obj2).entrySet()) {
                    arrayList.add(new C05000Mw(((Integer) entry.getKey()).intValue(), (byte[]) entry.getValue()));
                }
                c01j.A0T(arrayList, i3);
                return 0L;
            } else if (i == 2) {
                List list = (List) obj2;
                C01I c01i = INSTANCE.getJniCallbacks((NativeHolder) obj).A05;
                if (c01i != null) {
                    int[] iArr = new int[list.size()];
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        iArr[i4] = ((Integer) list.get(i4)).intValue();
                    }
                    c01i.A00.A0A.A03(iArr);
                    return 1L;
                }
                throw null;
            } else if (i != 3) {
                if (i != 4) {
                    return 0L;
                }
                C01N c01n = INSTANCE.getJniCallbacks((NativeHolder) obj2).A08;
                c01n.A00.A0C.A01(new C0IO((String) obj, (int) j));
                return 1L;
            } else {
                C01N c01n2 = INSTANCE.getJniCallbacks((NativeHolder) obj2).A08;
                C0IO c0io = new C0IO((String) obj, (int) j);
                C009304p c009304p = c01n2.A00.A0C;
                byte[] A03 = c009304p.A03(c0io);
                if (A03 != null) {
                    try {
                        C01J.A02(new C07920aJ(A03));
                        return 1L;
                    } catch (IOException unused) {
                        c009304p.A01(c0io);
                        return 0L;
                    }
                }
                return 0L;
            }
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0L;
        }
    }

    public static long jnidispatchIIOOO(int i, long j, Object obj, Object obj2, Object obj3) {
        try {
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0L;
        }
        if (i == 0) {
            if (INSTANCE.getJniCallbacks((NativeHolder) obj).A04 != null) {
                return 0L;
            }
            throw null;
        }
        if (i == 1) {
            byte[] bArr = (byte[]) obj3;
            C01Q c01q = INSTANCE.getJniCallbacks((NativeHolder) obj2).A04;
            C0IO c0io = new C0IO((String) obj, (int) j);
            if (bArr == null) {
                c01q.A00.A0L(c0io);
                return 1L;
            }
            try {
                c01q.A00.A0M(c0io, new C0IP(C002701i.A0S(bArr)));
                return 1L;
            } catch (C05240Nw e2) {
                Log.e("IdentityKeyStoreImpl/Could not save the identity key.", e2);
                return 0L;
            }
        } else if (i == 2) {
            INSTANCE.getJniCallbacks((NativeHolder) obj2);
            C04r.A00(new C0IO((String) obj, (int) j));
            return 1L;
        } else if (i != 3) {
            return 0L;
        } else {
            String str = (String) obj;
            int i2 = (int) j;
            byte[] bArr2 = (byte[]) obj3;
            C01N c01n = INSTANCE.getJniCallbacks((NativeHolder) obj2).A08;
            try {
                C01J.A02(new C07920aJ(bArr2));
                c01n.A00.A0C.A02(new C0IO(str, i2), bArr2);
                return 1L;
            } catch (IOException e3) {
                Log.e("sessionStoreImpl/invalid-session-record", e3);
                return 0L;
            }
        }
        INSTANCE.jniBridgeExceptionHandler.A00(e);
        return 0L;
    }

    public static long jnidispatchIIOOOO(int i, long j, Object obj, Object obj2, Object obj3, Object obj4) {
        try {
            if (i == 0) {
                byte[] bArr = (byte[]) obj4;
                C01P c01p = INSTANCE.getJniCallbacks((NativeHolder) obj3).A07;
                C0QS c0qs = new C0QS((String) obj, new C0IO((String) obj2, (int) j));
                if (bArr == null) {
                    c01p.A00.A0Q(c0qs);
                    return 1L;
                }
                c01p.A00.A0S(c0qs, bArr);
                return 1L;
            } else if (i != 1) {
                return 0L;
            } else {
                byte[] bArr2 = (byte[]) obj4;
                C01T c01t = INSTANCE.getJniCallbacks((NativeHolder) obj3).A03;
                C0QS c0qs2 = new C0QS((String) obj, new C0IO((String) obj2, (int) j));
                if (bArr2 == null) {
                    c01t.A00.A0P(c0qs2);
                    return 1L;
                }
                c01t.A00.A0R(c0qs2, bArr2);
                return 1L;
            }
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0L;
        }
    }

    public static long jnidispatchIIOOOOOOOOO(long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        try {
            ((InterfaceC19940wW) obj3).A6N((int) j, (String) obj, (String) obj2, (byte[]) obj4, (byte[]) obj5, (byte[]) obj6, (byte[]) obj7, (byte[]) obj8, (byte[]) obj9);
            return 0L;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0L;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static long jnidispatchIO(int i, Object obj) {
        try {
            switch (i) {
                case 0:
                    if (INSTANCE.jniCallbacks == null) {
                        throw null;
                    }
                    break;
                case 1:
                    return !((InterfaceC19940wW) obj).AF6() ? 0L : 1L;
                case 2:
                    return !((InterfaceC19930wV) obj).AF6() ? 0L : 1L;
                case 3:
                    return INSTANCE.getJniCallbacks((NativeHolder) obj).A04.A00.A08.A02();
                case 4:
                    return INSTANCE.getJniCallbacks((NativeHolder) obj).A09.A00.A0D().A00.A01;
                case 5:
                    return INSTANCE.getJniCallbacks((NativeHolder) obj).A05.A00.A0A.A00();
                case 6:
                    return INSTANCE.getJniCallbacks((NativeHolder) obj).A05.A00.A08.A01();
                case 7:
                    return INSTANCE.jniCallbacks.A0D.getTypeFromKeyValue(obj);
            }
            return 0L;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0L;
        }
    }

    public static long jnidispatchIOO(int i, Object obj, Object obj2) {
        try {
            if (i == 0) {
                return !((C0J1) obj).AS8(new C19920wU((NativeHolder) obj2)) ? 0L : 1L;
            } else if (i != 1) {
                return 0L;
            } else {
                String str = (String) obj;
                C0CD A02 = INSTANCE.getJniCallbacks((NativeHolder) obj2).A08.A00.A0C.A00.A02();
                StringBuilder sb = new StringBuilder();
                sb.append("axolotl deleted ");
                sb.append(A02.A02.A01("sessions", "recipient_id = ?", new String[]{str}));
                sb.append(" sessions with ");
                sb.append(AnonymousClass024.A0J(str, 4));
                Log.i(sb.toString());
                A02.close();
                return 1L;
            }
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0L;
        }
    }

    public static long jnidispatchIOOO(Object obj, Object obj2, Object obj3) {
        long j = 0;
        try {
            byte[] bArr = (byte[]) obj3;
            C0OC c0oc = (C0OC) obj;
            INSTANCE.getJniCallbacks((NativeHolder) obj2).A01.A00.A0H.A00();
            if (c0oc != null) {
                c0oc.AEI(bArr);
                j = 1;
                return 1L;
            }
            return 0L;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return j;
        }
    }

    public static Object jnidispatchOI(long j) {
        try {
            int i = (int) j;
            if (INSTANCE.jniCallbacks.A06 != null) {
                try {
                    byte[] bArr = new byte[i];
                    SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr);
                    return bArr;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            throw null;
        } catch (Exception e2) {
            INSTANCE.jniBridgeExceptionHandler.A00(e2);
            return null;
        }
    }

    public static Object jnidispatchOIO(int i, long j, Object obj) {
        try {
            if (i == 0) {
                int i2 = (int) j;
                byte[] A01 = INSTANCE.getJniCallbacks((NativeHolder) obj).A09.A00.A0D.A01(i2);
                if (A01 == null) {
                    C000200d.A0p("no signed prekey available with id ", i2);
                    return null;
                }
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("axolotl loaded a signed pre key with id ");
                    sb.append(i2);
                    Log.i(sb.toString());
                    C0AZ.A03(C0XX.A06, A01);
                    return A01;
                } catch (IOException e) {
                    StringBuilder sb2 = new StringBuilder("failed to parse signed pre key record during load for id ");
                    sb2.append(i2);
                    Log.e(sb2.toString(), e);
                    return null;
                }
            } else if (i != 1) {
                if (i != 2) {
                    return null;
                }
                int i3 = (int) j;
                C01I c01i = INSTANCE.getJniCallbacks((NativeHolder) obj).A05;
                if (i3 > 0) {
                    List A012 = c01i.A00.A0A.A01();
                    HashMap hashMap = new HashMap();
                    Iterator it = ((ArrayList) A012).iterator();
                    while (it.hasNext()) {
                        C05000Mw c05000Mw = (C05000Mw) it.next();
                        hashMap.put(Integer.valueOf(c05000Mw.A00), c05000Mw.A01);
                        if (hashMap.size() == i3) {
                            break;
                        }
                    }
                    return hashMap;
                }
                return null;
            } else {
                int i4 = (int) j;
                C04o c04o = INSTANCE.getJniCallbacks((NativeHolder) obj).A05.A00.A0A;
                byte[] A04 = c04o.A04(i4);
                if (A04 != null) {
                    try {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("axolotl found a pre key with id ");
                        sb3.append(i4);
                        Log.i(sb3.toString());
                        C01J.A01(i4, A04);
                        return A04;
                    } catch (IOException e2) {
                        StringBuilder sb4 = new StringBuilder("error reading prekey ");
                        sb4.append(i4);
                        sb4.append("; deleting");
                        Log.e(sb4.toString(), e2);
                        c04o.A02(i4);
                        return null;
                    }
                }
                return null;
            }
        } catch (Exception e3) {
            INSTANCE.jniBridgeExceptionHandler.A00(e3);
            return null;
        }
        INSTANCE.jniBridgeExceptionHandler.A00(e3);
        return null;
    }

    public static Object jnidispatchOIOO(int i, long j, Object obj, Object obj2) {
        try {
            if (i == 0) {
                C19920wU AG9 = ((C0J1) obj2).AG9((String) obj, (int) j);
                if (AG9 != null) {
                    return AG9.A00;
                }
                return null;
            } else if (i == 1) {
                C01Q c01q = INSTANCE.getJniCallbacks((NativeHolder) obj2).A04;
                C0IP A0A = c01q.A00.A0A(new C0IO((String) obj, (int) j));
                if (A0A != null) {
                    return A0A.A00.A00();
                }
                return null;
            } else if (i != 2) {
                return null;
            } else {
                C01N c01n = INSTANCE.getJniCallbacks((NativeHolder) obj2).A08;
                C0IO c0io = new C0IO((String) obj, (int) j);
                C009304p c009304p = c01n.A00.A0C;
                byte[] A03 = c009304p.A03(c0io);
                if (A03 != null) {
                    try {
                        C01J.A02(new C07920aJ(A03));
                        return A03;
                    } catch (IOException unused) {
                        c009304p.A01(c0io);
                        return null;
                    }
                }
                return null;
            }
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return null;
        }
    }

    public static Object jnidispatchOIOOO(int i, long j, Object obj, Object obj2, Object obj3) {
        try {
            if (i == 0) {
                C01P c01p = INSTANCE.getJniCallbacks((NativeHolder) obj3).A07;
                C27311Mw A00 = c01p.A00.A0B.A00(new C0QS((String) obj, new C0IO((String) obj2, (int) j)));
                C20020we c20020we = null;
                if (A00 != null) {
                    try {
                        byte[] bArr = A00.A01;
                        LinkedList linkedList = new LinkedList();
                        for (C12560jg c12560jg : ((C13260kr) C0AZ.A03(C13260kr.A01, bArr)).A00) {
                            linkedList.add(new C1RP(c12560jg));
                        }
                        c20020we = new C20020we(bArr, A00.A00);
                    } catch (IOException e) {
                        Log.e("SenderKeyStoreImpl/loadSenderKeyImpl", e);
                    }
                }
                if (c20020we != null) {
                    return c20020we.A00;
                }
                return null;
            } else if (i != 1) {
                if (i != 2) {
                    return null;
                }
                byte b = (byte) j;
                return INSTANCE.jniCallbacks.A0D.createKeyValue((String) obj, (String) obj2, obj3, b);
            } else {
                C01T c01t = INSTANCE.getJniCallbacks((NativeHolder) obj3).A03;
                C27291Mu A002 = c01t.A00.A07.A00(new C0QS((String) obj, new C0IO((String) obj2, (int) j)));
                C19980wa c19980wa = null;
                if (A002 != null) {
                    try {
                        byte[] bArr2 = A002.A01;
                        LinkedList linkedList2 = new LinkedList();
                        for (C13510lN c13510lN : ((C13520lO) C0AZ.A03(C13520lO.A01, bArr2)).A00) {
                            linkedList2.add(new C1RN(c13510lN));
                        }
                        c19980wa = new C19980wa(bArr2, A002.A00);
                    } catch (IOException e2) {
                        Log.e("FastRatchetSenderKeyStoreImpl/loadFastRatchetSenderKeyImpl", e2);
                    }
                }
                if (c19980wa != null) {
                    return c19980wa.A00;
                }
                return null;
            }
        } catch (Exception e3) {
            INSTANCE.jniBridgeExceptionHandler.A00(e3);
            return null;
        }
        INSTANCE.jniBridgeExceptionHandler.A00(e3);
        return null;
    }

    public static Object jnidispatchOO(int i, Object obj) {
        C0b9 c0b9;
        C19990wb c19990wb;
        C27301Mv c27301Mv;
        try {
            switch (i) {
                case 0:
                    String str = (String) obj;
                    C01G c01g = INSTANCE.jniCallbacks.A02;
                    if (TextUtils.isEmpty(str)) {
                        return null;
                    }
                    try {
                        InetAddress[] inetAddressArr = c01g.A00.A01(str).A04;
                        Arrays.toString(inetAddressArr);
                        ArrayList arrayList = new ArrayList();
                        for (InetAddress inetAddress : inetAddressArr) {
                            arrayList.add(inetAddress.getHostAddress());
                        }
                        return arrayList;
                    } catch (UnknownHostException unused) {
                        return null;
                    }
                case 1:
                    C01L c01l = INSTANCE.getJniCallbacks((NativeHolder) obj).A00.A00;
                    synchronized (c01l) {
                        c0b9 = c01l.A02().A01;
                        if (c0b9 == null) {
                            throw new RuntimeException("AuthKeyStore/failed to get client static key pair");
                        }
                    }
                    byte[] bArr = c0b9.A01.A01;
                    int length = bArr.length;
                    if (length != 32) {
                        C000200d.A1G(C000200d.A0P("AuthKeyStoreImpl/the key length is not expected/privateLength="), length);
                        return null;
                    }
                    return bArr;
                case 2:
                    if (INSTANCE.jniCallbacks != null) {
                        final C01Q c01q = INSTANCE.getJniCallbacks((NativeHolder) obj).A04;
                        C01R c01r = c01q.A01;
                        if (c01r.A01()) {
                            c27301Mv = c01q.A00.A08.A03();
                        } else {
                            try {
                                c27301Mv = (C27301Mv) c01r.A00.submit(new Callable() { // from class: X.0wS
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        return c01q.A00.A08.A03();
                                    }
                                }).get();
                            } catch (InterruptedException | ExecutionException unused2) {
                                Log.e("IdentityKeyStoreImpl/loadIdentityPublicKey thread interrupted");
                                c19990wb = null;
                            }
                        }
                        c19990wb = new C19990wb(c27301Mv.A01, c27301Mv.A00);
                        if (c19990wb != null) {
                            return c19990wb.A00;
                        }
                        return null;
                    }
                    throw null;
                case 3:
                    return INSTANCE.getJniCallbacks((NativeHolder) obj).A09.A00.A0D().A00.A0B();
                case 4:
                    return INSTANCE.jniCallbacks.A0D.getTagFromProtocolTreeNode(obj);
                case 5:
                    Object[] attributesFromProtocolTreeNode = INSTANCE.jniCallbacks.A0D.getAttributesFromProtocolTreeNode(obj);
                    if (attributesFromProtocolTreeNode != null) {
                        return Arrays.asList(attributesFromProtocolTreeNode);
                    }
                    return null;
                case 6:
                    Object[] childrenFromProtocolTreeNode = INSTANCE.jniCallbacks.A0D.getChildrenFromProtocolTreeNode(obj);
                    if (childrenFromProtocolTreeNode != null) {
                        return Arrays.asList(childrenFromProtocolTreeNode);
                    }
                    return null;
                case 7:
                    return INSTANCE.jniCallbacks.A0D.getDataFromProtocolTreeNode(obj);
                case 8:
                    return INSTANCE.jniCallbacks.A0D.getKeyFromKeyValue(obj);
                case 9:
                    return INSTANCE.jniCallbacks.A0D.getValueStringFromKeyValue(obj);
                case 10:
                    return INSTANCE.jniCallbacks.A0D.createNewJid((String) obj);
                default:
                    return null;
            }
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return null;
        }
    }

    public static Object jnidispatchOOO(Object obj, Object obj2) {
        try {
            Map map = (Map) obj2;
            C01N c01n = INSTANCE.getJniCallbacks((NativeHolder) obj).A08;
            if (map != null) {
                ArrayList arrayList = new ArrayList();
                for (Integer num : map.keySet()) {
                    int intValue = num.intValue();
                    Object obj3 = map.get(Integer.valueOf(intValue));
                    if (obj3 == null) {
                        throw null;
                    }
                    arrayList.add(new C0IO((String) obj3, intValue));
                }
                Set A0H = c01n.A00.A0H(arrayList);
                HashMap hashMap = new HashMap();
                Iterator it = ((HashSet) A0H).iterator();
                while (it.hasNext()) {
                    C0IO c0io = (C0IO) it.next();
                    hashMap.put(Integer.valueOf(c0io.A00), c0io.A01);
                }
                return hashMap;
            }
            return null;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return null;
        }
    }

    public static Object jnidispatchOOOOO(Object obj, Object obj2, Object obj3, Object obj4) {
        Object[] objArr;
        try {
            String str = (String) obj;
            List list = (List) obj3;
            List list2 = (List) obj4;
            byte[] bArr = (byte[]) obj2;
            ProtocolJniHelper protocolJniHelper = INSTANCE.jniCallbacks.A0D;
            Object[] array = list != null ? list.toArray() : null;
            if (list2 == null) {
                objArr = null;
            } else {
                objArr = list2.toArray();
            }
            return protocolJniHelper.createProtocolTreeNode(str, array, objArr, bArr);
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return null;
        }
    }

    public byte[] modelGetByteArray(NativeHolder nativeHolder, int i) {
        return (byte[]) jvidispatchOIO(0, i, nativeHolder);
    }

    public int modelGetInt(NativeHolder nativeHolder, int i) {
        return (int) jvidispatchIIO(1, i, nativeHolder);
    }
}
