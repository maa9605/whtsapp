package X;

import android.content.Context;
import android.util.Log;
import com.facebook.profilo.writer.NativeTraceWriterCallbacks;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* renamed from: X.1YO */
/* loaded from: classes.dex */
public final class C1YO implements NativeTraceWriterCallbacks, InterfaceC20250x6, InterfaceC20050wh {
    public static AtomicReference A0B = new AtomicReference(null);
    public C1YN A00;
    public C20230x3 A01;
    public AbstractC20060wj[] A02;
    public AbstractC20060wj[] A03;
    public final Object A05 = new Object();
    public volatile C1YM A0A = null;
    public final Random A08 = new Random();
    public final C39101pZ A04 = new C39101pZ();
    public final String A06 = "main";
    public final boolean A09 = true;
    public final HashMap A07 = new HashMap(2);

    public C1YO(Context context, C1YN c1yn, AbstractC20060wj[] abstractC20060wjArr, File file) {
        this.A00 = c1yn;
        this.A01 = new C20230x3(context, file);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (AbstractC20060wj abstractC20060wj : abstractC20060wjArr) {
            if (abstractC20060wj != null) {
                arrayList2.add(abstractC20060wj);
            } else {
                throw null;
            }
        }
        this.A02 = (AbstractC20060wj[]) arrayList2.toArray(new AbstractC20060wj[arrayList2.size()]);
        this.A03 = (AbstractC20060wj[]) arrayList.toArray(new AbstractC20060wj[arrayList.size()]);
    }

    public static void A00(File file) {
        if (file.isDirectory()) {
            try {
                String[] list = file.list();
                if (list != null) {
                    for (String str : list) {
                        File file2 = new File(file, str);
                        if (file2.isDirectory()) {
                            A00(file2);
                        } else {
                            file2.delete();
                        }
                    }
                }
                file.delete();
            } catch (Exception e) {
                Log.e("ZipHelper", "failed to delete directory", e);
            }
        }
    }

    public static void A01(File file, String str, ZipOutputStream zipOutputStream) {
        File absoluteFile = new File(file, str).getAbsoluteFile();
        URI uri = file.toURI();
        for (String str2 : absoluteFile.list()) {
            File file2 = new File(absoluteFile, str2);
            if (file2.exists()) {
                String path = uri.relativize(file2.toURI()).getPath();
                if (file2.isFile()) {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(new File(file, path));
                        byte[] bArr = new byte[1024];
                        zipOutputStream.putNextEntry(new ZipEntry(path));
                        while (true) {
                            int read = fileInputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            zipOutputStream.write(bArr, 0, read);
                        }
                        fileInputStream.close();
                    } finally {
                        zipOutputStream.closeEntry();
                    }
                } else if (file2.isDirectory()) {
                    A01(file, path, zipOutputStream);
                }
            }
        }
    }

    @Override // X.InterfaceC20250x6
    public void ALe(Throwable th) {
        this.A04.ALe(th);
    }

    @Override // com.facebook.profilo.writer.NativeTraceWriterCallbacks
    public void onTraceWriteAbort(long j, int i) {
        C20270x8 c20270x8;
        String str;
        HashMap hashMap = this.A07;
        synchronized (hashMap) {
            Long valueOf = Long.valueOf(j);
            c20270x8 = (C20270x8) hashMap.get(valueOf);
            if (c20270x8 != null) {
                hashMap.remove(valueOf);
            } else {
                throw new IllegalStateException("onTraceWriteAbort can't be called without onTraceWriteStart");
            }
        }
        this.A04.onTraceWriteAbort(j, i);
        StringBuilder sb = new StringBuilder("Trace is aborted with code: ");
        switch (i) {
            case 1:
                str = "unknown";
                break;
            case 2:
                str = "controller_init";
                break;
            case 3:
                str = "missed_event";
                break;
            case 4:
                str = "timeout";
                break;
            case 5:
                str = "new_start";
                break;
            case 6:
                str = "condition_not_met";
                break;
            default:
                str = C000200d.A0D("UNKNOWN REASON ", i);
                break;
        }
        sb.append(str);
        Log.w("Profilo/TraceOrchestrator", sb.toString());
        C20120wq c20120wq = C20120wq.A07;
        if (c20120wq != null) {
            c20120wq.A04(j, i);
            if (this.A09) {
                File file = c20270x8.A01;
                if (file.exists()) {
                    File parentFile = file.getParentFile();
                    synchronized (this) {
                    }
                    if (!file.delete()) {
                        Log.e("Profilo/TraceOrchestrator", "Could not delete aborted trace");
                    }
                    A00(parentFile);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("No TraceControl when cleaning up aborted trace");
    }

    @Override // com.facebook.profilo.writer.NativeTraceWriterCallbacks
    public void onTraceWriteEnd(long j) {
        C20270x8 c20270x8;
        File file;
        List<File> asList;
        List asList2;
        C20220x2 c20220x2;
        HashMap hashMap = this.A07;
        synchronized (hashMap) {
            Long valueOf = Long.valueOf(j);
            c20270x8 = (C20270x8) hashMap.get(valueOf);
            if (c20270x8 != null) {
                hashMap.remove(valueOf);
            } else {
                throw new IllegalStateException("onTraceWriteEnd can't be called without onTraceWriteStart");
            }
        }
        C39101pZ c39101pZ = this.A04;
        c39101pZ.onTraceWriteEnd(j);
        File file2 = c20270x8.A01;
        if (file2.exists() && this.A09) {
            File parentFile = file2.getParentFile();
            if (parentFile.isDirectory() && parentFile.list().length > 1) {
                file = null;
                if (parentFile.isDirectory()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(parentFile.getName());
                    sb.append(".zip.tmp");
                    File file3 = new File(parentFile.getParent(), sb.toString());
                    try {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file3), 262144);
                        ZipOutputStream zipOutputStream = new ZipOutputStream(bufferedOutputStream);
                        try {
                            A01(parentFile, ".", zipOutputStream);
                            zipOutputStream.flush();
                            zipOutputStream.finish();
                            bufferedOutputStream.close();
                            file = file3;
                        } finally {
                        }
                    } catch (IOException unused) {
                        file3.delete();
                    }
                }
                String format = new SimpleDateFormat("yyyy-MM-dd'T'HH-mm-ss", Locale.US).format(new Date());
                File parentFile2 = file.getParentFile();
                StringBuilder A0V = C000200d.A0V(format, "-");
                A0V.append(file.getName());
                File file4 = new File(parentFile2, A0V.toString());
                if (file.renameTo(file4)) {
                    file = file4;
                }
                A00(parentFile);
            } else {
                file = file2;
            }
            int i = c20270x8.A00;
            synchronized (this) {
                boolean z = (i & 1) == 0;
                C20230x3 c20230x3 = this.A01;
                String name = file.getName();
                int lastIndexOf = name.lastIndexOf(46);
                if (lastIndexOf != -1) {
                    name = name.substring(0, lastIndexOf);
                }
                String A0H = C000200d.A0H(name, ".log");
                if (!z) {
                    A0H = C000200d.A0H("override-", A0H);
                }
                File file5 = c20230x3.A04;
                if (file5.isDirectory() || file5.mkdirs()) {
                    if (file.renameTo(new File(file5, A0H))) {
                        c20230x3.A02.A00++;
                    } else {
                        c20230x3.A02.A03++;
                    }
                    File file6 = c20230x3.A05;
                    long j2 = c20230x3.A01;
                    if (file5.exists() || file5.isDirectory()) {
                        long currentTimeMillis = System.currentTimeMillis() - j2;
                        File[] listFiles = file5.listFiles(C20230x3.A06);
                        if (listFiles == null) {
                            asList = Collections.EMPTY_LIST;
                        } else {
                            asList = Arrays.asList(listFiles);
                        }
                        for (File file7 : asList) {
                            if (file7.lastModified() < currentTimeMillis) {
                                if (file7.renameTo(new File(file6, file7.getName()))) {
                                    c20230x3.A02.A05++;
                                } else {
                                    c20230x3.A02.A03++;
                                    if (file7.exists() && !file7.delete()) {
                                        c20230x3.A02.A02++;
                                    }
                                    c20230x3.A02.A04++;
                                }
                            }
                        }
                    }
                    int i2 = c20230x3.A00;
                    if (file6.exists() || file6.isDirectory()) {
                        File[] listFiles2 = file6.listFiles(C20230x3.A06);
                        if (listFiles2 == null) {
                            asList2 = Collections.EMPTY_LIST;
                        } else {
                            asList2 = Arrays.asList(listFiles2);
                        }
                        if (asList2.size() > i2) {
                            Collections.sort(asList2, new Comparator() { // from class: X.0x1
                                @Override // java.util.Comparator
                                public int compare(Object obj, Object obj2) {
                                    return ((File) obj).getName().compareTo(((File) obj2).getName());
                                }
                            });
                            for (File file8 : asList2.subList(0, asList2.size() - i2)) {
                                if (file8.delete()) {
                                    c20230x3.A02.A06++;
                                } else {
                                    c20230x3.A02.A04++;
                                }
                            }
                        }
                    }
                } else {
                    c20230x3.A02.A01++;
                }
                C20230x3 c20230x32 = this.A01;
                c20220x2 = c20230x32.A02;
                c20230x32.A02 = new C20220x2();
            }
            A00(parentFile);
            c39101pZ.APm(file2, j);
            c39101pZ.APn(c20220x2.A02 + c20220x2.A03 + c20220x2.A01 + c20220x2.A04, c20220x2.A06, c20220x2.A05, c20220x2.A00);
        }
    }

    @Override // com.facebook.profilo.writer.NativeTraceWriterCallbacks
    public void onTraceWriteStart(long j, int i, String str) {
        Long valueOf;
        C20270x8 c20270x8;
        HashMap hashMap = this.A07;
        synchronized (hashMap) {
            valueOf = Long.valueOf(j);
            c20270x8 = (C20270x8) hashMap.get(valueOf);
        }
        if (c20270x8 == null) {
            this.A04.onTraceWriteStart(j, i, str);
            synchronized (hashMap) {
                hashMap.put(valueOf, new C20270x8(i, new File(str)));
            }
            return;
        }
        throw new IllegalStateException("Trace already registered on start");
    }
}
