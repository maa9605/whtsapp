package X;

import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* renamed from: X.15u  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C232515u {
    public static int A00;
    public static String A01;

    public static String A00() {
        BufferedReader bufferedReader;
        String obj;
        StrictMode.ThreadPolicy allowThreadDiskReads;
        String str = A01;
        if (str == null) {
            int i = A00;
            if (i == 0) {
                i = Process.myPid();
                A00 = i;
            }
            str = null;
            str = null;
            str = null;
            BufferedReader bufferedReader2 = null;
            str = null;
            if (i > 0) {
                try {
                    try {
                        StringBuilder sb = new StringBuilder(25);
                        sb.append("/proc/");
                        sb.append(i);
                        sb.append("/cmdline");
                        obj = sb.toString();
                        allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    } catch (IOException unused) {
                        bufferedReader = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        bufferedReader = new BufferedReader(new FileReader(obj));
                        try {
                            str = bufferedReader.readLine().trim();
                            bufferedReader.close();
                        } catch (IOException unused2) {
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            A01 = str;
                            return str;
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader2 = bufferedReader;
                            if (bufferedReader2 != null) {
                                try {
                                    bufferedReader2.close();
                                } catch (IOException unused3) {
                                }
                            }
                            throw th;
                        }
                    } finally {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                } catch (IOException unused4) {
                }
            }
            A01 = str;
        }
        return str;
    }
}
