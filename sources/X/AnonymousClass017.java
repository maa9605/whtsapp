package X;

import android.content.Context;
import android.os.Build;
import com.facebook.soloader.SoLoader;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.017  reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass017 {
    public static boolean A00;

    public static synchronized void A00(Context context) {
        synchronized (AnonymousClass017.class) {
            if (A00) {
                Log.i("whatsappsoloader/init: already initialized");
                return;
            }
            if (Build.VERSION.SDK_INT < 23) {
                String A0A = AnonymousClass024.A0A();
                if (!"armeabi-v7a".equals(A0A) && !"x86".equals(A0A)) {
                    SoLoader.A02(context, 0, C002000y.A00());
                    C008403q c008403q = new C008403q(new File(context.getFilesDir(), "decompressed/libs.spk.zst"), 1);
                    ReentrantReadWriteLock reentrantReadWriteLock = SoLoader.A09;
                    reentrantReadWriteLock.writeLock().lock();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Prepending to SO sources: ");
                    sb.append(c008403q);
                    android.util.Log.d("SoLoader", sb.toString());
                    SoLoader.A01();
                    c008403q.A02(SoLoader.A00());
                    AbstractC008203o[] abstractC008203oArr = SoLoader.A04;
                    int length = abstractC008203oArr.length;
                    AbstractC008203o[] abstractC008203oArr2 = new AbstractC008203o[length + 1];
                    abstractC008203oArr2[0] = c008403q;
                    System.arraycopy(abstractC008203oArr, 0, abstractC008203oArr2, 1, length);
                    SoLoader.A04 = abstractC008203oArr2;
                    SoLoader.A0B++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Prepended to SO sources: ");
                    sb2.append(c008403q);
                    android.util.Log.d("SoLoader", sb2.toString());
                    reentrantReadWriteLock.writeLock().unlock();
                    A00 = true;
                }
            }
            SoLoader.A02(context, 0, null);
            C008403q c008403q2 = new C008403q(new File(context.getFilesDir(), "decompressed/libs.spk.zst"), 1);
            ReentrantReadWriteLock reentrantReadWriteLock2 = SoLoader.A09;
            reentrantReadWriteLock2.writeLock().lock();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Prepending to SO sources: ");
            sb3.append(c008403q2);
            android.util.Log.d("SoLoader", sb3.toString());
            SoLoader.A01();
            c008403q2.A02(SoLoader.A00());
            AbstractC008203o[] abstractC008203oArr3 = SoLoader.A04;
            int length2 = abstractC008203oArr3.length;
            AbstractC008203o[] abstractC008203oArr22 = new AbstractC008203o[length2 + 1];
            abstractC008203oArr22[0] = c008403q2;
            System.arraycopy(abstractC008203oArr3, 0, abstractC008203oArr22, 1, length2);
            SoLoader.A04 = abstractC008203oArr22;
            SoLoader.A0B++;
            StringBuilder sb22 = new StringBuilder();
            sb22.append("Prepended to SO sources: ");
            sb22.append(c008403q2);
            android.util.Log.d("SoLoader", sb22.toString());
            reentrantReadWriteLock2.writeLock().unlock();
            A00 = true;
        }
    }
}
