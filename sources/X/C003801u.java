package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import android.util.SparseArray;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.01u */
/* loaded from: classes.dex */
public class C003801u {
    public static volatile boolean A06;
    public static volatile boolean A07;
    public final C2Ae A00;
    public final C0Ob[] A01 = new C0Ob[1];
    public static final Set A04 = new HashSet(Arrays.asList("pt", "es"));
    public static final String[] A05 = {"app_strings_"};
    public static final int A02 = 1;
    public static final SparseArray A03 = new SparseArray();

    public C003801u(Context context, Resources resources, Locale locale, C2Ae c2Ae) {
        if (!AbstractC003201n.A0A(locale)) {
            this.A01[0] = A00(context, resources, C000200d.A0L(new StringBuilder(), A05[0], AbstractC003201n.A06(locale)), locale, false);
        }
        this.A00 = c2Ae;
    }

    public static C0Ob A00(Context context, Resources resources, String str, Locale locale, boolean z) {
        MappedByteBuffer mappedByteBuffer;
        boolean z2;
        File file;
        String A0H = C000200d.A0H(str, ".pack");
        try {
            InputStream open = resources.getAssets().open(A0H);
            if (A07) {
                String A062 = AbstractC003201n.A06(locale);
                if (A06 && (z || A04.contains(A062))) {
                    z2 = true;
                    Log.i("translations/closing un-used input stream");
                    open.close();
                } else {
                    z2 = false;
                }
                File filesDir = context.getFilesDir();
                if (z2) {
                    AnonymousClass010 anonymousClass010 = AnonymousClass010.A04;
                    if (anonymousClass010 != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(".spk.br");
                        String obj = sb.toString();
                        C001900w c001900w = anonymousClass010.A02;
                        if (c001900w != null) {
                            file = new File(new File(new File(context.getFilesDir(), "decompressed"), obj), A0H);
                            if (!file.exists() || !c001900w.A04(context, obj)) {
                                try {
                                    long uptimeMillis = SystemClock.uptimeMillis();
                                    if (c001900w.A05(context, obj, 1, true)) {
                                        AnonymousClass013 anonymousClass013 = new AnonymousClass013();
                                        anonymousClass013.A01 = obj;
                                        anonymousClass013.A00 = Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis);
                                        anonymousClass010.A01.A0B(anonymousClass013, null, false);
                                    }
                                    if (!file.exists()) {
                                        throw new IOException("Decompression failed: File does not exist");
                                    }
                                } catch (Exception e) {
                                    String obj2 = e.toString();
                                    C05290Oc c05290Oc = new C05290Oc();
                                    c05290Oc.A01 = obj;
                                    c05290Oc.A02 = obj2;
                                    c05290Oc.A00 = Double.valueOf(anonymousClass010.A00.A03());
                                    anonymousClass010.A01.A0B(c05290Oc, null, false);
                                    StringBuilder sb2 = new StringBuilder("Error decompressing archive ");
                                    sb2.append(obj);
                                    Log.w(sb2.toString(), e);
                                    throw e;
                                }
                            }
                        } else {
                            throw null;
                        }
                    } else {
                        throw null;
                    }
                } else {
                    StringBuilder A0V = C000200d.A0V(str, "_");
                    A0V.append(new File(context.getPackageCodePath()).lastModified() / 1000);
                    A0V.append(".pack");
                    file = new File(filesDir, A0V.toString());
                    if (!file.exists()) {
                        File file2 = new File(filesDir, "extracted_pack_file.pack.tmp");
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        AnonymousClass024.A0V(resources.getAssets().open(A0H), fileOutputStream);
                        fileOutputStream.close();
                        if (!file2.renameTo(file)) {
                            throw new IOException("Renaming temp file failed");
                        }
                    }
                }
                mappedByteBuffer = new RandomAccessFile(file, "r").getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, file.length());
            } else {
                mappedByteBuffer = null;
            }
            List A01 = A01(locale, z);
            if (A01.isEmpty()) {
                Log.e(String.format(Locale.US, "translations/loadData error: locale '%s' not supported", AbstractC003201n.A05(locale)));
            }
            return new C0Ob(open, A01, mappedByteBuffer);
        } catch (IOException e2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("translations/loadData error:");
            sb3.append(e2);
            Log.e(sb3.toString());
            return null;
        } catch (IndexOutOfBoundsException e3) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("translations/loadData error:");
            sb4.append(e3);
            Log.e(sb4.toString());
            return null;
        }
    }

    public static List A01(Locale locale, boolean z) {
        String language = locale.getLanguage();
        if ("fil".equals(language)) {
            language = "tl";
        } else if (language.length() == 3) {
            return Collections.emptyList();
        }
        String country = locale.getCountry();
        String A022 = AbstractC003201n.A02(locale);
        ArrayList arrayList = new ArrayList(2);
        if (!z && "en".equals(language)) {
            arrayList.add(C2Af.A00(country));
        } else {
            if ("pt".equals(language)) {
                arrayList.add(C47192Ag.A00.contains(locale.getCountry()) ? "pt" : "pt-BR");
            } else if ("zh".equals(language)) {
                if (A022.equals("Hans")) {
                    arrayList.add("zh-CN");
                } else if (A022.equals("Hant")) {
                    arrayList.add("zh-TW");
                }
            } else if (A022.equals(AbstractC003201n.A02(AbstractC003201n.A09(language)))) {
                arrayList.add(language);
            }
        }
        if (country.length() == 2) {
            String A0I = C000200d.A0I(language, "-", country);
            if ((arrayList.isEmpty() || !((String) arrayList.get(0)).equals(A0I)) && A022.equals(AbstractC003201n.A02(AbstractC003201n.A09(A0I)))) {
                arrayList.add(A0I);
            }
        }
        return arrayList;
    }

    public static void A02(Context context) {
        File filesDir = context.getFilesDir();
        String[] list = filesDir.list(new FilenameFilter() { // from class: X.2t6
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return str.endsWith(".pack");
            }
        });
        if (list != null) {
            for (String str : list) {
                String[] split = str.substring(0, str.lastIndexOf(".pack")).split("_");
                int length = split.length;
                if (length > 1) {
                    try {
                        if (Long.parseLong(split[length - 1]) != new File(context.getPackageCodePath()).lastModified() / 1000) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("translations/cleanupOldPackFiles Clearing old pack file: ");
                            sb.append(str);
                            Log.i(sb.toString());
                            if (!new File(filesDir, str).delete()) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("translations/cleanupOldPackFiles Could not delete old pack file: ");
                                sb2.append(str);
                                Log.e(sb2.toString());
                            }
                        }
                    } catch (NumberFormatException unused) {
                        C000200d.A15("translations/cleanupOldPackFiles Pack file name did not contain version info: ", str);
                    }
                }
            }
        }
    }

    public static void A03(int[] iArr) {
        String.format(Locale.US, "translations/registerStringPackIds module=%d", 0);
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            A03.put(iArr[i], new C47202Ah(i));
        }
    }

    public final String A04(int i, boolean z, Object obj) {
        C0Ob c0Ob;
        C47202Ah c47202Ah = (C47202Ah) A03.get(i);
        if (c47202Ah == null || (c0Ob = this.A01[0]) == null) {
            return null;
        }
        int i2 = c47202Ah.A00;
        if (z) {
            return c0Ob.A00(i2, obj, this.A00, A07);
        }
        return c0Ob.A01(i2, A07);
    }
}
