package X;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.whatsapp.util.NativeUtils;
import com.whatsapp.util.StatResult;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.02C  reason: invalid class name */
/* loaded from: classes.dex */
public class C02C {
    public static volatile C02C A03;
    public final Set A00 = new HashSet();
    public final Set A01 = new HashSet();
    public volatile Set A02 = new HashSet();

    public static C02C A00() {
        if (A03 == null) {
            synchronized (C02C.class) {
                if (A03 == null) {
                    A03 = new C02C();
                }
            }
        }
        return A03;
    }

    public static StatResult A01(String str) {
        try {
            return StatResult.lstatOpenFile(str);
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    public static Collection A02(int i, File... fileArr) {
        if (fileArr != null && i != 0) {
            ArrayList arrayList = new ArrayList(fileArr.length);
            for (File file : fileArr) {
                try {
                    StatResult A01 = A01(file.getPath());
                    if (!A01.A05) {
                        if (file.isDirectory()) {
                            arrayList.addAll(A02(i - 1, file.listFiles()));
                        } else if (A01.A01 == 1) {
                            arrayList.add(Long.valueOf(A01.A04));
                        }
                    }
                } catch (IOException e) {
                    C000200d.A12("externalfilevalidator/file read error: ", file, e);
                }
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    public void A03(Uri uri) {
        if (this.A00.contains(uri.getAuthority())) {
            throw new IOException(C000200d.A0G("externalfilevalidator/don't allow sharing ", uri));
        }
    }

    public void A04(ParcelFileDescriptor parcelFileDescriptor) {
        StatResult statOpenFile = StatResult.statOpenFile(NativeUtils.getFileDescriptorForFileDescriptor(parcelFileDescriptor.getFileDescriptor()));
        StringBuilder sb = new StringBuilder("parcelFileDescriptor=");
        sb.append(parcelFileDescriptor);
        A05(statOpenFile, sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x012a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A05(com.whatsapp.util.StatResult r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02C.A05(com.whatsapp.util.StatResult, java.lang.String):void");
    }

    public void A06(File file) {
        String canonicalPath = file.getCanonicalPath();
        StatResult A01 = A01(canonicalPath);
        StringBuilder sb = new StringBuilder("canonicalFilePath=");
        sb.append(canonicalPath);
        A05(A01, sb.toString());
    }

    public void A07(FileInputStream fileInputStream) {
        StatResult statOpenFile = StatResult.statOpenFile(NativeUtils.getFileDescriptorForFileDescriptor(fileInputStream.getFD()));
        StringBuilder sb = new StringBuilder("fileInputStream=");
        sb.append(fileInputStream);
        A05(statOpenFile, sb.toString());
    }
}
