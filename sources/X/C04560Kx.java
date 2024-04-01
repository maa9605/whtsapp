package X;

import android.util.JsonReader;
import android.util.JsonWriter;
import com.whatsapp.gif_search.GifCacheItemSerializable;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0Kx */
/* loaded from: classes.dex */
public class C04560Kx {
    public File A00;
    public ThreadPoolExecutor A01;
    public boolean A02;
    public final AbstractC000600i A03;
    public final C001200o A04;
    public final C66603Br A05;
    public final String A06 = "gif/gif_cache_mem_store";
    public final String A07;
    public final boolean A08;

    public C04560Kx(C001200o c001200o, AbstractC000600i abstractC000600i, int i, String str, boolean z) {
        this.A04 = c001200o;
        this.A03 = abstractC000600i;
        this.A07 = str;
        this.A08 = z;
        C66603Br c66603Br = new C66603Br(i);
        this.A05 = c66603Br;
        C3BV c3bv = new C3BV(this);
        synchronized (c66603Br) {
            c66603Br.A00 = c3bv;
        }
    }

    public static List A00(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            ArrayList arrayList = new ArrayList((List) objectInputStream.readObject());
            objectInputStream.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    fileInputStream.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static List A01(File file) {
        ArrayList arrayList = new ArrayList();
        JsonReader jsonReader = new JsonReader(new FileReader(file));
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if ("mappings".equals(jsonReader.nextName())) {
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        String str = null;
                        String str2 = null;
                        while (jsonReader.hasNext()) {
                            String nextName = jsonReader.nextName();
                            char c = 65535;
                            int hashCode = nextName.hashCode();
                            if (hashCode != 116079) {
                                if (hashCode == 3143036 && nextName.equals("file")) {
                                    c = 0;
                                }
                            } else if (nextName.equals("url")) {
                                c = 1;
                            }
                            if (c == 0) {
                                str = jsonReader.nextString();
                            } else if (c == 1) {
                                str2 = jsonReader.nextString();
                            }
                        }
                        jsonReader.endObject();
                        if (str == null) {
                            throw new IOException("field not found: file");
                        }
                        if (str2 != null) {
                            arrayList.add(new GifCacheItemSerializable(str, null, str2));
                        } else {
                            throw new IOException("field not found: url");
                        }
                    }
                    jsonReader.endArray();
                }
            }
            jsonReader.endObject();
            jsonReader.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    jsonReader.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public static void A02(File file, List list) {
        JsonWriter jsonWriter = new JsonWriter(new FileWriter(file));
        try {
            jsonWriter.beginObject();
            jsonWriter.name("mappings");
            jsonWriter.beginArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                GifCacheItemSerializable gifCacheItemSerializable = (GifCacheItemSerializable) it.next();
                jsonWriter.beginObject();
                jsonWriter.name("url").value(gifCacheItemSerializable.url);
                jsonWriter.name("file").value(gifCacheItemSerializable.filePath);
                jsonWriter.endObject();
            }
            jsonWriter.endArray();
            jsonWriter.endObject();
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    jsonWriter.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public GifCacheItemSerializable A03(String str) {
        A08();
        C66603Br c66603Br = this.A05;
        GifCacheItemSerializable gifCacheItemSerializable = (GifCacheItemSerializable) c66603Br.A04(str);
        if (gifCacheItemSerializable != null) {
            if (!gifCacheItemSerializable.A00().exists()) {
                c66603Br.A05(str);
                A05().execute(new RunnableEBaseShape3S0100000_I0_3(this, 1));
                return null;
            } else if (gifCacheItemSerializable.A00 == null && !AnonymousClass024.A0c()) {
                gifCacheItemSerializable.A00 = C02180Ae.A1c(gifCacheItemSerializable.A00(), 0L);
            }
        }
        return gifCacheItemSerializable;
    }

    public final File A04() {
        File file = this.A00;
        if (file != null && file.exists()) {
            return this.A00;
        }
        File externalCacheDir = this.A04.A00.getExternalCacheDir();
        if (externalCacheDir != null && externalCacheDir.exists()) {
            File file2 = new File(externalCacheDir, this.A06);
            if (!file2.exists() && !file2.mkdirs()) {
                Log.e("diskbackedgifcache/getmappingfile/disk cache dir doesn't exit");
                return null;
            }
            File file3 = new File(file2, this.A07);
            this.A00 = file3;
            return file3;
        }
        Log.e("diskbackedgifcache/getmappingfile/external cache dir doesn't exit");
        return null;
    }

    public synchronized ThreadPoolExecutor A05() {
        ThreadPoolExecutor threadPoolExecutor;
        threadPoolExecutor = this.A01;
        if (threadPoolExecutor == null) {
            threadPoolExecutor = C02180Ae.A0s(0, 1, TimeUnit.SECONDS, "Disk backed Gif Cache Worker#");
            this.A01 = threadPoolExecutor;
        }
        return threadPoolExecutor;
    }

    public void A06() {
        this.A05.A00();
    }

    public void A07() {
        this.A05.A01();
    }

    public final synchronized void A08() {
        List A01;
        if (!AnonymousClass024.A0c() && !this.A02) {
            A05();
            File A04 = A04();
            if (A04 != null && A04.exists()) {
                try {
                    try {
                        if (this.A08) {
                            try {
                                A01 = A01(A04);
                            } catch (IOException e) {
                                try {
                                    A01 = A00(A04);
                                } catch (IOException | ClassNotFoundException unused) {
                                    throw e;
                                }
                            }
                        } else {
                            try {
                                A01 = A00(A04);
                            } catch (IOException | ClassNotFoundException e2) {
                                try {
                                    A01 = A01(A04);
                                } catch (IOException unused2) {
                                    throw e2;
                                }
                            }
                        }
                        ArrayList arrayList = (ArrayList) A01;
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            GifCacheItemSerializable gifCacheItemSerializable = (GifCacheItemSerializable) it.next();
                            if (gifCacheItemSerializable.A00().exists()) {
                                this.A05.A08(gifCacheItemSerializable.url, gifCacheItemSerializable);
                            }
                        }
                        arrayList.size();
                        A04.getAbsolutePath();
                    } catch (ClassNotFoundException e3) {
                        e = e3;
                        Log.e("diskbackedgifcache/init/error", e);
                        AbstractC000600i abstractC000600i = this.A03;
                        StringBuilder sb = new StringBuilder();
                        sb.append("json=");
                        sb.append(this.A08);
                        sb.append("; ");
                        sb.append(e.toString());
                        abstractC000600i.A09("disk-backed-gif-cache/load-error", sb.toString(), false);
                        this.A02 = true;
                    }
                } catch (IOException e4) {
                    e = e4;
                    Log.e("diskbackedgifcache/init/error", e);
                    AbstractC000600i abstractC000600i2 = this.A03;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("json=");
                    sb2.append(this.A08);
                    sb2.append("; ");
                    sb2.append(e.toString());
                    abstractC000600i2.A09("disk-backed-gif-cache/load-error", sb2.toString(), false);
                    this.A02 = true;
                }
            }
            this.A02 = true;
        }
    }
}
