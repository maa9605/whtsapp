package X;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.0X9  reason: invalid class name */
/* loaded from: classes.dex */
public class C0X9 {
    public static final C06F A00 = new C06F(16);
    public static final C0XC A02 = new C0XC();
    public static final Object A03 = new Object();
    public static final C006802z A01 = new C006802z();
    public static final Comparator A04 = new Comparator() { // from class: X.0kM
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = (byte[]) obj2;
            int length = bArr.length;
            int length2 = bArr2.length;
            if (length == length2) {
                for (int i = 0; i < length; i++) {
                    byte b = bArr[i];
                    length2 = bArr2[i];
                    if (b != length2) {
                        length = b;
                    }
                }
                return 0;
            }
            return length - length2;
        }
    };

    public static C0XA A00(Context context, C0X5 c0x5, int i) {
        C12960kN c12960kN;
        int i2;
        Cursor query;
        Uri withAppendedId;
        boolean z;
        try {
            PackageManager packageManager = context.getPackageManager();
            Resources resources = context.getResources();
            String str = c0x5.A01;
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider != null) {
                String str2 = resolveContentProvider.packageName;
                String str3 = c0x5.A02;
                if (str2.equals(str3)) {
                    Signature[] signatureArr = packageManager.getPackageInfo(str2, 64).signatures;
                    ArrayList arrayList = new ArrayList();
                    for (Signature signature : signatureArr) {
                        arrayList.add(signature.toByteArray());
                    }
                    Comparator comparator = A04;
                    Collections.sort(arrayList, comparator);
                    List list = c0x5.A04;
                    if (list == null) {
                        list = C07O.A0S(resources, 0);
                    }
                    int i3 = 0;
                    while (true) {
                        if (i3 < list.size()) {
                            ArrayList arrayList2 = new ArrayList((Collection) list.get(i3));
                            Collections.sort(arrayList2, comparator);
                            if (arrayList.size() == arrayList2.size()) {
                                while (i2 < arrayList.size()) {
                                    i2 = Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2)) ? i2 + 1 : 0;
                                }
                                String str4 = resolveContentProvider.authority;
                                ArrayList arrayList3 = new ArrayList();
                                Uri build = new Uri.Builder().scheme("content").authority(str4).build();
                                Uri build2 = new Uri.Builder().scheme("content").authority(str4).appendPath("file").build();
                                try {
                                    if (Build.VERSION.SDK_INT > 16) {
                                        query = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{c0x5.A03}, null, null);
                                    } else {
                                        query = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{c0x5.A03}, null);
                                    }
                                    if (query != null) {
                                        if (query.getCount() > 0) {
                                            int columnIndex = query.getColumnIndex("result_code");
                                            arrayList3 = new ArrayList();
                                            int columnIndex2 = query.getColumnIndex("_id");
                                            int columnIndex3 = query.getColumnIndex("file_id");
                                            int columnIndex4 = query.getColumnIndex("font_ttc_index");
                                            int columnIndex5 = query.getColumnIndex("font_weight");
                                            int columnIndex6 = query.getColumnIndex("font_italic");
                                            while (query.moveToNext()) {
                                                int i4 = columnIndex != -1 ? query.getInt(columnIndex) : 0;
                                                int i5 = columnIndex4 != -1 ? query.getInt(columnIndex4) : 0;
                                                if (columnIndex3 == -1) {
                                                    withAppendedId = ContentUris.withAppendedId(build, query.getLong(columnIndex2));
                                                } else {
                                                    withAppendedId = ContentUris.withAppendedId(build2, query.getLong(columnIndex3));
                                                }
                                                int i6 = columnIndex5 != -1 ? query.getInt(columnIndex5) : 400;
                                                if (columnIndex6 != -1) {
                                                    z = true;
                                                    if (query.getInt(columnIndex6) == 1) {
                                                        arrayList3.add(new C12970kO(withAppendedId, i5, i6, z, i4));
                                                    }
                                                }
                                                z = false;
                                                arrayList3.add(new C12970kO(withAppendedId, i5, i6, z, i4));
                                            }
                                        }
                                        query.close();
                                    }
                                    c12960kN = new C12960kN(0, (C12970kO[]) arrayList3.toArray(new C12970kO[0]));
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            i3++;
                        } else {
                            c12960kN = new C12960kN(1, null);
                            break;
                        }
                    }
                    int i7 = c12960kN.A00;
                    if (i7 == 0) {
                        Typeface A05 = C0X2.A01.A05(context, null, c12960kN.A01, i);
                        return new C0XA(A05, A05 != null ? 0 : -3);
                    }
                    return new C0XA(null, i7 == 1 ? -2 : -3);
                }
                StringBuilder A0W = C000200d.A0W("Found content provider ", str, ", but package was not ");
                A0W.append(str3);
                throw new PackageManager.NameNotFoundException(A0W.toString());
            }
            throw new PackageManager.NameNotFoundException(C000200d.A0H("No package found for authority: ", str));
        } catch (PackageManager.NameNotFoundException unused) {
            return new C0XA(null, -1);
        }
    }
}
