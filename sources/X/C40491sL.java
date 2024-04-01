package X;

import com.whatsapp.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.Locale;

/* renamed from: X.1sL */
/* loaded from: classes2.dex */
public final class C40491sL {
    public static final FileFilter A00 = new FileFilter() { // from class: X.3eR
        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            String name = file.getName();
            if (name.startsWith("cpu")) {
                for (int i = 3; i < name.length(); i++) {
                    if (name.charAt(i) < '0' || name.charAt(i) > '9') {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
    };

    /* JADX WARN: Code restructure failed: missing block: B:157:0x00ab, code lost:
        if (r7 >= 1024) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x00b1, code lost:
        if (r8[r7] == 10) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x00b7, code lost:
        if (r8[r7] < 48) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x00bd, code lost:
        if (r8[r7] > 57) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x00c0, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x00c3, code lost:
        r1 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x00c5, code lost:
        if (r1 >= 1024) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x00c9, code lost:
        if (r8[r1] < 48) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x00cd, code lost:
        if (r8[r1] > 57) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x00cf, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x00d2, code lost:
        r0 = java.lang.Integer.parseInt(new java.lang.String(r8, r7, r1 - r7)) * com.google.android.search.verification.client.SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x00de, code lost:
        if (r0 <= r6) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x00e0, code lost:
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x00a8, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A00() {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40491sL.A00():int");
    }

    public static int A01() {
        try {
            return new File("/sys/devices/system/cpu/").listFiles(A00).length;
        } catch (NullPointerException | SecurityException unused) {
            return -1;
        }
    }

    public static boolean A02(String str) {
        BufferedReader bufferedReader;
        String readLine;
        String lowerCase = str.toLowerCase(Locale.US);
        Reader reader = null;
        try {
            try {
                FileInputStream fileInputStream = new FileInputStream("/proc/cpuinfo");
                try {
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, "UTF-8"));
                    } catch (UnsupportedEncodingException e) {
                        Log.i("searchFileForText/unsupported-encoding: UTF-8", e);
                        bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
                    }
                    BufferedReader bufferedReader2 = bufferedReader;
                    do {
                        readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            fileInputStream.close();
                            try {
                                bufferedReader2.close();
                                return false;
                            } catch (Exception e2) {
                                Log.w("DeviceInfo/searchFileForText bufferedReader.close failed", e2);
                                return false;
                            }
                        }
                    } while (!readLine.toLowerCase(Locale.US).contains(lowerCase));
                    fileInputStream.close();
                    try {
                        bufferedReader2.close();
                        return true;
                    } catch (Exception e3) {
                        Log.w("DeviceInfo/searchFileForText bufferedReader.close failed", e3);
                        return true;
                    }
                } finally {
                }
            } catch (Exception e4) {
                Log.w("DeviceInfo/searchFileForText read failed", e4);
                if (0 != 0) {
                    try {
                        reader.close();
                        return false;
                    } catch (Exception e5) {
                        Log.w("DeviceInfo/searchFileForText bufferedReader.close failed", e5);
                        return false;
                    }
                }
                return false;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    reader.close();
                    throw th;
                } catch (Exception e6) {
                    Log.w("DeviceInfo/searchFileForText bufferedReader.close failed", e6);
                    throw th;
                }
            }
            throw th;
        }
    }
}
