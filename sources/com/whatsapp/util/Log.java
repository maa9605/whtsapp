package com.whatsapp.util;

import X.C000200d;
import X.C000900l;
import X.C001500r;
import X.C003101m;
import android.os.Looper;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class Log {
    public static final C001500r LOGGER_THREAD;
    public static FileChannel channel = null;
    public static C000900l connectivityInfoProvider = null;
    public static int level = 5;
    public static File logFile;
    public static File logTempFile;
    public static String timezone;
    public static final AtomicReference logDirRef = new AtomicReference();
    public static final CountDownLatch logFileLatch = new CountDownLatch(1);
    public static final PrintStream ORIGINAL_SYSTEM_ERR = System.err;
    public static final ReentrantLock writeFileLock = new ReentrantLock(true);
    public static final Object tempFileLock = new Object();
    public static final Object compressFileLock = new Object();
    public static final CharsetEncoder DO_LOG_ENCODER = Charset.defaultCharset().newEncoder();
    public static final ByteBuffer DO_LOG_ENCODE_BUFFER = ByteBuffer.allocate(16384);

    static {
        C001500r c001500r = new C001500r();
        c001500r.start();
        LOGGER_THREAD = c001500r;
    }

    public static int A00(File file, File file2) {
        int length;
        String name = file2.getName();
        int length2 = name.length() + 1;
        File[] listFiles = file.getParentFile().listFiles();
        if (listFiles != null) {
            int i = 0;
            for (File file3 : listFiles) {
                String name2 = file3.getName();
                if (name2.startsWith(name) && length2 < (length = name2.length())) {
                    try {
                        int parseInt = Integer.parseInt(name2.substring(length2, length));
                        if (parseInt > i) {
                            i = parseInt;
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
            return i;
        }
        return 0;
    }

    public static void a(String str) {
        log("LL_A ", str);
    }

    public static void a(boolean z) {
        if (z) {
            return;
        }
        log("LL_A ", "Assertion Failed");
    }

    public static String adorn(String str, StringBuilder sb) {
        String str2;
        StringBuilder sb2;
        Thread currentThread = Thread.currentThread();
        long id = currentThread.getId();
        String name = currentThread.getName();
        StringBuilder A0P = C000200d.A0P(str);
        C000900l c000900l = connectivityInfoProvider;
        if (c000900l != null) {
            str2 = (String) c000900l.A00.get();
        } else {
            str2 = "D";
        }
        String A0L = C000200d.A0L(A0P, str2, " ");
        if (level < 5) {
            int length = name.length() + A0L.length() + 20 + 4;
            if (sb.length() > 16384) {
                sb2 = new StringBuilder(length + 16384 + 3);
                sb2.append(A0L);
                sb2.append('[');
                sb2.append(id);
                sb2.append(':');
                sb2.append(name);
                sb2.append("] ");
                sb2.append(sb.substring(0, 16384));
                sb2.append("...");
            } else {
                sb2 = new StringBuilder(sb.length() + length);
                sb2.append(A0L);
                sb2.append('[');
                sb2.append(id);
                sb2.append(':');
                sb2.append(name);
                sb2.append("] ");
                sb2.append((CharSequence) sb);
            }
            return sb2.toString();
        }
        StackTraceElement[] stackTrace = currentThread.getStackTrace();
        String str3 = "";
        String str4 = "";
        int i = 5;
        while (true) {
            if (i >= stackTrace.length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            if (!stackTraceElement.isNativeMethod()) {
                if (stackTraceElement.getFileName() == null) {
                    str4 = String.valueOf(stackTraceElement.getLineNumber());
                    str3 = "(null)";
                } else {
                    str3 = stackTraceElement.getFileName();
                    str4 = String.valueOf(stackTraceElement.getLineNumber());
                    break;
                }
            } else if (i == 5) {
                str3 = stackTraceElement.getFileName();
                str4 = "native";
            }
            i++;
        }
        StringBuilder sb3 = new StringBuilder(sb.length() + str4.length() + str3.length() + name.length() + A0L.length() + 1 + 20 + 1 + 1 + 1 + 1);
        sb3.append(A0L);
        sb3.append('[');
        sb3.append(id);
        sb3.append(':');
        sb3.append(name);
        sb3.append(']');
        sb3.append(str3);
        sb3.append(':');
        sb3.append(str4);
        sb3.append(' ');
        sb3.append((CharSequence) sb);
        return sb3.toString();
    }

    public static void blockingLog(int i, String str) {
        Thread currentThread;
        C001500r c001500r;
        if (i <= level) {
            String adorn = adorn(getLogPrefix(i), new StringBuilder(str));
            if (1 == 0 && (currentThread = Thread.currentThread()) != (c001500r = LOGGER_THREAD)) {
                if (currentThread == c001500r) {
                    blockingLog(2, "postLog called on the logging thread. Next log will be out of order.");
                    doLogToFile(adorn);
                } else {
                    c001500r.A01(adorn);
                }
            } else {
                doLogToFile(adorn);
            }
            if (level == 5) {
                logToLogcat(i, adorn);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x0129, code lost:
        if (r4.getAbsolutePath().equals(r5.getAbsolutePath()) == false) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.io.File compress() {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.Log.compress():java.io.File");
    }

    public static void d(String str) {
        int i = level;
        if (i == 5) {
            logToLogcat(4, log("LL_D ", str));
        } else if (i < 4) {
        } else {
            log("LL_D ", str);
        }
    }

    public static void d(String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("; exception=");
        sb.append(th);
        String obj = sb.toString();
        int i = level;
        if (i == 5) {
            logToLogcat(4, log("LL_D ", obj, getStackTraceString(th)));
        } else if (i < 4) {
        } else {
            log("LL_D ", obj, getStackTraceString(th));
        }
    }

    public static void d(Throwable th) {
        int i = level;
        if (i == 5) {
            logToLogcat(4, log("LL_D ", getStackTraceString(th)));
        } else if (i < 4) {
        } else {
            log("LL_D ", getStackTraceString(th));
        }
    }

    public static void doLogToFile(String str) {
        StringBuilder sb = new StringBuilder();
        Calendar calendar = Calendar.getInstance();
        sb.append(calendar.get(1));
        sb.append('-');
        if (calendar.get(2) < 9) {
            sb.append('0');
        }
        sb.append(calendar.get(2) + 1);
        sb.append('-');
        if (calendar.get(5) < 10) {
            sb.append('0');
        }
        sb.append(calendar.get(5));
        sb.append(' ');
        if (calendar.get(11) < 10) {
            sb.append('0');
        }
        sb.append(calendar.get(11));
        sb.append(':');
        if (calendar.get(12) < 10) {
            sb.append('0');
        }
        sb.append(calendar.get(12));
        sb.append(':');
        if (calendar.get(13) < 10) {
            sb.append('0');
        }
        sb.append(calendar.get(13));
        sb.append('.');
        if (calendar.get(14) < 10) {
            sb.append("00");
        } else if (calendar.get(14) < 100) {
            sb.append('0');
        }
        sb.append(calendar.get(14));
        sb.append(' ');
        writeFileLock.lock();
        try {
            try {
            } catch (IOException e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("IOException on ");
                sb2.append(str);
                android.util.Log.e("WhatsApp", sb2.toString(), e);
            }
            if (initialize()) {
                FileChannel fileChannel = channel;
                if (fileChannel != null) {
                    fileChannel.position(fileChannel.size());
                    FileChannel fileChannel2 = channel;
                    CharsetEncoder charsetEncoder = DO_LOG_ENCODER;
                    ByteBuffer byteBuffer = DO_LOG_ENCODE_BUFFER;
                    encodeAndWriteToChannel(fileChannel2, charsetEncoder, byteBuffer, sb);
                    FileChannel fileChannel3 = channel;
                    CharsetEncoder charsetEncoder2 = DO_LOG_ENCODER;
                    ByteBuffer byteBuffer2 = DO_LOG_ENCODE_BUFFER;
                    encodeAndWriteToChannel(fileChannel3, charsetEncoder2, byteBuffer, str);
                    encodeAndWriteToChannel(channel, charsetEncoder2, byteBuffer2, "\n");
                    return;
                }
                throw new NullPointerException();
            }
        } finally {
            writeFileLock.unlock();
        }
    }

    public static void doLogToLogcat(int i, String str) {
        if (i != 0 && i != 5) {
            if (i == 4) {
                android.util.Log.d("WhatsApp", str);
                return;
            } else if (i == 3) {
                android.util.Log.i("WhatsApp", str);
                return;
            } else if (i == 2) {
                android.util.Log.w("WhatsApp", str);
                return;
            } else if (i != 1) {
                return;
            } else {
                android.util.Log.e("WhatsApp", str);
                return;
            }
        }
        android.util.Log.v("WhatsApp", str);
    }

    public static void e(String str) {
        if (level == 5) {
            logToLogcat(1, log("LL_E ", str));
        } else {
            log("LL_E ", str);
        }
    }

    public static void e(String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("; exception=");
        sb.append(th);
        String obj = sb.toString();
        int i = level;
        String stackTraceString = getStackTraceString(th);
        if (i == 5) {
            logToLogcat(1, log("LL_E ", obj, stackTraceString));
        } else {
            log("LL_E ", obj, stackTraceString);
        }
    }

    public static void e(Throwable th) {
        int i = level;
        String stackTraceString = getStackTraceString(th);
        if (i == 5) {
            logToLogcat(1, log("LL_E ", stackTraceString));
        } else {
            log("LL_E ", stackTraceString);
        }
    }

    public static void encodeAndWriteToChannel(FileChannel fileChannel, CharsetEncoder charsetEncoder, ByteBuffer byteBuffer, CharSequence charSequence) {
        CharBuffer wrap = CharBuffer.wrap(charSequence);
        charsetEncoder.reset();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        charsetEncoder.onMalformedInput(codingErrorAction);
        charsetEncoder.onUnmappableCharacter(codingErrorAction);
        byteBuffer.clear();
        CoderResult coderResult = CoderResult.OVERFLOW;
        while (coderResult.isOverflow()) {
            coderResult = charsetEncoder.encode(wrap, byteBuffer, true);
            byteBuffer.flip();
            if (coderResult.isError()) {
                coderResult.throwException();
            }
            fileChannel.write(byteBuffer);
            byteBuffer.clear();
        }
    }

    public static void flush() {
        try {
            blockingLog(5, "log/flush/start");
            C001500r c001500r = LOGGER_THREAD;
            if (Thread.currentThread() == c001500r) {
                int size = c001500r.A03.size();
                for (int i = 0; i < size; i++) {
                    c001500r.A00();
                }
            } else {
                FutureTask futureTask = new FutureTask(C001500r.A05, null);
                c001500r.A01(futureTask);
                while (!futureTask.isDone()) {
                    try {
                        futureTask.get();
                    } catch (InterruptedException | ExecutionException unused) {
                    }
                }
            }
            blockingLog(5, "log/flush/logs written");
            blockingLog(5, "log/flush/forcing to disk");
            writeFileLock.lock();
            FileChannel fileChannel = channel;
            if (fileChannel != null && fileChannel.isOpen()) {
                channel.force(true);
            }
            writeFileLock.unlock();
            blockingLog(5, "log/flush/end");
        } catch (IOException e) {
            String logPrefix = getLogPrefix(1);
            StringBuilder sb = new StringBuilder("log/flush/failed");
            sb.append("; exception=");
            sb.append(e);
            String obj = sb.toString();
            String stackTraceString = getStackTraceString(e);
            StringBuilder sb2 = new StringBuilder(stackTraceString.length() + obj.length() + 1);
            C000200d.A1T(sb2, obj, "\n", stackTraceString);
            String adorn = adorn(logPrefix, sb2);
            doLogToFile(adorn);
            if (level == 5) {
                logToLogcat(1, adorn);
            }
        }
    }

    public static ArrayList getLatestLogs(int i) {
        File file = logFile;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        ArrayList arrayList = new ArrayList();
        Date date = new Date();
        String pattern = simpleDateFormat.toPattern();
        String A0C = C003101m.A0C(file.getName(), ".gz");
        String A09 = C003101m.A09(file.getName());
        File[] listFiles = file.getParentFile().listFiles();
        if (listFiles != null) {
            Arrays.sort(listFiles);
            for (File file2 : listFiles) {
                String name = file2.getName();
                if (name.startsWith(A09) && name.endsWith(A0C)) {
                    int length = A09.length();
                    try {
                        if ((date.getTime() - simpleDateFormat.parse(name.substring(length, pattern.length() + length)).getTime()) / TimeUnit.DAYS.toMillis(1L) < i) {
                            arrayList.add(file2);
                        }
                    } catch (ParseException unused) {
                    }
                }
            }
        }
        return arrayList;
    }

    public static String getLogPrefix(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                return "LL_V ";
                            }
                            throw new IllegalArgumentException(C000200d.A0D("Invalid log level ", i));
                        }
                        return "LL_D ";
                    }
                    return "LL_I ";
                }
                return "LL_W ";
            }
            return "LL_E ";
        }
        return "LL_A ";
    }

    public static String getStackTraceString(Throwable th) {
        if (th == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("### begin stack trace 2.21.9.15(291224746)\n");
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        sb.append(stringWriter.toString());
        sb.append("### end stack trace");
        return sb.toString();
    }

    public static void i(String str) {
        int i = level;
        if (i == 5) {
            logToLogcat(3, log("LL_I ", str));
        } else if (i < 3) {
        } else {
            log("LL_I ", str);
        }
    }

    public static void i(String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("; exception=");
        sb.append(th);
        String obj = sb.toString();
        int i = level;
        if (i == 5) {
            logToLogcat(3, log("LL_I ", obj, getStackTraceString(th)));
        } else if (i < 3) {
        } else {
            log("LL_I ", obj, getStackTraceString(th));
        }
    }

    public static void i(Throwable th) {
        int i = level;
        if (i == 5) {
            logToLogcat(3, log("LL_I ", getStackTraceString(th)));
        } else if (i < 3) {
        } else {
            log("LL_I ", getStackTraceString(th));
        }
    }

    public static boolean initialize() {
        Thread currentThread;
        C001500r c001500r;
        FileChannel fileChannel = channel;
        if (fileChannel == null || !fileChannel.isOpen()) {
            if (Looper.myLooper() == Looper.getMainLooper() && logFileLatch.getCount() == 1) {
                throw new AssertionError("If Log.initialize() is called on the main thread,  Log.setApplicationContext() must have been called beforehand.");
            }
            try {
                logFileLatch.await();
                File file = (File) logDirRef.get();
                if (file == null) {
                    return false;
                }
                if (file.exists() || file.mkdirs()) {
                    channel = new FileOutputStream(logFile, true).getChannel();
                    PrintStream printStream = System.err;
                    PrintStream printStream2 = ORIGINAL_SYSTEM_ERR;
                    boolean z = printStream != printStream2;
                    System.setErr(new PrintStream(new OutputStream(new PrintStream(printStream2) { // from class: X.02G
                        @Override // java.io.PrintStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                        public void close() {
                        }
                    }, Channels.newOutputStream(channel)) { // from class: X.02H
                        public final OutputStream A00;
                        public final OutputStream A01;

                        {
                            this.A00 = r1;
                            this.A01 = r2;
                        }

                        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                        public void close() {
                            try {
                                this.A00.close();
                            } finally {
                                this.A01.close();
                            }
                        }

                        @Override // java.io.OutputStream, java.io.Flushable
                        public void flush() {
                            this.A00.flush();
                            this.A01.flush();
                        }

                        @Override // java.io.OutputStream
                        public void write(int i) {
                            this.A00.write(i);
                            this.A01.write(i);
                        }

                        @Override // java.io.OutputStream
                        public void write(byte[] bArr) {
                            this.A00.write(bArr);
                            this.A01.write(bArr);
                        }

                        @Override // java.io.OutputStream
                        public void write(byte[] bArr, int i, int i2) {
                            this.A00.write(bArr, i, i2);
                            this.A01.write(bArr, i, i2);
                        }
                    }, true));
                    if (z) {
                        printStream.close();
                    } else {
                        printStream.flush();
                    }
                    Calendar calendar = Calendar.getInstance();
                    int i = (calendar.get(16) + calendar.get(15)) / 60000;
                    int i2 = i / 60;
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[3];
                    objArr[0] = Character.valueOf(i2 < 0 ? '-' : '+');
                    objArr[1] = Integer.valueOf(Math.abs(i2));
                    objArr[2] = Integer.valueOf(Math.abs(i % 60));
                    String format = String.format(locale, "%c%02d%02d", objArr);
                    timezone = format;
                    StringBuilder A0P = C000200d.A0P("==== logfile level=");
                    A0P.append(level);
                    A0P.append(" tz=");
                    String adorn = adorn("LL_I ", new StringBuilder(C000200d.A0L(A0P, format, " ====")));
                    if (1 == 0 && (currentThread = Thread.currentThread()) != (c001500r = LOGGER_THREAD)) {
                        if (currentThread == c001500r) {
                            blockingLog(2, "postLog called on the logging thread. Next log will be out of order.");
                            doLogToFile(adorn);
                        } else {
                            c001500r.A01(adorn);
                        }
                    } else {
                        doLogToFile(adorn);
                    }
                    FileChannel fileChannel2 = channel;
                    return fileChannel2 != null && fileChannel2.isOpen();
                }
                return false;
            } catch (FileNotFoundException | InterruptedException unused) {
                return false;
            }
        }
        return true;
    }

    public static String log(String str, String str2) {
        String adorn = adorn(str, new StringBuilder(str2));
        logAdorned(adorn, false);
        return adorn;
    }

    public static String log(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str3.length() + str2.length() + 1);
        C000200d.A1T(sb, str2, "\n", str3);
        String adorn = adorn(str, sb);
        logAdorned(adorn, false);
        return adorn;
    }

    public static void log(int i, String str) {
        if (i <= level) {
            String log = log(getLogPrefix(i), str);
            if (level == 5) {
                logToLogcat(i, log);
            }
        }
    }

    public static String logAdorned(String str, boolean z) {
        Thread currentThread;
        C001500r c001500r;
        if (!z && (currentThread = Thread.currentThread()) != (c001500r = LOGGER_THREAD)) {
            if (currentThread == c001500r) {
                blockingLog(2, "postLog called on the logging thread. Next log will be out of order.");
                doLogToFile(str);
                return str;
            }
            c001500r.A01(str);
            return str;
        }
        doLogToFile(str);
        return str;
    }

    public static void logToLogcat(int i, String str) {
        int length = str.length();
        if (length <= 4000) {
            doLogToLogcat(i, str);
            return;
        }
        StringBuilder sb = new StringBuilder(4006);
        int i2 = 0;
        while (length - i2 > 4000) {
            if (i2 > 0) {
                sb.append("...");
            }
            sb.append(str.substring(i2, (i2 + 4000) - 3));
            sb.append("...");
            doLogToLogcat(i, sb.toString());
            i2 += 3997;
            sb.setLength(0);
        }
        StringBuilder sb2 = new StringBuilder(4006);
        if (i2 > 0) {
            sb2.append("...");
        }
        sb2.append(str.substring(i2, length));
        doLogToLogcat(i, sb2.toString());
    }

    public static boolean rotate() {
        synchronized (tempFileLock) {
            writeFileLock.lock();
            boolean z = false;
            if (!initialize()) {
                writeFileLock.unlock();
                return false;
            }
            FileChannel fileChannel = channel;
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                    channel = null;
                    File file = logFile;
                    File file2 = logTempFile;
                    if (file.exists()) {
                        int A00 = A00(file, file2);
                        StringBuilder sb = new StringBuilder();
                        sb.append(file2.getPath());
                        sb.append(".");
                        sb.append(A00 + 1);
                        try {
                            z = file.renameTo(new File(sb.toString()));
                        } catch (SecurityException unused) {
                        }
                    }
                    initialize();
                    writeFileLock.unlock();
                    return z;
                } catch (IOException unused2) {
                    channel = null;
                    writeFileLock.unlock();
                    return false;
                } catch (Throwable th) {
                    channel = null;
                    throw th;
                }
            }
            throw new NullPointerException();
        }
    }

    public static void v(String str) {
        if (level >= 5) {
            logToLogcat(5, log("LL_V ", str));
        }
    }

    public static void v(String str, Throwable th) {
        if (level >= 5) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("; exception=");
            sb.append(th);
            logToLogcat(5, log("LL_V ", sb.toString(), getStackTraceString(th)));
        }
    }

    public static void v(Throwable th) {
        if (level >= 5) {
            logToLogcat(5, log("LL_V ", getStackTraceString(th)));
        }
    }

    public static void w(String str) {
        int i = level;
        if (i == 5) {
            logToLogcat(2, log("LL_W ", str));
        } else if (i < 2) {
        } else {
            log("LL_W ", str);
        }
    }

    public static void w(String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("; exception=");
        sb.append(th);
        String obj = sb.toString();
        int i = level;
        if (i == 5) {
            logToLogcat(2, log("LL_W ", obj, getStackTraceString(th)));
        } else if (i < 2) {
        } else {
            log("LL_W ", obj, getStackTraceString(th));
        }
    }

    public static void w(Throwable th) {
        int i = level;
        if (i == 5) {
            logToLogcat(2, log("LL_W ", getStackTraceString(th)));
        } else if (i < 2) {
        } else {
            log("LL_W ", getStackTraceString(th));
        }
    }
}
