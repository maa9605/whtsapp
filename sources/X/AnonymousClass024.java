package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.provider.MediaStore;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import com.whatsapp.util.Log;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.io.StringWriter;
import java.io.SyncFailedException;
import java.security.MessageDigest;
import java.text.Normalizer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.024 */
/* loaded from: classes.dex */
public final class AnonymousClass024 {
    public static int A00(C02F c02f, TelephonyManager telephonyManager) {
        if (c02f.A02("android.permission.READ_PHONE_STATE") != 0) {
            return 0;
        }
        return Build.VERSION.SDK_INT < 30 ? telephonyManager.getNetworkType() : telephonyManager.getDataNetworkType();
    }

    public static int A01(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static long A02(File file, AnonymousClass025 anonymousClass025) {
        if (file.exists()) {
            if (!file.isDirectory()) {
                return file.length();
            }
            LinkedList linkedList = new LinkedList();
            linkedList.add(file);
            long j = 0;
            while (linkedList.peek() != null) {
                Object poll = linkedList.poll();
                if (poll != null) {
                    File[] listFiles = ((File) poll).listFiles();
                    if (listFiles != null) {
                        for (File file2 : listFiles) {
                            if (file2.exists()) {
                                if (file2.isDirectory()) {
                                    linkedList.add(file2);
                                } else {
                                    j += (anonymousClass025 == null || ((Boolean) anonymousClass025.A5q(file2)).booleanValue()) ? file2.length() : 0L;
                                }
                            }
                        }
                    }
                } else {
                    throw null;
                }
            }
            return j;
        }
        return 0L;
    }

    public static long A03(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return j;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static Uri A04(Context context, File file) {
        if (Build.VERSION.SDK_INT < 23) {
            return Uri.fromFile(file);
        }
        return FileProvider.A00(context, "com.whatsapp.fileprovider").ADj(file);
    }

    public static File A05(Uri uri) {
        if (uri.getPath() == null) {
            return null;
        }
        if (uri.getScheme() == null || "file".equals(uri.getScheme())) {
            return new File(uri.getPath());
        }
        return null;
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0176: MOVE  (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:228:0x0176 */
    public static File A06(C000400f c000400f, File file, int i, int i2) {
        File file2;
        File file3;
        int i3;
        StringBuilder sb = new StringBuilder("file-utils/truncate-from-end compressedFile:");
        sb.append(file);
        sb.append(" compressedInputFileSizeLimit:");
        sb.append(i);
        sb.append(" bufferSize:");
        sb.append(0);
        sb.append(" uncompressedTruncatedFileSize:");
        sb.append(i2);
        Log.i(sb.toString());
        File file4 = null;
        if (file == null) {
            Log.i("file-utils/truncate-from-end/no-compressed-file");
            return null;
        } else if (file.length() <= i) {
            Log.i("file-utils/truncate-from-end/too-small-no-truncation-required");
            return file;
        } else {
            file.length();
            try {
                if (i2 >= 16384) {
                    try {
                        file3 = File.createTempFile("uncompressed-crashlog", null);
                    } catch (IOException e) {
                        e = e;
                        file3 = null;
                    } catch (Throwable th) {
                        th = th;
                        if (file4 != null) {
                            file4.delete();
                        }
                        throw th;
                    }
                    try {
                        try {
                            RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
                            try {
                                byte[] bArr = new byte[16384];
                                FileInputStream fileInputStream = new FileInputStream(file);
                                GZIPInputStream gZIPInputStream = new GZIPInputStream(fileInputStream, 16384);
                                try {
                                    file3.getAbsolutePath();
                                    do {
                                        i3 = 0;
                                        while (i3 < i2) {
                                            int read = gZIPInputStream.read(bArr, 0, Math.min(16384, i2 - i3));
                                            if (read <= 0) {
                                                break;
                                            }
                                            randomAccessFile.write(bArr, 0, read);
                                            i3 += read;
                                        }
                                        randomAccessFile.seek(0L);
                                    } while (i3 == i2);
                                    gZIPInputStream.close();
                                    fileInputStream.close();
                                    randomAccessFile.getFD().sync();
                                    try {
                                        String name = file.getName();
                                        if (c000400f != null) {
                                            AnonymousClass028 anonymousClass028 = c000400f.A04;
                                            anonymousClass028.A02();
                                            File file5 = new File(anonymousClass028.A03, name);
                                            FileOutputStream fileOutputStream = new FileOutputStream(file5);
                                            try {
                                                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(fileOutputStream);
                                                randomAccessFile.seek(i3);
                                                int i4 = i2 - i3;
                                                int i5 = 0;
                                                while (i5 < i4) {
                                                    int read2 = randomAccessFile.read(bArr, 0, Math.min(16384, i4 - i5));
                                                    if (read2 <= 0) {
                                                        break;
                                                    }
                                                    gZIPOutputStream.write(bArr, 0, read2);
                                                    i5 += read2;
                                                }
                                                randomAccessFile.seek(0L);
                                                int i6 = 0;
                                                while (i6 < i3) {
                                                    int read3 = randomAccessFile.read(bArr, 0, Math.min(16384, i3 - i6));
                                                    if (read3 <= 0) {
                                                        break;
                                                    }
                                                    gZIPOutputStream.write(bArr, 0, read3);
                                                    i6 += read3;
                                                }
                                                StringBuilder sb2 = new StringBuilder();
                                                sb2.append("file-utils/truncate-from-end uncompressedSize:");
                                                sb2.append(i2);
                                                sb2.append(" compressedSize:");
                                                sb2.append(file5.length());
                                                Log.i(sb2.toString());
                                                gZIPOutputStream.close();
                                                randomAccessFile.close();
                                                file3.delete();
                                                return file5;
                                            } catch (Throwable th2) {
                                                try {
                                                    throw th2;
                                                } finally {
                                                    try {
                                                        fileOutputStream.close();
                                                    } catch (Throwable unused) {
                                                    }
                                                }
                                            }
                                        }
                                        throw null;
                                    } catch (IOException e2) {
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append("file-utils/unable to create compressed file");
                                        sb3.append(e2);
                                        Log.e(sb3.toString());
                                        randomAccessFile.close();
                                        file3.delete();
                                        return null;
                                    }
                                } finally {
                                }
                            } catch (Throwable th3) {
                                try {
                                    throw th3;
                                } catch (Throwable th4) {
                                    try {
                                        randomAccessFile.close();
                                    } catch (Throwable unused2) {
                                    }
                                    throw th4;
                                }
                            }
                        } catch (SyncFailedException e3) {
                            Log.e("file-utils/truncate-from-end", e3);
                            if (file3 != null) {
                                file3.delete();
                            }
                            return null;
                        }
                    } catch (IOException e4) {
                        e = e4;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("fileutils/unable to create tempfile/");
                        sb4.append(e);
                        Log.i(sb4.toString());
                        if (file3 != null) {
                            file3.delete();
                        }
                        return null;
                    }
                } else {
                    StringBuilder sb5 = new StringBuilder("uncompressedTruncatedFileSize(");
                    sb5.append(i2);
                    sb5.append(") cannot be less than bufferSize(");
                    sb5.append(16384);
                    sb5.append(")");
                    throw new IllegalArgumentException(sb5.toString());
                }
            } catch (Throwable th5) {
                th = th5;
                file4 = file2;
            }
        }
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00e3: MOVE  (r14 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:164:0x00e3 */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00e1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x00c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.io.File A07(java.io.File r15, java.lang.String r16, java.io.File r17) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass024.A07(java.io.File, java.lang.String, java.io.File):java.io.File");
    }

    public static File A08(String str, String str2) {
        File file;
        try {
            file = new File(str, str2);
        } catch (IOException unused) {
        }
        if (file.getCanonicalPath().startsWith(str)) {
            return file;
        }
        return null;
    }

    public static CharSequence A09(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        Pattern pattern = AnonymousClass029.A04;
        if (pattern == null) {
            pattern = Pattern.compile("[\\u1680\\u2000-\\u200a\\u205f\\u3000]+\\u0020");
            AnonymousClass029.A04 = pattern;
        }
        Matcher matcher = pattern.matcher(charSequence);
        if (matcher.find()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            int i = 0;
            int i2 = 0;
            while (matcher.find(i)) {
                i = matcher.end();
                int start = matcher.start();
                spannableStringBuilder.replace(start - i2, i - i2, (CharSequence) " ");
                i2 += (i - start) - 1;
            }
            return spannableStringBuilder;
        }
        return charSequence;
    }

    public static String A0A() {
        if (Build.VERSION.SDK_INT >= 21) {
            String[] strArr = Build.SUPPORTED_ABIS;
            if (strArr.length > 0) {
                return strArr[0];
            }
        }
        return Build.CPU_ABI;
    }

    public static String A0B(C002301c c002301c, String str, String str2) {
        String A04 = c002301c.A04();
        String str3 = ("ar".equals(A04) || "fa".equals(A04) || "ur".equals(A04)) ? " — " : " • ";
        StringBuilder sb = new StringBuilder();
        sb.append(c002301c.A0E(str));
        sb.append(str3);
        sb.append(c002301c.A0E(str2));
        return sb.toString();
    }

    public static String A0C(File file, long j, MessageDigest messageDigest) {
        if (!file.exists() || j > file.length()) {
            return null;
        }
        messageDigest.reset();
        byte[] bArr = new byte[4096];
        long j2 = 0;
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            int i = 0;
            while (true) {
                if (i == -1) {
                    break;
                }
                i = bufferedInputStream.read(bArr, 0, 4096);
                if (i > 0) {
                    long j3 = i + j2;
                    if (j3 < j) {
                        messageDigest.update(bArr, 0, i);
                        j2 = j3;
                    } else {
                        messageDigest.update(bArr, 0, (int) (j - j2));
                        break;
                    }
                }
            }
            String A04 = C02A.A04(messageDigest.digest());
            bufferedInputStream.close();
            return A04;
        } finally {
        }
    }

    public static String A0D(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        char[] cArr = new char[8192];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        try {
            StringWriter stringWriter = new StringWriter();
            while (true) {
                int read = bufferedReader.read(cArr);
                if (read < 0) {
                    String obj = stringWriter.toString();
                    bufferedReader.close();
                    return obj;
                } else if (!Thread.currentThread().isInterrupted()) {
                    stringWriter.write(cArr, 0, read);
                } else {
                    throw new InterruptedIOException();
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    public static String A0E(CharSequence charSequence) {
        String normalize = Normalizer.normalize(charSequence, Normalizer.Form.NFKD);
        Pattern pattern = AnonymousClass029.A03;
        if (pattern == null) {
            pattern = Pattern.compile("\\p{Mn}+");
            AnonymousClass029.A03 = pattern;
        }
        return pattern.matcher(normalize).replaceAll("").toLowerCase(Locale.US).replace((char) 305, 'i');
    }

    /* JADX WARN: Type inference failed for: r0v171, types: [X.02B] */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.02B] */
    public static String A0F(CharSequence charSequence) {
        C02B c02b = AnonymousClass029.A00;
        C02B c02b2 = c02b;
        if (c02b == null) {
            ?? r2 = new Object(new String[]{"ı", "i", "ة", "ه", "ـ", "", "ى", "ي", "ٱ", "ا", "ڤ", "ف", "ک", "ك", "ں", "ن", "ھ", "ه", "ۃ", "ۂ", "ی", "ي", "ے", "ي", "ە", "ه", "۰", "٠", "۱", "١", "۲", "٢", "۳", "٣", "۴", "٤", "۵", "٥", "۶", "٦", "۷", "٧", "۸", "٨", "۹", "٩", "ࢻ", "ف", "ࢼ", "ق", "ࢽ", "ن", "\u200c", ""}) { // from class: X.02B
                public final HashMap A00;
                public final Pattern A01;

                {
                    int length = r6.length;
                    this.A00 = new HashMap(length >> 1);
                    for (int i = 0; i < length; i += 2) {
                        this.A00.put(r6[i], r6[i + 1]);
                    }
                    this.A01 = Pattern.compile(TextUtils.join("|", this.A00.keySet()));
                }

                public CharSequence A00(CharSequence charSequence2) {
                    Matcher matcher = this.A01.matcher(charSequence2);
                    if (matcher.find()) {
                        StringBuffer stringBuffer = new StringBuffer(charSequence2.length());
                        do {
                            matcher.appendReplacement(stringBuffer, (String) this.A00.get(matcher.group()));
                        } while (matcher.find());
                        matcher.appendTail(stringBuffer);
                        return stringBuffer.toString();
                    }
                    return charSequence2;
                }
            };
            AnonymousClass029.A00 = r2;
            c02b2 = r2;
        }
        C02B c02b3 = AnonymousClass029.A01;
        C02B c02b4 = c02b3;
        if (c02b3 == null) {
            ?? r0 = new Object(new String[]{"ٵ", "ٴا", "ٶ", "ٴو", "ٷ", "ٴۇ", "ٸ", "ٴى", "अॆ", "ऄ", "अा", "आ", "र्इ", "ई", "उु", "ऊ", "एॅ", "ऍ", "एॆ", "ऎ", "एे", "ऐ", "अॉ", "ऑ", "आॅ", "ऑ", "अॊ", "ऒ", "आॆ", "ऒ", "अो", "ओ", "आे", "ओ", "अौ", "औ", "आै", "औ", "अॅ", "ॲ", "अऺ", "ॳ", "अऻ", "ॴ", "आऺ", "ॴ", "अॏ", "ॵ", "अॖ", "ॶ", "अॗ", "ॷ", "অা", "আ", "ঋৃ", "ৠ", "ঌৢ", "ৡ", "ਅਾ", "ਆ", "ੲਿ", "ਇ", "ੲੀ", "ਈ", "ੳੁ", "ਉ", "ੳੂ", "ਊ", "ੲੇ", "ਏ", "ਅੈ", "ਐ", "ੳੋ", "ਓ", "ਅੌ", "ਔ", "અા", "આ", "અૅ", "ઍ", "અે", "એ", "અૈ", "ઐ", "અૉ", "ઑ", "અો", "ઓ", "અાૅ", "ઓ", "અૌ", "ઔ", "અાૈ", "ઔ", "ૅા", "ૉ", "ଅା", "ଆ", "ଏୗ", "ଐ", "ଓୗ", "ଔ", "ஸ்ரீ", "ஶ்ரீ", "ఒౕ", "ఓ", "ఒౌ", "ఔ", "ిౕ", "ీ", "ెౕ", "ే", "ొౕ", "ో", "ಉಾ", "ಊ", "ಒೌ", "ಔ", "ಋಾ", "ೠ", "ഇൗ", "ഈ", "ഉൗ", "ഊ", "എെ", "ഐ", "ഒാ", "ഓ", "ഒൗ", "ഔ", "ണ്\u200d", "ൺ", "ന്\u200d", "ൻ", "ര്\u200d", "ർ", "ല്\u200d", "ൽ", "ള്\u200d", "ൾ", "අා", "ආ", "අැ", "ඇ", "අෑ", "ඈ", "උෟ", "ඌ", "ඍෘ", "ඎ", "ඏෟ", "ඐ", "එ්", "ඒ", "එෙ", "ඓ", "ඔෟ", "ඖ"}) { // from class: X.02B
                public final HashMap A00;
                public final Pattern A01;

                {
                    int length = r6.length;
                    this.A00 = new HashMap(length >> 1);
                    for (int i = 0; i < length; i += 2) {
                        this.A00.put(r6[i], r6[i + 1]);
                    }
                    this.A01 = Pattern.compile(TextUtils.join("|", this.A00.keySet()));
                }

                public CharSequence A00(CharSequence charSequence2) {
                    Matcher matcher = this.A01.matcher(charSequence2);
                    if (matcher.find()) {
                        StringBuffer stringBuffer = new StringBuffer(charSequence2.length());
                        do {
                            matcher.appendReplacement(stringBuffer, (String) this.A00.get(matcher.group()));
                        } while (matcher.find());
                        matcher.appendTail(stringBuffer);
                        return stringBuffer.toString();
                    }
                    return charSequence2;
                }
            };
            AnonymousClass029.A01 = r0;
            c02b4 = r0;
        }
        String normalize = Normalizer.normalize(c02b4.A00(charSequence), Normalizer.Form.NFKD);
        Pattern pattern = AnonymousClass029.A03;
        if (pattern == null) {
            pattern = Pattern.compile("\\p{Mn}+");
            AnonymousClass029.A03 = pattern;
        }
        return c02b2.A00(pattern.matcher(normalize).replaceAll("").toLowerCase(Locale.US)).toString();
    }

    public static String A0G(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return (str.lastIndexOf(File.separator) > lastIndexOf || lastIndexOf < 0) ? "" : str.substring(lastIndexOf + 1);
    }

    public static String A0H(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        int lastIndexOf2 = str.lastIndexOf(File.separator);
        if (lastIndexOf2 > lastIndexOf) {
            lastIndexOf = -1;
        }
        if (lastIndexOf2 < 0) {
            lastIndexOf2 = 0;
        }
        return lastIndexOf >= 0 ? str.substring(lastIndexOf2, lastIndexOf) : str.substring(lastIndexOf2);
    }

    public static String A0I(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    public static String A0J(String str, int i) {
        int length;
        C000700j.A06(true);
        return (str == null || (length = str.length()) <= i) ? str : str.substring(length - i);
    }

    public static String A0K(String str, int i) {
        return (str == null || str.codePointCount(0, str.length()) <= i) ? str : str.substring(0, str.offsetByCodePoints(0, i));
    }

    public static String A0L(String str, int i) {
        if (str == null) {
            return "";
        }
        String A0K = A0K(str, i);
        return str == A0K ? str : C000200d.A0H(A0K, "…");
    }

    public static String A0M(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length << 1);
        for (byte b : bArr) {
            sb.append(Character.forDigit((b >> 4) & 15, 16));
            sb.append(Character.forDigit(b & 15, 16));
        }
        return sb.toString();
    }

    public static JSONObject A0N(InputStream inputStream) {
        String A0D = A0D(inputStream);
        if (A0D != null) {
            return new JSONObject(A0D);
        }
        return null;
    }

    public static void A0O() {
        try {
            if (3 <= Log.level) {
                for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                    StringBuilder sb = new StringBuilder("\n");
                    Thread key = entry.getKey();
                    StackTraceElement[] value = entry.getValue();
                    sb.append("name=");
                    sb.append(key.getName());
                    sb.append(" state=");
                    sb.append(key.getState());
                    sb.append(" tid=");
                    sb.append(key.getId());
                    sb.append('\n');
                    sb.append("### begin stack trace 2.21.9.15(291224746)\n");
                    for (StackTraceElement stackTraceElement : value) {
                        sb.append("    at ");
                        sb.append(stackTraceElement.toString());
                        sb.append('\n');
                    }
                    sb.append("### end stack trace");
                    sb.append('\n');
                    Log.log(3, sb.toString());
                }
            }
        } catch (Throwable th) {
            Log.e("ThreadUtils/logAllStackTraces exception", th);
        }
    }

    public static void A0P(C02C c02c, File file, File file2) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            c02c.A07(fileInputStream);
            File parentFile = file2.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            A0V(fileInputStream, fileOutputStream);
            fileOutputStream.close();
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

    public static void A0Q(C02C c02c, File file, File file2) {
        if (file.renameTo(file2)) {
            return;
        }
        A0P(c02c, file, file2);
        A0f(file);
    }

    public static void A0R(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th) {
            Log.e(th);
        }
    }

    public static void A0S(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    A0S(file2);
                } else {
                    file2.getPath();
                    A0f(file2);
                }
            }
        }
        file.getPath();
        A0f(file);
    }

    public static void A0T(File file, long j) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (System.currentTimeMillis() - file2.lastModified() > j) {
                    StringBuilder A0P = C000200d.A0P("cleanup/");
                    A0P.append(file2.getName());
                    A0P.append(":");
                    A0P.append(System.currentTimeMillis());
                    A0P.append(" - ");
                    A0P.append(file2.lastModified());
                    Log.i(A0P.toString());
                    if (!file2.delete()) {
                        StringBuilder A0P2 = C000200d.A0P("cleanup/failed to delete ");
                        A0P2.append(file2.getName());
                        Log.i(A0P2.toString());
                    }
                }
            }
        }
    }

    public static void A0U(File file, String str) {
        File[] listFiles = file.getParentFile().listFiles();
        if (listFiles == null || (r5 = listFiles.length) <= 0) {
            return;
        }
        for (File file2 : listFiles) {
            StringBuilder A0P = C000200d.A0P(str);
            A0P.append(file2.getName());
            A0P.append(" ");
            A0P.append(file2.length());
            A0P.append(" drw=");
            String str2 = "1";
            A0P.append(file2.isDirectory() ? "1" : "0");
            A0P.append(file2.canRead() ? "1" : "0");
            if (!file2.canWrite()) {
                str2 = "0";
            }
            A0P.append(str2);
            Log.i(A0P.toString());
        }
    }

    public static void A0V(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read < 0) {
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }

    public static void A0W(String str, String str2, SharedPreferences.Editor editor) {
        if (TextUtils.isEmpty(str2)) {
            editor.remove(str);
            return;
        }
        try {
            editor.putFloat(str, Float.parseFloat(str2));
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder("PropsCommon/invalid number format for property; prefKey=");
            sb.append(str);
            sb.append("; value=");
            sb.append(str2);
            Log.w(sb.toString(), e);
            editor.remove(str);
        }
    }

    public static void A0X(String str, String str2, SharedPreferences.Editor editor) {
        if (TextUtils.isEmpty(str2)) {
            editor.remove(str);
            return;
        }
        try {
            editor.putInt(str, Integer.parseInt(str2));
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder("PropsCommon/invalid number format for property; prefKey=");
            sb.append(str);
            sb.append("; value=");
            sb.append(str2);
            Log.w(sb.toString(), e);
            editor.remove(str);
        }
    }

    public static void A0Y(String str, String str2, SharedPreferences.Editor editor) {
        if (TextUtils.isEmpty(str2)) {
            editor.remove(str);
        } else {
            editor.putString(str, str2);
        }
    }

    public static void A0Z(String str, String str2, SharedPreferences.Editor editor) {
        if (TextUtils.isEmpty(str2)) {
            editor.remove(str);
            return;
        }
        try {
            editor.putBoolean(str, Integer.parseInt(str2) != 0);
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder("PropsCommon/invalid number format for property; prefKey=");
            sb.append(str);
            sb.append("; value=");
            sb.append(str2);
            Log.w(sb.toString(), e);
            editor.remove(str);
        }
    }

    public static void A0a(String str, String str2, String str3, SharedPreferences.Editor editor) {
        if (TextUtils.isEmpty(str3)) {
            editor.remove(str);
        } else {
            str2 = str3;
        }
        try {
            new JSONObject(str2);
            editor.putString(str, str2);
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder("PropsCommon/invalid json format for property; prefKey=");
            sb.append(str);
            sb.append("; value=");
            sb.append(str3);
            Log.w(sb.toString(), e);
            editor.remove(str);
            throw new IllegalArgumentException(C000200d.A0J("PropsCommon/invalid json format for property; prefKey=", str, "; value=", str2), e);
        }
    }

    public static void A0b(byte[] bArr, File file) {
        if (bArr != null) {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            try {
                bufferedOutputStream.write(bArr);
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                    try {
                        bufferedOutputStream.close();
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    public static boolean A0c() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean A0d(C000400f c000400f, File file, File file2, boolean z) {
        C02D c02d;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            if (z) {
                c02d = new C02D(c000400f.A05, file2);
            } else {
                c02d = new C02D(c000400f.A04, file2);
            }
            byte[] bArr = new byte[C42271vT.A09];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read >= 0) {
                    c02d.write(bArr, 0, read);
                } else {
                    c02d.close();
                    fileInputStream.close();
                    return true;
                }
            }
        } catch (IOException e) {
            StringBuilder A0P = C000200d.A0P("fileutils/copyfile/failed to copy ");
            A0P.append(z ? "external file" : "internal file");
            Log.e(A0P.toString(), e);
            return false;
        }
    }

    public static boolean A0e(C02E c02e, C02F c02f, Uri uri, boolean z) {
        String scheme = uri.getScheme();
        if ("settings".equals(uri.getAuthority())) {
            return true;
        }
        if ("file".equals(scheme) || "content".equals(scheme)) {
            try {
                try {
                    ContentResolver A07 = c02e.A07();
                    if (A07 == null) {
                        Log.w("file-utils/ringtone-available/false cr=null");
                        return false;
                    }
                    A0R(A07.openInputStream(uri));
                    return true;
                } catch (SQLiteException e) {
                    e = e;
                    StringBuilder sb = new StringBuilder();
                    sb.append("file-utils/ringtone-available/false/file-not-found ");
                    sb.append(uri.toString());
                    Log.i(sb.toString(), e);
                    return false;
                } catch (IllegalStateException e2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("file-utils/ringtone-available/false/illegal-state ");
                    sb2.append(uri.toString());
                    Log.i(sb2.toString(), e2);
                    return false;
                } catch (NullPointerException e3) {
                    e = e3;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("file-utils/ringtone-available/false/file-not-found ");
                    sb3.append(uri.toString());
                    Log.i(sb3.toString(), e);
                    return false;
                }
            } catch (FileNotFoundException e4) {
                e = e4;
                StringBuilder sb32 = new StringBuilder();
                sb32.append("file-utils/ringtone-available/false/file-not-found ");
                sb32.append(uri.toString());
                Log.i(sb32.toString(), e);
                return false;
            } catch (SecurityException e5) {
                if (uri.toString().startsWith(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI.toString())) {
                    Log.i("file-utils/ringtone-available/false/access-denied", e5);
                    if (!c02f.A06()) {
                        return z;
                    }
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("file-utils/ringtone-available/true/cannot-check ");
                    sb4.append(uri.toString());
                    Log.i(sb4.toString(), e5);
                }
                return true;
            }
        }
        return true;
    }

    public static boolean A0f(File file) {
        if (file.exists() && !file.delete()) {
            StringBuilder sb = new StringBuilder("file-utils/delete-file/failed ");
            sb.append(file);
            Log.w(sb.toString());
            return false;
        }
        return true;
    }

    public static boolean A0g(File file) {
        if (file.isDirectory()) {
            try {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        if (!A0g(file2)) {
                            return false;
                        }
                    }
                }
            } catch (OutOfMemoryError e) {
                StringBuilder A0P = C000200d.A0P("trash/delete-recursive/out-of-memory ");
                A0P.append(file.getAbsolutePath());
                Log.e(A0P.toString(), e);
                return false;
            }
        }
        return file.delete();
    }

    public static boolean A0h(File file) {
        String absolutePath = file.getAbsolutePath();
        if (file.exists()) {
            if (file.isDirectory()) {
                StringBuilder sb = new StringBuilder("FileUtils/prepareEmptyDir/Directory already exists unexpectedly! Cleaning up. ");
                sb.append(absolutePath);
                Log.e(sb.toString());
                A0T(file, -1L);
                return true;
            }
            C000200d.A13("FileUtils/prepareEmptyDir/Directory already exists unexpectedly and is a file! Wrong call.", absolutePath);
            return false;
        } else if (file.mkdirs()) {
            return true;
        } else {
            C000200d.A13("FileUtils/prepareEmptyDir/Could not make directory ", absolutePath);
            return false;
        }
    }

    public static boolean A0i(InputStream inputStream, File file) {
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    bufferedOutputStream.write(bArr, 0, read);
                } else {
                    bufferedOutputStream.close();
                    return true;
                }
            }
        } catch (IOException e) {
            StringBuilder A0P = C000200d.A0P("FileUtils/saveInputStreamToFile/could not save file to:");
            A0P.append(file.getAbsolutePath());
            Log.e(A0P.toString(), e);
            return false;
        }
    }

    public static boolean A0j(CharSequence charSequence) {
        int length;
        if (charSequence != null && (length = charSequence.length()) != 0) {
            for (int i = 0; i < length; i++) {
                char charAt = charSequence.charAt(i);
                if (charAt != 8203 && !Character.isWhitespace(charAt)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean A0k(CharSequence charSequence, CharSequence charSequence2) {
        return (TextUtils.isEmpty(charSequence) && TextUtils.isEmpty(charSequence2)) || TextUtils.equals(charSequence, charSequence2);
    }

    public static boolean A0l(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static boolean A0m(String str) {
        int length;
        return str != null && 5 <= (length = str.length()) && length <= 20;
    }

    public static byte[] A0n(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return A0o(fileInputStream);
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

    public static byte[] A0o(InputStream inputStream) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(inputStream.available());
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, 8192);
                if (read < 0) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }
}
