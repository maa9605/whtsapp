package X;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.05v */
/* loaded from: classes.dex */
public class ComponentCallbacks2C011905v extends AnonymousClass038 implements ComponentCallbacks2 {
    public static volatile ComponentCallbacks2C011905v A04;
    public long A00;
    public long A01;
    public final C02N A02;
    public final InterfaceC002901k A03;

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    public ComponentCallbacks2C011905v(C001200o c001200o, InterfaceC002901k interfaceC002901k, C02N c02n) {
        this.A03 = interfaceC002901k;
        this.A02 = c02n;
        c001200o.A00.registerComponentCallbacks(this);
    }

    public static ComponentCallbacks2C011905v A00() {
        if (A04 == null) {
            synchronized (ComponentCallbacks2C011905v.class) {
                if (A04 == null) {
                    A04 = new ComponentCallbacks2C011905v(C001200o.A01, C002801j.A00(), new C02N());
                }
            }
        }
        return A04;
    }

    public /* synthetic */ void A02(boolean z) {
        synchronized (super.A00) {
            Iterator it = super.A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    InterfaceC011705t interfaceC011705t = (InterfaceC011705t) c0g5.next();
                    if (z) {
                        interfaceC011705t.AHJ();
                    } else {
                        interfaceC011705t.AHI();
                    }
                }
            }
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        if (i >= 60) {
            C02N c02n = this.A02;
            if (c02n != null) {
                if (SystemClock.uptimeMillis() > this.A00 + 60000) {
                    if (c02n != null) {
                        this.A00 = SystemClock.uptimeMillis();
                        StringBuilder sb = new StringBuilder();
                        sb.append("OnTrimMemory/level: ");
                        sb.append(i);
                        sb.append(", trimming memory, app in background");
                        Log.i(sb.toString());
                        this.A03.AS1(new Runnable() { // from class: X.1PW
                            {
                                ComponentCallbacks2C011905v.this = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                ComponentCallbacks2C011905v.this.A02(r2);
                            }
                        });
                        return;
                    }
                    throw null;
                }
                return;
            }
            throw null;
        } else if (i < 15 || i >= 20) {
        } else {
            C02N c02n2 = this.A02;
            if (c02n2 != null) {
                if (SystemClock.uptimeMillis() <= this.A01 + 30000) {
                    return;
                }
                if (c02n2 != null) {
                    this.A01 = SystemClock.uptimeMillis();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("OnTrimMemory/level: ");
                    sb2.append(i);
                    sb2.append(", trimming memory, app in forground");
                    Log.i(sb2.toString());
                    this.A03.AS1(new Runnable() { // from class: X.1PW
                        {
                            ComponentCallbacks2C011905v.this = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ComponentCallbacks2C011905v.this.A02(r2);
                        }
                    });
                    return;
                }
                throw null;
            }
            throw null;
        }
    }
}
