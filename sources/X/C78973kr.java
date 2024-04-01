package X;

import android.content.Context;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.webkit.URLUtil;
import com.whatsapp.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.3kr  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C78973kr extends C0HS {
    public static final HashMap A09 = new HashMap();
    public int A00;
    public long A01;
    public C27851Pa A02;
    public final C04470Kh A03;
    public final C001200o A04;
    public final C0HA A05;
    public final AnonymousClass035 A06;
    public final C004902f A07;
    public final InterfaceC002901k A08;

    public C78973kr(C001200o c001200o, C004902f c004902f, InterfaceC002901k interfaceC002901k, C0HA c0ha, AnonymousClass035 anonymousClass035, C04470Kh c04470Kh, C27851Pa c27851Pa, int i, long j) {
        this.A04 = c001200o;
        this.A07 = c004902f;
        this.A08 = interfaceC002901k;
        this.A05 = c0ha;
        this.A06 = anonymousClass035;
        this.A03 = c04470Kh;
        this.A02 = c27851Pa;
        this.A00 = i;
        this.A01 = j;
    }

    public static File A00(Context context, C78973kr c78973kr) {
        File file = new File(context.getCacheDir(), "ProfilePictureTemp");
        file.mkdirs();
        return new File(file, URLUtil.guessFileName(c78973kr.A02.A05.toString(), null, null));
    }

    public static void A01(Context context) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap = A09;
        synchronized (hashMap) {
            for (AbstractC005302j abstractC005302j : hashMap.keySet()) {
                C78973kr c78973kr = (C78973kr) hashMap.get(abstractC005302j);
                if (c78973kr != null) {
                    if (!c78973kr.A00().equals(AsyncTask.Status.RUNNING)) {
                        File A00 = A00(context, c78973kr);
                        if (A00.exists()) {
                            A00.delete();
                        }
                        arrayList.add(c78973kr);
                    } else {
                        File A002 = A00(context, c78973kr);
                        if (A002.exists()) {
                            arrayList2.add(A002);
                        }
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                hashMap.remove(((C78973kr) it.next()).A02.A03);
            }
        }
        File file = new File(context.getCacheDir(), "ProfilePictureTemp");
        file.mkdirs();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (!arrayList2.contains(file2)) {
                    file2.delete();
                }
            }
        }
    }

    public static void A02(C001200o c001200o, C004902f c004902f, InterfaceC002901k interfaceC002901k, C0HA c0ha, AnonymousClass035 anonymousClass035, C04470Kh c04470Kh, C27851Pa c27851Pa, int i, long j) {
        HashMap hashMap = A09;
        synchronized (hashMap) {
            AbstractC005302j abstractC005302j = c27851Pa.A03;
            if (hashMap.containsKey(abstractC005302j)) {
                C78973kr c78973kr = (C78973kr) hashMap.get(abstractC005302j);
                if (c78973kr.A02.A05.equals(c27851Pa.A05)) {
                    if (!c78973kr.A00().equals(AsyncTask.Status.RUNNING)) {
                        hashMap.remove(c78973kr.A02.A03);
                        C78973kr c78973kr2 = new C78973kr(c001200o, c004902f, interfaceC002901k, c0ha, anonymousClass035, c04470Kh, c27851Pa, i, j);
                        hashMap.put(abstractC005302j, c78973kr2);
                        interfaceC002901k.ARy(c78973kr2, new Void[0]);
                    }
                } else {
                    c78973kr.A05(true);
                    hashMap.remove(c78973kr.A02.A03);
                    C78973kr c78973kr3 = new C78973kr(c001200o, c004902f, interfaceC002901k, c0ha, anonymousClass035, c04470Kh, c27851Pa, i, j);
                    hashMap.put(abstractC005302j, c78973kr3);
                    interfaceC002901k.ARy(c78973kr3, new Void[0]);
                }
            } else {
                C78973kr c78973kr4 = new C78973kr(c001200o, c004902f, interfaceC002901k, c0ha, anonymousClass035, c04470Kh, c27851Pa, i, j);
                hashMap.put(abstractC005302j, c78973kr4);
                interfaceC002901k.ARy(c78973kr4, new Void[0]);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x022d, code lost:
        if (r8 == null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d6, code lost:
        if (r15 != 0) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0216 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01cc  */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v18, types: [int] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.io.InputStream] */
    @Override // X.C0HS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A07(java.lang.Object[] r19) {
        /*
            Method dump skipped, instructions count: 605
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78973kr.A07(java.lang.Object[]):java.lang.Object");
    }

    @Override // X.C0HS
    public void A08() {
        File A00 = A00(this.A04.A00, this);
        if (A00.exists()) {
            A00.delete();
        }
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        int i;
        C3T6 c3t6 = (C3T6) obj;
        int i2 = c3t6.A01;
        if (i2 == 2) {
            int length = (int) c3t6.A02.length();
            byte[] bArr = new byte[length];
            try {
                FileInputStream fileInputStream = new FileInputStream(c3t6.A02);
                BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
                bufferedInputStream.read(bArr, 0, length);
                bufferedInputStream.close();
                fileInputStream.close();
            } catch (FileNotFoundException e) {
                Log.w("ProfilePictureDownload: Could not find picture download file", e);
            } catch (IOException e2) {
                Log.w("ProfilePictureDownload: IO Exception while reading the picture download file", e2);
            }
            C27851Pa c27851Pa = this.A02;
            c27851Pa.A00 = bArr;
            C04470Kh c04470Kh = this.A03;
            c04470Kh.A00.A00.post(new C1NN(c04470Kh, c27851Pa));
            A0B(c3t6);
            A0A(c3t6);
        } else if (i2 == 0 && (i = this.A00) < 3) {
            A02(this.A04, this.A07, this.A08, this.A05, this.A06, this.A03, this.A02, i + 1, this.A01);
        } else {
            A0B(c3t6);
            A0A(c3t6);
        }
    }

    public final void A0A(C3T6 c3t6) {
        HashMap hashMap = A09;
        synchronized (hashMap) {
            hashMap.remove(this.A02.A03);
        }
        c3t6.A02.delete();
    }

    public final void A0B(C3T6 c3t6) {
        Double d;
        C0HA c0ha = this.A05;
        int i = c3t6.A00;
        Long valueOf = Long.valueOf(SystemClock.elapsedRealtime() - this.A01);
        File file = c3t6.A02;
        if (file != null) {
            d = Double.valueOf(file.length());
        } else {
            d = null;
        }
        c0ha.A02(i, 2, valueOf, d);
    }
}
