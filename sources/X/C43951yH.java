package X;

import android.util.JsonReader;
import android.util.SparseArray;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.1yH  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C43951yH {
    public static final SparseArray A08;
    public RandomAccessFile A01;
    public String A02;
    public final AbstractC000600i A03;
    public final C001200o A04;
    public final Map A06 = new ConcurrentHashMap();
    public final Object A05 = new Object();
    public final ReentrantLock A07 = new ReentrantLock();
    public int A00 = 0;

    static {
        SparseArray sparseArray = new SparseArray();
        A08 = sparseArray;
        sparseArray.put(0, "EMPTY");
        sparseArray.put(1, "LOADING");
        sparseArray.put(2, "COMPLETE");
    }

    public C43951yH(C001200o c001200o, AbstractC000600i abstractC000600i) {
        this.A04 = c001200o;
        this.A03 = abstractC000600i;
    }

    public final synchronized int A00() {
        return this.A00;
    }

    public final RandomAccessFile A01() {
        RandomAccessFile randomAccessFile;
        synchronized (this.A05) {
            randomAccessFile = this.A01;
        }
        return randomAccessFile;
    }

    public final synchronized String A02() {
        return this.A02;
    }

    public final void A03(int i) {
        C000700j.A07(this.A07.isHeldByCurrentThread());
        if (i == 1 || this.A00 == 1) {
            SparseArray sparseArray = A08;
            sparseArray.get(this.A00);
            sparseArray.get(i);
        }
        this.A00 = i;
    }

    public final boolean A04() {
        C000700j.A07(this.A07.isHeldByCurrentThread());
        Map map = this.A06;
        if (map.isEmpty() || A01() == null) {
            String A02 = A02();
            if (A02 == null) {
                return false;
            }
            File file = new File(this.A04.A00.getFilesDir(), A02);
            if (file.exists()) {
                File file2 = new File(file, "flatfile");
                File file3 = new File(file, "offsetfile.json");
                if (file2.exists() && file3.exists()) {
                    synchronized (this.A05) {
                        if (this.A01 == null) {
                            try {
                                this.A01 = new RandomAccessFile(file2, "rw");
                            } catch (FileNotFoundException e) {
                                Log.e("FlatfileStorage/prepareFilesIfNeeded/flatfile was not found", e);
                                return false;
                            }
                        }
                    }
                    if (map.isEmpty()) {
                        try {
                            JsonReader jsonReader = new JsonReader(new InputStreamReader(new FileInputStream(file3)));
                            jsonReader.beginObject();
                            while (jsonReader.hasNext()) {
                                String nextName = jsonReader.nextName();
                                jsonReader.beginArray();
                                int nextInt = jsonReader.nextInt();
                                int nextInt2 = jsonReader.nextInt();
                                jsonReader.endArray();
                                map.put(nextName, new C43961yI(nextInt, nextInt2));
                            }
                            jsonReader.endObject();
                            jsonReader.close();
                            return true;
                        } catch (IOException e2) {
                            Log.e("FlatfileStorage/prepareFilesIfNeeded/error while reading offset file", e2);
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
