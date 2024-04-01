package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.Pair;
import com.facebook.rendercore.RenderTreeNode;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.08R */
/* loaded from: classes.dex */
public class C08R {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C08S A03;
    public final InterfaceC20520xf A04;
    public final FutureTask A05;
    public final AtomicInteger A06 = new AtomicInteger(-1);

    public C08R(final Context context, InterfaceC20520xf interfaceC20520xf, final Object obj, C08S c08s, int i, int i2, int i3) {
        this.A04 = interfaceC20520xf;
        this.A03 = c08s;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A05 = new FutureTask(new Callable() { // from class: X.0xe
            {
                C08R.this = this;
            }

            @Override // java.util.concurrent.Callable
            public Object call() {
                AbstractC016907v abstractC016907v;
                Object obj2;
                Pair ARo;
                C08S c08s2;
                C20430xW c20430xW;
                C08T c08t;
                Context context2 = context;
                C08R c08r = C08R.this;
                InterfaceC20520xf interfaceC20520xf2 = c08r.A04;
                Object obj3 = obj;
                C08S c08s3 = c08r.A03;
                int i4 = c08r.A01;
                int i5 = c08r.A02;
                int i6 = c08r.A00;
                if (c08s3 != null) {
                    abstractC016907v = c08s3.A03;
                    obj2 = c08s3.A04;
                } else {
                    abstractC016907v = null;
                    obj2 = null;
                }
                C1YX.A00("RC Create Tree", null);
                if (c08s3 != null && interfaceC20520xf2 == c08s3.A01) {
                    ARo = new Pair(abstractC016907v, obj2);
                } else {
                    ARo = interfaceC20520xf2.ARo();
                }
                Object obj4 = ARo.first;
                if (c08s3 != null && (c08t = c08s3.A02) != null && obj4 == c08s3.A03) {
                    int i7 = c08t.A01;
                    Rect rect = c08t.A02.A04;
                    if (C07K.A1h(i7, i5, rect.width()) && C07K.A1h(c08t.A00, i6, rect.height())) {
                        c08s2 = new C08S(c08t, interfaceC20520xf2, (AbstractC016907v) ARo.first, c08s3.A00, ARo.second);
                        C20500xd.A00();
                        return c08s2;
                    }
                }
                C1YX.A00("RC Layout", null);
                C016107n c016107n = new C016107n(context2, obj3, i4, (c08s3 == null || (c20430xW = c08s3.A00) == null) ? new C20430xW(null) : new C20430xW(c20430xW));
                InterfaceC016607s A00 = ((AbstractC016907v) ARo.first).A00(c016107n, i5, i6);
                C20500xd.A00();
                C1YX.A00("RC Reduce", null);
                Object obj5 = ARo.second;
                Context context3 = c016107n.A02;
                ArrayList arrayList = new ArrayList();
                RenderTreeNode A002 = C20480xb.A00(A00, C20480xb.A00, new Rect(0, 0, A00.getWidth(), A00.getHeight()), null);
                arrayList.add(A002);
                C20480xb.A01(context3, A00, A002, 0, 0, arrayList);
                c08s2 = new C08S(new C08T(A002, (RenderTreeNode[]) arrayList.toArray(new RenderTreeNode[arrayList.size()]), i5, i6), interfaceC20520xf2, (AbstractC016907v) ARo.first, c016107n.A00(), obj5);
                C20500xd.A00();
                c016107n.A00 = null;
                C20500xd.A00();
                return c08s2;
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x004e, code lost:
        if (r2 == false) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C08S A00() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicInteger r2 = r9.A06
            int r1 = android.os.Process.myTid()
            r0 = -1
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L34
            java.util.concurrent.FutureTask r0 = r9.A05
            r0.run()
            java.lang.Object r0 = r0.get()     // Catch: java.util.concurrent.ExecutionException -> L19 java.lang.InterruptedException -> L2d
            X.08S r0 = (X.C08S) r0     // Catch: java.util.concurrent.ExecutionException -> L19 java.lang.InterruptedException -> L2d
            return r0
        L19:
            r1 = move-exception
            java.lang.Throwable r0 = r1.getCause()
            boolean r0 = r0 instanceof java.lang.RuntimeException
            java.lang.Throwable r1 = r1.getCause()
            if (r0 == 0) goto L27
            throw r1
        L27:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L2d:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L34:
            java.util.concurrent.FutureTask r8 = r9.A05
            int r6 = r2.get()
            java.lang.String r5 = ", "
            java.lang.String r4 = "Unable to restore priority: "
            int r0 = android.os.Process.myTid()
            r7 = 0
            r2 = 0
            if (r6 == r0) goto L47
            r2 = 1
        L47:
            boolean r0 = r8.isDone()
            if (r0 != 0) goto L50
            r1 = 1
            if (r2 != 0) goto L51
        L50:
            r1 = 0
        L51:
            boolean r0 = X.C0AQ.A02()
            if (r0 == 0) goto L70
            if (r1 == 0) goto L70
            int r0 = android.os.Process.myTid()
            int r0 = android.os.Process.getThreadPriority(r0)
            int r3 = android.os.Process.getThreadPriority(r6)
        L65:
            if (r0 >= r3) goto L6e
            android.os.Process.setThreadPriority(r6, r0)     // Catch: java.lang.SecurityException -> L6b
            goto L6e
        L6b:
            int r0 = r0 + 1
            goto L65
        L6e:
            r7 = 1
            goto L71
        L70:
            r3 = 0
        L71:
            java.lang.Object r0 = r8.get()     // Catch: java.util.concurrent.CancellationException -> L8b java.lang.InterruptedException -> L8d java.util.concurrent.ExecutionException -> L98 java.lang.Throwable -> Lae
            if (r7 == 0) goto L88
            android.os.Process.setThreadPriority(r6, r3)     // Catch: java.lang.SecurityException -> L7b java.lang.IllegalArgumentException -> L7d
            goto L88
        L7b:
            r2 = move-exception
            goto L7e
        L7d:
            r2 = move-exception
        L7e:
            java.lang.String r1 = X.C000200d.A0F(r4, r6, r5, r3)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r2)
            throw r0
        L88:
            X.08S r0 = (X.C08S) r0
            return r0
        L8b:
            r2 = move-exception
            goto L8e
        L8d:
            r2 = move-exception
        L8e:
            java.lang.String r1 = r2.getMessage()     // Catch: java.lang.Throwable -> Lae
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> Lae
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> Lae
            throw r0     // Catch: java.lang.Throwable -> Lae
        L98:
            r2 = move-exception
            java.lang.Throwable r1 = r2.getCause()     // Catch: java.lang.Throwable -> Lae
            boolean r0 = r1 instanceof java.lang.RuntimeException     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto La4
            java.lang.RuntimeException r1 = (java.lang.RuntimeException) r1     // Catch: java.lang.Throwable -> Lae
            throw r1     // Catch: java.lang.Throwable -> Lae
        La4:
            java.lang.String r1 = r2.getMessage()     // Catch: java.lang.Throwable -> Lae
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> Lae
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> Lae
            throw r0     // Catch: java.lang.Throwable -> Lae
        Lae:
            r0 = move-exception
            if (r7 == 0) goto Lc2
            android.os.Process.setThreadPriority(r6, r3)     // Catch: java.lang.SecurityException -> Lb5 java.lang.IllegalArgumentException -> Lb7
            throw r0
        Lb5:
            r2 = move-exception
            goto Lb8
        Lb7:
            r2 = move-exception
        Lb8:
            java.lang.String r1 = X.C000200d.A0F(r4, r6, r5, r3)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r2)
            throw r0
        Lc2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08R.A00():X.08S");
    }
}
