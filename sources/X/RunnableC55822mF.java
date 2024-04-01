package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.2mF  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC55822mF extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ C55862mJ A00;
    public final /* synthetic */ File A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ Map A03;
    public final /* synthetic */ CountDownLatch A04;
    public final /* synthetic */ AtomicReference A05;
    public final /* synthetic */ boolean A06;

    public /* synthetic */ RunnableC55822mF(C55862mJ c55862mJ, File file, Map map, AtomicReference atomicReference, List list, boolean z, CountDownLatch countDownLatch) {
        this.A00 = c55862mJ;
        this.A01 = file;
        this.A03 = map;
        this.A05 = atomicReference;
        this.A02 = list;
        this.A06 = z;
        this.A04 = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        String str;
        C55862mJ c55862mJ = this.A00;
        File file = this.A01;
        Map map = this.A03;
        AtomicReference atomicReference = this.A05;
        List list = this.A02;
        boolean z = this.A06;
        CountDownLatch countDownLatch = this.A04;
        try {
            AnonymousClass034 anonymousClass034 = c55862mJ.A0H;
            String A07 = C40061rW.A07(anonymousClass034, c55862mJ.A0I.A00, file);
            if (A07 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("gdrive/backup/collect-files-to-be-uploaded/file-upload-path-is-null/ ");
                sb.append(file);
                Log.e(sb.toString());
                return;
            }
            C40051rV c40051rV = (C40051rV) map.get(A07);
            AbstractC40111rb abstractC40111rb = c55862mJ.A0F;
            if (abstractC40111rb.A00()) {
                try {
                    i = AnonymousClass088.A0B(file.getAbsolutePath(), c40051rV, anonymousClass034, c55862mJ.A0J);
                } catch (C2GT e) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("gdrive/backup/get-files-to-be-uploaded problem with a file ");
                    sb2.append(file);
                    Log.e(sb2.toString(), e);
                    atomicReference.set(e);
                    i = 0;
                }
                if (i != 3) {
                    Object[] objArr = new Object[2];
                    objArr[0] = A07;
                    if (i == 1) {
                        str = "local-file-does-not-exist";
                    } else if (i == 2) {
                        str = "remote-file-does-not-exist";
                    } else if (i == 3) {
                        str = "remote-file-same-as-local";
                    } else if (i != 4) {
                        throw new IllegalArgumentException(C000200d.A0D("unexpected file-status: ", i));
                    } else {
                        str = "remote-file-different-from-local";
                    }
                    objArr[1] = str;
                    String.format("gdrive/backup/get-files-to-be-uploaded fileUploadPath is %s, fileStatus is %s.", objArr);
                    list.add(file);
                }
                AtomicLong atomicLong = c55862mJ.A0V;
                atomicLong.addAndGet(file.length());
                if (abstractC40111rb.A00()) {
                    if (c55862mJ.A0B.A0Y.get() && z) {
                        c55862mJ.A0C.A0A(atomicLong.get(), c55862mJ.A04);
                    }
                }
            }
        } finally {
            countDownLatch.countDown();
        }
    }
}
