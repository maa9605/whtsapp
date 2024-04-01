package X;

import com.facebook.profilo.writer.NativeTraceWriterCallbacks;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.1pZ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C39101pZ implements C1YP {
    public final CopyOnWriteArrayList A00 = new CopyOnWriteArrayList();

    @Override // X.InterfaceC20250x6
    public void ALe(Throwable th) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC20250x6) it.next()).ALe(th);
        }
    }

    @Override // X.C1YP
    public void ANS() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C1YP) it.next()).ANS();
        }
    }

    @Override // X.C1YP
    public void ANT(int i) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C1YP) it.next()).ANT(i);
        }
    }

    @Override // X.C1YP
    public void APl(C20180wy c20180wy) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C1YP) it.next()).APl(c20180wy);
        }
    }

    @Override // X.C1YP
    public void APm(File file, long j) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C1YP) it.next()).APm(file, j);
        }
    }

    @Override // X.C1YP
    public void APn(int i, int i2, int i3, int i4) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C1YP) it.next()).APn(i, i2, i3, i4);
        }
    }

    @Override // X.C1YP
    public void APo(C20180wy c20180wy) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C1YP) it.next()).APo(c20180wy);
        }
    }

    @Override // X.C1YP
    public void APp(C20180wy c20180wy) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C1YP) it.next()).APp(c20180wy);
        }
    }

    @Override // com.facebook.profilo.writer.NativeTraceWriterCallbacks
    public void onTraceWriteAbort(long j, int i) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((NativeTraceWriterCallbacks) it.next()).onTraceWriteAbort(j, i);
        }
    }

    @Override // com.facebook.profilo.writer.NativeTraceWriterCallbacks
    public void onTraceWriteEnd(long j) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((NativeTraceWriterCallbacks) it.next()).onTraceWriteEnd(j);
        }
    }

    @Override // com.facebook.profilo.writer.NativeTraceWriterCallbacks
    public void onTraceWriteStart(long j, int i, String str) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((NativeTraceWriterCallbacks) it.next()).onTraceWriteStart(j, i, str);
        }
    }
}
