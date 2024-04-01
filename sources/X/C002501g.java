package X;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.util.Base64;
import com.facebook.soloader.SysUtil$LollipopSysdeps;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: X.01g */
/* loaded from: classes.dex */
public final class C002501g {
    public static volatile DateFormat A00;
    public static volatile DateFormat A01;
    public static volatile DateFormat[] A02;

    public static long A00(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        A0M(fileChannel, byteBuffer, 8, j);
        return byteBuffer.getLong();
    }

    public static long A01(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        A0M(fileChannel, byteBuffer, 4, j);
        return byteBuffer.getInt() & 4294967295L;
    }

    public static C07D A02(C07E c07e, C07E c07e2) {
        HashSet hashSet = new HashSet();
        Iterator it = c07e.A02().iterator();
        while (true) {
            C04250Jl c04250Jl = (C04250Jl) it;
            if (c04250Jl.hasNext()) {
                Object next = c04250Jl.next();
                Map map = c07e2.A00;
                if (!map.containsKey(next) || map.get(next) != c07e.A00.get(next)) {
                    hashSet.add(next);
                }
            } else {
                return new C07D(hashSet, null);
            }
        }
    }

    public static C07D A03(C07E c07e, C07E c07e2) {
        HashSet hashSet = new HashSet();
        Iterator it = c07e2.A02().iterator();
        while (true) {
            C04250Jl c04250Jl = (C04250Jl) it;
            if (c04250Jl.hasNext()) {
                Object next = c04250Jl.next();
                Map map = c07e.A00;
                if (!map.containsKey(next) || map.get(next) != c07e2.A00.get(next)) {
                    hashSet.add(next);
                }
            } else {
                return new C07D(hashSet, null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0150, code lost:
        if (r6 == 3) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C06C A04(android.database.Cursor r15) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C002501g.A04(android.database.Cursor):X.06C");
    }

    public static C0CE A05(SQLiteDatabase sQLiteDatabase, C04Z c04z) {
        Log.i("DatabaseUtils/initDatabase/injected sql log writer/using modified LoggableSQLiteDatabase");
        return new C0CE(sQLiteDatabase, c04z);
    }

    public static File A06(Context context) {
        File file = new File(context.getCacheDir(), "minidumps");
        if (file.exists() && file.isDirectory()) {
            return file;
        }
        if (file.exists()) {
            file.delete();
        }
        if (file.mkdirs()) {
            return file;
        }
        StringBuilder sb = new StringBuilder("Breakpad init failed to create crash directory: ");
        sb.append(file);
        throw new RuntimeException(sb.toString());
    }

    public static String A07(Cursor cursor, int i) {
        try {
            return cursor.getString(i);
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e("DatabaseUtils/tryGetStringOrGetBlob/error reading jids", e);
            throw e;
        } catch (SQLiteException e2) {
            if (e2.getMessage() != null && e2.getMessage().contains("Unable to convert BLOB to string")) {
                byte[] blob = cursor.getBlob(i);
                if (blob == null) {
                    return null;
                }
                try {
                    String str = new String(blob, "UTF-8");
                    StringBuilder sb = new StringBuilder();
                    sb.append("DatabaseUtils/tryGetStringOrGetBlob/converting from blob; rawJids=");
                    sb.append(str);
                    Log.i(sb.toString());
                    return str;
                } catch (UnsupportedEncodingException unused) {
                    return null;
                }
            }
            Log.e("DatabaseUtils/tryGetStringOrGetBlob/error reading jids", e2);
            throw e2;
        }
    }

    public static String A08(C002301c c002301c) {
        return A0G(c002301c.A0I(), c002301c.A05(294));
    }

    public static String A09(C002301c c002301c, long j) {
        return A0H(c002301c).format(new Date(j));
    }

    public static String A0A(C002301c c002301c, long j) {
        String A05;
        DateFormat dateFormat = c002301c.A03;
        if (dateFormat == null) {
            Locale A0I = c002301c.A0I();
            if (Build.VERSION.SDK_INT >= 18) {
                A05 = android.text.format.DateFormat.getBestDateTimePattern(A0I, "MMMd");
            } else {
                A05 = c002301c.A05(170);
            }
            dateFormat = new SimpleDateFormat(A05, A0I);
            c002301c.A03 = dateFormat;
        }
        return ((DateFormat) dateFormat.clone()).format(new Date(j));
    }

    public static String A0B(C002301c c002301c, long j) {
        if (A01 == null) {
            A01 = DateFormat.getDateInstance(2, c002301c.A0I());
        }
        return ((DateFormat) A01.clone()).format(new Date(j));
    }

    public static String A0C(C002301c c002301c, long j) {
        return A0I(c002301c, 0).format(new Date(j));
    }

    public static String A0D(C002301c c002301c, long j) {
        if (A00 == null) {
            A00 = DateFormat.getDateInstance(3, c002301c.A0I());
        }
        return ((DateFormat) A00.clone()).format(new Date(j));
    }

    public static String A0E(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("DatabaseHelper");
        sb.append("/");
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        return sb.toString();
    }

    public static String A0F(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((Jid) it.next()).getRawString());
        }
        Collections.sort(arrayList);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                messageDigest.update(((String) it2.next()).getBytes());
            }
            byte[] digest = messageDigest.digest();
            byte[] bArr = new byte[6];
            System.arraycopy(digest, 0, bArr, 0, 6);
            StringBuilder sb = new StringBuilder("2:");
            sb.append(Base64.encodeToString(bArr, 2));
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x003e, code lost:
        if (r3 == 105) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String A0G(java.util.Locale r4, java.lang.String r5) {
        /*
            int r1 = r5.length()
            if (r1 != 0) goto L7
            return r5
        L7:
            java.lang.String r4 = r4.getLanguage()
            r0 = 0
            int r3 = r5.codePointAt(r0)
            r0 = 105(0x69, float:1.47E-43)
            if (r3 != r0) goto L3e
            java.lang.String r0 = "tr"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L24
            java.lang.String r0 = "az"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L40
        L24:
            r0 = 304(0x130, float:4.26E-43)
        L26:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.appendCodePoint(r0)
            int r0 = java.lang.Character.charCount(r3)
            java.lang.String r0 = r5.substring(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L3e:
            if (r3 != r0) goto L66
        L40:
            r2 = 2
            if (r1 < r2) goto L66
            r0 = 1
            char r1 = r5.charAt(r0)
            r0 = 106(0x6a, float:1.49E-43)
            if (r1 != r0) goto L66
            java.lang.String r0 = "nl"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L66
            java.lang.String r0 = "IJ"
            java.lang.StringBuilder r1 = X.C000200d.A0P(r0)
            java.lang.String r0 = r5.substring(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L66:
            int r0 = java.lang.Character.toTitleCase(r3)
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C002501g.A0G(java.util.Locale, java.lang.String):java.lang.String");
    }

    public static DateFormat A0H(C002301c c002301c) {
        SimpleDateFormat simpleDateFormat;
        DateFormat dateFormat = c002301c.A02;
        SimpleDateFormat simpleDateFormat2 = dateFormat;
        if (dateFormat == null) {
            Locale A0I = c002301c.A0I();
            String A05 = c002301c.A05(173);
            if (A05.contains("MMMM")) {
                String[] A012 = AbstractC09110cf.A01(c002301c, 0);
                SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat(A05, A0I);
                DateFormatSymbols dateFormatSymbols = simpleDateFormat3.getDateFormatSymbols();
                dateFormatSymbols.setMonths(A012);
                simpleDateFormat3.setDateFormatSymbols(dateFormatSymbols);
                simpleDateFormat = simpleDateFormat3;
            } else if (A05.contains("LLLL")) {
                String replace = A05.replace("LLLL", "MMMM");
                String[] A002 = AbstractC09110cf.A00(c002301c);
                SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat(replace, A0I);
                DateFormatSymbols dateFormatSymbols2 = simpleDateFormat4.getDateFormatSymbols();
                dateFormatSymbols2.setMonths(A002);
                simpleDateFormat4.setDateFormatSymbols(dateFormatSymbols2);
                simpleDateFormat = simpleDateFormat4;
            } else {
                simpleDateFormat = new SimpleDateFormat(A05, A0I);
            }
            c002301c.A02 = simpleDateFormat;
            simpleDateFormat2 = simpleDateFormat;
        }
        return (DateFormat) simpleDateFormat2.clone();
    }

    public static DateFormat A0I(C002301c c002301c, int i) {
        if (A02 == null) {
            Locale A0I = c002301c.A0I();
            String A05 = c002301c.A05(169);
            String[] A012 = AbstractC09110cf.A01(c002301c, 0);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(A05, A0I);
            DateFormatSymbols dateFormatSymbols = simpleDateFormat.getDateFormatSymbols();
            dateFormatSymbols.setMonths(A012);
            simpleDateFormat.setDateFormatSymbols(dateFormatSymbols);
            String[] A013 = AbstractC09110cf.A01(c002301c, 1);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(A05, A0I);
            DateFormatSymbols dateFormatSymbols2 = simpleDateFormat2.getDateFormatSymbols();
            dateFormatSymbols2.setMonths(A013);
            simpleDateFormat2.setDateFormatSymbols(dateFormatSymbols2);
            String[] A014 = AbstractC09110cf.A01(c002301c, 2);
            SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat(A05, A0I);
            DateFormatSymbols dateFormatSymbols3 = simpleDateFormat3.getDateFormatSymbols();
            dateFormatSymbols3.setMonths(A014);
            simpleDateFormat3.setDateFormatSymbols(dateFormatSymbols3);
            A02 = new SimpleDateFormat[]{simpleDateFormat, simpleDateFormat2, simpleDateFormat3};
        }
        return (DateFormat) A02[i].clone();
    }

    public static Map A0J(AbstractC000600i abstractC000600i, Map map, Map map2, List list, int i) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map2.entrySet()) {
            DeviceJid deviceJid = (DeviceJid) entry.getKey();
            Number number = (Number) entry.getValue();
            if (!deviceJid.isPrimary() && !list.contains(Integer.valueOf(number.intValue()))) {
                StringBuilder sb = new StringBuilder("key index is not found in valid indexes, jid=");
                sb.append(deviceJid);
                sb.append("; index=");
                sb.append(number);
                abstractC000600i.A09("adv-data-error", sb.toString(), true);
            } else {
                hashMap.put(deviceJid, number);
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            Object key = entry2.getKey();
            Number number2 = (Number) entry2.getValue();
            long longValue = number2.longValue();
            if (longValue > i) {
                hashMap.put(key, number2);
            } else if (map2.containsKey(key) && ((Number) map2.get(key)).longValue() < longValue && list.contains(Integer.valueOf(number2.intValue()))) {
                StringBuilder sb2 = new StringBuilder("DevicesUtil/filterDeviceWithKeyIndexList/larger index exists in current map, jid=");
                sb2.append(key);
                sb2.append("; index=");
                sb2.append(number2);
                Log.i(sb2.toString());
                hashMap.put(key, number2);
            }
        }
        return hashMap;
    }

    public static void A0K(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return;
            }
            for (File file2 : listFiles) {
                A0K(file2);
            }
        }
        if (file.delete() || !file.exists()) {
            return;
        }
        StringBuilder sb = new StringBuilder("could not delete: ");
        sb.append(file);
        throw new IOException(sb.toString());
    }

    public static void A0L(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    A0L(file2);
                }
                return;
            }
            StringBuilder sb = new StringBuilder("cannot list directory ");
            sb.append(file);
            throw new IOException(sb.toString());
        } else if (!file.getPath().endsWith("_lock")) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            try {
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
    }

    public static void A0M(FileChannel fileChannel, ByteBuffer byteBuffer, int i, long j) {
        int read;
        byteBuffer.position(0);
        byteBuffer.limit(i);
        while (byteBuffer.remaining() > 0 && (read = fileChannel.read(byteBuffer, j)) != -1) {
            j += read;
        }
        if (byteBuffer.remaining() <= 0) {
            byteBuffer.position(0);
            return;
        }
        throw new C20700y0("ELF file truncated");
    }

    public static boolean A0N(C0CE c0ce, String str, String str2, String str3, String str4, String str5) {
        if (A0P(str, str3, str4)) {
            return false;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("ALTER TABLE ");
            sb.append(str2);
            sb.append(" ADD ");
            sb.append(str3);
            sb.append(" ");
            sb.append(str4);
            String obj = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str5);
            sb2.append("/addColumnIfNotExists/ALTER_TABLE");
            sb2.toString();
            c0ce.A0C(obj);
            return true;
        } catch (SQLiteException e) {
            StringBuilder sb3 = new StringBuilder("databasehelper/addColumnIfNotExists/alter_table ");
            sb3.append(str3);
            Log.w(sb3.toString(), e);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
        if (r3.delete() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0068, code lost:
        if (r2.delete() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0076, code lost:
        if (r1.delete() != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0O(java.io.File r5, java.lang.String r6) {
        /*
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r5.getPath()
            r1.append(r0)
            java.lang.String r0 = "-wal"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.io.File r3 = new java.io.File
            r3.<init>(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r5.getPath()
            r1.append(r0)
            java.lang.String r0 = "-journal"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r5.getPath()
            r1.append(r0)
            java.lang.String r0 = "-shm"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r0 = r3.exists()
            r5 = 1
            if (r0 == 0) goto L5c
            boolean r0 = r3.delete()
            r4 = 0
            if (r0 == 0) goto L5d
        L5c:
            r4 = 1
        L5d:
            boolean r0 = r2.exists()
            if (r0 == 0) goto L6a
            boolean r0 = r2.delete()
            r3 = 0
            if (r0 == 0) goto L6b
        L6a:
            r3 = 1
        L6b:
            boolean r0 = r1.exists()
            if (r0 == 0) goto L78
            boolean r0 = r1.delete()
            r2 = 0
            if (r0 == 0) goto L79
        L78:
            r2 = 1
        L79:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            java.lang.String r0 = "deleteTemporaryFiles/journalDeleted="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "; writeAheadLogDeleted="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "; sharedDeleted="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i(r0)
            if (r4 == 0) goto La7
            if (r3 == 0) goto La7
            if (r2 == 0) goto La7
            return r5
        La7:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C002501g.A0O(java.io.File, java.lang.String):boolean");
    }

    public static boolean A0P(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(" ");
        sb.append(str3);
        if (!str.contains(sb.toString())) {
            StringBuilder sb2 = new StringBuilder("`");
            sb2.append(str2);
            sb2.append("`\t");
            sb2.append(str3);
            if (!str.contains(sb2.toString())) {
                StringBuilder sb3 = new StringBuilder("(`*)");
                sb3.append(str2);
                sb3.append("(`*)(\\s+)");
                sb3.append(str3);
                if (!Pattern.compile(sb3.toString()).matcher(str).find()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static String[] A0Q() {
        return Build.VERSION.SDK_INT < 21 ? new String[]{Build.CPU_ABI, Build.CPU_ABI2} : SysUtil$LollipopSysdeps.getSupportedAbis();
    }
}
