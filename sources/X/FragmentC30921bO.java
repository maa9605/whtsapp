package X;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.1bO  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class FragmentC30921bO extends Fragment implements AnonymousClass149 {
    public static WeakHashMap A03 = new WeakHashMap();
    public Bundle A01;
    public Map A02 = new C006702y();
    public int A00 = 0;

    @Override // X.AnonymousClass149
    public final void A57(final String str, final LifecycleCallback lifecycleCallback) {
        if (!this.A02.containsKey(str)) {
            this.A02.put(str, lifecycleCallback);
            if (this.A00 > 0) {
                new HandlerC234616t(Looper.getMainLooper()).post(new Runnable() { // from class: X.14i
                    @Override // java.lang.Runnable
                    public final void run() {
                        FragmentC30921bO fragmentC30921bO = FragmentC30921bO.this;
                        if (fragmentC30921bO.A00 > 0) {
                            LifecycleCallback lifecycleCallback2 = lifecycleCallback;
                            Bundle bundle = fragmentC30921bO.A01;
                            lifecycleCallback2.A04(bundle != null ? bundle.getBundle(str) : null);
                        }
                        if (fragmentC30921bO.A00 >= 2) {
                            lifecycleCallback.A01();
                        }
                        if (fragmentC30921bO.A00 >= 3) {
                            lifecycleCallback.A00();
                        }
                        if (fragmentC30921bO.A00 >= 4) {
                            lifecycleCallback.A02();
                        }
                        if (fragmentC30921bO.A00 >= 5 && lifecycleCallback == null) {
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
    public final Activity AAt() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.A02.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback lifecycleCallback : this.A02.values()) {
            lifecycleCallback.A03(i, i2, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
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

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.A00 = 5;
        for (Object obj : this.A02.values()) {
            if (obj == null) {
                throw null;
            }
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.A00 = 3;
        for (LifecycleCallback lifecycleCallback : this.A02.values()) {
            lifecycleCallback.A00();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.A02.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).A05(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.A00 = 2;
        for (LifecycleCallback lifecycleCallback : this.A02.values()) {
            lifecycleCallback.A01();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.A00 = 4;
        for (LifecycleCallback lifecycleCallback : this.A02.values()) {
            lifecycleCallback.A02();
        }
    }
}
