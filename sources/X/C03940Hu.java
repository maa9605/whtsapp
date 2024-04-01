package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.HashMap;

/* renamed from: X.0Hu  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C03940Hu {
    public static volatile C03940Hu A04;
    public final Handler A00;
    public final C010005b A01;
    public final C05Y A02;
    public final HashMap A03 = new HashMap();

    public C03940Hu(C05Y c05y, C010005b c010005b) {
        final Looper mainLooper = Looper.getMainLooper();
        this.A00 = new Handler(mainLooper) { // from class: X.0IS
            public final HashMap A00 = new HashMap();

            public final void A00(AbstractC005302j abstractC005302j, boolean z) {
                if (hasMessages(0, abstractC005302j) || hasMessages(3, abstractC005302j)) {
                    return;
                }
                if (!hasMessages(2, abstractC005302j)) {
                    C03940Hu c03940Hu = C03940Hu.this;
                    if (c03940Hu.A01.A06 && (z || hasMessages(5, abstractC005302j))) {
                        c03940Hu.A02.A09(Message.obtain(null, 0, 5, 0, abstractC005302j));
                    }
                }
                removeMessages(4, abstractC005302j);
                removeMessages(5, abstractC005302j);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 0) {
                    Object obj = message.obj;
                    int i2 = message.arg1 == 1 ? 1 : 0;
                    int i3 = message.arg2;
                    if (hasMessages(1, obj) || hasMessages(4, obj)) {
                        return;
                    }
                    removeMessages(0, obj);
                    if (!hasMessages(2, obj) && !hasMessages(5, obj)) {
                        C03940Hu c03940Hu = C03940Hu.this;
                        if (c03940Hu.A01.A06) {
                            if (i2 != 0) {
                                c03940Hu.A02.A09(Message.obtain(null, 0, 4, i3, obj));
                            }
                            this.A00.put(obj, Long.valueOf(System.currentTimeMillis()));
                        }
                    } else {
                        HashMap hashMap = this.A00;
                        Number number = (Number) hashMap.get(obj);
                        long currentTimeMillis = System.currentTimeMillis();
                        if (number != null && currentTimeMillis - number.longValue() > 10000) {
                            C03940Hu c03940Hu2 = C03940Hu.this;
                            if (c03940Hu2.A01.A06) {
                                if (i2 != 0) {
                                    c03940Hu2.A02.A09(Message.obtain(null, 0, 4, i3, obj));
                                }
                                hashMap.put(obj, Long.valueOf(currentTimeMillis));
                            }
                        }
                    }
                    removeMessages(2, obj);
                    sendMessageDelayed(obtainMessage(2, i2, 0, obj), 2500L);
                } else if (i == 1 || i == 2) {
                    Object obj2 = message.obj;
                    boolean z = message.arg1 == 1;
                    if (hasMessages(0, obj2) || hasMessages(3, obj2)) {
                        return;
                    }
                    if (!hasMessages(5, obj2)) {
                        C03940Hu c03940Hu3 = C03940Hu.this;
                        if (c03940Hu3.A01.A06 && z) {
                            c03940Hu3.A02.A09(Message.obtain(null, 0, 5, 0, obj2));
                        }
                    }
                    removeMessages(1, obj2);
                    removeMessages(2, obj2);
                } else if (i != 3) {
                    if (i == 4) {
                        A00((AbstractC005302j) message.obj, false);
                    } else if (i == 5) {
                        A00((AbstractC005302j) message.obj, true);
                    }
                } else {
                    Object obj3 = message.obj;
                    int i4 = message.arg2;
                    if (hasMessages(1, obj3) || hasMessages(4, obj3)) {
                        return;
                    }
                    if (!hasMessages(2, obj3)) {
                        C03940Hu c03940Hu4 = C03940Hu.this;
                        if (c03940Hu4.A01.A06) {
                            c03940Hu4.A02.A09(Message.obtain(null, 0, 4, i4, obj3));
                        }
                    }
                    sendMessageDelayed(obtainMessage(5, 0, 0, obj3), 30000L);
                }
            }
        };
        this.A02 = c05y;
        this.A01 = c010005b;
    }

    public static C03940Hu A00() {
        if (A04 == null) {
            synchronized (C03940Hu.class) {
                if (A04 == null) {
                    A04 = new C03940Hu(C05Y.A01(), C010005b.A07);
                }
            }
        }
        return A04;
    }

    public final AbstractC005302j A01(AbstractC005302j abstractC005302j) {
        HashMap hashMap = this.A03;
        AbstractC005302j abstractC005302j2 = (AbstractC005302j) hashMap.get(abstractC005302j);
        if (abstractC005302j2 != null) {
            return abstractC005302j2;
        }
        hashMap.put(abstractC005302j, abstractC005302j);
        return abstractC005302j;
    }
}
