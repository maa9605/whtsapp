package X;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.contentprovider.MediaProvider;
import com.whatsapp.util.DocumentWarningDialogFragment;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

/* renamed from: X.24r */
/* loaded from: classes2.dex */
public class C460324r {
    public static final AnonymousClass015 A00 = new AnonymousClass015(1, 1, 1, true);
    public static final Set A06 = new HashSet(Arrays.asList("ai", "ico", "jpeg", "jpg", "png", "ps", "psd", "svg", "tif", "tiff"));
    public static final Set A07 = new HashSet(Arrays.asList("3g2", "3gp", "avi", "flv", "h264", "m4v", "mkv", "mov", "mp4", "mpg", "mpeg", "rm", "vob"));
    public static final Set A02 = new HashSet(Arrays.asList("wmv", "aif", "cda", "mpa", "opus", "ogg", "wlp", "amr", "mp3", "m4a", "aac", "wav", "wma"));
    public static final Set A04 = new HashSet(Arrays.asList("pdf", "doc", "docx", "ppt", "pptx", "xls", "xlsx", "txt", "rtf", "tex", "csv", "wpd"));
    public static final Set A03 = new HashSet(Arrays.asList("7z", "arj", "deb", "pkg", "rar", "rpm", "gz", "z", "zip"));
    public static final Set A05 = new HashSet(Arrays.asList("apk", "bat", "bin", "cgi", "pl", "com", "exe", "gadget", "jar", "msi", "py", "wsf"));
    public static final Object A01 = new Object();

    public static int A00(String str, File file) {
        ZipFile zipFile;
        int A012;
        int i;
        try {
            try {
                if ("application/pdf".equals(str)) {
                    C72583aG c72583aG = new C72583aG(file);
                    c72583aG.A05();
                    return c72583aG.A00;
                } else if ("application/vnd.openxmlformats-officedocument.presentationml.presentation".equals(str)) {
                    try {
                        zipFile = new ZipFile(file.getAbsolutePath());
                        try {
                            if (zipFile.getEntry("[Content_Types].xml") != null) {
                                try {
                                    i = A01(zipFile, "Slides");
                                } catch (IOException e) {
                                    Log.i("documentutils/slidecount ", e);
                                }
                                if (i == 0) {
                                    while (true) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("ppt/slides/slide");
                                        int i2 = i + 1;
                                        sb.append(i2);
                                        sb.append(".xml");
                                        if (zipFile.getEntry(sb.toString()) == null) {
                                            break;
                                        }
                                        i = i2;
                                    }
                                }
                                zipFile.close();
                                return i;
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("documentutils/no content types in ");
                            sb2.append(file.getName());
                            Log.e(sb2.toString());
                            throw new Exception() { // from class: X.3a2
                            };
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    } catch (IOException e2) {
                        Log.i("documentutils/slidecount ", e2);
                        throw e2;
                    }
                } else if ("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet".equals(str)) {
                    try {
                        zipFile = new ZipFile(file.getAbsolutePath());
                        try {
                            if (zipFile.getEntry("[Content_Types].xml") == null) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("documentutils/no content types in ");
                                sb3.append(file.getName());
                                Log.e(sb3.toString());
                                throw new Exception() { // from class: X.3a2
                                };
                            }
                            int i3 = 0;
                            while (true) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("xl/worksheets/sheet");
                                int i4 = i3 + 1;
                                sb4.append(i4);
                                sb4.append(".xml");
                                if (zipFile.getEntry(sb4.toString()) == null) {
                                    zipFile.close();
                                    return i3;
                                }
                                i3 = i4;
                            }
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } finally {
                                try {
                                    zipFile.close();
                                } catch (Throwable unused) {
                                }
                            }
                        }
                    } catch (IOException e3) {
                        Log.i("documentutils/sheetcount ", e3);
                        throw e3;
                    }
                } else if ("application/vnd.openxmlformats-officedocument.wordprocessingml.document".equals(str)) {
                    try {
                        ZipFile zipFile2 = new ZipFile(file.getAbsolutePath());
                        try {
                            if (zipFile2.getEntry("[Content_Types].xml") != null) {
                                try {
                                    A012 = A01(zipFile2, "Pages");
                                } catch (IOException e4) {
                                    Log.i("documentutils/slidecount ", e4);
                                }
                                return A012;
                            }
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("documentutils/no content types in ");
                            sb5.append(file.getName());
                            Log.e(sb5.toString());
                            throw new Exception() { // from class: X.3a2
                            };
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } finally {
                                try {
                                    zipFile2.close();
                                } catch (Throwable unused2) {
                                }
                            }
                        }
                    } catch (IOException e5) {
                        Log.i("documentutils/slidecount ", e5);
                        throw e5;
                    }
                } else {
                    return 0;
                }
            } catch (C72463a2 e6) {
                Log.i("documentutils/getpagecount ", e6);
                throw e6;
            } catch (C72573aF e7) {
                e = e7;
                Log.i("documentutils/getpagecount ", e);
                throw new Exception() { // from class: X.3a2
                };
            } catch (Exception e8) {
                Log.i("documentutils/getpagecount ", e8);
                return 0;
            }
        } catch (ZipException e9) {
            e = e9;
            Log.i("documentutils/getpagecount ", e);
            throw new Exception() { // from class: X.3a2
            };
        }
    }

    public static int A01(ZipFile zipFile, String str) {
        ZipEntry entry = zipFile.getEntry("docProps/app.xml");
        int i = 0;
        if (entry != null) {
            StringBuilder sb = new StringBuilder("<");
            sb.append(str);
            sb.append("[^>]*>(.*)</");
            sb.append(str);
            sb.append(">");
            Pattern compile = Pattern.compile(sb.toString(), 34);
            InputStream inputStream = zipFile.getInputStream(entry);
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
                StringWriter stringWriter = new StringWriter();
                char[] cArr = new char[1024];
                while (true) {
                    int read = inputStreamReader.read(cArr);
                    if (read == -1) {
                        break;
                    }
                    stringWriter.write(cArr, 0, read);
                }
                String obj = stringWriter.toString();
                inputStreamReader.close();
                Matcher matcher = compile.matcher(obj);
                if (matcher.find()) {
                    String group = matcher.group(1);
                    if (group != null) {
                        try {
                            i = Integer.parseInt(group.trim());
                        } catch (NumberFormatException e) {
                            Log.i("documentutils/count ", e);
                        }
                    } else {
                        throw null;
                    }
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable unused) {
                        }
                    }
                    throw th2;
                }
            }
        }
        return i;
    }

    public static Bitmap A02(String str, int i, int i2, boolean z) {
        boolean equalsIgnoreCase;
        ParcelFileDescriptor parcelFileDescriptor;
        PdfRenderer pdfRenderer;
        Matrix matrix;
        if (Build.VERSION.SDK_INT < 23) {
            equalsIgnoreCase = true;
        } else {
            String str2 = Build.MANUFACTURER;
            if (str2.equalsIgnoreCase("oppo")) {
                equalsIgnoreCase = Build.MODEL.equalsIgnoreCase("A53");
            } else if (str2.equalsIgnoreCase("HUAWEI")) {
                equalsIgnoreCase = Build.MODEL.equalsIgnoreCase("CUN-AL00");
            } else {
                equalsIgnoreCase = str2.equalsIgnoreCase("GiONEE") ? Build.MODEL.equalsIgnoreCase("GN5001S") : false;
            }
        }
        Bitmap bitmap = null;
        if (equalsIgnoreCase) {
            return null;
        }
        synchronized (A01) {
            try {
                parcelFileDescriptor = ParcelFileDescriptor.open(new File(str), 268435456);
            } catch (FileNotFoundException e) {
                Log.w(e);
                parcelFileDescriptor = null;
            }
            if (parcelFileDescriptor == null) {
                return null;
            }
            try {
                pdfRenderer = new PdfRenderer(parcelFileDescriptor);
            } catch (IOException | SecurityException e2) {
                Log.w(e2);
                pdfRenderer = null;
            }
            if (pdfRenderer == null) {
                try {
                    parcelFileDescriptor.close();
                } catch (IOException unused) {
                }
                return null;
            }
            if (pdfRenderer.getPageCount() > 0) {
                PdfRenderer.Page openPage = pdfRenderer.openPage(0);
                if (i <= 0 || i2 <= 0) {
                    int width = openPage.getWidth();
                    int height = openPage.getHeight();
                    if (width > height) {
                        i2 = (height * 480) / width;
                        i = 480;
                    } else {
                        i = (width * 480) / height;
                        i2 = 480;
                    }
                }
                Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                new Canvas(createBitmap).drawColor(-1);
                if (!z) {
                    matrix = null;
                } else {
                    int width2 = openPage.getWidth();
                    matrix = new Matrix();
                    float f = (i * 1.0f) / width2;
                    matrix.setScale(f, f);
                }
                openPage.render(createBitmap, null, matrix, 1);
                openPage.close();
                bitmap = createBitmap;
            }
            pdfRenderer.close();
            try {
                parcelFileDescriptor.close();
            } catch (IOException unused2) {
            }
            return bitmap;
        }
    }

    public static Drawable A03(Context context, C09E c09e) {
        String upperCase = C41961un.A0T(((AnonymousClass097) c09e).A07).toUpperCase(Locale.US);
        if (TextUtils.isEmpty(upperCase) && !TextUtils.isEmpty(c09e.A1B())) {
            upperCase = AnonymousClass024.A0G(c09e.A1B()).toUpperCase(Locale.US);
        }
        return A05(context, ((AnonymousClass097) c09e).A07, upperCase, false);
    }

    public static Drawable A04(Context context, File file) {
        String A0G = file == null ? "" : AnonymousClass024.A0G(file.getAbsolutePath());
        return A05(context, C0DD.A0M(A0G), A0G, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0087, code lost:
        return X.C02160Ac.A03(r4, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x008e, code lost:
        if (r5.equals("text/rtf") != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0097, code lost:
        if (r5.equals("application/vnd.openxmlformats-officedocument.wordprocessingml.document") != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x00a0, code lost:
        if (r5.equals("application/vnd.ms-powerpoint") != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x00a9, code lost:
        if (r5.equals("application/vnd.openxmlformats-officedocument.presentationml.presentation") != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00ab, code lost:
        r0 = com.google.android.search.verification.client.R.drawable.icon_file_ppt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x00ae, code lost:
        if (r7 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x00b0, code lost:
        r0 = com.google.android.search.verification.client.R.drawable.icon_file_ppt_large;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x00b7, code lost:
        return X.C02160Ac.A03(r4, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x00be, code lost:
        if (r5.equals("application/rtf") != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x00c0, code lost:
        r0 = com.google.android.search.verification.client.R.drawable.icon_file_doc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x00c3, code lost:
        if (r7 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x00c5, code lost:
        r0 = com.google.android.search.verification.client.R.drawable.icon_file_doc_large;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x00cc, code lost:
        return X.C02160Ac.A03(r4, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0067, code lost:
        if (r5.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet") != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0070, code lost:
        if (r5.equals("application/msword") != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0079, code lost:
        if (r5.equals("application/vnd.ms-excel") != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x007b, code lost:
        r0 = com.google.android.search.verification.client.R.drawable.icon_file_xls;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x007e, code lost:
        if (r7 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0080, code lost:
        r0 = com.google.android.search.verification.client.R.drawable.icon_file_xls_large;
     */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.drawable.Drawable A05(android.content.Context r4, java.lang.String r5, java.lang.String r6, boolean r7) {
        /*
            if (r5 != 0) goto L2a
            r3 = 2131231798(0x7f080436, float:1.8079687E38)
            if (r7 == 0) goto La
            r3 = 2131231799(0x7f080437, float:1.807969E38)
        La:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L23
            java.lang.String r2 = ""
        L12:
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131166240(0x7f070420, float:1.794672E38)
            int r1 = r1.getDimensionPixelSize(r0)
            X.2ul r0 = new X.2ul
            r0.<init>(r4, r3, r2, r1)
            return r0
        L23:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = r6.toUpperCase(r0)
            goto L12
        L2a:
            int r0 = r5.hashCode()
            switch(r0) {
                case -1248334925: goto Lcd;
                case -1248332507: goto Lb8;
                case -1073633483: goto La3;
                case -1071817359: goto L9a;
                case -1050893613: goto L91;
                case -1004732798: goto L88;
                case -366307023: goto L73;
                case 904647503: goto L6a;
                case 1993842850: goto L61;
                default: goto L31;
            }
        L31:
            r3 = 2131231798(0x7f080436, float:1.8079687E38)
            if (r7 == 0) goto L39
            r3 = 2131231799(0x7f080437, float:1.807969E38)
        L39:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L5a
            java.lang.String r1 = X.C41961un.A0T(r5)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = r1.toUpperCase(r0)
        L49:
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131166240(0x7f070420, float:1.794672E38)
            int r1 = r1.getDimensionPixelSize(r0)
            X.2ul r0 = new X.2ul
            r0.<init>(r4, r3, r2, r1)
            return r0
        L5a:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = r6.toUpperCase(r0)
            goto L49
        L61:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L31
            goto L7b
        L6a:
            java.lang.String r0 = "application/msword"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L31
            goto Lc0
        L73:
            java.lang.String r0 = "application/vnd.ms-excel"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L31
        L7b:
            r0 = 2131231800(0x7f080438, float:1.8079691E38)
            if (r7 == 0) goto L83
            r0 = 2131231801(0x7f080439, float:1.8079693E38)
        L83:
            android.graphics.drawable.Drawable r0 = X.C02160Ac.A03(r4, r0)
            return r0
        L88:
            java.lang.String r0 = "text/rtf"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L31
            goto Lc0
        L91:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.wordprocessingml.document"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L31
            goto Lc0
        L9a:
            java.lang.String r0 = "application/vnd.ms-powerpoint"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L31
            goto Lab
        La3:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.presentationml.presentation"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L31
        Lab:
            r0 = 2131231796(0x7f080434, float:1.8079683E38)
            if (r7 == 0) goto Lb3
            r0 = 2131231797(0x7f080435, float:1.8079685E38)
        Lb3:
            android.graphics.drawable.Drawable r0 = X.C02160Ac.A03(r4, r0)
            return r0
        Lb8:
            java.lang.String r0 = "application/rtf"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L31
        Lc0:
            r0 = 2131231792(0x7f080430, float:1.8079675E38)
            if (r7 == 0) goto Lc8
            r0 = 2131231793(0x7f080431, float:1.8079677E38)
        Lc8:
            android.graphics.drawable.Drawable r0 = X.C02160Ac.A03(r4, r0)
            return r0
        Lcd:
            java.lang.String r0 = "application/pdf"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L31
            r3 = 2131231794(0x7f080432, float:1.807968E38)
            if (r7 == 0) goto Ldd
            r3 = 2131231795(0x7f080433, float:1.8079681E38)
        Ldd:
            java.lang.String r1 = X.C41961un.A0T(r5)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = r1.toUpperCase(r0)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131166240(0x7f070420, float:1.794672E38)
            int r1 = r1.getDimensionPixelSize(r0)
            X.2ul r0 = new X.2ul
            r0.<init>(r4, r3, r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C460324r.A05(android.content.Context, java.lang.String, java.lang.String, boolean):android.graphics.drawable.Drawable");
    }

    public static Pair A06(C012005w c012005w, AnonymousClass011 anonymousClass011, C01B c01b, C41491u0 c41491u0, C41961un c41961un, C02E c02e, List list, Uri uri, String str, AnonymousClass092 anonymousClass092, boolean z) {
        Integer num;
        File file;
        File A0c = c41961un.A0c(uri);
        long length = A0c.length();
        String A0L = C0DD.A0L(uri);
        String A072 = A07(c02e, uri);
        if (A072 != null && TextUtils.isEmpty(A0L)) {
            A0L = AnonymousClass024.A0G(A072);
        }
        C37471mT c37471mT = new C37471mT();
        c37471mT.A00 = Double.valueOf(Math.ceil(length / 2.0E7d) * 20.0d * 1000000.0d);
        if (TextUtils.isEmpty(A0L)) {
            num = null;
        } else {
            String lowerCase = A0L.toLowerCase(Locale.US);
            if (A06.contains(lowerCase)) {
                num = 2;
            } else if (A07.contains(lowerCase)) {
                num = 3;
            } else if (A02.contains(lowerCase)) {
                num = 4;
            } else if (A04.contains(lowerCase)) {
                num = 5;
            } else if (A03.contains(lowerCase)) {
                num = 6;
            } else if (A05.contains(lowerCase)) {
                num = 7;
            } else {
                num = 1;
            }
        }
        c37471mT.A01 = num;
        if (length <= c01b.A07(C01C.A2w) * SearchActionVerificationClientService.MS_TO_NS) {
            anonymousClass011.A0B(c37471mT, null, false);
            byte[] A0C = A0C(str, A0c);
            if (!c012005w.A0S(A0c)) {
                file = c012005w.A0L(UUID.randomUUID().toString());
                AnonymousClass024.A0P(c012005w.A04, A0c, file);
            } else {
                file = A0c;
            }
            C09H c09h = new C09H();
            c09h.A0F = file;
            C04130Ir A032 = c41491u0.A03(list, c09h, 0, A072, anonymousClass092, z);
            int A002 = A00(str, A0c);
            for (AnonymousClass097 anonymousClass097 : Collections.unmodifiableList(A032.A01)) {
                if (anonymousClass097 instanceof C09E) {
                    C09E c09e = (C09E) anonymousClass097;
                    c09e.A00 = A002;
                    ((AnonymousClass097) c09e).A07 = str;
                    ((AnonymousClass097) c09e).A08 = A072;
                }
            }
            return new Pair(A032, A0C);
        }
        anonymousClass011.A0B(c37471mT, A00, false);
        throw new Exception() { // from class: X.3a3
        };
    }

    public static String A07(C02E c02e, Uri uri) {
        File A052 = AnonymousClass024.A05(uri);
        if (A052 != null) {
            return A052.getName();
        }
        String[] strArr = {"_display_name", "_size"};
        ContentResolver A072 = c02e.A07();
        if (A072 != null) {
            try {
                Cursor query = A072.query(uri, strArr, null, null, null);
                if (query == null) {
                    return null;
                }
                try {
                    if (query.getColumnCount() <= 0 || !query.moveToFirst()) {
                        query.close();
                        return null;
                    }
                    return query.getString(0);
                } finally {
                }
            } catch (IllegalArgumentException | UnsupportedOperationException e) {
                Log.w("document-utils/get-document-title/unexpected exception", e);
                return null;
            }
        } else {
            Log.w("document-utils/get-document-title cr=null");
            return null;
        }
    }

    public static String A08(C002301c c002301c, C09E c09e) {
        return A09(c002301c, ((AnonymousClass097) c09e).A07, c09e.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0016, code lost:
        if (r7.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet") != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x001f, code lost:
        if (r7.equals("application/msword") != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0028, code lost:
        if (r7.equals("application/vnd.ms-excel") != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x002a, code lost:
        r4 = com.google.android.search.verification.client.R.plurals.number_of_sheets;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0034, code lost:
        if (r7.equals("application/vnd.openxmlformats-officedocument.wordprocessingml.document") != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x003d, code lost:
        if (r7.equals("application/vnd.ms-powerpoint") != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0046, code lost:
        if (r7.equals("application/vnd.openxmlformats-officedocument.presentationml.presentation") != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0048, code lost:
        r4 = com.google.android.search.verification.client.R.plurals.number_of_slides;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0052, code lost:
        if (r7.equals("application/pdf") != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0054, code lost:
        r4 = com.google.android.search.verification.client.R.plurals.number_of_pages;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0064, code lost:
        return r6.A0A(r4, r8, java.lang.Integer.valueOf(r8));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String A09(X.C002301c r6, java.lang.String r7, int r8) {
        /*
            java.lang.String r2 = ""
            if (r7 == 0) goto L65
            if (r8 == 0) goto L65
            int r0 = r7.hashCode()
            r1 = 1
            r5 = 0
            switch(r0) {
                case -1248334925: goto L4c;
                case -1073633483: goto L40;
                case -1071817359: goto L37;
                case -1050893613: goto L2e;
                case -366307023: goto L22;
                case 904647503: goto L19;
                case 1993842850: goto L10;
                default: goto Lf;
            }
        Lf:
            return r2
        L10:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto Lf
            goto L2a
        L19:
            java.lang.String r0 = "application/msword"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto Lf
            goto L54
        L22:
            java.lang.String r0 = "application/vnd.ms-excel"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto Lf
        L2a:
            r4 = 2131755143(0x7f100087, float:1.9141157E38)
            goto L57
        L2e:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.wordprocessingml.document"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto Lf
            goto L54
        L37:
            java.lang.String r0 = "application/vnd.ms-powerpoint"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto Lf
            goto L48
        L40:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.presentationml.presentation"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto Lf
        L48:
            r4 = 2131755144(0x7f100088, float:1.9141159E38)
            goto L57
        L4c:
            java.lang.String r0 = "application/pdf"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto Lf
        L54:
            r4 = 2131755141(0x7f100085, float:1.9141153E38)
        L57:
            long r2 = (long) r8
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r1[r5] = r0
            java.lang.String r0 = r6.A0A(r4, r2, r1)
            return r0
        L65:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C460324r.A09(X.01c, java.lang.String, int):java.lang.String");
    }

    public static void A0A(C42461vm c42461vm, C018508q c018508q, AbstractC000600i abstractC000600i, InterfaceC002901k interfaceC002901k, C40421sE c40421sE, ActivityC02290Ap activityC02290Ap, C09E c09e, C018308n c018308n) {
        C09H c09h = ((AnonymousClass097) c09e).A02;
        if (c09h != null) {
            File file = c09h.A0F;
            if (file != null && file.exists()) {
                if (!c09e.A0n.A02 && "apk".equalsIgnoreCase(AnonymousClass024.A0G(c09h.A0F.getAbsolutePath()))) {
                    long j = c09e.A0p;
                    DocumentWarningDialogFragment documentWarningDialogFragment = new DocumentWarningDialogFragment();
                    Bundle bundle = new Bundle();
                    bundle.putLong("message_id", j);
                    bundle.putInt("warning_id", R.string.warning_opening_apk);
                    documentWarningDialogFragment.A0P(bundle);
                    documentWarningDialogFragment.A14(activityC02290Ap.A0N(), null);
                    return;
                } else if (c09h.A07 == 3) {
                    long j2 = c09e.A0p;
                    DocumentWarningDialogFragment documentWarningDialogFragment2 = new DocumentWarningDialogFragment();
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("message_id", j2);
                    bundle2.putInt("warning_id", R.string.warning_opening_document);
                    documentWarningDialogFragment2.A0P(bundle2);
                    documentWarningDialogFragment2.A14(activityC02290Ap.A0N(), null);
                    return;
                } else {
                    WeakReference weakReference = new WeakReference(activityC02290Ap);
                    c018508q.A06(0, R.string.loading_spinner);
                    MediaProvider.A05(c018508q, abstractC000600i, interfaceC002901k, c40421sE, c09e, new C83603sO(weakReference, c018508q, c018308n, c09e));
                    return;
                }
            }
            c42461vm.A03(activityC02290Ap);
            return;
        }
        throw null;
    }

    public static byte[] A0B(Bitmap bitmap) {
        byte[] byteArray;
        int i = 80;
        do {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
            byteArray = byteArrayOutputStream.toByteArray();
            StringBuilder A0P = C000200d.A0P("documentutils/docthumb ");
            int length = byteArray.length;
            A0P.append(length);
            A0P.append(" ");
            A0P.append(i);
            Log.i(A0P.toString());
            i -= 5;
            if (length <= 20480) {
                break;
            }
        } while (i > 0);
        return byteArray;
    }

    public static byte[] A0C(String str, File file) {
        try {
            if ("application/pdf".equals(str)) {
                Bitmap A022 = A02(file.getAbsolutePath(), 0, 0, false);
                if (A022 != null) {
                    byte[] A0B = A0B(A022);
                    A022.recycle();
                    return A0B;
                }
            } else {
                if (!"application/vnd.openxmlformats-officedocument.presentationml.presentation".equals(str)) {
                    if (!"application/vnd.openxmlformats-officedocument.spreadsheetml.sheet".equals(str)) {
                        if ("application/vnd.openxmlformats-officedocument.wordprocessingml.document".equals(str)) {
                        }
                    }
                }
                byte[] bArr = null;
                try {
                    ZipFile zipFile = new ZipFile(file.getAbsolutePath());
                    try {
                        ZipEntry entry = zipFile.getEntry("docProps/thumbnail.jpeg");
                        if (entry != null) {
                            InputStream inputStream = zipFile.getInputStream(entry);
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inDither = true;
                            Bitmap A0A = C002701i.A0A(inputStream, options);
                            if (A0A != null && A0A.getWidth() != 0 && A0A.getHeight() != 0) {
                                int max = Math.max(A0A.getWidth(), A0A.getHeight());
                                if (max > 480) {
                                    float f = 480.0f / max;
                                    Matrix matrix = new Matrix();
                                    matrix.setScale(f, f);
                                    Bitmap createBitmap = Bitmap.createBitmap(A0A, 0, 0, A0A.getWidth(), A0A.getHeight(), matrix, true);
                                    if (createBitmap != A0A) {
                                        A0A.recycle();
                                        A0A = createBitmap;
                                    }
                                }
                                bArr = A0B(A0A);
                                A0A.recycle();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                        }
                        return bArr;
                    } finally {
                    }
                } catch (IOException e) {
                    Log.i("documentutils/openxmlthumb ", e);
                    return null;
                }
            }
            return null;
        } catch (Exception e2) {
            Log.i("documentutils/getthumbnail ", e2);
            return null;
        }
    }
}
