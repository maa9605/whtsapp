package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;
import java.net.URLEncoder;

/* renamed from: X.2Bu */
/* loaded from: classes2.dex */
public class C47582Bu {
    public static volatile C47582Bu A06;
    public C003701t A00;
    public final AbstractC000600i A01;
    public final C01B A02;
    public final C000400f A03;
    public final C0G4 A04;
    public final C001200o A05;

    public C47582Bu(C001200o c001200o, C003701t c003701t, AbstractC000600i abstractC000600i, C01B c01b, C000400f c000400f, C0G4 c0g4) {
        this.A05 = c001200o;
        this.A00 = c003701t;
        this.A01 = abstractC000600i;
        this.A02 = c01b;
        this.A03 = c000400f;
        this.A04 = c0g4;
    }

    public static Pair A00(String str) {
        int indexOf = str.indexOf(" ");
        if (indexOf < 0) {
            return null;
        }
        return new Pair(URLDecoder.decode(str.substring(0, indexOf)), str.substring(indexOf + 1));
    }

    public static String A01(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(URLEncoder.encode(str));
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    public static final boolean A02(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (!str.matches("[\\w-.,'\\s]+")) {
            StringBuilder sb = new StringBuilder();
            sb.append("ThirdPartyStickerFetcher/stringInvalid/string ");
            sb.append(str);
            sb.append(" contains invalid characters, allowed characters are a to z, A to Z, _ , ' - . and space character");
            Log.e(sb.toString());
            return true;
        } else if (str.contains("..")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ThirdPartyStickerFetcher/stringInvalid/string ");
            sb2.append(str);
            sb2.append(" cannot contain ..");
            Log.e(sb2.toString());
            return true;
        } else {
            return false;
        }
    }

    public static byte[] A03(Context context, C42531vt c42531vt) {
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(Uri.parse(c42531vt.A0I));
            try {
                if (openInputStream != null) {
                    byte[] bArr = new byte[51201];
                    int read = openInputStream.read(bArr, 0, 51201);
                    if (read != 51201) {
                        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, read);
                        if (decodeByteArray.getWidth() <= 512 && decodeByteArray.getHeight() >= 24) {
                            if (decodeByteArray.getHeight() <= 512 && decodeByteArray.getHeight() >= 24) {
                                openInputStream.close();
                                return bArr;
                            }
                            StringBuilder sb = new StringBuilder();
                            sb.append("tray icon height incorrect, it is currently ");
                            sb.append(decodeByteArray.getHeight());
                            sb.append(", should be between ");
                            sb.append(24);
                            sb.append(" and ");
                            sb.append(512);
                            sb.append(" pixels, sticker pack: ");
                            sb.append(c42531vt.A0D);
                            throw new IllegalArgumentException(sb.toString());
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("tray icon width incorrect, it is currently ");
                        sb2.append(decodeByteArray.getWidth());
                        sb2.append(", should be between ");
                        sb2.append(24);
                        sb2.append(" and ");
                        sb2.append(512);
                        sb2.append(" pixels, sticker pack: ");
                        sb2.append(c42531vt.A0D);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("tray icon file size too big, limit is 50 KB, sticker pack: ");
                    sb3.append(c42531vt.A0D);
                    throw new IllegalArgumentException(sb3.toString());
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("failed to fetch sticker tray icon, inputstream is null: ");
                sb4.append(c42531vt.A0D);
                throw new IOException(sb4.toString());
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    if (openInputStream != null) {
                        try {
                            openInputStream.close();
                        } catch (Throwable unused) {
                        }
                    }
                    throw th2;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (Exception e3) {
            StringBuilder A0P = C000200d.A0P("failed to fetch sticker tray icon, sticker pack:");
            A0P.append(c42531vt.A0D);
            throw new IOException(A0P.toString(), e3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x01aa A[LOOP:2: B:175:0x01a4->B:177:0x01aa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0193 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C42531vt A04(java.lang.String r28, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47582Bu.A04(java.lang.String, java.lang.String):X.1vt");
    }

    /* JADX WARN: Code restructure failed: missing block: B:198:0x01e5, code lost:
        if (r7.getShort(r1) <= 0) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x027b A[Catch: all -> 0x0328, TryCatch #0 {all -> 0x0328, blocks: (B:156:0x00c8, B:158:0x00ce, B:160:0x00df, B:162:0x0101, B:163:0x010a, B:164:0x0120, B:165:0x0121, B:167:0x0129, B:168:0x0150, B:171:0x0158, B:173:0x0162, B:175:0x016a, B:176:0x0183, B:178:0x0185, B:180:0x018b, B:182:0x0195, B:184:0x019d, B:186:0x01a5, B:187:0x01be, B:189:0x01c0, B:191:0x01c8, B:193:0x01d2, B:194:0x01d9, B:195:0x01da, B:197:0x01e0, B:200:0x01e8, B:202:0x01ee, B:204:0x01f5, B:206:0x01ff, B:207:0x0206, B:209:0x0208, B:211:0x027b, B:213:0x0281, B:215:0x0289, B:217:0x028f, B:219:0x0297, B:223:0x02a0, B:224:0x02b4, B:225:0x02b5, B:226:0x02c9, B:227:0x02ca, B:228:0x02de, B:229:0x02df, B:230:0x02f3, B:231:0x02f4, B:232:0x0308, B:233:0x0309, B:234:0x0327), top: B:259:0x00c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02f4 A[Catch: all -> 0x0328, TryCatch #0 {all -> 0x0328, blocks: (B:156:0x00c8, B:158:0x00ce, B:160:0x00df, B:162:0x0101, B:163:0x010a, B:164:0x0120, B:165:0x0121, B:167:0x0129, B:168:0x0150, B:171:0x0158, B:173:0x0162, B:175:0x016a, B:176:0x0183, B:178:0x0185, B:180:0x018b, B:182:0x0195, B:184:0x019d, B:186:0x01a5, B:187:0x01be, B:189:0x01c0, B:191:0x01c8, B:193:0x01d2, B:194:0x01d9, B:195:0x01da, B:197:0x01e0, B:200:0x01e8, B:202:0x01ee, B:204:0x01f5, B:206:0x01ff, B:207:0x0206, B:209:0x0208, B:211:0x027b, B:213:0x0281, B:215:0x0289, B:217:0x028f, B:219:0x0297, B:223:0x02a0, B:224:0x02b4, B:225:0x02b5, B:226:0x02c9, B:227:0x02ca, B:228:0x02de, B:229:0x02df, B:230:0x02f3, B:231:0x02f4, B:232:0x0308, B:233:0x0309, B:234:0x0327), top: B:259:0x00c8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C42531vt A05(java.lang.String r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 971
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47582Bu.A05(java.lang.String, java.lang.String):X.1vt");
    }
}
