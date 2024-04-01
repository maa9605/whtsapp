package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService;
import com.whatsapp.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1vT */
/* loaded from: classes2.dex */
public class C42271vT {
    public static final int A09 = 131072;
    public static final String A0A = "migration/prefetcher";
    public static final String A0B = "xpm/file-prefetcher";
    public final AbstractC000600i A00;
    public final C001200o A01;
    public final C42221vO A02;
    public final C42241vQ A03;
    public final C42251vR A04;
    public final C42261vS A05;
    public final C42211vN A06;
    public final C00J A07;
    public final AtomicBoolean A08 = new AtomicBoolean(false);

    public C42271vT(AbstractC000600i abstractC000600i, C001200o c001200o, C42211vN c42211vN, C00J c00j, C42221vO c42221vO, C42241vQ c42241vQ, C42251vR c42251vR, C42261vS c42261vS) {
        this.A00 = abstractC000600i;
        this.A01 = c001200o;
        this.A07 = c00j;
        this.A06 = c42211vN;
        this.A02 = c42221vO;
        this.A03 = c42241vQ;
        this.A04 = c42251vR;
        this.A05 = c42261vS;
    }

    public File A00() {
        return new File(this.A01.A00.getFilesDir(), A0A);
    }

    public File A01(String str) {
        File canonicalFile = A00().getCanonicalFile();
        File canonicalFile2 = new File(canonicalFile, str).getCanonicalFile();
        for (File parentFile = canonicalFile2.getParentFile(); parentFile != null; parentFile = parentFile.getParentFile()) {
            if (canonicalFile.equals(parentFile)) {
                return canonicalFile2;
            }
        }
        StringBuilder sb = new StringBuilder("Remote path '");
        sb.append(str);
        sb.append("' escaped prefetch sandbox: '");
        sb.append(canonicalFile2);
        sb.append("'");
        throw new SecurityException(sb.toString());
    }

    public void A02() {
        this.A08.get();
    }

    public void A03() {
        C42251vR c42251vR = this.A04;
        synchronized (c42251vR) {
            C76163g9 c76163g9 = c42251vR.A00;
            if (c76163g9 != null) {
                c76163g9.close();
                c42251vR.A00 = null;
            }
            c42251vR.A01.deleteDatabase("migration_prefetcher.db");
            Log.i("FilePrefetcher/removeDatabase/deleted");
        }
        AnonymousClass024.A0S(A00());
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0031, code lost:
        if (r1 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A04(android.os.CancellationSignal r15) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42271vT.A04(android.os.CancellationSignal):void");
    }

    /* JADX WARN: Finally extract failed */
    public void A05(CancellationSignal cancellationSignal) {
        C3MI c3mi;
        Log.i("xpm/file-prefetcher/importMetadata(); ");
        C0CD A01 = this.A05.A00.A01();
        try {
            C03790Hb A00 = A01.A00();
            long A002 = this.A05.A00();
            if (A002 > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("xpm/file-prefetcher/importMetadata(); metadata was already imported, skipping (has ");
                sb.append(A002);
                sb.append(" entries)");
                Log.i(sb.toString());
                A00.close();
                A01.close();
                return;
            }
            try {
                C81093oL A003 = this.A02.A00();
                try {
                    ParcelFileDescriptor AAD = ((IAppDataReaderService) A003.A00()).AAD();
                    C3MJ c3mj = new C3MJ(new JsonReader(new BufferedReader(new FileReader(AAD.getFileDescriptor()))), AAD);
                    A003.close();
                    int i = 0;
                    while (c3mj.A00()) {
                        try {
                            cancellationSignal.throwIfCanceled();
                            if (!c3mj.A01) {
                                if (c3mj.A00() && (c3mi = c3mj.A00) != null) {
                                    c3mj.A00 = null;
                                    ContentValues contentValues = new ContentValues();
                                    String str = c3mi.A01;
                                    contentValues.put("remote_file_path", str);
                                    contentValues.put("file_size", Long.valueOf(c3mi.A00));
                                    contentValues.putNull("prefetched_file_path");
                                    contentValues.put("prefetched", (Integer) 0);
                                    if (A01.A02.A02("prefetched_files", contentValues) < 0) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("xpm/file-prefetcher/importMetadata(); failed to import metadata for ");
                                        sb2.append(str);
                                        Log.e(sb2.toString());
                                        this.A00.A09("xpm-file-prefetcher-cannot-add-metadata", str, false);
                                    } else {
                                        i++;
                                    }
                                } else {
                                    throw new NoSuchElementException();
                                }
                            } else {
                                throw new IOException("Closed.");
                            }
                        } finally {
                        }
                    }
                    c3mj.close();
                    A00.A00();
                    A00.close();
                    A01.close();
                    StringBuilder sb3 = new StringBuilder("xpm/file-prefetcher/importMetadata(); imported ");
                    sb3.append(i);
                    sb3.append(" entries.");
                    Log.i(sb3.toString());
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            A003.close();
                        } catch (Throwable unused) {
                        }
                        throw th2;
                    }
                }
            } catch (Exception e) {
                throw new IOException(e);
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                try {
                    A01.close();
                } catch (Throwable unused2) {
                }
                throw th4;
            }
        }
    }

    public void A06(CancellationSignal cancellationSignal) {
        Log.i("xpm/file-prefetcher/prefetchAllFiles()");
        if (!this.A08.getAndSet(true)) {
            try {
                try {
                    A05(cancellationSignal);
                    A04(cancellationSignal);
                    return;
                } catch (OperationCanceledException e) {
                    Log.w("xpm/file-prefetcher/prefetchAllFiles()cancelled");
                    throw e;
                }
            } finally {
                this.A08.set(false);
            }
        }
        Log.e("xpm/file-prefetcher/prefetchAllFiles()concurrent prefetch requested, not supported");
        throw new IllegalStateException("Multiple concurrent operations are not supported.");
    }

    public void A07(String str, File file, byte[] bArr, CancellationSignal cancellationSignal) {
        C42261vS c42261vS = this.A05;
        if (str != null) {
            C0CD A00 = c42261vS.A00.A00();
            try {
                Cursor A07 = A00.A02.A07("SELECT prefetched_file_path, prefetched FROM prefetched_files WHERE remote_file_path = ?", new String[]{str});
                if (A07.moveToFirst()) {
                    if (A07.getCount() <= 1) {
                        int columnIndexOrThrow = A07.getColumnIndexOrThrow("prefetched");
                        int columnIndexOrThrow2 = A07.getColumnIndexOrThrow("prefetched_file_path");
                        boolean z = A07.getLong(columnIndexOrThrow) != 0;
                        String string = A07.getString(columnIndexOrThrow2);
                        if (z && !TextUtils.isEmpty(string)) {
                            if (new File(string).exists()) {
                                File file2 = new File(string);
                                A07.close();
                                A00.close();
                                if (this.A06 != null) {
                                    File canonicalFile = file2.getCanonicalFile();
                                    File canonicalFile2 = file.getCanonicalFile();
                                    if (!canonicalFile.equals(canonicalFile2)) {
                                        File parentFile = canonicalFile2.getParentFile();
                                        if (parentFile != null) {
                                            parentFile.mkdirs();
                                        }
                                        if (!canonicalFile.renameTo(canonicalFile2)) {
                                            File canonicalFile3 = canonicalFile.getCanonicalFile();
                                            File canonicalFile4 = canonicalFile2.getCanonicalFile();
                                            if (!canonicalFile3.equals(canonicalFile4)) {
                                                File parentFile2 = canonicalFile4.getParentFile();
                                                if (parentFile2 != null) {
                                                    parentFile2.mkdirs();
                                                }
                                                FileOutputStream fileOutputStream = new FileOutputStream(canonicalFile4);
                                                try {
                                                    FileInputStream fileInputStream = new FileInputStream(canonicalFile3);
                                                    while (true) {
                                                        int read = fileInputStream.read(bArr);
                                                        if (read < 0) {
                                                            break;
                                                        }
                                                        cancellationSignal.throwIfCanceled();
                                                        fileOutputStream.write(bArr, 0, read);
                                                    }
                                                    fileInputStream.close();
                                                } catch (Throwable th) {
                                                    try {
                                                        throw th;
                                                    } finally {
                                                        try {
                                                            fileOutputStream.close();
                                                        } catch (Throwable unused) {
                                                        }
                                                    }
                                                }
                                            }
                                            canonicalFile.delete();
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                throw null;
                            }
                            StringBuilder sb = new StringBuilder();
                            sb.append("File has been moved or deleted: ");
                            sb.append(str);
                            throw new FileNotFoundException(sb.toString());
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("File was not prefetched: ");
                        sb2.append(str);
                        throw new FileNotFoundException(sb2.toString());
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Multiple prefetched files match: ");
                    sb3.append(A07.getCount());
                    throw new FileNotFoundException(sb3.toString());
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Unknown remote file: ");
                sb4.append(str);
                throw new FileNotFoundException(sb4.toString());
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        A00.close();
                    } catch (Throwable unused2) {
                    }
                    throw th3;
                }
            }
        }
        throw null;
    }

    /* JADX WARN: Finally extract failed */
    public void A08(String str, byte[] bArr, CancellationSignal cancellationSignal) {
        File A01 = A01(str);
        File parentFile = A01.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        try {
            C42221vO c42221vO = this.A02;
            try {
                C81093oL A00 = c42221vO.A00();
                ParcelFileDescriptor ACj = ((IAppDataReaderService) A00.A00()).ACj(str);
                FileInputStream fileInputStream = new FileInputStream(ACj.getFileDescriptor());
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(A01);
                    if (c42221vO.A00 == null) {
                        throw null;
                    }
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read < 0) {
                            break;
                        }
                        cancellationSignal.throwIfCanceled();
                        fileOutputStream.write(bArr, 0, read);
                    }
                    fileOutputStream.close();
                    fileInputStream.close();
                    ACj.close();
                    A00.close();
                    C42261vS c42261vS = this.A05;
                    if (c42261vS != null) {
                        String canonicalPath = A01.getCanonicalPath();
                        C0CD A012 = c42261vS.A00.A01();
                        try {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("prefetched", (Integer) 1);
                            contentValues.put("prefetched_file_path", canonicalPath);
                            A012.A02.A00("prefetched_files", contentValues, "remote_file_path = ?", new String[]{str});
                            A012.close();
                            C42221vO c42221vO2 = this.A02;
                            if (c42221vO2 != null) {
                                try {
                                    C81093oL A002 = c42221vO2.A00();
                                    ((IAppDataReaderService) A002.A00()).A75(str);
                                    A002.close();
                                    return;
                                } catch (Exception e) {
                                    throw new IOException(e);
                                }
                            }
                            throw null;
                        } finally {
                        }
                    } else {
                        throw null;
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable unused) {
                        }
                        throw th2;
                    }
                }
            } catch (Exception e2) {
                throw new IOException(e2);
            }
        } catch (OperationCanceledException e3) {
            A01.delete();
            StringBuilder sb = new StringBuilder("xpm/file-prefetcher/importFile(); cancelled while importing ");
            sb.append(str);
            Log.i(sb.toString());
            throw e3;
        }
    }
}
