package X;

import android.content.Context;
import android.os.Parcel;
import android.os.StrictMode;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.03r */
/* loaded from: classes.dex */
public abstract class AbstractC008503r extends C008403q {
    public String A00;
    public final Context A01;
    public final Map A02;

    public abstract AbstractC20770yA A04();

    public AbstractC008503r(Context context, String str) {
        super(new File(C000200d.A0M(new StringBuilder(), context.getApplicationInfo().dataDir, "/", str)), 1);
        this.A02 = new HashMap();
        this.A01 = context;
    }

    public static void A00(File file, byte b) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        try {
            randomAccessFile.seek(0L);
            randomAccessFile.write(b);
            randomAccessFile.setLength(randomAccessFile.getFilePointer());
            randomAccessFile.getFD().sync();
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    randomAccessFile.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // X.C008403q, X.AbstractC008203o
    public int A01(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        Object obj;
        int A03;
        Map map = this.A02;
        synchronized (map) {
            obj = map.get(str);
            if (obj == null) {
                obj = new Object();
                map.put(str, obj);
            }
        }
        synchronized (obj) {
            A03 = A03(str, i, super.A01, threadPolicy);
        }
        return A03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:222:0x00d0, code lost:
        if ((r32 & 2) == 0) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x027a, code lost:
        r5.A01.close();
     */
    /* JADX WARN: Removed duplicated region for block: B:244:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x034f A[Catch: all -> 0x0364, TRY_ENTER, TryCatch #18 {all -> 0x036f, blocks: (B:224:0x00de, B:225:0x00e6, B:313:0x02c0, B:227:0x0115, B:229:0x011b, B:231:0x0121, B:233:0x0126, B:234:0x013a, B:242:0x0161, B:245:0x016c, B:247:0x016f, B:249:0x0177, B:251:0x017d, B:253:0x0183, B:256:0x018a, B:258:0x018d, B:260:0x0197, B:261:0x019a, B:262:0x01b7, B:263:0x01ba, B:264:0x01bf, B:266:0x01c5, B:296:0x027a, B:326:0x034f, B:327:0x0363, B:235:0x0142, B:236:0x0149, B:237:0x014a, B:238:0x0151, B:241:0x0158, B:240:0x0153, B:267:0x01ca, B:269:0x01d1, B:271:0x01df, B:274:0x01ed, B:275:0x01f0, B:277:0x020c, B:278:0x0211, B:294:0x0275, B:303:0x029e, B:304:0x02a1, B:280:0x021a, B:305:0x02a2, B:306:0x02b4), top: B:368:0x00de }] */
    @Override // X.AbstractC008203o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A02(int r32) {
        /*
            Method dump skipped, instructions count: 923
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC008503r.A02(int):void");
    }

    public byte[] A05() {
        Parcel obtain = Parcel.obtain();
        AbstractC20770yA A04 = A04();
        try {
            C20730y6[] c20730y6Arr = A04.A00().A00;
            obtain.writeByte((byte) 1);
            int length = c20730y6Arr.length;
            obtain.writeInt(length);
            for (int i = 0; i < length; i++) {
                obtain.writeString(c20730y6Arr[i].A01);
                obtain.writeString(c20730y6Arr[i].A00);
            }
            A04.close();
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            return marshall;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (A04 != null) {
                    try {
                        A04.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th2;
            }
        }
    }
}
