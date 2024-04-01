package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.MimeTypeMap;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

/* renamed from: X.0DD */
/* loaded from: classes.dex */
public class C0DD {
    public static int A00 = -1;
    public static String A01;
    public static final BitmapFactory.Options A02;
    public static final DecimalFormat A03;

    static {
        BitmapFactory.Options options = new BitmapFactory.Options();
        A02 = options;
        options.inDither = true;
        options.inInputShareable = true;
        options.inPurgeable = true;
        A03 = new DecimalFormat("0000", new DecimalFormatSymbols(Locale.US));
    }

    public static byte A00(String str) {
        if (str != null) {
            if (str.startsWith("audio")) {
                return (byte) 2;
            }
            if (str.startsWith("video")) {
                return (byte) 3;
            }
            if (str.startsWith("image")) {
                return (byte) 1;
            }
            if (str.startsWith("text/x-vcard") || str.startsWith("text/vcard")) {
                return (byte) 4;
            }
            return str.startsWith("text") ? (byte) 0 : (byte) 9;
        }
        return (byte) -1;
    }

    public static int A01(ContentResolver contentResolver, Uri uri) {
        File A05 = AnonymousClass024.A05(uri);
        int i = 0;
        if (A05 != null) {
            i = A04(A05.getPath());
        } else if ("content".equals(uri.getScheme())) {
            String[] strArr = {"_data", "orientation"};
            Uri build = uri.buildUpon().query(null).build();
            if (contentResolver != null) {
                try {
                    Cursor query = contentResolver.query(build, strArr, null, null, null);
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                if (query.getColumnCount() == 2) {
                                    String string = query.getString(0);
                                    if (string != null) {
                                        i = A04(string);
                                    } else {
                                        int i2 = query.getInt(1);
                                        if (i2 == 90) {
                                            i = 6;
                                        } else if (i2 == 180) {
                                            i = 3;
                                        } else if (i2 == 270) {
                                            i = 8;
                                        }
                                    }
                                } else {
                                    Log.e("sample_rotate_image/no_orientation_info");
                                }
                            } else {
                                Log.e("sample_rotate_image/cursor_is_empty");
                            }
                        } finally {
                            query.close();
                        }
                    }
                } catch (Exception e) {
                    Log.w("sample_rotate_image/query_orientation_info", e);
                }
            } else {
                Log.w("media-file-utils/get-exiff-orientation cr=null");
            }
        }
        C000200d.A0q("sample_rotate_image/orientation ", i);
        return i;
    }

    public static int A02(C012005w c012005w, String str, C0DC c0dc, int i, int i2) {
        File A0E = c012005w.A0E(c0dc.A00, i, i2);
        int i3 = 0;
        int i4 = -1;
        if (A0E.exists()) {
            File[] listFiles = A0E.listFiles();
            if (listFiles != null) {
                String A0N = C000200d.A0N(new StringBuilder(), c0dc.A01, "-", str, "-WA");
                int length = listFiles.length;
                while (i3 < length) {
                    String name = listFiles[i3].getName();
                    if (name.startsWith(A0N) && name.length() > 19) {
                        try {
                            int parseInt = Integer.parseInt(name.substring(15, 19));
                            if (parseInt > i4) {
                                i4 = parseInt;
                            }
                        } catch (NumberFormatException e) {
                            StringBuilder sb = new StringBuilder("mediafileutils/findlargestfileindex/nfe:");
                            sb.append(name);
                            Log.i(sb.toString(), e);
                        }
                    }
                    i3++;
                }
                i3 = length;
            } else {
                StringBuilder sb2 = new StringBuilder("mediafileutils/findlargestfileindex/no files for mmsType:");
                sb2.append(c0dc);
                Log.i(sb2.toString());
            }
        }
        StringBuilder sb3 = new StringBuilder("mediafileutils/findlargestfileindex mmsType:");
        sb3.append(c0dc);
        sb3.append(" fileIndex:");
        sb3.append(i4);
        sb3.append(" total:");
        C000200d.A1F(sb3, i3);
        return i4;
    }

    public static int A03(File file) {
        long A05 = A05(file);
        int i = (int) (A05 / 1000);
        if (i != 0 || A05 == 0) {
            return i;
        }
        return 1;
    }

    public static int A04(String str) {
        C0HT c0ht = new C0HT(str);
        C0HU A032 = c0ht.A03("Orientation");
        if (A032 != null) {
            try {
                return A032.A06(c0ht.A09);
            } catch (NumberFormatException unused) {
                return 1;
            }
        }
        return 1;
    }

    public static long A05(File file) {
        if (file != null && file.exists()) {
            if (file.getName().endsWith(".opus")) {
                C0HV c0hv = null;
                try {
                    c0hv = C0HV.A00(file, 3, null);
                    c0hv.A04();
                    long A022 = c0hv.A02();
                    c0hv.A05();
                    return A022;
                } catch (IOException unused) {
                    if (c0hv != null) {
                        c0hv.A05();
                    }
                } catch (Throwable th) {
                    if (c0hv != null) {
                        c0hv.A05();
                    }
                    throw th;
                }
            } else if (C40841sx.A0i(file)) {
                return 0L;
            } else {
                try {
                    C40831sw c40831sw = new C40831sw();
                    c40831sw.A00(file);
                    long parseLong = Long.parseLong(c40831sw.extractMetadata(9));
                    c40831sw.close();
                    return parseLong;
                } catch (Exception e) {
                    Log.e("getmediadurationseconds", e);
                    return 0L;
                }
            }
        }
        return 0L;
    }

    public static Bitmap A06(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 21) {
            return bitmap;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, A02);
    }

    public static Bitmap A07(Bitmap bitmap, int i, float f) {
        Rect rect;
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.getWidth();
            bitmap.getHeight();
            Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            float f2 = i;
            RectF rectF = new RectF(0.0f, 0.0f, f2, f2);
            int width = (bitmap.getWidth() - bitmap.getHeight()) >> 1;
            if (width > 0) {
                rect = new Rect(width, 0, bitmap.getWidth() - width, bitmap.getHeight());
            } else {
                rect = new Rect(0, -width, bitmap.getWidth(), bitmap.getHeight() + width);
            }
            paint.setAntiAlias(true);
            paint.setDither(true);
            paint.setFilterBitmap(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(-1);
            if (f >= 0.0f) {
                canvas.drawRoundRect(rectF, f, f, paint);
            } else {
                canvas.drawArc(rectF, 0.0f, 360.0f, true, paint);
            }
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap, rect, rectF, paint);
            return createBitmap;
        }
        return null;
    }

    public static Bitmap A08(Bitmap bitmap, Matrix matrix, int i, int i2) {
        Bitmap bitmap2 = bitmap;
        if (matrix != null) {
            Log.i("sample_rotate_image/rotate");
            try {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                if (bitmap2 != createBitmap) {
                    bitmap2.recycle();
                }
                bitmap2 = createBitmap;
            } catch (OutOfMemoryError e) {
                Log.e("sample_rotate_image/rotate/out-of-memory");
                bitmap2.recycle();
                throw e;
            }
        }
        if (i2 <= 0 || (bitmap2.getWidth() <= i2 && bitmap2.getHeight() <= i2)) {
            return bitmap2;
        }
        StringBuilder A0P = C000200d.A0P("sample_rotate_image/scale/");
        A0P.append(bitmap2.getWidth());
        A0P.append(" | ");
        A0P.append(bitmap2.getHeight());
        Log.i(A0P.toString());
        float f = i;
        float max = Math.max(bitmap2.getWidth() / f, bitmap2.getHeight() / f);
        Rect rect = new Rect(0, 0, (int) (bitmap2.getWidth() / max), (int) (bitmap2.getHeight() / max));
        rect.right = Math.max(rect.right, 1);
        rect.bottom = Math.max(rect.bottom, 1);
        Rect rect2 = new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight());
        Bitmap.Config config = bitmap2.getConfig();
        try {
            int width = rect.width();
            int height = rect.height();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap2 = Bitmap.createBitmap(width, height, config);
            Canvas canvas = new Canvas(createBitmap2);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setFilterBitmap(true);
            paint.setDither(true);
            canvas.drawBitmap(bitmap2, rect2, rect, paint);
            bitmap2.recycle();
            return createBitmap2;
        } catch (OutOfMemoryError e2) {
            Log.e("sample_rotate_image/scale/out-of-memory");
            bitmap2.recycle();
            throw e2;
        }
    }

    public static Matrix A09(int i) {
        switch (i) {
            case 2:
                Matrix matrix = new Matrix();
                matrix.setValues(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
                return matrix;
            case 3:
                Matrix matrix2 = new Matrix();
                matrix2.setRotate(180.0f);
                return matrix2;
            case 4:
                Matrix matrix3 = new Matrix();
                matrix3.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
                return matrix3;
            case 5:
                Matrix matrix4 = new Matrix();
                matrix4.setValues(new float[]{0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f});
                return matrix4;
            case 6:
                Matrix matrix5 = new Matrix();
                matrix5.setRotate(90.0f);
                return matrix5;
            case 7:
                Matrix matrix6 = new Matrix();
                matrix6.setValues(new float[]{0.0f, -1.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f});
                return matrix6;
            case 8:
                Matrix matrix7 = new Matrix();
                matrix7.setRotate(270.0f);
                return matrix7;
            default:
                return null;
        }
    }

    public static Matrix A0A(ContentResolver contentResolver, Uri uri) {
        int parseInt;
        if (uri != null && !TextUtils.isEmpty(uri.toString())) {
            Matrix A09 = A09(A01(contentResolver, uri));
            if (uri.getQueryParameter("flip-h") != null) {
                Matrix matrix = new Matrix();
                matrix.setValues(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
                if (A09 == null) {
                    A09 = matrix;
                } else {
                    A09.postConcat(matrix);
                }
            }
            if (uri.getQueryParameter("flip-v") != null) {
                Matrix matrix2 = new Matrix();
                matrix2.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
                if (A09 == null) {
                    A09 = matrix2;
                } else {
                    A09.postConcat(matrix2);
                }
            }
            String queryParameter = uri.getQueryParameter("rotation");
            if (queryParameter != null && (parseInt = Integer.parseInt(queryParameter)) != 0) {
                if (A09 == null) {
                    A09 = new Matrix();
                }
                A09.postRotate(parseInt);
            }
            return A09;
        }
        throw new FileNotFoundException(C000200d.A0G("No file ", uri));
    }

    public static Pair A0B(File file) {
        int A04;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        if (file.exists()) {
            try {
                A04 = A04(file.getAbsolutePath());
            } catch (IOException e) {
                Log.e("failure retrieving exif, io exception", e);
            }
            if (A04 == 6 && A04 != 8) {
                return new Pair(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
            }
            return new Pair(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
        }
        A04 = 0;
        if (A04 == 6) {
        }
        return new Pair(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
    }

    public static Pair A0C(File file) {
        int i;
        C40831sw c40831sw = new C40831sw();
        int i2 = 0;
        try {
            try {
                c40831sw.A00(file);
                String extractMetadata = c40831sw.extractMetadata(18);
                String extractMetadata2 = c40831sw.extractMetadata(19);
                try {
                    i = Integer.parseInt(extractMetadata);
                    try {
                        i2 = Integer.parseInt(extractMetadata2);
                    } catch (Exception e) {
                        e = e;
                        StringBuilder sb = new StringBuilder();
                        sb.append("getVideoHeightWidth/cannot parse width (");
                        sb.append(extractMetadata);
                        sb.append(")");
                        sb.append(" or height (");
                        sb.append(i2);
                        sb.append(") ");
                        sb.append(file.getAbsolutePath());
                        Log.w(sb.toString(), e);
                        Pair create = Pair.create(Integer.valueOf(i2), Integer.valueOf(i));
                        c40831sw.close();
                        return create;
                    }
                } catch (Exception e2) {
                    e = e2;
                    i = 0;
                }
                Pair create2 = Pair.create(Integer.valueOf(i2), Integer.valueOf(i));
                c40831sw.close();
                return create2;
            } catch (Exception unused) {
                Pair create3 = Pair.create(0, 0);
                c40831sw.close();
                return create3;
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    c40831sw.close();
                } catch (Throwable unused2) {
                }
                throw th2;
            }
        }
    }

    public static File A0D(Context context, C012005w c012005w, C02O c02o, File file, C0DC c0dc, int i) {
        StringBuilder A0P = C000200d.A0P(".");
        A0P.append(AnonymousClass024.A0G(file.getAbsolutePath()));
        return A0E(c012005w, c02o, A0P.toString(), c0dc, i, 3);
    }

    public static File A0E(C012005w c012005w, C02O c02o, String str, C0DC c0dc, int i, int i2) {
        String obj;
        File file = null;
        for (int i3 = 0; i3 < 100; i3++) {
            StringBuilder sb = new StringBuilder();
            synchronized (C0DD.class) {
                A0O(c02o, c012005w);
                SharedPreferences.Editor edit = c02o.A01(C02M.A02).edit();
                String format = new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date());
                if (!format.equals(A01)) {
                    A00 = 0;
                    A01 = format;
                    edit.putString("file_date", format);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c0dc.A01);
                sb2.append("-");
                sb2.append(A01);
                sb2.append("-WA");
                sb2.append(A03.format(A00));
                obj = sb2.toString();
                int i4 = A00 + 1;
                A00 = i4;
                edit.putInt("file_index", i4);
                edit.apply();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("mediafileutils/readablefilename/");
                sb3.append(obj);
                Log.i(sb3.toString());
            }
            String A0L = C000200d.A0L(sb, obj, str);
            byte b = c0dc.A00;
            if (c012005w != null) {
                file = new File(c012005w.A0E(b, i, i2), A0L);
                if (!file.exists()) {
                    break;
                }
            } else {
                throw null;
            }
        }
        return file;
    }

    public static File A0F(C012005w c012005w, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".doodle");
        return c012005w.A0L(sb.toString());
    }

    public static File A0G(File file, String str) {
        File file2 = new File(file, str);
        if (file2.exists()) {
            for (int i = 1; i <= 100; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("-");
                sb.append(i);
                File file3 = new File(file, sb.toString());
                if (!file3.exists()) {
                    return file3;
                }
            }
            StringBuilder A0V = C000200d.A0V(str, "-");
            A0V.append(UUID.randomUUID().toString());
            return new File(file, A0V.toString());
        }
        return file2;
    }

    public static File A0H(boolean z, boolean z2, boolean z3, C0DC c0dc, int i, int i2, String str, String str2, C001200o c001200o, C012005w c012005w, C02O c02o) {
        String str3;
        final String A0I;
        boolean z4;
        String str4;
        String str5 = str2;
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append(A0J());
            sb.append(".");
            sb.append(str5);
            String obj = sb.toString();
            File file = c012005w.A04().A0M;
            AbstractC012105x.A03(file, false);
            return AbstractC012105x.A01(file, obj);
        } else if (z2) {
            return new File(c012005w.A03.A00.getFilesDir(), "gdpr.zip");
        } else {
            if (z3) {
                File file2 = c012005w.A04().A08;
                String str6 = c0dc.A01;
                C000700j.A04(str6, "View Once media must have a filePrefix in its MmsType");
                synchronized (AbstractC012105x.class) {
                    String l = Long.toString(System.currentTimeMillis(), 36);
                    A0I = C000200d.A0I(str6, "-", l);
                    File[] listFiles = file2.listFiles(new FilenameFilter() { // from class: X.1Fe
                        @Override // java.io.FilenameFilter
                        public final boolean accept(File file3, String str7) {
                            return str7.startsWith(A0I);
                        }
                    });
                    if (listFiles == null) {
                        str4 = A0I;
                    } else {
                        do {
                            z4 = false;
                            for (File file3 : listFiles) {
                                if (file3.getName().equals(A0I)) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(C000200d.A0I(str6, "-", l));
                                    sb2.append(UUID.randomUUID().toString());
                                    A0I = sb2.toString();
                                    z4 = true;
                                }
                            }
                        } while (z4);
                        str4 = A0I;
                    }
                }
                if (!TextUtils.isEmpty(str5)) {
                    str4 = C000200d.A0I(A0I, ".", str5);
                }
                return new File(file2, str4);
            }
            if (C0HW.A01(c0dc)) {
                if (str != null) {
                    String replaceAll = str.replaceAll("[?:\\\\/*\"<>|]", "");
                    str3 = AnonymousClass024.A0H(replaceAll);
                    str5 = AnonymousClass024.A0G(replaceAll);
                } else {
                    str3 = null;
                }
                if (TextUtils.isEmpty(str3) && TextUtils.isEmpty(str5)) {
                    str3 = null;
                    str5 = "";
                }
            } else {
                str3 = null;
            }
            String A0H = TextUtils.isEmpty(str5) ? "" : C000200d.A0H(".", str5);
            if (TextUtils.isEmpty(str3)) {
                return A0E(c012005w, c02o, A0H, c0dc, i, i2);
            }
            int i3 = 0;
            File file4 = null;
            while (i3 < 1000) {
                String A0L = C000200d.A0L(C000200d.A0P(str3), i3 == 0 ? "" : C000200d.A0D("-", i3), A0H);
                byte b = c0dc.A00;
                if (c012005w != null) {
                    file4 = new File(c012005w.A0E(b, i, i2), A0L);
                    if (!file4.exists()) {
                        return file4;
                    }
                    i3++;
                } else {
                    throw null;
                }
            }
            return file4;
        }
    }

    public static FileInputStream A0I(File file) {
        for (int i = 0; i < 2; i++) {
            try {
                return new FileInputStream(file);
            } catch (FileNotFoundException e) {
                if (!e.getMessage().contains("Permission denied")) {
                    throw e;
                }
                if (i == 1) {
                    throw e;
                }
            }
        }
        throw new AssertionError("Unreachable code");
    }

    public static String A0J() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static String A0K(ContentResolver contentResolver, Uri uri) {
        if (contentResolver == null) {
            Log.w("media-file-utils/get-media-mime cr=null");
        } else {
            String type = contentResolver.getType(uri);
            if (type != null) {
                return type;
            }
        }
        return A0M(A0L(uri));
    }

    public static String A0L(Uri uri) {
        int lastIndexOf;
        String lastPathSegment = uri.getLastPathSegment();
        return (lastPathSegment == null || (lastIndexOf = lastPathSegment.lastIndexOf(46)) == -1) ? "" : lastPathSegment.substring(lastIndexOf + 1);
    }

    public static String A0M(String str) {
        String lowerCase = str.toLowerCase(Locale.US);
        switch (lowerCase.hashCode()) {
            case 96323:
                if (lowerCase.equals("aac")) {
                    return "audio/aac";
                }
                break;
            case 96710:
                if (lowerCase.equals("amr")) {
                    return "audio/amr";
                }
                break;
            case 98822:
                if (lowerCase.equals("csv")) {
                    return "text/csv";
                }
                break;
            case 99640:
                if (lowerCase.equals("doc")) {
                    return "application/msword";
                }
                break;
            case 106458:
                if (lowerCase.equals("m4a")) {
                    return "audio/mp4";
                }
                break;
            case 108272:
                if (lowerCase.equals("mp3")) {
                    return "audio/mpeg";
                }
                break;
            case 108273:
                if (lowerCase.equals("mp4")) {
                    return "video/mp4";
                }
                break;
            case 110834:
                if (lowerCase.equals("pdf")) {
                    return "application/pdf";
                }
                break;
            case 111220:
                if (lowerCase.equals("ppt")) {
                    return "application/vnd.ms-powerpoint";
                }
                break;
            case 113252:
                if (lowerCase.equals("rtf")) {
                    return "application/rtf";
                }
                break;
            case 115312:
                if (lowerCase.equals("txt")) {
                    return "text/plain";
                }
                break;
            case 117484:
                if (lowerCase.equals("wav")) {
                    return "audio/x-wav";
                }
                break;
            case 117835:
                if (lowerCase.equals("wma")) {
                    return "audio/x-ms-wma";
                }
                break;
            case 118783:
                if (lowerCase.equals("xls")) {
                    return "application/vnd.ms-excel";
                }
                break;
            case 3088960:
                if (lowerCase.equals("docx")) {
                    return "application/vnd.openxmlformats-officedocument.wordprocessingml.document";
                }
                break;
            case 3418175:
                if (lowerCase.equals("opus")) {
                    return "audio/ogg; codecs=opus";
                }
                break;
            case 3447940:
                if (lowerCase.equals("pptx")) {
                    return "application/vnd.openxmlformats-officedocument.presentationml.presentation";
                }
                break;
            case 3682393:
                if (lowerCase.equals("xlsx")) {
                    return "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
                }
                break;
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str.toLowerCase(Locale.US));
        return mimeTypeFromExtension == null ? "application/octet-stream" : mimeTypeFromExtension;
    }

    public static void A0N(Context context, Uri uri) {
        context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE").setData(uri));
    }

    public static synchronized void A0O(C02O c02o, C012005w c012005w) {
        synchronized (C0DD.class) {
            if (A00 >= 0) {
                return;
            }
            SharedPreferences A012 = c02o.A01(C02M.A02);
            A00 = A012.getInt("file_index", -1);
            String string = A012.getString("file_date", null);
            A01 = string;
            if (A00 >= 0 && !TextUtils.isEmpty(string)) {
                StringBuilder sb = new StringBuilder();
                sb.append("mediafileutils/initfilecounter file_index:");
                sb.append(A00);
                sb.append(" | file_date:");
                sb.append(A01);
                Log.i(sb.toString());
                return;
            }
            String format = new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date());
            A01 = format;
            long currentTimeMillis = System.currentTimeMillis();
            A00 = -1;
            C0DC c0dc = C0DC.A05;
            int max = Math.max(-1, A02(c012005w, format, c0dc, 0, 1));
            A00 = max;
            int max2 = Math.max(max, A02(c012005w, A01, c0dc, 0, 2));
            A00 = max2;
            int max3 = Math.max(max2, A02(c012005w, A01, c0dc, 0, 3));
            A00 = max3;
            String str = A01;
            C0DC c0dc2 = C0DC.A0D;
            int max4 = Math.max(max3, A02(c012005w, str, c0dc2, 1, 1));
            A00 = max4;
            int max5 = Math.max(max4, A02(c012005w, A01, c0dc2, 1, 2));
            A00 = max5;
            int max6 = Math.max(max5, A02(c012005w, A01, c0dc2, 1, 3));
            A00 = max6;
            String str2 = A01;
            C0DC c0dc3 = C0DC.A0N;
            int max7 = Math.max(max6, A02(c012005w, str2, c0dc3, 0, 1));
            A00 = max7;
            int max8 = Math.max(max7, A02(c012005w, A01, c0dc3, 0, 2));
            A00 = max8;
            int max9 = Math.max(max8, A02(c012005w, A01, c0dc3, 0, 3));
            A00 = max9;
            String str3 = A01;
            C0DC c0dc4 = C0DC.A0A;
            int max10 = Math.max(max9, A02(c012005w, str3, c0dc4, 0, 1));
            A00 = max10;
            int max11 = Math.max(max10, A02(c012005w, A01, c0dc4, 0, 2));
            A00 = max11;
            int max12 = Math.max(max11, A02(c012005w, A01, c0dc4, 0, 3));
            A00 = max12;
            String str4 = A01;
            C0DC c0dc5 = C0DC.A07;
            int max13 = Math.max(max12, A02(c012005w, str4, c0dc5, 0, 1));
            A00 = max13;
            int max14 = Math.max(max13, A02(c012005w, A01, c0dc5, 0, 2));
            A00 = max14;
            int max15 = Math.max(max14, A02(c012005w, A01, c0dc5, 0, 3));
            A00 = max15;
            A00 = max15 + 1;
            SharedPreferences.Editor edit = A012.edit();
            edit.putInt("file_index", A00);
            edit.putString("file_date", A01);
            edit.apply();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("mediafileutils/initfilecounter file_index:");
            sb2.append(A00);
            sb2.append(" | file_date:");
            sb2.append(A01);
            sb2.append(" |  time:");
            sb2.append(System.currentTimeMillis() - currentTimeMillis);
            Log.i(sb2.toString());
        }
    }

    public static void A0P(File file, C09H c09h) {
        Pair A0B = A0B(file);
        c09h.A08 = ((Number) A0B.first).intValue();
        c09h.A06 = ((Number) A0B.second).intValue();
    }

    public static boolean A0Q(C000400f c000400f, File file, File file2) {
        File A07 = c000400f.A07(file);
        if (file2.renameTo(A07)) {
            if (file.renameTo(file2)) {
                if (A07.delete()) {
                    return true;
                }
                C000200d.A0o(A07, C000200d.A0P("failed to delete "));
                return true;
            } else if (A07.renameTo(file2)) {
                if (file.delete()) {
                    return false;
                }
                C000200d.A0o(file, C000200d.A0P("failed to delete "));
                return false;
            } else {
                if (!file.delete()) {
                    C000200d.A0o(file, C000200d.A0P("failed to delete "));
                }
                if (!A07.delete()) {
                    C000200d.A0o(A07, C000200d.A0P("failed to delete "));
                }
                Log.e("restore input file failed");
                return false;
            }
        } else if (A07.delete()) {
            return false;
        } else {
            C000200d.A0o(A07, C000200d.A0P("failed to delete "));
            return false;
        }
    }
}
