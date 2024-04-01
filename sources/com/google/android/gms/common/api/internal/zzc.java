package com.google.android.gms.common.api.internal;

import X.AnonymousClass149;
import X.C006702y;
import X.C0BA;
import X.HandlerC234616t;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.zzc;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class zzc extends C0BA implements AnonymousClass149 {
    public static WeakHashMap A03 = new WeakHashMap();
    public Bundle A01;
    public Map A02 = new C006702y();
    public int A00 = 0;

    @Override // X.C0BA
    public final void A0T(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.A0T(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.A02.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // X.C0BA
    public final void A0g() {
        this.A0U = true;
        this.A00 = 2;
        for (LifecycleCallback lifecycleCallback : this.A02.values()) {
            lifecycleCallback.A01();
        }
    }

    @Override // X.C0BA
    public final void A0h(int i, int i2, Intent intent) {
        for (LifecycleCallback lifecycleCallback : this.A02.values()) {
            lifecycleCallback.A03(i, i2, intent);
        }
    }

    @Override // X.C0BA
    public final void A0k(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.A02.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).A05(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // X.C0BA
    public final void A0q() {
        this.A0U = true;
        this.A00 = 5;
        for (Object obj : this.A02.values()) {
            if (obj == null) {
                throw null;
            }
        }
    }

    @Override // X.C0BA
    public final void A0s() {
        this.A0U = true;
        this.A00 = 3;
        for (LifecycleCallback lifecycleCallback : this.A02.values()) {
            lifecycleCallback.A00();
        }
    }

    @Override // X.C0BA
    public final void A0t() {
        this.A0U = true;
        this.A00 = 4;
        for (LifecycleCallback lifecycleCallback : this.A02.values()) {
            lifecycleCallback.A02();
        }
    }

    @Override // X.C0BA
    public final void A0v(Bundle bundle) {
        Bundle bundle2;
        super.A0v(bundle);
        this.A00 = 1;
        this.A01 = bundle;
        for (Map.Entry entry : this.A02.entrySet()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            lifecycleCallback.A04(bundle2);
        }
    }

    @Override // X.AnonymousClass149
    public final void A57(final String str, final LifecycleCallback lifecycleCallback) {
        if (!this.A02.containsKey(str)) {
            this.A02.put(str, lifecycleCallback);
            if (this.A00 > 0) {
                new HandlerC234616t(Looper.getMainLooper()).post(new Runnable() { // from class: X.14j
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzc zzcVar = zzc.this;
                        if (zzcVar.A00 > 0) {
                            LifecycleCallback lifecycleCallback2 = lifecycleCallback;
                            Bundle bundle = zzcVar.A01;
                            lifecycleCallback2.A04(bundle != null ? bundle.getBundle(str) : null);
                        }
                        if (zzcVar.A00 >= 2) {
                            lifecycleCallback.A01();
                        }
                        if (zzcVar.A00 >= 3) {
                            lifecycleCallback.A00();
                        }
                        if (zzcVar.A00 >= 4) {
                            lifecycleCallback.A02();
                        }
                        if (zzcVar.A00 >= 5 && lifecycleCallback == null) {
                            throw null;
                        }
                    }
                });
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 59);
        sb.append("LifecycleCallback with tag ");
        sb.append(str);
        sb.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // X.AnonymousClass149
    public final LifecycleCallback A8i(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.A02.get(str));
    }

    @Override // X.AnonymousClass149
    public final /* synthetic */ Activity AAt() {
        return A09();
    }
}
