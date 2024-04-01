package X;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0ER */
/* loaded from: classes.dex */
public class C0ER {
    public static volatile C0ER A03;
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final Map A01 = new HashMap();
    public final Set A02 = new HashSet();

    public static C0ER A00() {
        if (A03 == null) {
            synchronized (C0ER.class) {
                if (A03 == null) {
                    A03 = new C0ER();
                }
            }
        }
        return A03;
    }

    public final void A01() {
        this.A00.post(new Runnable() { // from class: X.1QL
            {
                C0ER.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0ER c0er = C0ER.this;
                synchronized (c0er) {
                    Iterator it = c0er.A02.iterator();
                    while (it.hasNext()) {
                        Class cls = (Class) it.next();
                        Map map = c0er.A01;
                        C0IL c0il = (C0IL) map.get(cls);
                        if (c0il != null) {
                            if (c0il.A02()) {
                                map.remove(cls);
                            }
                            it.remove();
                        }
                    }
                }
            }
        });
    }

    public void A02(Context context, Class cls) {
        StringBuilder sb = new StringBuilder("FgServiceManager/stopService ");
        sb.append(cls);
        Log.i(sb.toString());
        if (Build.VERSION.SDK_INT >= 26) {
            synchronized (this) {
                this.A02.add(cls);
            }
            A01();
            return;
        }
        context.stopService(new Intent(context, cls));
    }

    public void A03(Context context, Class cls, Intent intent) {
        StringBuilder sb = new StringBuilder("FgServiceManager/startService ");
        sb.append(cls);
        Log.i(sb.toString());
        intent.setClass(context, cls);
        if (Build.VERSION.SDK_INT >= 26) {
            synchronized (this) {
                this.A02.remove(cls);
            }
        }
        C02160Ac.A06(context, intent);
    }
}
