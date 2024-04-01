package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.logger.Logger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/* renamed from: X.0wr */
/* loaded from: classes.dex */
public class HandlerC20130wr extends Handler {
    public final C20100wo A00;
    public final C1YO A01;
    public final HashSet A02;
    public final Random A03;

    public HandlerC20130wr(C1YO c1yo, Looper looper) {
        super(looper);
        this.A01 = c1yo;
        this.A02 = new HashSet();
        this.A00 = new C20100wo();
        this.A03 = new Random();
    }

    public synchronized void A00(C20180wy c20180wy) {
        HashSet hashSet = this.A02;
        if (hashSet.contains(Long.valueOf(c20180wy.A05))) {
            sendMessage(obtainMessage(3, c20180wy));
            hashSet.remove(Long.valueOf(c20180wy.A05));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Aborted trace ");
        sb.append(c20180wy.A0A);
        sb.append(" for reason ");
        int i = c20180wy.A00;
        sb.append(Integer.MAX_VALUE & i);
        sb.append((i & EditorInfoCompat.IME_FLAG_FORCE_ASCII) == Integer.MIN_VALUE ? " (remote process)" : "");
        Log.d("Profilo/TraceControlThread", sb.toString());
    }

    public synchronized void A01(C20180wy c20180wy) {
        HashSet hashSet = this.A02;
        if (hashSet.contains(Long.valueOf(c20180wy.A05))) {
            sendMessage(obtainMessage(2, c20180wy));
            hashSet.remove(Long.valueOf(c20180wy.A05));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Stopped trace ");
        sb.append(c20180wy.A0A);
        Log.d("Profilo/TraceControlThread", sb.toString());
    }

    public synchronized void A02(C20180wy c20180wy, int i) {
        int i2;
        ArrayList arrayList;
        AbstractC20060wj[] abstractC20060wjArr;
        synchronized (this.A00) {
            C20100wo c20100wo = this.A00;
            if (c20100wo != null) {
                C20090wn c20090wn = new C20090wn(c20180wy);
                if (c20090wn.A01) {
                    c20100wo.A00.put(c20180wy.A05, c20090wn);
                }
            } else {
                throw null;
            }
        }
        this.A02.add(Long.valueOf(c20180wy.A05));
        if (this.A01 != null) {
            C1YO c1yo = this.A01;
            synchronized (TraceEvents.class) {
                if (TraceEvents.sInitialized) {
                    C20070wk c20070wk = ProvidersRegistry.A00;
                    ArrayList arrayList2 = c20070wk.A01;
                    int A00 = c20070wk.A00(arrayList2);
                    if (A00 != TraceEvents.sLastNameRefreshProvidersState) {
                        TraceEvents.sLastNameRefreshProvidersState = A00;
                        synchronized (arrayList2) {
                            arrayList = new ArrayList(arrayList2);
                        }
                        int size = arrayList.size();
                        int[] iArr = new int[size];
                        String[] strArr = new String[size];
                        Iterator it = arrayList.iterator();
                        int i3 = 0;
                        while (it.hasNext()) {
                            String str = (String) it.next();
                            strArr[i3] = str;
                            iArr[i3] = ProvidersRegistry.A00.A01(str);
                            i3++;
                        }
                        TraceEvents.nativeRefreshProviderNames(iArr, strArr);
                    }
                } else {
                    throw new IllegalStateException("Native library is not initialized.");
                }
            }
            int i4 = c20180wy.A02;
            synchronized (TraceEvents.class) {
                TraceEvents.sProviders = TraceEvents.nativeEnableProviders(i4);
            }
            synchronized (c1yo) {
                abstractC20060wjArr = c1yo.A03;
            }
            synchronized (c1yo.A05) {
                for (AbstractC20060wj abstractC20060wj : abstractC20060wjArr) {
                    if ((abstractC20060wj.getSupportedProviders() & TraceEvents.sProviders) != 0) {
                        abstractC20060wj.A00();
                        abstractC20060wj.A01(c20180wy);
                        abstractC20060wj.onTraceStarted(c20180wy, c1yo);
                    }
                }
            }
        }
        sendMessage(obtainMessage(1, c20180wy));
        sendMessageDelayed(obtainMessage(0, c20180wy), i);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        AbstractC20060wj[] abstractC20060wjArr;
        AbstractC20060wj[] abstractC20060wjArr2;
        int i;
        C20080wm c20080wm;
        AbstractC20060wj[] abstractC20060wjArr3;
        int i2;
        AbstractC20060wj[] abstractC20060wjArr4;
        AbstractC20060wj[] abstractC20060wjArr5;
        C20180wy c20180wy = (C20180wy) message.obj;
        switch (message.what) {
            case 0:
                long j = c20180wy.A05;
                StringBuilder sb = new StringBuilder("Timing out trace ");
                sb.append(j);
                Log.d("Profilo/TraceControlThread", sb.toString());
                C20120wq c20120wq = C20120wq.A07;
                if (c20120wq.A01(j) == null) {
                    return;
                }
                Logger.postFinishTrace(42, j);
                c20120wq.A04(j, 4);
                return;
            case 1:
                StringBuilder A0P = C000200d.A0P("Started trace ");
                A0P.append(c20180wy.A0A);
                A0P.append("  for controller ");
                A0P.append(c20180wy.A01);
                Log.d("Profilo/TraceControlThread", A0P.toString());
                C1YO c1yo = this.A01;
                if (c1yo == null) {
                    return;
                }
                C39101pZ c39101pZ = c1yo.A04;
                c39101pZ.APo(c20180wy);
                synchronized (c1yo) {
                    abstractC20060wjArr3 = c1yo.A02;
                }
                for (AbstractC20060wj abstractC20060wj : abstractC20060wjArr3) {
                    if ((abstractC20060wj.getSupportedProviders() & TraceEvents.sProviders) != 0) {
                        abstractC20060wj.A00();
                        abstractC20060wj.A01(c20180wy);
                        abstractC20060wj.onTraceStarted(c20180wy, c1yo);
                    }
                }
                c39101pZ.ANS();
                return;
            case 2:
                synchronized (this) {
                    removeMessages(0, c20180wy);
                    if ((c20180wy.A03 & 2) != 0) {
                        long j2 = c20180wy.A05;
                        if (Logger.sInitialized) {
                            Logger.startWorkerThreadIfNecessary();
                            Logger.loggerWriteAndWakeupTraceWriter(Logger.sTraceWriter, j2, 41, 0, 0, j2);
                        }
                    }
                    sendMessageDelayed(obtainMessage(4, c20180wy), c20180wy.A07.A00("trace_config.post_trace_extension_ms", 0));
                }
                return;
            case 3:
                synchronized (this) {
                    removeMessages(0, c20180wy);
                }
                C1YO c1yo2 = this.A01;
                if (c1yo2 == null) {
                    return;
                }
                synchronized (c1yo2) {
                    abstractC20060wjArr4 = c1yo2.A02;
                    abstractC20060wjArr5 = c1yo2.A03;
                }
                c1yo2.A04.APl(c20180wy);
                int i3 = c20180wy.A02;
                synchronized (TraceEvents.class) {
                    TraceEvents.sProviders = TraceEvents.nativeDisableProviders(i3);
                }
                synchronized (c1yo2.A05) {
                    for (AbstractC20060wj abstractC20060wj2 : abstractC20060wjArr5) {
                        if (abstractC20060wj2.A00 != 0) {
                            abstractC20060wj2.A00();
                            abstractC20060wj2.onTraceEnded(c20180wy, c1yo2);
                            abstractC20060wj2.A01(c20180wy);
                        }
                    }
                }
                for (AbstractC20060wj abstractC20060wj3 : abstractC20060wjArr4) {
                    if (abstractC20060wj3.A00 != 0) {
                        abstractC20060wj3.A00();
                        abstractC20060wj3.onTraceEnded(c20180wy, c1yo2);
                        abstractC20060wj3.A01(c20180wy);
                    }
                }
                return;
            case 4:
                C1YO c1yo3 = this.A01;
                if (c1yo3 != null) {
                    synchronized (c1yo3) {
                        abstractC20060wjArr = c1yo3.A02;
                        abstractC20060wjArr2 = c1yo3.A03;
                    }
                    if (c1yo3.A09) {
                        C1YM c1ym = c20180wy.A06;
                        Logger.writeStandardEntry(0, 7, 52, 0L, 0, 8126470, 0, 0L);
                    }
                    int i4 = 0;
                    for (AbstractC20060wj abstractC20060wj4 : abstractC20060wjArr) {
                        i4 |= (abstractC20060wj4.A02 == null || abstractC20060wj4.A03) ? abstractC20060wj4.getTracingProviders() : 0;
                    }
                    for (AbstractC20060wj abstractC20060wj5 : abstractC20060wjArr2) {
                        i4 |= (abstractC20060wj5.A02 == null || abstractC20060wj5.A03) ? abstractC20060wj5.getTracingProviders() : 0;
                    }
                    int i5 = c20180wy.A02;
                    synchronized (TraceEvents.class) {
                        TraceEvents.sProviders = TraceEvents.nativeDisableProviders(i5);
                    }
                    synchronized (c1yo3.A05) {
                        for (AbstractC20060wj abstractC20060wj6 : abstractC20060wjArr2) {
                            if (abstractC20060wj6.A00 != 0) {
                                abstractC20060wj6.A00();
                                abstractC20060wj6.onTraceEnded(c20180wy, c1yo3);
                                abstractC20060wj6.A01(c20180wy);
                            }
                        }
                    }
                    for (AbstractC20060wj abstractC20060wj7 : abstractC20060wjArr) {
                        if (abstractC20060wj7.A00 != 0) {
                            abstractC20060wj7.A00();
                            abstractC20060wj7.onTraceEnded(c20180wy, c1yo3);
                            abstractC20060wj7.A01(c20180wy);
                        }
                    }
                    C39101pZ c39101pZ2 = c1yo3.A04;
                    c39101pZ2.ANT(i4);
                    c39101pZ2.APp(c20180wy);
                }
                Logger.postFinishTrace(39, c20180wy.A05);
                return;
            case 5:
                long j3 = message.arg1;
                C20100wo c20100wo = this.A00;
                synchronized (c20100wo) {
                    C20090wn c20090wn = (C20090wn) c20100wo.A00.get(c20180wy.A05);
                    if (c20090wn != null) {
                        C20080wm c20080wm2 = c20090wn.A00;
                        if (c20080wm2 != null) {
                            if (j3 > c20080wm2.A00) {
                                c20080wm2.A00 = j3;
                            }
                        } else {
                            throw new IllegalStateException("We should have set a duration");
                        }
                    }
                }
                return;
            case 6:
                C20100wo c20100wo2 = this.A00;
                synchronized (c20100wo2) {
                    C20090wn c20090wn2 = (C20090wn) c20100wo2.A00.get(c20180wy.A05);
                    if (c20090wn2 == null || (c20080wm = c20090wn2.A00) == null) {
                        i = 1;
                    } else {
                        int i6 = -1;
                        i = 0;
                        int i7 = 0;
                        while (true) {
                            int[] iArr = c20080wm.A01;
                            if (i7 < iArr.length) {
                                if (c20080wm.A00 > iArr[i7] && iArr[i7] > i6) {
                                    i6 = iArr[i7];
                                    i = c20080wm.A02[i7];
                                }
                                i7++;
                            }
                        }
                    }
                }
                if (i != 0 && this.A03.nextInt(i) == 0) {
                    Logger.writeStandardEntry(0, 7, 95, 0L, 0, 0, 0, i);
                    Logger.postFinishTrace(61, c20180wy.A05);
                    A01(c20180wy);
                } else {
                    Logger.postFinishTrace(38, c20180wy.A05);
                    A00(new C20180wy(c20180wy, 6));
                }
                synchronized (c20100wo2) {
                    c20100wo2.A00.delete(c20180wy.A05);
                }
                return;
            default:
                return;
        }
    }
}
