package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.0mF  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14030mF {
    public static C14030mF A05;
    public static final Object A06 = new Object();
    public final Context A00;
    public final Handler A01;
    public final HashMap A04 = new HashMap();
    public final HashMap A03 = new HashMap();
    public final ArrayList A02 = new ArrayList();

    public C14030mF(Context context) {
        this.A00 = context;
        final Looper mainLooper = context.getMainLooper();
        this.A01 = new Handler(mainLooper) { // from class: X.0mC
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int size;
                C14010mD[] c14010mDArr;
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                C14030mF c14030mF = C14030mF.this;
                while (true) {
                    synchronized (c14030mF.A04) {
                        ArrayList arrayList = c14030mF.A02;
                        size = arrayList.size();
                        if (size <= 0) {
                            return;
                        }
                        c14010mDArr = new C14010mD[size];
                        arrayList.toArray(c14010mDArr);
                        arrayList.clear();
                    }
                    int i = 0;
                    do {
                        C14010mD c14010mD = c14010mDArr[i];
                        int size2 = c14010mD.A01.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            C14020mE c14020mE = (C14020mE) c14010mD.A01.get(i2);
                            if (!c14020mE.A01) {
                                c14020mE.A02.onReceive(c14030mF.A00, c14010mD.A00);
                            }
                        }
                        i++;
                    } while (i < size);
                }
            }
        };
    }

    public static C14030mF A00(Context context) {
        C14030mF c14030mF;
        synchronized (A06) {
            c14030mF = A05;
            if (c14030mF == null) {
                c14030mF = new C14030mF(context.getApplicationContext());
                A05 = c14030mF;
            }
        }
        return c14030mF;
    }
}
